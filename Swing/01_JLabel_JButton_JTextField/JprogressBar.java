package swingpackage;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class JprogressBar {

	static JFrame frame;
	static JProgressBar bar;
	
	public static void main(String[] args) {
		frame = new JFrame("JProgress Bar");
		bar = new JProgressBar();
		
		bar.setBounds(0, 0, 400, 40);
		bar.setValue(0);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setBackground(Color.black);
		bar.setForeground(Color.red);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setSize(400,400); // sets the size of frame
		frame.setLayout(null);
		frame.setVisible(true); // make frame visible

		fill();
	}
	
	@SuppressWarnings("static-access")
	public static void fill() { 
		int counter = 0;
		while(counter <=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			counter+=1;
		}
		bar.setString("Done :)");
		if(bar.getValue() == 100) {
			JOptionPane box = new JOptionPane();
			box.showMessageDialog(box, "Process Completed successfully!!");
		}
	}

}
