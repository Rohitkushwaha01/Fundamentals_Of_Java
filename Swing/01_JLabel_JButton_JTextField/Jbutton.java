package swingpackage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Jbutton {
	public static void main(String[] args) {
		// JButton = a button that performs an action when clicked on
		JFrame f = new JFrame();
		JButton b = new JButton("Click Me!!");
		ImageIcon icon = new ImageIcon("web.png");
		
		b.setBounds(200, 200, 100, 50);
		b.setFocusable(false);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setText("Clicked!!");
				f.setIconImage(icon.getImage()); // changes the frame icon
				b.setEnabled(false);
			}
		});
		b.setVerticalTextPosition(JButton.CENTER);
		b.setHorizontalTextPosition(JButton.CENTER);
		
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setVisible(true);
		f.add(b);
	}
}
