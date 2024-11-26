package LAB01_02;

//Ex5: ShowTwoNumbers.java;
import javax.swing.JOptionPane;
public class ShowTwoNumbers
{
	public static void main(String[] args)
	{
		String strNum1, strNum2;
		String strNotificaiton = "You've just entered: ";
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ",
		"Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotificaiton += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", 
		"Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotificaiton += strNum2;
		JOptionPane.showMessageDialog(null, strNotificaiton, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}