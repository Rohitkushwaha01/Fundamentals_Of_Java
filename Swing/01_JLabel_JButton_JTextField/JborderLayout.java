package swingpackage;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;

public class JborderLayout {
	public static void main(String[] args) {
		// BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER.
		// 				  All extra space is placed in the center area.	
		
		JFrame frame = new JFrame("BorderLayout");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		JLabel label1 = new JLabel("NORTH");
		label1.setVerticalAlignment(JLabel.CENTER);
		label1.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label2 = new JLabel("SOUTH");
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label3 = new JLabel("WEST");
		label3.setVerticalAlignment(JLabel.CENTER);
		label3.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label4 = new JLabel("EAST");
		label4.setVerticalAlignment(JLabel.CENTER);
		label4.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label5 = new JLabel("CENTER");
		label5.setVerticalAlignment(JLabel.CENTER);
		label5.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		
		
		panel1.setBackground(Color.red);
		panel1.setPreferredSize(new Dimension(100, 100));
		panel1.setLayout(new BorderLayout());
		panel1.add(label1);
		
		panel2.setBackground(Color.ORANGE);
		panel2.setPreferredSize(new Dimension(100, 100));
		panel2.setLayout(new BorderLayout());
		panel2.add(label2);
		
		panel3.setPreferredSize(new Dimension(100, 100));
		panel3.setBackground(Color.yellow);
		panel3.setLayout(new BorderLayout());
		panel3.add(label3);
		
		panel4.setPreferredSize(new Dimension(100, 100));
		panel4.setBackground(Color.green);
		panel4.setLayout(new BorderLayout());
		panel4.add(label4);
		
		panel5.setPreferredSize(new Dimension(100, 100));
		panel5.setBackground(Color.magenta);
		panel5.setLayout(new BorderLayout());
		panel5.add(label5);
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		frame.add(panel3, BorderLayout.WEST);
		frame.add(panel4, BorderLayout.EAST);
		frame.add(panel5, BorderLayout.CENTER);
	}
}
