package genericsMethod;

public class MaximumNumberTest {
	public static String maximumNumberTest(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		String maximum = MaximumNumberTest.maximumNumberTest("Tiger", "Dog", "Cat");
		System.out.println("Maximum Number:" + maximum);
	}
}
