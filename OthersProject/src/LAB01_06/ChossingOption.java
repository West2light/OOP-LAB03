package LAB01_06;

import javax.swing.JOptionPane;
public class ChossingOption {
	public static void main(String[] args) 
	{
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		  // Tùy chỉnh hộp thoại với hai tùy chọn "Yes" và "No"
        String[] options = {"Yes", "No"};
        int choice = JOptionPane.showOptionDialog(null,
                "Do you want to continue?",
                "Choose an Option",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You chose Yes");
        } else if (choice == 1) {
            JOptionPane.showMessageDialog(null, "You chose No");
        } else {
            JOptionPane.showMessageDialog(null, "You chose Cancel");
        }

        // Tùy chỉnh hộp thoại với hai tùy chọn "I do" và "I don’t"
        String[] customOptions = {"I do", "I don’t"};
        int customChoice = JOptionPane.showOptionDialog(null,
                "Do you agree?",
                "Choose an Option",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                customOptions,
                customOptions[0]);

        if (customChoice == 0) {
            JOptionPane.showMessageDialog(null, "User chose: I do");
        } else {
            JOptionPane.showMessageDialog(null, "User chose: I don’t");
        }
        System.exit(0);
	}
}



      
