// Applet do not have main function in it;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents extends Applet implements MouseListener {
	String str = "Holi Is coming @2023";
	int x  =400;
	int y  = 400;
	Font f1;
	
	// Initializing Applet
	public void init(){
		f1 = new Font("Arial",Font.BOLD,100);
		setBackground(Color.cyan);
		addMouseListener(this); // when started initialize with key listener
	}
	
	// Overiding all the methods of mouseListener interface(mouseClicked, mouseEntered, mouseExited,mousePressed)
	public void mouseClicked(MouseEvent arg0) {
		setForeground(Color.WHITE);
		setBackground(Color.green);
		x = 200;
		str = "Bura na Mano Holi Heyy!!";
		showStatus(str);
		repaint();
	}


	public void mouseEntered(MouseEvent arg0) {
		setForeground(Color.WHITE);
		setBackground(Color.ORANGE);
		x = 200;
		str = "One of the biggest festival!";
		showStatus(str);
		repaint();
	}

	public void mouseExited(MouseEvent arg0) {
		setForeground(Color.WHITE);
		setBackground(Color.red);
		x  = 500;
		str = "The End";
		showStatus(str);
		repaint();
	}

	public void mousePressed(MouseEvent arg0) {
		setForeground(Color.WHITE);
		setBackground(Color.blue);
		x = 500;
		str = "Holi Haye!!!";
		showStatus(str);
		repaint();
	}

	public void mouseReleased(MouseEvent arg0) {
		setForeground(Color.WHITE);
		setBackground(Color.yellow);
		new Font("Arial",Font.BOLD,18);
		str = "Mouse Released";
		showStatus("Mouse Released");
		repaint();
	}
	

	public void paint(Graphics g){
		g.setFont(f1);
	    g.drawString(str, x, y);
	}
}
