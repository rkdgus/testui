package testui;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class CarContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarContent() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		car1 panel = new car1();
		panel.setAlignmentY(500.0f);
		panel.setAlignmentX(500.0f);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		car1 panel_1 = new car1();
		add(panel_1);
		
		car1 panel_2 = new car1();
		add(panel_2);

	}
}
