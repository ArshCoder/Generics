
public class MaximumTest<T extends Comparable<T>> {
	T x, y, z;

	public T maximum() {
		return MaximumTest.maximum(x, y, z);
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

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of three is ", x, y, z, max);
	}

	public static void main(String[] args) {
		System.out.print("Max of given three integers is " + maximum(8, 4, 5) + "\n\n");

		System.out.print("Max of given three float is " + maximum(5.6, 6.8, 6.4) + "\n\n");

		System.out.print("Max of given three Strings is " + maximum("Apple", "Peach", "Banana") + "\n\n");

		Integer xInt = 3, yInt = 4, zInt = 5;
		Float xF1 = 6.6f, yF1 = 8.5f, zF1 = 7.2f;
		String xStr = "Apple", yStr = "Peach", zStr = "Banana";

		MaximumTest.testMaximum(xStr, yStr, zStr);
		new MaximumTest(xInt, yInt, zInt).maximum();
		new MaximumTest(xF1, yF1, zF1).maximum();
		new MaximumTest(xStr, yStr, zStr).maximum();

	}
}
