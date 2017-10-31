package testui;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class UserMainRent extends JPanel {

	public UserMainRent() {
		setLayout(null);
		
		//위 좌측 패널
		InsertRentContent UpLeftPanel = new InsertRentContent();
		UpLeftPanel.setBounds(0, 0, 430, 392);
		add(UpLeftPanel);
		UpLeftPanel.setLayout(null);
		
		// 위 우측 패널
		JPanel UpRightPanel = new JPanel();
		UpRightPanel.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		UpRightPanel.setLayout(new BorderLayout(0, 0));	
		
		add(UpRightPanel);
		
		AbstractTable userRentUpTable = new UserRentUpTable();
		userRentUpTable.loadDate();
		UpRightPanel.add(userRentUpTable, BorderLayout.CENTER);
		UpRightPanel.setBounds(436, 0, 538, 392);
				
		// 아래 우측 패널
		JPanel MiddlePanel = new JPanel();
		MiddlePanel.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		MiddlePanel.setLayout(new BorderLayout(0, 0));
		add(MiddlePanel);
		
		AbstractTable userRentBottomTable = new UserRentBottomTable();
		userRentBottomTable.loadDate();
		MiddlePanel.add(userRentBottomTable, BorderLayout.CENTER);
		MiddlePanel.setBounds(0, 397, 974, 74);
		
		// 아래 좌측 패널
		JPanel BottomLeftPanel = new JPanel();
		BottomLeftPanel.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		BottomLeftPanel.setBounds(0, 476, 567, 275);
		add(BottomLeftPanel);
		BottomLeftPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Images\\428i.gif"));
		lblNewLabel.setBounds(0, 0, 567, 275);
		BottomLeftPanel.add(lblNewLabel);
		
		InsertTotalContent BottomRightPanel = new InsertTotalContent();
		BottomRightPanel.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		BottomRightPanel.setBounds(571, 476, 403, 275);
		add(BottomRightPanel);
		
		JPanel panel = new JPanel();
		BottomRightPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnCalculation = new JButton("계산하기");
		btnCalculation.setBounds(31, 10, 99, 30);
		panel.add(btnCalculation);
		
		JButton btnReserve = new JButton("예약하기");
		btnReserve.setBounds(158, 10, 99, 30);
		panel.add(btnReserve);
		
		JButton btnExit = new JButton("나가기");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = UserMain.getInstance();
				frame.getContentPane().removeAll();
				frame.getContentPane().add(new UserMainHome(), BorderLayout.CENTER);
				frame.setVisible(true);
				
			}
		});
		btnExit.setBounds(281, 10, 99, 30);
		panel.add(btnExit);

	}
}
