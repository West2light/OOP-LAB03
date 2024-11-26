package LAB01_02;

//2.2.5 TwoDoubleCaculation
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class TwoDoubleCaculation {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);

        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        JOptionPane.showMessageDialog(null, "Sum: " + String.format("%.2f", sum) + "\n"
                + "Difference: " + String.format("%.2f", difference) + "\n"
                + "Product: " + String.format("%.2f", product), "Results", JOptionPane.INFORMATION_MESSAGE);

        if (num2 != 0) {
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "Quotient: " + String.format("%.2f", quotient), "Quotient Result", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cannot perform the division because divisor = 0", "Division Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
