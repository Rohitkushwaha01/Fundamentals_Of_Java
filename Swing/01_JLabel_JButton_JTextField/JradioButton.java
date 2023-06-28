package swingpackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JradioButton{

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JRadioButton pizzaBtn = new JRadioButton("Pizza");
		JRadioButton burgerBtn = new JRadioButton("Burger");
		JRadioButton subBurgerBtn = new JRadioButton("SubBurger");
		
		ButtonGroup group = new ButtonGroup();
		group.add(subBurgerBtn);
		group.add(pizzaBtn);
		group.add(burgerBtn);
		
		pizzaBtn.setFocusable(false);
		burgerBtn.setFocusable(false);
		subBurgerBtn.setFocusable(false);
		
		pizzaBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==pizzaBtn) {
					System.out.println("You have ordered Pizza!!");
				}
			}
		});
		
		burgerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==burgerBtn) {
					System.out.println("You have ordered Burger!!");
				}
			}
		});
		
		subBurgerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==subBurgerBtn) {
					System.out.println("You have ordered Sub Burger!!");
				}
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(pizzaBtn);
		f.add(burgerBtn);
		f.add(subBurgerBtn);
		f.pack();
		f.setVisible(true);
	}


}
