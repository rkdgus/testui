package testui;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class InsertRentContent extends JPanel {

	
	public InsertRentContent() {
		setForeground(Color.WHITE);
		setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		setLayout(null);
		
		ComboPanel comboPanel = new ComboPanel("대여일 : ");
		comboPanel.setBounds(70, 104, 289, 34);
		add(comboPanel);
		
		TextFieldPanel panel = new TextFieldPanel("총 시간 : ");
		panel.setBounds(103, 158, 198, 34);
		add(panel);
		
		ComboPanel panel_1 = new ComboPanel("반납일 : ");
		panel_1.setBounds(70, 59, 289, 35);
		add(panel_1);
		
		RadioPanel panel_2 = new RadioPanel("자차 보험 :", "포함","비포함");
		panel_2.setBounds(70, 266, 289, 34);
		add(panel_2);
		
		ComboboxPanel panel_3 = new ComboboxPanel("차종 : ");
		panel_3.setBounds(103, 212, 198, 34);
		add(panel_3);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setBounds(113, 329, 246, 34);
		add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Images\\search.png"));
		label.setBounds(67, 310, 44, 72);
		add(label);
	}
}
