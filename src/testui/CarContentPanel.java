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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class CarContentPanel extends JPanel implements ActionListener {
	private	ImageIcon img;
	/**
	 * Create the panel.
	 */
	public CarContentPanel() {
		setBounds(new Rectangle(0, 0, 500, 500));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 0, 974, 125);
		add(panel);
		panel.setLayout(null);
		
		ComboPanel panel_1 = new ComboPanel("대여일   ");
		panel_1.setBounds(11, 76, 254, 31);
		panel.add(panel_1);
		
		ComboPanel comboPanel = new ComboPanel("반납일   ");
		comboPanel.setBounds(259, 76, 254, 31);
		panel.add(comboPanel);
		
		TextFieldPanel panel_2 = new TextFieldPanel("총 시간  ");
		panel_2.setBounds(542, 76, 121, 31);
		panel.add(panel_2);
		
		JButton btnNewButton = new JButton("차량검색");
		btnNewButton.setBounds(861, 76, 85, 31);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\"\"님 ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(808, 31, 130, 31);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이티 렌터카");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(11, 26, 130, 40);
		panel.add(lblNewLabel_1);
		
		ComboboxPanel panel_7 = new ComboboxPanel("차종  ");
		panel_7.setBounds(672, 76, 155, 31);
		panel.add(panel_7);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 974, 27);
		panel.add(toolBar);
		
		JButton btnNewButton_1 = new JButton("←뒤로");
		toolBar.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(0, 135, 302, 616);
		add(panel_3);
		panel_3.setLayout(null);
		
		RadioPanel panel_5 = new RadioPanel("자차 보험", "포함", "비포함");
		panel_5.setBounds(11, 358, 279, 59);
		panel_3.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("차량검색");
		lblNewLabel_3.setBounds(41, 202, 57, 15);
		panel_3.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(110, 191, 160, 36);
		panel_3.add(comboBox_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(0, 0, 302, 53);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("상세정보");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(43, 10, 94, 33);
		panel_6.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(310, 135, 664, 616);
		add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_4.add(scrollPane);
		
		CarContent panel_8 = new CarContent();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		img = new ImageIcon("D:\\workspace\\workspace_java\\testProject\\src\\testProject\\ui\\car1.jpg");

	}
	public void actionPerformed(ActionEvent e) {
	}
}
