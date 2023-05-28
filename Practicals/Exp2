package CollegeExperiment;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Exp2 {

	public static void main(String[] args) {
		Frame f = new Frame();
		TextField t = new TextField();
		Button b = new Button("I'm a Button");
		Label l = new Label("Hello The Rohit kushwaha!!", Label.CENTER);
		
		f.setTitle("Practical 02- AWT(Abstract Window ToolKit) ");
		f.setSize(400,500);
		f.setResizable(false);
		f.setVisible(true);
		f.setBackground(Color.pink);
		
		l.setBackground(Color.black);
		l.setForeground(Color.white);
		
		t.setBounds(30, 50, 200, 20);
		b.setBounds(30, 80, 200, 20);
		l.setBounds(30, 120, 200, 20);
		
		
		f.setLayout(null);
		
		f.add(l);
		f.add(b);
		f.add(t);
		
		f.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				l.setText("Mouse Released");
				f.setBackground(Color.red);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				l.setText("Mouse Pressed");
				f.setBackground(Color.blue);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				l.setText("Mouse Exited");
				f.setBackground(Color.cyan);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				l.setText("Mouse Entered");
				f.setBackground(Color.yellow);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				l.setText("Mouse Clicked");
				f.setBackground(Color.green);
			}
		});
	
	}

}
