package swingpackage;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
public class JgridLayout {

	public static void main(String[] args) {
		// GridLayout = places components in a grid of cells.
		// Each component takes all the available space within its cell, and each cell is the same size.
		
		JFrame frame = new JFrame("GridLayout");
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setLayout(new GridLayout(3,2,10,10));
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
