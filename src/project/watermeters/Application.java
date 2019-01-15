package project.watermeters;

import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;
import project.watermeters.actions.AddAction;
import project.watermeters.actions.EditAction;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addReading = new AddAction();
		MenuItem editReading = new EditAction();

		BackAction back = new BackAction("0", "Back");

		Menu readingsMenu = new Menu("1", "Readings");
		readingsMenu.addItem(addReading);
		readingsMenu.addItem(editReading);
		readingsMenu.addItem(back);
		readingsMenu.setBackAction(back);

		Menu statisticsMenu = new Menu("2", "Statistics");
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
