package sessions.s06;

public enum Direction {
	UP("Move up"), DOWN("Go down"), LEFT("Go left"), RIGHT("Go right");

	private String msg;

	private Direction(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
