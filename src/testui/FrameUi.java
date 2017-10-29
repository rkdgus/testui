package testui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class FrameUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameUi frame = new FrameUi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		InsertRentPanel panel = new InsertRentPanel();
		panel.setBounds(12, 43, 320, 450);
		contentPane.add(panel);
		
		CarListPanel panel_1 = new CarListPanel();
		panel_1.setBounds(358, 0, 588, 712);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("←뒤로");
		btnNewButton.setBounds(0, 0, 92, 31);
		contentPane.add(btnNewButton);
	}
}
