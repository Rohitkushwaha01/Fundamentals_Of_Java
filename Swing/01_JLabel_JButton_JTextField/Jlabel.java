package swingpackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Jlabel {
	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image or both
		JFrame f = new JFrame("Label");
		JLabel l = new JLabel();
		ImageIcon image = new ImageIcon("javaimage.png");
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		l.setText("Bro, I'm coding!!"); // set text of the label
		l.setIcon(image); // set icon of the frame
		l.setHorizontalTextPosition(JLabel.CENTER); // set horizontal position of label
		l.setVerticalTextPosition(JLabel.TOP); // set vertical position of the label
		l.setForeground(Color.green); // set the font color
		l.setFont(new Font("MV Boli",Font.BOLD, 20)); // set font style
		l.setBorder(border); // set the border
		l.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label 
		l.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label 
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.BLACK);
		f.add(l);
	}

}
