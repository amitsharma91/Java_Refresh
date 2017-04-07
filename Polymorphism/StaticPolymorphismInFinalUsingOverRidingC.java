class StaticPolymorphismInFinalUsingOverRidingP {
	final int add(int x, int y) {
		return (x + y);
	}

	// final methods are constant methods
	// these methods are common for all the objects
	final float add(float x, int y) {
		return (x + y);
	}

	final double add(float x, double y) {
		return (x + y);
	}
}

public class StaticPolymorphismInFinalUsingOverRidingC extends
		StaticPolymorphismInFinalUsingOverRidingP {

	// final methods are inherited
	// But cannot be overridden, since final
	
	/*
	 final int add(int x,int y){ return (x+y); }
	 */

	public static void main(String[] args) {
		StaticPolymorphismInFinalUsingOverRidingC obj = new StaticPolymorphismInFinalUsingOverRidingC();
		System.out.println(obj.add(5, 6));
	}
}