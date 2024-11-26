package LAB01_06;

// A triangle with a height of n stars (*)
import java.util.Scanner;
public class PrintStars
{
	public static void main(String[] args)
	{
		Scanner nKeyboard = new Scanner(System.in);
			
		System.out.println("Please input a height of n stars:");
		int n = nKeyboard.nextInt();
		// lặp từng hàng luôn !
		for(int i = 1; i <= n; i++)
		{
			// in các khoảng trắng 
			for(int j = 1; j <= n - i; j++)
			{
				System.out.print(" ");
			}
			// in ra các kí tự sao theo số
			for(int k = 1; k <= 2*i - 1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}