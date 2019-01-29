package project.watermeters;

import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.watermeters.actions.AddAction;
import project.watermeters.actions.ClearAction;
import project.watermeters.actions.EditAction;
import project.watermeters.actions.ViewAction;
import project.watermeters.actions.ViewConsumptionAction;
import project.watermeters.model.Database;
import project.watermeters.model.Reading;
import project.watermeters.utils.Serializer;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		// app.init();
		app.run();
	}

	private void init() {
		Database database = ApplicationSession.getInstance().getDatabase();
		database.addReading(new Reading(2018, 11, 100, 100));
		database.addReading(new Reading(2018, 12, 110, 109));
	}

	private void run() {
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		Database database = serializer.load();
		if (database == null) {
			return;
		}

		ApplicationSession.getInstance().setDatabase(database);

		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addReading = new AddAction();
		MenuItem editReading = new EditAction();
		MenuItem clear = new ClearAction();

		MenuItem viewReadings = new ViewAction();
		MenuItem viewConsumption = new ViewConsumptionAction();

		BackAction back = new BackAction("0", "Back");

		Menu readingsMenu = new Menu("1", "Readings");
		readingsMenu.addItem(addReading);
		readingsMenu.addItem(editReading);
		readingsMenu.addItem(clear);
		readingsMenu.addItem(back);
		readingsMenu.setBackAction(back);

		Menu statisticsMenu = new Menu("2", "Statistics");
		statisticsMenu.addItem(viewReadings);
		statisticsMenu.addItem(viewConsumption);
		statisticsMenu.addItem(back);
		statisticsMenu.setBackAction(back);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(readingsMenu);
		mainMenu.addItem(statisticsMenu);
		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
