package testui;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;

public class CarContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarContent() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarList panel = new CarList();
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarList panel_1 = new CarList();
		add(panel_1);
		panel_1.setLayout(null);
		
		CarList carList = new CarList();
		add(carList);
		carList.setLayout(null);
		
		CarList carList_1 = new CarList();
		add(carList_1);
		
		CarList carList_2 = new CarList();
		add(carList_2);
		carList_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarList carList_3 = new CarList();
		add(carList_3);
		carList_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarList carList_4 = new CarList();
		add(carList_4);
		carList_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		CarList carList_5 = new CarList();
		add(carList_5);
		carList_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

	}
}
