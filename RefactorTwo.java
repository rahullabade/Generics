package genericsMethod;

public class RefactorTwo<T extends Comparable<T>> {

	T x, y, z;

	public RefactorTwo(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return RefactorTwo.maximum(x, y, z);
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.printf("The Maximum Integer Value of %d,%d,%d id %d \n ", 5, 6, 7, maximum(5, 6, 7));
	}
}
