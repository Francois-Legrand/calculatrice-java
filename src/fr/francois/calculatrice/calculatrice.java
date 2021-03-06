package fr.francois.calculatrice;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.SwingConstants;
import java.awt.Font;

public class calculatrice {

	private JFrame frmCalculatrice;
	private JTextField textField;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private Double result;
	private boolean addition = false;
	private boolean soustraction = false;
	private boolean multiplication = false;
	private boolean division = false;
	private Double numberOneDouble;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatrice window = new calculatrice();
					window.frmCalculatrice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatrice() {
		initialize();
		textField.setText("0");
		System.out.println(textField.getText());
		if(textField.getText().equals("0")) {
			System.out.println("ok");
		}
			
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatrice = new JFrame();
		frmCalculatrice.setResizable(false);
		frmCalculatrice.setTitle("Calculatrice");
		frmCalculatrice.setBounds(200, 200, 520, 500);
		frmCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatrice.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(10, 15, 500, 100);
		frmCalculatrice.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_7 = new JButton("7"); 
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_7.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_7.setBounds(9, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_8.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_8.setBounds(94, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_9.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_9.setBounds(179, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_9);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText("");
					addition = false;
					soustraction = false;
					multiplication = false;
					division = true;
					
					if(result == null) {
						result = numberOneDouble;
						System.out.println(result);
					}else {
						System.out.println("on est ici "+result+ " / " +numberOneDouble );
						result /= numberOneDouble;
						textField.setText(df2.format(result));
					}
				} catch (Exception e2) {
					
					System.out.println("Cette action n'est pas possible");
				}
			}
		});
		button_div.setBounds(265, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_div);
		
		JButton button_return = new JButton("<-");
		button_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int textInt = textField.getText().length();
				String textNumber = textField.getText();
				if (textField.getText() == null || textInt == 0) {
					System.out.println("Aucun caractère n'a été trouvé");
				}else {
					String deleteChar = textNumber.substring(0, textInt - 1);
					textField.setText(deleteChar);
					System.out.println(textInt);
				}
				
			}
		});
		
		button_return.setBounds(350, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_return);
		JButton button_c = new JButton("C");
		button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				result = null;
				numberOneDouble = null;
			}
		});
		button_c.setBounds(435, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_c);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_4.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_4.setBounds(9, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_5.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_5.setBounds(94, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_6.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_6.setBounds(179, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_6);
		
		JButton button_mult = new JButton("x");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText("");
					addition = false;
					soustraction = false;
					multiplication = true;
					division = false;
					if(result == null) {
						result = numberOneDouble;
						System.out.println(result);
					}else {
						System.out.println("on est ici "+result+ " * " +numberOneDouble );
						result *= numberOneDouble;
						textField.setText(df2.format(result));
					}
				} catch (Exception e2) {
					
					System.out.println("Cette action n'est pas possible");
				}
			}
		});
		button_mult.setBounds(265, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_mult);
		
		JButton button_parzg = new JButton("(");
		button_parzg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_parzg.getText();
				textField.setText(textNumber);
			}
		});
		button_parzg.setBounds(350, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_parzg);
		
		JButton button_parzd = new JButton(")");
		button_parzd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_parzd.getText();
				textField.setText(textNumber);
			}
		});
		button_parzd.setBounds(435, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_parzd);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_1.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_1.setBounds(9, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_2.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_2.setBounds(94, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_3.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_3.setBounds(179, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_3);
		
		JButton button_soust = new JButton("-");
		button_soust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText("");
					addition = false;
					soustraction = true;
					multiplication = false;
					division = false;
					if(result == null) {
						result = numberOneDouble;
						System.out.println(result);
					}else {
						System.out.println("on est ici " +result+ " - " +numberOneDouble);
						result -= numberOneDouble;
						textField.setText(df2.format(result));
					}
				} catch (Exception e2) {
					
					System.out.println("Cette action n'est pas possible");
				}
			}
		});
		button_soust.setBounds(265, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_soust);
		
		JButton button_carre = new JButton("x²");
		button_carre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				soustraction = false;
				addition = false;
				multiplication = false;
				division = false;
				numberOneDouble = Double.parseDouble(textNumber);
				Double sum = numberOneDouble * numberOneDouble;
				textField.setText(df2.format(sum));
				System.out.println(numberOneDouble * numberOneDouble);
			}
		});
		button_carre.setBounds(350, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_carre);
		
		JButton button_racine2 = new JButton("√");
		button_racine2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				double square = Math.sqrt(Double.parseDouble(textNumber));
				textField.setText(df2.format(square));
			}
		});
		
		button_racine2.setBounds(435, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_racine2);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("0")) {
					textField.setText("");
				}
				String textNumber = textField.getText() + button_0.getText();
				numberOneDouble = Double.parseDouble(textNumber);
				System.out.println(numberOneDouble);
				textField.setText(textNumber);
			}
		});
		button_0.setBounds(9, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_0);
		
		JButton button_virg = new JButton(".");
		button_virg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_virg.getText();
				textField.setText(textNumber);
			}
		});
		button_virg.setBounds(94, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_virg);
		
		JButton button_pourcent = new JButton("%");
		button_pourcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textNumber = textField.getText();
				double pourcent = Double.parseDouble(textNumber) / 100;
				textField.setText(df2.format(pourcent));
			}
		});
		button_pourcent.setBounds(179, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_pourcent);
		
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText("");
					addition = true;
					soustraction = false;
					multiplication = false;
					division = false;
					if(result == null) {
						result = numberOneDouble;
						System.out.println(result);
						System.out.println("on est ici ");
					}else{
						System.out.println("on est ici " +result+ " + " +numberOneDouble);
						result += numberOneDouble;
						textField.setText(df2.format(result));
					}
				} catch (Exception e2) {
					
					System.out.println("Cette action n'est pas possible");
				}
			}
		});
		button_add.setBounds(265, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_add);
		
		JButton button_egal = new JButton("=");
		button_egal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if (addition) {
						System.out.println(result+" + "+numberOneDouble);
						Double sumFinal = result + numberOneDouble;
				        textField.setText(df2.format(sumFinal));
				        result = sumFinal;
				        numberOneDouble = null;
				        System.out.println("sum = "+result);
				        
					}else if(soustraction) {
						System.out.println(result+" - "+numberOneDouble);
						Double sumFinal = result - numberOneDouble;
				        textField.setText(df2.format(sumFinal));
				        result = sumFinal;
				        numberOneDouble = null;
				        System.out.println("sum = "+result);
				        
					}else if(multiplication) {
						System.out.println(result+" * "+numberOneDouble);
						Double sumFinal = result * numberOneDouble;
				        textField.setText(df2.format(sumFinal));
				        result = sumFinal;
				        numberOneDouble = null;
				        System.out.println("sum = "+result);
						
					}else if(division) {
						System.out.println(result+" - "+numberOneDouble);
						Double sumFinal = result / numberOneDouble;
				        textField.setText(df2.format(sumFinal));
				        result = sumFinal;
				        numberOneDouble = null;
				        System.out.println("sum = "+result);
					}
					
				} catch (Exception e2) {
					System.out.println("les variables sont vides");
				}
			}
		});
		
		button_egal.setBounds(350, 322, 160, 55);
		frmCalculatrice.getContentPane().add(button_egal);
	}
}
