package genericsMethod;

public class TestMaximum<A extends Comparable<A>> {
	A[] multiple;

	public TestMaximum(A[] multiple) {
		this.multiple = multiple;
	}

	public A maximum() {
		return TestMaximum.maximum(multiple);
	}

	public static <A extends Comparable<A>> A maximum(A[] multiple) {
		for (int i = 0; i < 5; i++) {
			for (int p = i; p < 5; p++) {
				if (multiple[i].compareTo(multiple[p]) < 0) {
					multiple[i] = multiple[p];
				}
			}
		}
		TestMaximum.testMaximum(multiple[0]);
		return multiple[0];
	}

	private static <A> void testMaximum(A maximum) {
		System.out.println("The Maximum Value is :" + maximum);
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] multiInteger = { 9, 11111, 87, 980, 90 };
		new TestMaximum<Integer>(multiInteger).maximum();
	}
}
