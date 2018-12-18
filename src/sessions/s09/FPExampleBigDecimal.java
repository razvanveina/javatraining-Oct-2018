package sessions.s09;

import java.math.BigDecimal;

public class FPExampleBigDecimal {
	public static void main(String[] args) {
		BigDecimal bd = new BigDecimal("0.0");
		for (int i = 1; i <= 10; i++) {
			bd = bd.add(new BigDecimal("0.1"));
			System.out.println(bd);
		}
	}
}