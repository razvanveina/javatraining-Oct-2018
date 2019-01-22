package project.watermeters.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;
import project.watermeters.ApplicationSession;
import project.watermeters.model.Reading;

public class AddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		// Date date = keyboard.getDate("Date: ");
		// System.out.println(date);
		int year = keyboard.getInt("Year: ");
		int month = keyboard.getInt("Month: ");
		int coldWater = keyboard.getInt("Cold water: ");
		int hotWater = keyboard.getInt("Hot water: ");
		// do something with values
		Reading reading = new Reading(year, month, coldWater, hotWater);
		ApplicationSession.getInstance().getDatabase().addReading(reading);
	}

}
