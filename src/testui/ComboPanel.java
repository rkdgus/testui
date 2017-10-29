package testui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class ComboPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ComboPanel(String str) {
		setLayout(new GridLayout(1, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);

	}
	
	
}
