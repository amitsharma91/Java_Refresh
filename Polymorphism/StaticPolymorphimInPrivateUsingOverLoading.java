public class StaticPolymorphimInPrivateUsingOverLoading {
	//Instance Method
	private int add(int x, int y) {
		return (x + y);
	}
	//private methods NOT VISIBLE to "JVM"
	//Memory for private methods get allocated at Compile time
	//i.e at Class LEVEL
	private float add(float x, int y) {
		return (x + y);
	}

	private double add(float x, double y) {
		return (x + y);
	}

	public static void main(String[] args) {
		StaticPolymorphimInPrivateUsingOverLoading obj= new StaticPolymorphimInPrivateUsingOverLoading();
		System.out.println(obj.add(5,6));//Static(polymorphism)compile time
	}
}
