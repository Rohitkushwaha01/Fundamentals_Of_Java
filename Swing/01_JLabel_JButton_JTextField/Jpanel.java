package swingpackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Jpanel {

	public static void main(String[] args) {
		//JPanel = a GUI component that functions as a container to hold other components
		JFrame f = new JFrame("JPanel");
		ImageIcon webIcon = new ImageIcon("web.png");
		f.setIconImage(webIcon.getImage());
		
		JLabel label = new JLabel();
		label.setText("Hii!!!");
		label.setFont(new Font("MV Boli", Font.BOLD, 20));
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

		JPanel panelRed = new JPanel();
		panelRed.setBackground(Color.red);
		panelRed.setBounds(0, 0, 200, 200);
		
		JPanel panelBlue = new JPanel();
		panelBlue.setBackground(Color.blue);
		panelBlue.setBounds(200, 0, 200, 200);
		
		JPanel panelGreen = new JPanel();
		panelGreen.setBackground(Color.green);
		panelGreen.setBounds(0, 200, 400, 200);
		panelGreen.setLayout(new BorderLayout());
		panelGreen.add(label);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(750,750);
		f.setVisible(true);
		f.add(panelRed);
		f.add(panelBlue);
		f.add(panelGreen);
		
	}

}
