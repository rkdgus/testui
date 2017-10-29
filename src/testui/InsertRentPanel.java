package testui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class InsertRentPanel extends JPanel {

	
	public InsertRentPanel() {
		setForeground(Color.BLACK);
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("렌탈 견적");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 320, 49);
		add(lblNewLabel);
		
		ComboPanel comboPanel = new ComboPanel("대여일 : ");
		comboPanel.setBounds(12, 133, 289, 34);
		add(comboPanel);
		
		TextFieldPanel panel = new TextFieldPanel("총 시간 : ");
		panel.setBounds(93, 195, 198, 34);
		add(panel);
		
		ComboPanel panel_1 = new ComboPanel("반납일 : ");
		panel_1.setBounds(12, 79, 289, 35);
		add(panel_1);
		
		JButton btnNewButton = new JButton("신 청");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		btnNewButton.setBounds(12, 388, 296, 52);
		add(btnNewButton);
		
		RadioPanel panel_2 = new RadioPanel("자차 보험 :", "포함","비포함");
		panel_2.setBounds(26, 313, 275, 34);
		add(panel_2);
		
		ComboboxPanel panel_3 = new ComboboxPanel("차종 : ");
		panel_3.setBounds(93, 256, 198, 34);
		add(panel_3);
	}
}
