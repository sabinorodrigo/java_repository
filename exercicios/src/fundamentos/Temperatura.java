package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final int  AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		int fahrenheit = 20;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		// (F - 32) * 5/9 = C
		System.out.println(celsius);
	}
}
