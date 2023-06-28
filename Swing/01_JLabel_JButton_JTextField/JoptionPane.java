package swingpackage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		// JOptionPane = JOptionPane pop up a standard dialog box that prompts users for a value or informs them of something.
		
		JOptionPane.showMessageDialog(null, "This is some useless infor", "Error", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Here is more useless info:D", "Not an Error", JOptionPane.CANCEL_OPTION);
		JOptionPane.showMessageDialog(null, "Really?", "Questioning", JOptionPane.INFORMATION_MESSAGE);
		
		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "What's your thought?", JOptionPane.YES_NO_CANCEL_OPTION);
		System.out.print(answer);
		
		ImageIcon icon = new ImageIcon("web.png");
		String[] options = { "rock", "paper", "scissors" };
		
		JOptionPane.showOptionDialog(
				null, 
				"Select one:", 
				"Let's play a game!", 
                0,
                3,
                icon,
                options,
                options[0]);
		
	}

}
