package testui;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class InsertTotalContent extends JPanel {

	
	private TextFieldPanel panelId;
	private TextFieldPanel panelPw;
	private TextFieldPanel panelName;
	private TextFieldPanel panelGrade;

	public InsertTotalContent() {
		setLayout(new GridLayout(0, 1, 0, 5));
		
		panelId = new TextFieldPanel("");
		add(panelId);
		
		panelPw = new TextFieldPanel("");
		add(panelPw);
		
		panelName = new TextFieldPanel("할인요금");
		add(panelName);
		
		panelGrade = new TextFieldPanel("최종요금");
		add(panelGrade);
	}

	public void setContent() {
		

	}

	public void isEmptyCheck() throws Exception {
		panelId.isEmptyCheck();
		panelPw.isEmptyCheck();
		panelName.isEmptyCheck();
		panelGrade.isEmptyCheck();
	}

	public void clear() {
		panelId.setTextValue("");
		panelPw.setTextValue("");
		panelName.setTextValue("");
		panelGrade.setTextValue("");
	}

}
