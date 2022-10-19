package task5;

public class Exception_Handling {

	public static void main(String[] args) {
		try
		{
			int x=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handdel the exception by ArithmeticException.");
		}
		catch(Exception e)
		{
			System.out.println("Handdel the Exception by Exception class.");
		}
		finally 
		{
			System.out.println("Server close.....");
		}

	}

}
