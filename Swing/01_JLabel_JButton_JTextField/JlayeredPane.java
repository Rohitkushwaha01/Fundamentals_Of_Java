package swingpackage;

import java.awt.Color;

import javax.swing.*;

public class JlayeredPane {

	public static void main(String[] args) {
		//JLayeredPane = Swing container that provides a third dimension for positioning components ex- depth, z-index
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		label1.setOpaque(true);
		label2.setOpaque(true);
		label3.setOpaque(true);
		
		label1.setBounds(50, 50, 200, 200);
		label2.setBounds(100, 100, 200, 200);
		label3.setBounds(150, 150, 200, 200);
		
		label1.setBackground(Color.cyan);
		label2.setBackground(Color.black);
		label3.setBackground(Color.green);
		
		JFrame frame = new JFrame("LayeredPane");
		JLayeredPane layer = new JLayeredPane();
		
		layer.add(label1, Integer.valueOf(0));
		layer.add(label2, Integer.valueOf(1));
		layer.add(label3, Integer.valueOf(-1));
		
		frame.setSize(500,500);
		frame.add(layer);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
