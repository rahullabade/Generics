package genericsMethod;

public class MaxNumber {
	public static Float maxNumber(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		Float maximum = MaxNumber.maxNumber(11.11f, 22.22f, 330.3f);
		System.out.println("Maximum Three float:" + maximum);
	}

}
