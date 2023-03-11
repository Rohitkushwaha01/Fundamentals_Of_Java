import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

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
				f.setBackground(Color.red);
				l.setText("Mouse Released");
				l.setBackground(Color.red);
				b.setBackground(Color.green);
				f.setSize(400,200);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				l.setText("Mouse Pressed");
				f.setBackground(Color.blue);
				l.setBackground(Color.green);
				b.setBackground(Color.red);
				f.setSize(500, 800);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				l.setText("Mouse Exited");
				f.setBackground(Color.cyan);
				l.setBackground(Color.yellow);
				b.setBackground(Color.magenta);
				f.setSize(800, 600);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				l.setText("Mouse Entered");
				f.setBackground(Color.yellow);
				l.setBackground(Color.magenta);
				b.setBackground(Color.orange);
				f.setSize(300, 700);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				l.setText("Mouse Clicked");
				f.setBackground(Color.green);
				l.setBackground(Color.orange);
				b.setBackground(Color.blue);
				f.setSize(600, 800);
			}
		});
	
	}

}
