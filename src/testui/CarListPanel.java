package testui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
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
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
	
	}
}
