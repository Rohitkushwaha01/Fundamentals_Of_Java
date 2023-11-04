package swingpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JcheckBox {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JCheckBox checkBox = new JCheckBox();
		JButton button = new JButton("Submit");
		ImageIcon xicon = new ImageIcon("C:\\Users\\rohit\\eclipse-workspace\\javaswing\\src\\My project.png");
		ImageIcon checkicon = new ImageIcon("C:\\Users\\rohit\\eclipse-workspace\\javaswing\\src\\checkmark.png");
		
		checkBox.setText("I'm not a Robot👀!");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.ITALIC, 25));
		checkBox.setIcon(xicon);
		checkBox.setSelectedIcon(checkicon);
		
		button.setPreferredSize(new Dimension(80, 40));
		button.setBackground(Color.black);
		button.setForeground(new Color(0x00FF00));
		button.setFocusable(false);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					System.out.print(checkBox.isSelected());
				}
			}
		});
	
		f.add(checkBox);
		f.add(button);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);

	}

}
