package swingpackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JfileChooser {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Choose a File");
		button.setFocusable(false);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					JFileChooser filechooser = new JFileChooser();
					int response = filechooser.showOpenDialog(null);
					if(response == JFileChooser.APPROVE_OPTION) {
						File file = new File(filechooser.getSelectedFile().getAbsolutePath());
						System.out.print(file);
					}
				}
			}
		});
		
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true); // make frame visible

	}

}
