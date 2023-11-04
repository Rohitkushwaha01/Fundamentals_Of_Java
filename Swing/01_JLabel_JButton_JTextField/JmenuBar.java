package swingpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JmenuBar{

	static JMenuBar menubar;
	static JMenu fileMenu;
	static JMenu editMenu;
	static JMenu helpMenu;
	static JMenuItem loadItem;
	static JMenuItem saveItem;
	static JMenuItem exitItem;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		menubar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		menubar.add(fileMenu);
		menubar.add(editMenu);
		menubar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // alt + e for save
		helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help
		
		loadItem.setMnemonic(KeyEvent.VK_L); // L for file
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for help
		
		
		loadItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == loadItem) {
					System.out.println("Loading");
				}
			}
		});
		
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == saveItem) {
					System.out.println("Saved");
				}
			}
		});
		
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == exitItem) {
					System.out.println("exiting");
					frame.dispose();
				}
			}
		});
		
		frame.setJMenuBar(menubar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setSize(400,400); // sets the size of frame
		frame.setLayout(null);
		frame.setVisible(true);
	}

	

	
}					
		