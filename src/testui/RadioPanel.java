package testui;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public RadioPanel(String srt,String srt1,String srt2) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel(srt);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(srt1);
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(srt2);
		add(rdbtnNewRadioButton_1);

	}

}
