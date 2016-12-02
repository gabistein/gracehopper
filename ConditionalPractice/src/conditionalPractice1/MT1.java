package conditionalPractice1;

public class MT1 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = new int[] { 4, 5, 6 };
		int[][] c = new int[][] { a, b, b, a };

		b = a;

		b[0] = a[1] + c[1][0];
		// c[1][0]=4
		// a[1]=2
		// b[0]=6
		System.out.println(a[0]);
		System.out.println(c[2][2]);
		System.out.println(b[2]);
	}

}
