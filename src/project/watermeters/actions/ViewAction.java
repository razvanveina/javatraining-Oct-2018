package project.watermeters.actions;

import project.core.menu.MenuItem;
import project.watermeters.ApplicationSession;
import project.watermeters.model.Database;
import project.watermeters.model.Reading;

public class ViewAction extends MenuItem {
	public ViewAction() {
		super("1", "View");
	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		System.out.println("-------------------------------------");
		for (Reading reading : database.getReadings()) {
			System.out.println(reading);
			System.out.println("------------------------------------");
		}
	}

}
