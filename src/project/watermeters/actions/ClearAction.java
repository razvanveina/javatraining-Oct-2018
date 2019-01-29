package project.watermeters.actions;

import project.core.menu.MenuItem;
import project.watermeters.ApplicationSession;

public class ClearAction extends MenuItem {

	public ClearAction() {
		super("3", "Clear db");
	}

	@Override
	public void doAction() {
		ApplicationSession.getInstance().getDatabase().clear();
	}

}
