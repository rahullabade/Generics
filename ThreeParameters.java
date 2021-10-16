package genericsMethod;

public class ThreeParameters<A extends Comparable<A>> {
	A[] multiple;

	public ThreeParameters(A[] multiple) {
		this.multiple = multiple;
	}

	public A maximum() {
		return ThreeParameters.maximum(multiple);
	}

	public static <A extends Comparable<A>> A maximum(A[] multiple) {
			 for (int i = 0; i < 4; i++) {
				 for(int p = i; p < 4; p++) {
					 if (multiple[i].compareTo(multiple[p]) < 0) {
						 A x = multiple[i];
						 multiple[p] = x;
					 }
				 }
			 }
			 System.out.println("The Maximum value is :" + multiple[0]);
			 return multiple[0];
		}

	public static void main(String[] args) {
		String[] multiString = { "Elephant", "Tiger", "Lion", "Dog" };
		new ThreeParameters<String>(multiString).maximum();
	}
}
