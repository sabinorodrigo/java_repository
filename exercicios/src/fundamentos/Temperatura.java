package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		int temperaturaF = 20;
		final int  AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		double celsius = (temperaturaF - AJUSTE) * FATOR;
		
		// (F - 32) * 5/9 = C
		System.out.println(celsius);
	}
}
