public class DynamiPolymorplismUsingOveloading {
	/*int add(int x,int y){
		return (x+y);
	}*/
	
	float add(float x,int y){
		return (x+y);
	}
	
	/*double add(float x,double y){
		return (x+y);
	}*/
	
	public static void main(String[] args) {
		DynamiPolymorplismUsingOveloading obj = new DynamiPolymorplismUsingOveloading();
		System.out.println(obj.add(5.6f,5));
	}
}
