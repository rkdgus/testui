package testui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class CarListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarListPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 46, 588, 656);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		CarContent panel_2 = new CarContent();
		JScrollPane scrollPane = new JScrollPane(panel_2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(scrollPane, BorderLayout.CENTER);
		
	
		
	


		
	}
}
