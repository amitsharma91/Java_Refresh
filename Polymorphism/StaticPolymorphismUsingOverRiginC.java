class StaticPolymorphismUsingOverRiginP {
	static int add(int x, int y) {
		return (x + y);
	}

	static float add(float x, int y) {
		return (x + y);
	}

	static double add(float x, double y) {
		return (x + y);
	}
}

public class StaticPolymorphismUsingOverRiginC {
	//this is not overriding since static methods are not inherited but only instance are
	static double add(float x, double y) {
		return (x*x + y*y);
	}
	
	public static void main(String[] args) {
		StaticPolymorphismUsingOverRiginC obj = new StaticPolymorphismUsingOverRiginC();
		System.out.println(obj.add(2.0f,2.0));//it does not calls parent class method , but calls child class method which is new created method
	}
}