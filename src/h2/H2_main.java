package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		int[] result = change(new int[] { 2, 7, 1, 9 }, new int[] { 5, 6, 7 }, 2, 4);
		System.out.println(Arrays.toString(result));
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
