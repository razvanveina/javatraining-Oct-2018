package project.watermeters;

import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;

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
		MenuItem addReading = new MenuItem("1", "Add") {
			@Override
			public void doAction() {
				System.out.println("Aici adaugam ceva");
			}
		};

		MenuItem editReading = new MenuItem("2", "Edit") {
			@Override
			public void doAction() {
				System.out.println("Aici editam ceva");
			}
		};

		BackAction back = new BackAction("0", "Back");

		Menu readingsMenu = new Menu("1", "Readings");
		readingsMenu.addItem(addReading);
		readingsMenu.addItem(editReading);
		readingsMenu.addItem(back);
		readingsMenu.setBackAction(back);

		Menu statisticsMenu = new Menu("2", "Statistics");
		statisticsMenu.addItem(back);
		statisticsMenu.setBackAction(back);

		Menu mainMenu = new Menu();
		mainMenu.addItem(readingsMenu);
		mainMenu.addItem(statisticsMenu);
		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
