package conditionalPractice1;

public class Practice1Runner {
	public static int bar(int x) {
		switch (x) {
		case 1:
			throw new ExceptionA();
		case 2:
			throw new ExceptionB();
		case 3:
			throw new ExceptionC();
		case 4:
			throw new ExceptionD();
		default:
			return x * x;
		}
	}

	public static int foo(int y) {
		int x = 0;
		try {
			try {
				x += bar(y);
				System.out.println("x equals " + x);
			} catch (ExceptionD ex_d) {
				x = -3;
				System.out.println("x equals " + x);
			} catch (ExceptionC ex_c) {
				x += bar(y - 1);
				System.out.println("x equals " + x);
			} catch (ExceptionA ex_a) {
				try {
					x += bar(y + 3);
					System.out.println("x equals " + x);
				} catch (ExceptionB ex_b) {
					x += 3;
					System.out.println("x equals " + x);
				} finally {
					x += 3;
					System.out.println("x equals " + x);
				}
			}
		} catch (RuntimeException e) {
			x += 5;
			System.out.println("x equals " + x);
		} finally {
			x += 3;
			System.out.println("x equals " + x);
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(foo(3));
	}
}
