public class StaticPolymorphismUsingOverloading {
	static int add(int x,int y){
		return (x+y);
	}
	
	static float add(float x,int y){
		return (x+y);
	}
	
	static double add(float x,double y){
		return (x+y);
	}
	
	public static void main(String[] args) {
		System.out.println(add(5,6));//static(compile-time)
		StaticPolymorphismUsingOverloading obj = new StaticPolymorphismUsingOverloading();
		System.out.println(obj.add(6,6));//static(compile-time)
	}
}

//Object Level
//Class Level