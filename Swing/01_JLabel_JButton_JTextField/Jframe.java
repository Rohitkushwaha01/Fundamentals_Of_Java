package swingpackage;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe {

	public static void main(String[] args) {
		// JFrame = a GUI window to add components to 
		// frame.setTitle("First swing frame"); // set the title of the frame
		JFrame frame = new JFrame("First Swing Frame"); // creates a frame  
		frame.setSize(400,400); // sets the size of frame
		frame.setVisible(true); // make frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resized.
		ImageIcon image = new ImageIcon("javaimage.png"); // create an image icon
		frame.setIconImage(image.getImage()); // change icon image of the frame.
		frame.getContentPane().setBackground(Color.CYAN); // change the background color
		frame.getContentPane().setBackground(new Color(255,23,43));
	}

}
