package CollegeExperiment;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Experiment_01 {
	public static void main(String[] args) {
	Frame fr=new Frame("Key Event");
	fr.setSize(500,500);
	fr.setVisible(true);
	Label l=new Label("Label");
	fr.add(l);
	fr.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			char keychar=e.getKeyChar();
			if(keychar=='x') {
				l.setText("x was pressed");
			}
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			l.setText("Key released");
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			l.setText("Key pressed");
		}
	}); 
	
	}
}
