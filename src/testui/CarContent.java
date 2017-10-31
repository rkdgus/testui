package testui;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import java.awt.BorderLayout;

public class CarContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarContent() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarPanel panel = new CarPanel();
		add(panel);
		
		CarPanel panel_1 = new CarPanel();
		add(panel_1);
		
		CarPanel ppppp_ = new CarPanel();
		add(ppppp_);
		
		CarPanel ppppp__1 = new CarPanel();
		add(ppppp__1);

	}
}
