package sessions.s09;

import java.text.DecimalFormat;

public class Numbers {
	public static void main(String[] args) {
		System.out.println(Math.min(3, 5));
		DecimalFormat df = new DecimalFormat("#,###.00");
		System.out.println(df.format(1234431234.2));
	}
}
