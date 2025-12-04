package h1;

public class H1_main {
	public static void main(String[] args) {
		Zahl z = new Zahl(-120);

		z.setEven();
		z.setSmall();
		z.setPositive();

		System.out.println("even: " + z.even);
		System.out.println("small: " + z.small);
		System.out.println("positive: " + z.positive);
	}
}
