import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AVAILABILITYCHECKING {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AVAILABILITYCHECKING window = new AVAILABILITYCHECKING();
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
	public AVAILABILITYCHECKING() {
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
		
		JLabel availabilityImg = new JLabel("");
		availabilityImg.setIcon(new ImageIcon(AVAILABILITYCHECKING.class.getResource("/IMAGES/availbtn.png")));
		availabilityImg.setBounds(143, 411, 128, 36);
		frame.getContentPane().add(availabilityImg);
		
		JLabel reservationsImg = new JLabel("");
		reservationsImg.setIcon(new ImageIcon(AVAILABILITYCHECKING.class.getResource("/IMAGES/reservationsbtn.png")));
		reservationsImg.setBounds(597, 130, 128, 36);
		frame.getContentPane().add(reservationsImg);
		
		JLabel availabilityImg_1 = new JLabel("");
		availabilityImg_1.setIcon(new ImageIcon(AVAILABILITYCHECKING.class.getResource("/IMAGES/reservebtn.png")));
		availabilityImg_1.setBounds(440, 477, 80, 36);
		frame.getContentPane().add(availabilityImg_1);
		
		JLabel availImg = new JLabel("");
		availImg.setIcon(new ImageIcon(AVAILABILITYCHECKING.class.getResource("/IMAGES/AVAILABILITYCHECKING.png")));
		availImg.setBounds(0, 0, 984, 561);
		frame.getContentPane().add(availImg);
	}

}
