package testui;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class FrameUi extends JFrame {

	
	private ImageIcon img;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
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
		img = new ImageIcon("C:\\Users\\DGIT3-10\\Desktop\\Images\\jeepBack2.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 974, 751);
		
		JPanel back = new JPanel(){
			public void paintComponent(Graphics g){
				g.drawImage(img.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		back.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(back);
		back.setLayout(null);
		
		InsertRentPanel panel = new InsertRentPanel();
		panel.setBounds(12, 43, 320, 450);
		back.add(panel);
		
		CarListPanel panel_1 = new CarListPanel();
		panel_1.setBounds(358, 0, 588, 712);
		back.add(panel_1);
		
		JButton btnNewButton = new JButton("←뒤로");
		btnNewButton.setBounds(0, 0, 92, 31);
		back.add(btnNewButton);
		
		
		
		
	}
}
