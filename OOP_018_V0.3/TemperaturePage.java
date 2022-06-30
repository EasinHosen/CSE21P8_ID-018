import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Choice;

public class TemperaturePage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldInT;
	private final Choice choiceT = new Choice();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperaturePage frame = new TemperaturePage();
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
	public TemperaturePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTemperatureConversion = new JLabel("Temperature Conversion");
		lblTemperatureConversion.setBounds(0, 11, 784, 40);
		lblTemperatureConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTemperatureConversion.setFont(new Font("MV Boli", Font.BOLD, 24));


		
		JButton btnMainMenuT = new JButton("<< Main menu");
		btnMainMenuT.setBounds(10, 521, 125, 29);
		btnMainMenuT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConverterMain main = new ConverterMain();
				main.setVisible(true);
				dispose();
			}
		});
		
		JButton btnExitT = new JButton("Exit");
		btnExitT.setBounds(709, 521, 65, 29);
		btnExitT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		textFieldInT = new JTextField();
		textFieldInT.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldInT.setBounds(100, 152, 226, 47);
		textFieldInT.setColumns(10);
		
		JLabel lebelMsgTemp = new JLabel("");
		lebelMsgTemp.setBounds(100, 220, 414, 225);
		lebelMsgTemp.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		
		JButton btnConvertT = new JButton("Convert");
		btnConvertT.setBounds(530, 146, 154, 63);
		btnConvertT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldInT.getText().isEmpty()) {
					lebelMsgTemp.setVisible(true);
					lebelMsgTemp.setText("Invalid Input");
				} else {
					Double temperature = Double.parseDouble(textFieldInT.getText());
					
					if(choiceT.getSelectedIndex() == 0) {
						Double farenheit = (temperature * 1.8) + 32;
						Double kelvin = temperature + 273.15;
						String far = String.format("%.2f",farenheit);
						String kel = String.format("%.2f", kelvin);
						
						
						String output = ("<html><p>Temperature <br/>In Farenheit: " + far +"<br/>In Kelvin: " + kel+"</p></html>");
						lebelMsgTemp.setVisible(true);
						lebelMsgTemp.setText(output);
						
					} else if(choiceT.getSelectedIndex() == 1) {
						Double celsius = (temperature-32) * 5/9;
						Double kelvin = celsius + 273.15;
						
						String cel = String.format("%.2f",celsius);
						String kel = String.format("%.2f", kelvin);
						
						
						String output = ("<html><p>Temperature <br/>In Celsius: " + cel +"<br/>In Kelvin: " + kel+"</p></html>");
						lebelMsgTemp.setVisible(true);
						lebelMsgTemp.setText(output);
						
					} else if(choiceT.getSelectedIndex() == 2) {
					
						Double celsius = temperature - 273.15;
						Double farenheit = (celsius * 1.8) + 32;
						
						String cel = String.format("%.2f",celsius);
						String far = String.format("%.2f", farenheit);
						
						
						String output = ("<html><p>Temperature <br/>In Celsius: " + cel +"<br/>In Farenheit: " + far+"</p></html>");
						lebelMsgTemp.setVisible(true);
						lebelMsgTemp.setText(output);
						
					}
				}
			}
		});
		btnConvertT.setForeground(Color.BLUE);
		btnConvertT.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton btnClearT = new JButton("Clear");
		btnClearT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClearT.setBounds(530, 220, 154, 63);
		btnClearT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldInT.setText(null);
				lebelMsgTemp.setText(null);
			}
		});
		lebelMsgTemp.setVisible(false);
		contentPane.setLayout(null);
		contentPane.add(lblTemperatureConversion);
		contentPane.add(textFieldInT);
		contentPane.add(btnConvertT);
		contentPane.add(btnClearT);
		contentPane.add(lebelMsgTemp);
		contentPane.add(btnMainMenuT);
		contentPane.add(btnExitT);
		choiceT.setFont(new Font("Dialog", Font.PLAIN, 30));
		choiceT.setBounds(393, 152, 75, 45);
		contentPane.add(choiceT);
		
		choiceT.add("°C");
		choiceT.add("°F");
		choiceT.add("°K");
	}
}
