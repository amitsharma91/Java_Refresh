public class ComparingTwoObjects {
	// instance var
	int x;
	String str;

	public ComparingTwoObjects(String str, int x) {
		this.str = str;
		this.x = x;
	}

	// USED ONLY FOR HASHBUCKET(HASHMAP , HASHTABLE, HASHTREE, HASHSET)
	// Over-riding Object Class Method
	public int hashCode() {

		int hashCode = 88;
		hashCode += 77 * x;
		hashCode += 77 * str.hashCode();

		return hashCode;

		// Another method to return hashcode
		// return Objects.hash(x, str); // only for JDK1.7 and above
	}

	// Over-riding Object Class Method
	public boolean equals(Object obj) {
		if (!(obj instanceof ComparingTwoObjects))
			return false;
		ComparingTwoObjects com = (ComparingTwoObjects) obj;// Specialization
															// using reference
		return com.x == x && com.str.equals(str);
	}

	public static void main(String[] args) {
		ComparingTwoObjects obj1 = new ComparingTwoObjects("php", 8);//
		ComparingTwoObjects obj2 = new ComparingTwoObjects("php", 8);//

		System.out.println(obj1.equals(obj2));		

		//Use of getClass()
		System.out.println(obj1.getClass().getName());
		System.out.println(obj1.str.getClass().getName());
	}
}