import java.util.Scanner;

public class UsingUserdefindExceptions {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");

		try {
			age = sc.nextInt();
			// throwing user-defined Exception
			if (age < 18)
				throw new InvalidAgeException();

			System.out.println("Your age is: " + age);
		} catch (InvalidAgeException iae)// Handling user-Defined Exception
		{
			//ReThrowing An Exception
			try {
				throw new ClassToHandleExceptionOfAge();
			} catch (ClassToHandleExceptionOfAge e) {
			}
		}
	}
}