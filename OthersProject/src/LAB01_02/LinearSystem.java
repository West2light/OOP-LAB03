package LAB01_02;

// Linear system
import javax.swing.JOptionPane;
public class LinearSystem
{
	public static void main(String[] args)
	{
		String strA11, strA12, strB1, strA21, strA22, strB2;
		String strPoly1 = "a11 a21 b1: ", strPoly2 = "a21 a22 b2: ";
		strA11 = JOptionPane.showInputDialog(null,"Please input a11: ","Input a11",JOptionPane.INFORMATION_MESSAGE);
		strPoly1 += strA11 + " ";
		double a11 = Double.parseDouble(strA11);
		
		strA12 = JOptionPane.showInputDialog(null,"Please input a12: ","Input a12",JOptionPane.INFORMATION_MESSAGE);
		strPoly1 += strA12 + " ";  
		double a12 = Double.parseDouble(strA12);
		
		strB1 = JOptionPane.showInputDialog(null,"Please input b1: ","Input b1",JOptionPane.INFORMATION_MESSAGE);
		strPoly1 += strB1 + "";
		double b1 = Double.parseDouble(strB1);
		
		JOptionPane.showMessageDialog(null, strPoly1, "Show a11 a12 b1", JOptionPane.INFORMATION_MESSAGE);
		
		strA21 = JOptionPane.showInputDialog(null,"Please input a21: ","Input a21",JOptionPane.INFORMATION_MESSAGE);
		strPoly2 += strA21 + " "; 
		double a21 = Double.parseDouble(strA21);
		
		strA22 = JOptionPane.showInputDialog(null,"Please input a22: ","Input a22",JOptionPane.INFORMATION_MESSAGE);
		strPoly2 += strA22 + " ";
		double a22 = Double.parseDouble(strA22);
		
		strB2 = JOptionPane.showInputDialog(null,"Please input b2: ","Input b2",JOptionPane.INFORMATION_MESSAGE);
		strPoly2 += strB2 + "";
		double b2 = Double.parseDouble(strB2);
		
		JOptionPane.showMessageDialog(null, strPoly2, "Show a21 a22 b2", JOptionPane.INFORMATION_MESSAGE);
		
		double D = a11*a22 - a12*a21;
		if(D != 0)
		{
			double D1 = b1*a22 - b2*a12;
			double D2 = b2*a11 - a21*b1;
			double x1 = D1/D;
			double x2 = D2/D;
			JOptionPane.showMessageDialog(null,"The roots of the linear system are (x1,x2):\n" + String.format("%.4f", x1) + "\n" + String.format("%.4f", x2),"The roots",JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			if(((a11/a21) != (b1/b2)) || ((a12/a22) != (b1/b2)))
			{
				JOptionPane.showMessageDialog(null, "Null the roots of linear system", "Inconsistent system", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "The coefficients produce infinitely many solutions", "Infinitely roots", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		System.exit(0);
	}
}
// input a11 = 2; a12 = 3; b1 = 5;
// input a21 = -1; a22 = 2; b2 = 4;