package LAB01_02;

//2.2.6 Linear equaiton
import javax.swing.JOptionPane;
public class LinearEquation
{
	public static void main(String[] args)
	{
		String str1, str2;
		
		str1 = JOptionPane.showInputDialog(null,"Please input a: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(str1);
		
		str2 = JOptionPane.showInputDialog(null,"Please input b: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		double b = Double.parseDouble(str2);
		
		if(a != 0)
		{
			double result = -b/a;
			JOptionPane.showMessageDialog(null,"The real root of the equaiton is: " + String.format("%.5f", result), "The real root",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Cannot find the real root of the equaiton because a  = 0","Null root", JOptionPane.ERROR_MESSAGE);
		}
	}
}
//Input a = 6, b = 7
//Input a= 0, b = -4