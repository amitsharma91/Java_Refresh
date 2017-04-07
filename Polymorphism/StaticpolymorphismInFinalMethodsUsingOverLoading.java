
public class StaticpolymorphismInFinalMethodsUsingOverLoading {
	final int add(int x,int y){
		return (x+y);
	}
	//final methods are constant methods 
	//these methods are common for all the objects
	final float add(float x,int y){
		return (x+y);
	}
	
	final double add(float x,double y){
		return (x+y);
	}
	
	public static void main(String[] args) {
		StaticpolymorphismInFinalMethodsUsingOverLoading obj = new StaticpolymorphismInFinalMethodsUsingOverLoading();
		System.out.println(obj.add(5.0f,2));//call is binded at compile time,since memory is allocated at class - level
	}
}