package swingpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JtextField {	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JTextField textfield = new JTextField();
		JButton button = new JButton("Submit");

		textfield.setPreferredSize(new Dimension(150, 40));
		textfield.setFont(new Font("Consolas", Font.PLAIN, 20));
		textfield.setBackground(Color.black);
		textfield.setForeground(new Color(0x00FF00));
		textfield.setCaretColor(Color.white);
		
		button.setPreferredSize(new Dimension(80, 40));
		button.setBackground(Color.black);
		button.setForeground(new Color(0x00FF00));
		button.setFocusable(false);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					f.dispose();
					button.setEnabled(false);
					textfield.setEditable(false);
					JOptionPane.showMessageDialog(null, textfield.getText(), "UserName", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		});
		
		f.add(textfield);
		f.add(button);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 100);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	}

}
