import java.util.Scanner;

public class ExceptionHandlingUsingTryCatch {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 6, 2, 2, 2, 5, 6, 6 };
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		a = s.nextInt();
		System.out.println("Enter Second Number: ");
		b = s.nextInt();

		try {
			c = (a / b);//new ArithmeticException()
			System.out.println("Division is: " + c);
			System.out.println("9th position " + arr[9]);//new ArrayIndexOutOfBoundsException()
		} catch (Exception e) {
			// used to catch all exceptions
			e.printStackTrace();
		}
		
		/*
			 catch (ArithmeticException ae) { ae.printStackTrace(); //
			 System.out.println(ae); //
			 System.out.println("Denominator Cannot be zero...5"); } catch
			 (ArrayIndexOutOfBoundsException aex) {
			 System.out.println("Invalid postion in array..."); }
		 */
	}
}