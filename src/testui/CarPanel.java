package testui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CarPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarPanel() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\강현\\Desktop\\새 폴더 (2)\\그림8.jpg"));
		add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 5, 0, 5));
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		TfPanel panel_1 = new TfPanel("차량요금");
		panel.add(panel_1);
		
		TfPanel panel_2 = new TfPanel("보험료");
		panel.add(panel_2);
		
		TfPanel panel_3 = new TfPanel("할인금액");
		panel.add(panel_3);
		
		TfPanel panel_4 = new TfPanel("총 결제금액");
		panel.add(panel_4);
		
		JButton btnNewButton = new JButton("예약");
		panel.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		add(panel_5, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("소나타");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오토/휘발류");
		panel_5.add(lblNewLabel_2);

	}
}
