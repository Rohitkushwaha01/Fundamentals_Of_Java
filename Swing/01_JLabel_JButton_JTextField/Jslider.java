package swingpackage;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Jslider {

	public static void main(String[] args) {
		JFrame frame = new JFrame("SliderDemo");
		JLabel label = new JLabel();
		JPanel panel = new JPanel();
		JSlider slider = new JSlider(0,100);
		
		panel.setPreferredSize(new Dimension(400, 250));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("Temperature:  °C " + slider.getValue());
		
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label.setText("Temperature °C " + slider.getValue());
			}
			
		});
		
		panel.add(slider);
		frame.add(panel);
		frame.add(label);
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
	}

}
