// Applet do not have main function in it;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends Applet implements KeyListener{

	String str = "Hello Please do Something!!!";
	
	// Initializing Applet
	public void init(){
		addKeyListener(this); // when started initialize with key listener
	}
	
	// Overiding all the methods of keyListener interface(keyPressed, keyReleased, keyTyped)
	public void keyPressed(KeyEvent arg0) {
		str = "I Got Pressed";
		showStatus("I Got Pressed");
		repaint();
	}

	public void keyReleased(KeyEvent arg0) {
		str = "Ohh You Released me!!";
		showStatus("Ohh You Released me!!");
		repaint();
		
	}

	public void keyTyped(KeyEvent arg0) 
		showStatus("typed");
		repaint();
	}
	
	public void paint(Graphics g){
	    g.drawString(str, 50, 50);
	    g.drawRect(38, 38, 310, 15);
	    g.fillRect(38, 38, 310, 14);
	}

}
