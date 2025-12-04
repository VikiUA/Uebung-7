package h1;

public class H1_main {
	public static void main(String[] args) {
		Zahl z = new Zahl();
		
		z.num = 121;

		z.setEven();
		z.setSmall();
		z.setPositive();

		System.out.println("even: " + z.even);
		System.out.println("small: " + z.small);
		System.out.println("positive: " + z.positive);
	}
}
