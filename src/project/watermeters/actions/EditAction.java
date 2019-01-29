package project.watermeters.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.watermeters.ApplicationSession;
import project.watermeters.model.Database;
import project.watermeters.model.Reading;

public class EditAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public EditAction() {
		super("2", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		int year = keyboard.getInt("Year: ");
		int month = keyboard.getInt("Month: ");
		Reading reading = db.getReadingByYearAndMonth(year, month);
		if (reading == null) {
			throw new RuntimeException("Reading not found");
		}

		int coldWater = keyboard.getInt("New cold water: ");
		int hotWater = keyboard.getInt("New hot water: ");
		db.editReading(year, month, coldWater, hotWater);
	}
}
