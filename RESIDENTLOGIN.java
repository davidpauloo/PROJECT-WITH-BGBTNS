import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RESIDENTLOGIN {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RESIDENTLOGIN window = new RESIDENTLOGIN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RESIDENTLOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel loginImg = new JLabel("");
		loginImg.setIcon(new ImageIcon(RESIDENTLOGIN.class.getResource("/IMAGES/loginbtn.png")));
		loginImg.setBounds(707, 438, 80, 40);
		frame.getContentPane().add(loginImg);
		
		JLabel resiImg = new JLabel("");
		resiImg.setIcon(new ImageIcon(RESIDENTLOGIN.class.getResource("/IMAGES/RESIDENTLOGIN.png")));
		resiImg.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(resiImg);
	}

}
