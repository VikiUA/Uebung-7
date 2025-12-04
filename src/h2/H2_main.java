package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		int[] a = {2, 7, 1, 9};
		int[] b = {5, 6, 7};
		int start = 2;
		int end = 4;
		
		System.out.println(Arrays.toString(change(a, b, start, end)));
	}

	static public int[] change(int[] a, int[] b, int start, int end) {

		if (end <= start) {
			return new int[0];
		}

		if (Arrays.compare(a, b) != 0) {
			return Arrays.copyOf(a, a.length);
		}

		int[] sorted = Arrays.copyOf(a, a.length);
		Arrays.sort(sorted);

		int[] result = Arrays.copyOfRange(sorted, start, end);
		return result;
	}

}
