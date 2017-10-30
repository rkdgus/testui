package testui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class CarListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarListPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("차량 리스트");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 588, 49);
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 46, 588, 656);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		CarContent panel_2 = new CarContent();
		JScrollPane scrollPane = new JScrollPane(panel_2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 2));
		panel.add(scrollPane, BorderLayout.CENTER);
		
	
		
	


		
	}
}
