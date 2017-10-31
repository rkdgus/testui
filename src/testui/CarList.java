package testui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class CarList extends JPanel {
	ImageIcon img;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public CarList() {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		img = new ImageIcon("D:\\workspace\\workspace_java\\testProject\\src\\testProject\\ui\\car1.jpg");
		setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\DGIT3-10\\Desktop\\차\\sorentoR.jpg"));
		lblNewLabel.setBounds(28, 52, 531, 233);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[소형차]K3");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(173, 10, 173, 32);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("휘발/오토/5인승");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_2.setBounds(322, 14, 115, 32);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("차량요금");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(31, 302, 68, 32);
		add(lblNewLabel_3);
		
		JLabel label = new JLabel("총결제금액");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(363, 303, 85, 31);
		add(label);
		
		JLabel label_1 = new JLabel("보험요금");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(123, 302, 99, 32);
		add(label_1);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(12, 344, 99, 32);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(123, 344, 99, 32);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(350, 344, 115, 32);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("예약");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton.setBounds(477, 337, 90, 39);
		add(btnNewButton);
		
		JLabel label_2 = new JLabel("할인요금");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		label_2.setBounds(253, 302, 68, 32);
		add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(234, 344, 103, 32);
		add(textField_3);
	}

}
