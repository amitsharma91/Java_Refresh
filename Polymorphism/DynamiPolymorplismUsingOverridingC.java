class DynamiPolymorplismUsingOverridingP{
	int add(int x,int y){
		return (x+y);
	}
	
	float add(float x,int y){
		return (x+y);
	}
	
	double add(float x,double y){
		return (x+y);
	}
}

public class DynamiPolymorplismUsingOverridingC extends DynamiPolymorplismUsingOverridingP{
	double add(float x,double y){
		System.out.println(super.add(x, y));//returns value
		return (x*x+y*y);
	}
	
	public static void main(String[] args) {
		DynamiPolymorplismUsingOverridingC obj = new DynamiPolymorplismUsingOverridingC();
		System.out.println(obj.add(2.0f,2.0));
		
	}
}
