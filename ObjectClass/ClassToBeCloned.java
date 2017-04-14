public class ClassToBeCloned implements Cloneable {
	int x = 5;
	String str = "tom";

	public Object cloneIt() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ClassToBeCloned c1 = new ClassToBeCloned();

		System.out.println(c1.x);// 5
		ClassToBeCloned c2 = (ClassToBeCloned) c1.cloneIt();
		System.out.println(c2.x);// 5

		c1.x++;

		System.out.println(c1.x);// 6
		System.out.println(c2.x);// 5
	}
}