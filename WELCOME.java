import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class WELCOME {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOME window = new WELCOME();
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
	public WELCOME() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(WELCOME.class.getResource("/IMAGES/welcomenterbtn.png")));
		lblNewLabel.setBounds(467, 482, 80, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel welcomeImg = new JLabel("");
		welcomeImg.setIcon(new ImageIcon(WELCOME.class.getResource("/IMAGES/LASTHOME.png")));
		welcomeImg.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(welcomeImg);
	}

}
