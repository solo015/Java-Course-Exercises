// Handling exception using try catch block
public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args)
	{
		int ar[] = { 1, 2, 3, 4, 5 };
		try {
			for (int i = 0; i <= ar.length; i++)
				System.out.println(ar[i]+" ");
		}
		catch (Exception e) {
			System.out.println("\nException caught");
		}
	}
}
