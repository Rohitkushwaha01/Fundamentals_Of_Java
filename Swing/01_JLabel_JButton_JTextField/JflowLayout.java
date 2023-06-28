package swingpackage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class JflowLayout {

	public static void main(String[] args) {
		// FlowLayout = Places component in a row, sized at their preferred size.If the horizontal space in the container is too small, the flowlayout class uses the next available row.

		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		//frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		//frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.white);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 30,20));
		
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("0"));
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
