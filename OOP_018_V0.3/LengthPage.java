import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.Color;

public class LengthPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFromL;
	private JTextField textFieldToL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengthPage frame = new LengthPage();
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
	public LengthPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLengthConversion = new JLabel("Length Conversion");
		lblLengthConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblLengthConversion.setFont(new Font("MV Boli", Font.BOLD, 24));
		lblLengthConversion.setBounds(0, 0, 784, 40);
		contentPane.add(lblLengthConversion);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(55, 95, 68, 29);
		contentPane.add(lblNewLabel);
		
		textFieldFromL = new JTextField();
		textFieldFromL.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldFromL.setColumns(10);
		textFieldFromL.setBounds(55, 137, 300, 70);
		contentPane.add(textFieldFromL);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTo.setBounds(55, 253, 68, 29);
		contentPane.add(lblTo);
		
		textFieldToL = new JTextField();
		textFieldToL.setEditable(false);
		textFieldToL.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldToL.setColumns(10);
		textFieldToL.setBounds(55, 295, 300, 70);
		contentPane.add(textFieldToL);
		
		Choice choiceFromL = new Choice();
		choiceFromL.setFont(new Font("Dialog", Font.PLAIN, 30));
		choiceFromL.setBounds(416, 137, 75, 45);
		contentPane.add(choiceFromL);
		
		Choice choiceToL = new Choice();
		choiceToL.setFont(new Font("Dialog", Font.PLAIN, 30));
		choiceToL.setBounds(416, 295, 75, 45);
		contentPane.add(choiceToL);
		
		JButton btnConvertL = new JButton("Convert");
		btnConvertL.setForeground(Color.BLUE);
		btnConvertL.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnConvertL.setBounds(564, 183, 176, 70);
		contentPane.add(btnConvertL);
		
		JButton btnClearL = new JButton("Clear");
		btnClearL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClearL.setBounds(602, 266, 102, 60);
		contentPane.add(btnClearL);
		
		JButton btnMainMenuL = new JButton("<< Main menu");
		btnMainMenuL.setBounds(12, 525, 120, 23);
		contentPane.add(btnMainMenuL);
		
		JButton btnExitL = new JButton("Exit");
		btnExitL.setBounds(683, 522, 89, 23);
		contentPane.add(btnExitL);
		
		JLabel lblMsgLength = new JLabel("");
		lblMsgLength.setFont(new Font("SansSerif", Font.PLAIN, 30));
		lblMsgLength.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsgLength.setBounds(55, 419, 300, 60);
		contentPane.add(lblMsgLength);
	}
}
