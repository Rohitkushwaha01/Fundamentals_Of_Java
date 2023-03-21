import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;  

public class Main {

	public static void create(JTextField t1, JTextField t2, JFrame f) {
		int x1 = 50, y1 = 250;
		int x2 = 150, y2 = 250;
		String s1 = t1.getText();
		String s2 = t2.getText();
		JLabel customLabel1 = new JLabel();
		JLabel customLabel2 = new JLabel();
		
		customLabel1.setBounds(x1,y1,200,100);
		f.add(customLabel1);
		customLabel1.setText(s1);
		
		customLabel2.setBounds(x2,y2,200,100);
		f.add(customLabel2);
		customLabel2.setText(s2);
		
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("Enter Your Name: ");
		JLabel l2 = new JLabel("Enter Your Marks: ");
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JButton b=new JButton("Submit");
		
		
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(800, 800);
		
		l1.setBounds(50,50,200,100);
		f.add(l1);
		
		t1.setBounds(180,90,200,30);
		f.add(t1);
		
		l2.setBounds(50,50,200,200);
		f.add(l2);
		
		t2.setBounds(180,130,200,30);
		f.add(t2);
		
		b.setBounds(50,190,150,30);
		f.add(b);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				create(t1, t2, f);
			}
		});
	}

}
