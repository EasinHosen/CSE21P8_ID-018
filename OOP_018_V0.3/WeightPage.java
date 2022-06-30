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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WeightPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFromW;
	private JTextField textFieldToW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightPage frame = new WeightPage();
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
	public WeightPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWeightConversion = new JLabel("Weight Conversion");
		lblWeightConversion.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeightConversion.setFont(new Font("MV Boli", Font.BOLD, 24));
		lblWeightConversion.setBounds(0, 0, 784, 40);
		contentPane.add(lblWeightConversion);
		
		textFieldFromW = new JTextField();
		textFieldFromW.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldFromW.setBounds(55, 130, 300, 70);
		contentPane.add(textFieldFromW);
		textFieldFromW.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("From");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(55, 90, 68, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTo.setBounds(55, 246, 68, 29);
		contentPane.add(lblTo);
		
		textFieldToW = new JTextField();
		textFieldToW.setEditable(false);
		textFieldToW.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldToW.setColumns(10);
		textFieldToW.setBounds(55, 286, 300, 70);
		contentPane.add(textFieldToW);
		
		Choice choiceFromW = new Choice();
		choiceFromW.setFont(new Font("Dialog", Font.PLAIN, 30));
		choiceFromW.setBounds(413, 130, 75, 60);
		contentPane.add(choiceFromW);
		
		choiceFromW.add("mg");
		choiceFromW.add("g");
		choiceFromW.add("Kg");
		choiceFromW.add("Ton");
		
		Choice choiceToW = new Choice();
		choiceToW.setFont(new Font("Dialog", Font.PLAIN, 30));
		choiceToW.setBounds(413, 286, 75, 60);
		contentPane.add(choiceToW);
		
		choiceToW.add("mg");
		choiceToW.add("g");
		choiceToW.add("Kg");
		choiceToW.add("Ton");
		
		JLabel lblMsgWeight = new JLabel("");
		lblMsgWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsgWeight.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMsgWeight.setBounds(55, 431, 300, 60);
		contentPane.add(lblMsgWeight);
		lblMsgWeight.setVisible(false);
		
		JButton btnMainMenuW = new JButton("<< Main menu");
		btnMainMenuW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConverterMain main = new ConverterMain();
				main.setVisible(true);
				dispose();
			}
		});
		btnMainMenuW.setBounds(10, 527, 120, 23);
		contentPane.add(btnMainMenuW);
		
		JButton btnExitW = new JButton("Exit");
		btnExitW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExitW.setBounds(685, 527, 89, 23);
		contentPane.add(btnExitW);
		
		JButton btnConvertW = new JButton("Convert");
		btnConvertW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFieldFromW.getText().isEmpty()) {
					textFieldToW.setText("");
					lblMsgWeight.setText("Invalid Input!!");
					lblMsgWeight.setVisible(true);
				} else {
					Double weightIn = Double.parseDouble(textFieldFromW.getText());
					
					if(choiceFromW.getSelectedIndex()==0) {
						if(choiceToW.getSelectedIndex()==0) {
							textFieldToW.setText(String.format("%.2f",weightIn));
						} else if(choiceToW.getSelectedIndex()==1) {
							Double toGm = weightIn * 1/1000;
							textFieldToW.setText(String.format("%.2f",toGm));
						} else if(choiceToW.getSelectedIndex()==2) {
							Double toKg = weightIn * 1/1000000;
							textFieldToW.setText(String.format("%.2f",toKg));
						} else if(choiceToW.getSelectedIndex()==3) {
							Double toKg = weightIn * 1/1000000000;
							textFieldToW.setText(String.format("%.2f",toKg));
						} 
					} else if(choiceFromW.getSelectedIndex()==1) {
						if(choiceToW.getSelectedIndex()==0) {
							Double toMg = weightIn * 1000;
							textFieldToW.setText(String.format("%.2f",toMg));
						} else if(choiceToW.getSelectedIndex()==1) {
							textFieldToW.setText(String.format("%.2f",weightIn));
						} else if(choiceToW.getSelectedIndex()==2) {
							Double toKg = weightIn * 1/1000;
							textFieldToW.setText(String.format("%.2f",toKg));
						} else if(choiceToW.getSelectedIndex()==3) {
							Double toKg = weightIn * 1/1000000;
							textFieldToW.setText(String.format("%.2f",toKg));
						}
				} else if(choiceFromW.getSelectedIndex()==2) {
					if(choiceToW.getSelectedIndex()==0) {
						Double toMg = weightIn * 1000000;
						textFieldToW.setText(String.format("%.2f",toMg));
					} else if(choiceToW.getSelectedIndex()==1) {
						Double toGm = weightIn * 1000;
						textFieldToW.setText(String.format("%.2f",toGm));
					} else if(choiceToW.getSelectedIndex()==2) {
						textFieldToW.setText(String.format("%.2f",weightIn));
					} else if(choiceToW.getSelectedIndex()==3) {
						Double toKg = weightIn * 1/1000;
						textFieldToW.setText(String.format("%.2f",toKg));
					}
			} else if(choiceFromW.getSelectedIndex()==3) {
				if(choiceToW.getSelectedIndex()==0) {
					Double toMg = weightIn * 1000000000;
					textFieldToW.setText(String.format("%.2f",toMg));
				} else if(choiceToW.getSelectedIndex()==1) {
					Double toGm = weightIn * 1000000;
					textFieldToW.setText(String.format("%.2f",toGm));
				} else if(choiceToW.getSelectedIndex()==2) {
					Double toKg = weightIn * 1000;
					textFieldToW.setText(String.format("%.2f",toKg));
				} else if(choiceToW.getSelectedIndex()==3) {
					textFieldToW.setText(String.format("%.2f",weightIn));
				}
		}
			}
		}});
		btnConvertW.setForeground(Color.BLUE);
		btnConvertW.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnConvertW.setBounds(557, 161, 176, 70);
		contentPane.add(btnConvertW);
		
		JButton btnClearW = new JButton("Clear");
		btnClearW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldFromW.setText(null);
				textFieldToW.setText(null);
				lblMsgWeight.setVisible(false);
			}
		});
		btnClearW.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClearW.setBounds(598, 246, 102, 60);
		contentPane.add(btnClearW);
	}
}
