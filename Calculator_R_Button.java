package Calculator_Ro_Buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_R_Button extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	
	String number, operations, answer;
	double num1, num2;
	double results;
	private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_R_Button frame = new Calculator_R_Button();
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
	public Calculator_R_Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 235, 46);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(number);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 93, 70, 59);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn8.setBounds(82, 93, 70, 59);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn9.setBounds(154, 93, 70, 59);
		contentPane.add(btn9);
		
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setBounds(226, 93, 70, 59);
		contentPane.add(btnDivide);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn4.setBounds(10, 152, 70, 59);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn5.setBounds(82, 152, 70, 59);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(number);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn6.setBounds(154, 152, 70, 59);
		contentPane.add(btn6);
		
		JButton btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMulti.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnMulti.setBounds(226, 152, 70, 59);
		contentPane.add(btnMulti);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(number);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn1.setBounds(10, 212, 70, 59);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn2.setBounds(82, 212, 70, 59);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn3.setBounds(154, 212, 70, 59);
		contentPane.add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnMinus.setBounds(226, 212, 70, 59);
		contentPane.add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Arial Black", Font.BOLD, 18));
		btn0.setBounds(10, 272, 70, 59);
		contentPane.add(btn0);
		
		JButton btnComma = new JButton(".");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String number = txtDisplay.getText() + btnComma.getText();
				txtDisplay.setText(number);
			}
		});
		btnComma.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnComma.setBounds(82, 272, 70, 59);
		contentPane.add(btnComma);
		
		JButton btnEqualTo = new JButton("=");
		btnEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				num2 = Double.parseDouble(txtDisplay.getText());
				if(operations == ("+"))
				{
					results =  num1 + num2;
					answer = String.format("%.2f", results);
					txtDisplay.setText(answer);
				}
				else if (operations == ("-"))
				
				{
					results = num1 - num2;
					answer = String.format("%.2f", results);
					txtDisplay.setText(answer);
			
				}
				
				else if(operations == ("*"))
					{
						results = num1 * num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
					}
					else if (operations == ("/"))
					
					{
						results = num1 / num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
				}
					else if (operations == ("%"))
					{
						results = num1 % num2;
						answer = String.format("%.2f", results);
						txtDisplay.setText(answer);
					}
				
			}
		});
		btnEqualTo.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnEqualTo.setBounds(226, 331, 70, 59);
		contentPane.add(btnEqualTo);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
				
			}
		});
		btnPlus.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnPlus.setBounds(226, 272, 70, 59);
		contentPane.add(btnPlus);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(82, 331, 70, 59);
		contentPane.add(btnClear);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops =ops * (-1);
           txtDisplay.setText(String.valueOf(ops));
			}
			
		});
		btnPlusMinus.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnPlusMinus.setBounds(154, 272, 70, 59);
		contentPane.add(btnPlusMinus);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnPercent.setBounds(154, 331, 70, 59);
		contentPane.add(btnPercent);
		
		JButton btnBs = new JButton("\u2190");
		btnBs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String number = (null);
				
				if (txtDisplay.getText().length()>0 ){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1 );
					number = strB.toString();
					txtDisplay.setText(number);
		
				}
			}
		});
		btnBs.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBs.setBounds(10, 331, 70, 59);
		contentPane.add(btnBs);
	}
}
