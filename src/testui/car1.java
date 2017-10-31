package testui;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import java.awt.BorderLayout;

public class car1 extends JPanel implements ActionListener {
	private	ImageIcon img;
	/**
	 * Create the panel.
	 */
	public car1() {
		setBounds(new Rectangle(0, 0, 500, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 974, 137);
		add(panel);
		panel.setLayout(null);
		
		ComboPanel panel_1 = new ComboPanel("대여일");
		panel_1.setBounds(21, 84, 254, 40);
		panel.add(panel_1);
		
		ComboPanel comboPanel = new ComboPanel("반납일");
		comboPanel.setBounds(305, 84, 254, 40);
		panel.add(comboPanel);
		
		TextFieldPanel panel_2 = new TextFieldPanel("총 시간");
		panel_2.setBounds(586, 84, 170, 40);
		panel.add(panel_2);
		
		JButton btnNewButton = new JButton("차량 검색");
		btnNewButton.setBounds(852, 84, 97, 40);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\"\"님 환영합니다");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(808, 31, 130, 31);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이티 렌터카");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(11, 26, 130, 40);
		panel.add(lblNewLabel_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 974, 31);
		panel.add(toolBar);
		
		JButton btnNewButton_2 = new JButton("<-");
		toolBar.add(btnNewButton_2);
		
		JButton button = new JButton("새로고침");
		toolBar.add(button);
		
		JButton btnNewButton_1 = new JButton("홈");
		toolBar.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 146, 302, 605);
		add(panel_3);
		panel_3.setLayout(null);
		
		RadioPanel panel_5 = new RadioPanel("자차 보험", "포함", "비포함");
		panel_5.setBounds(12, 341, 259, 59);
		panel_3.add(panel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(110, 90, 160, 36);
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("차종검색");
		lblNewLabel_2.setBounds(41, 101, 57, 15);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("차량검색");
		lblNewLabel_3.setBounds(41, 202, 57, 15);
		panel_3.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 191, 160, 36);
		panel_3.add(comboBox_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 302, 53);
		panel_3.add(panel_6);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(310, 147, 664, 604);
		add(panel_4);
		panel_4.setLayout(null);
		img = new ImageIcon("D:\\workspace\\workspace_java\\testProject\\src\\testProject\\ui\\car1.jpg");

	}
	public void actionPerformed(ActionEvent e) {
	}
}
