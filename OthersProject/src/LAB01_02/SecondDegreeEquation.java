package LAB01_02;

// Second-degree equation
import javax.swing.JOptionPane;
public class SecondDegreeEquation
{
	public static void main(String[] args)
	{
		String strA, strB, strC;
		String strPoly = "a b c: ";
		
		strA = JOptionPane.showInputDialog(null, "Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
		strPoly += strA + " ";
		double a = Double.parseDouble(strA);

		strB = JOptionPane.showInputDialog(null, "Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
		strPoly += strB + " ";
		double b = Double.parseDouble(strB);

		strC = JOptionPane.showInputDialog(null, "Please input c: ", "Input c", JOptionPane.INFORMATION_MESSAGE);
		strPoly += strC + "";
		double c = Double.parseDouble(strC);
		
		JOptionPane.showMessageDialog(null,"a b c of the poly: " + strA + " " + strB + " " + strC,"The Poly",JOptionPane.INFORMATION_MESSAGE);
		
		double delta = b*b - 4*a*c;
		if(a != 0)
		{
			if(delta < 0)
			{
				JOptionPane.showMessageDialog(null, "Null the roots of second-degree equation", "Inconsistent system", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				double sqrtDelta = Math.sqrt(delta);
				double x1 = (-b + sqrtDelta) / (2*a);
				double x2 = (-b - sqrtDelta) / (2*a);
				if(x1 != x2)
				{
				JOptionPane.showMessageDialog(null, "Two distinct roots:\n" + String.format("%.4f", x1) + "\n" + String.format("%.4f", x2), "The two distinct", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Reapted roots: "+ String.format("%.4f", x1), "The reapted roots", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else
		{
			if(b != 0)
			{
				double x = -c/b;
				JOptionPane.showMessageDialog(null, "One single root: ", String.format("%.4f", x), JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				if(c != 0)
				{
					JOptionPane.showMessageDialog(null, "Null the roots of second-degree equation", "Inconsistent system", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The coefficients produce infinitely many solutions", "Infinitely roots", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
		System.exit(0);
	}
}
//input a = 1; b = 2; c = -3