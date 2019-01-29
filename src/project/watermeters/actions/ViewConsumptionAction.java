package project.watermeters.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.watermeters.ApplicationSession;
import project.watermeters.model.Database;
import project.watermeters.model.Reading;

public class ViewConsumptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ViewConsumptionAction() {
		super("2", "View consumption");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		int year = keyboard.getInt("Year: ");
		int month = keyboard.getInt("Month: ");
		Reading currentReading = db.getReadingByYearAndMonth(year, month);
		Reading previousReading = db.getPreviousReadingByYearAndMonth(year, month);

		int hot = currentReading.getHotWater() - previousReading.getHotWater();
		int cold = currentReading.getColdWater() - previousReading.getColdWater();

		System.out.println(year + " " + month + " " + " Hot: " + hot + " Cold: " + cold);
	}

}
