import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class RESERVATIONMANAGEMENT {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RESERVATIONMANAGEMENT window = new RESERVATIONMANAGEMENT();
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
	public RESERVATIONMANAGEMENT() {
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
		
		JLabel availabilityImg_1 = new JLabel("");
		availabilityImg_1.setIcon(new ImageIcon(RESERVATIONMANAGEMENT.class.getResource("/IMAGES/continuebtn.png")));
		availabilityImg_1.setBounds(454, 496, 80, 36);
		frame.getContentPane().add(availabilityImg_1);
		
		JLabel managementIMG = new JLabel("");
		managementIMG.setIcon(new ImageIcon(RESERVATIONMANAGEMENT.class.getResource("/IMAGES/RESERVATIONMANAGEMENT.png")));
		managementIMG.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(managementIMG);
	}

}
