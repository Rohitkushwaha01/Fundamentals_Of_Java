package swingpackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JcomboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		String[] options = {"Rohit", "Gaurav", "Shubham", "Sahil", "Ajinkya", "Darshan", "Ankit", "Tejal", "Ashlesha", "Anushka", "Aditya"};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		JComboBox box = new JComboBox(options);
		
//		box.addItem("Sarvesh");
//		box.insertItemAt("Sarvesh", 5);
//		box.removeItem("Sarvesh");
//		box.removeAll();
//		box.setSelectedItem("Gaurav");
//		box.setSelectedIndex(1);
//		box.setEditable(true);
		
		box.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(box.getSelectedItem());
			}
			
		});
		
		frame.add(box);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);

	}

}
