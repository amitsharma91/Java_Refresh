public class TypecastingInPrimitive {
	public static void main(String[] args) {
		int a = 15;
		float b = a;// widening
		System.out.println(a + " " + b);

		float x = 5.69f;
		int y = (int) x;// Narrowing
		System.out.println(x + " " + y);
	}
}