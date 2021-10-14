package genericsMethod;

public class MaximumTest {
	public static Integer maximumTest(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0);
		max = y;
		if(z.compareTo(max) > 0);
		max = z;
		
		return max;
		
	}
	public static void main(String[] args) {
		Integer maximum = MaximumTest.maximumTest(112, 145, 789);
		System.out.println("Maximum Number:"+maximum);
	}

}
