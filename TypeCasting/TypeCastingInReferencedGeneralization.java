class A {
	int x = 56;

	void show() {
		System.out.println("x: " + x);
	}
}

class B extends A {
	float y = 58.63f;

	void print() {
		System.out.println("y: " + y);
	}
}

public class TypeCastingInReferencedGeneralization {
	public static void main(String[] args) {
		A a = new B();// Generalization using Object
		// Here only 50% data is accessible
		// i.e of A class
		a.show();
		// a.print();//error
	}
}
