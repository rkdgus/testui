package testui.content;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import testui.calendar.CalendarFrame;
import testui.common.TextFieldPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ReserveHeaderContent extends JPanel {

	
	public ReserveHeaderContent() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JLabel home = new JLabel("아이티 렌트카");
		home.setBounds(12, 0, 81, 24);
		add(home);
		
		TextFieldPanel startPanel = new TextFieldPanel("대여일  ");
		startPanel.setBounds(12, 31, 213, 35);
		add(startPanel);
		startPanel.setFocusable(false);
		startPanel.getTextField().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalendarFrame cf = new CalendarFrame(startPanel.getTextField());
				cf.setVisible(true);
			}
		});
		
		TextFieldPanel totalTimePanel = new TextFieldPanel("총");
		totalTimePanel.setBounds(627, 31, 137, 35);
		add(totalTimePanel);
		
		JLabel lblNewLabel = new JLabel("시간");
		lblNewLabel.setBounds(765, 31, 68, 35);
		add(lblNewLabel);
		
		JButton btnSearch = new JButton("차량검색");
		btnSearch.setBounds(833, 22, 122, 41);
		add(btnSearch);
		
		TextFieldPanel finalPanel = new TextFieldPanel("반납일  ");
		finalPanel.setBounds(314, 31, 213, 35);
		add(finalPanel);
		finalPanel.setFocusable(false);
		finalPanel.getTextField().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalendarFrame cf = new CalendarFrame(finalPanel.getTextField());
				cf.setVisible(true);
			}
		});
		
		
		String[] timeArr = { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30",
				"14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00",
				"19:30", "20:00", "20:30", "21:00" };
		DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(timeArr);
		DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(timeArr);
		JComboBox<String> startTimeCom = new JComboBox<String>(model1);
		startTimeCom.setBounds(231, 31, 82, 35);
		add(startTimeCom);
		
		JComboBox<String> finalTimeCom = new JComboBox<String>(model2);
		finalTimeCom.setBounds(533, 31, 82, 35);
		add(finalTimeCom);
				
	}
}
