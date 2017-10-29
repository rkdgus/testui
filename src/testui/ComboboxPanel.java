package testui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class ComboboxPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ComboboxPanel(String str) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);

	}

}
