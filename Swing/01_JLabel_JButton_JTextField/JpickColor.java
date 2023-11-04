package swingpackage;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JpickColor {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Set Label Color");
		JLabel label = new JLabel("Well, I'm the Rohit kushwaha");
		
		label.setFont(new Font("MV Boli", Font.BOLD, 15));	
		button.setFocusable(false);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					Color color = JColorChooser.showDialog(null, "Set label color", Color.black);
					label.setForeground(color);
				}
			}
		});
		
		frame.add(button);
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true); // make frame visible

	}

}
