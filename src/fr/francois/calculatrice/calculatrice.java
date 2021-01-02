package fr.francois.calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.regex.*;

public class calculatrice {

	private JFrame frmCalculatrice;
	private JTextField textField;
	public double sum = 0;
	public boolean addition = false;
	public boolean soustraction = false;
	public boolean multiplication = false;
	public boolean division = false;
	public String textNumber = "";
	public double numberOneDouble = 0;
	public double numberTwoDouble = 0;
	public double intNumber;
	public String text = "";
	public static Pattern pattern;
    public static Matcher matcher;
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
		
		
		JMenuBar menuBar = new JMenuBar();
		frmCalculatrice.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		frmCalculatrice.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 15, 500, 100);
		frmCalculatrice.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_7.getText();
				textField.setText(textNumber);
			}
		});
		button_7.setBounds(9, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_8.getText();
				textField.setText(textNumber);
			}
		});
		button_8.setBounds(94, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_9.getText();
				textField.setText(textNumber);
			}
		});
		button_9.setBounds(179, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_9);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				division = true;
				soustraction = false;
				addition = false;
				multiplication = false;
				numberOneDouble = Double.parseDouble(textNumber);
				textField.setText("");
				System.out.println(numberOneDouble);
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
				textField.setText("");
				sum = 0;
				textNumber = "";
				intNumber = 0;
				text = "";
				System.out.println(text);
			}
		});
		button_c.setBounds(435, 125, 75, 55);
		frmCalculatrice.getContentPane().add(button_c);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_4.getText();
				textField.setText(textNumber);
			}
		});
		button_4.setBounds(9, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textNumber = textField.getText() + button_5.getText();
				
				textField.setText(textNumber);
			}
		});
		button_5.setBounds(94, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_6.getText();
				textField.setText(textNumber);
			}
		});
		button_6.setBounds(179, 190, 75, 55);
		frmCalculatrice.getContentPane().add(button_6);
		
		JButton button_mult = new JButton("x");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				addition = false;
				multiplication = true;
				soustraction = false;
				division = false;
				numberOneDouble = Double.parseDouble(textNumber);
				textField.setText("");
				System.out.println(numberOneDouble);
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
				String textNumber = textField.getText() + button_1.getText();
				textField.setText(textNumber);
			}
		});
		button_1.setBounds(9, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_2.getText();
				textField.setText(textNumber);
			}
		});
		button_2.setBounds(94, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_3.getText();
				textField.setText(textNumber);
			}
		});
		button_3.setBounds(179, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_3);
		
		JButton button_soust = new JButton("-");
		button_soust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				soustraction = true;
				addition = false;
				multiplication = false;
				division = false;
				numberOneDouble = Double.parseDouble(textNumber);
				textField.setText("");
				System.out.println(numberOneDouble);
			}
		});
		button_soust.setBounds(265, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_soust);
		
		JButton button_carre = new JButton("x2");
		button_carre.setBounds(350, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_carre);
		
		JButton button_racine2 = new JButton("v");
		
		button_racine2.setBounds(435, 257, 75, 55);
		frmCalculatrice.getContentPane().add(button_racine2);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText() + button_0.getText();
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
				
				String textNumber = textField.getText() + button_pourcent.getText();
				textField.setText(textNumber);
			}
		});
		button_pourcent.setBounds(179, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_pourcent);
		
		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textNumber = textField.getText();
				addition = true;
				soustraction = false;
				multiplication = false;
				numberOneDouble = Double.parseDouble(textNumber);
				textField.setText("");
				System.out.println(numberOneDouble);
			}
		});
		button_add.setBounds(265, 322, 75, 55);
		frmCalculatrice.getContentPane().add(button_add);
		
		JButton button_egal = new JButton("=");
		button_egal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String textNumber = textField.getText();
				numberTwoDouble = Double.parseDouble(textNumber);
				if (addition) {
					
					sum = numberOneDouble + numberTwoDouble;
					String textSum = Double.toString(sum);
					pattern = Pattern.compile(".0");
			        matcher = pattern.matcher(textSum);
			        if(matcher.find()) {
			            String resultFinal = textSum.substring(0, textSum.length() -2);
			            textField.setText(resultFinal);
			        }else {
			        	textField.setText(Double.toString(sum));
			        }
					
					
				}else if(soustraction) {
					
					sum = numberOneDouble - numberTwoDouble;
					String textSum = Double.toString(sum);
					pattern = Pattern.compile(".0");
			        matcher = pattern.matcher(textSum);
			        if(matcher.find()) {
			            String resultFinal = textSum.substring(0, textSum.length() -2);
			            textField.setText(resultFinal);
			        }else {
			        	textField.setText(Double.toString(sum));
			        }
			        
				}else if(multiplication) {
					
					sum = numberOneDouble * numberTwoDouble;
					String textSum = Double.toString(sum);
					pattern = Pattern.compile(".0");
			        matcher = pattern.matcher(textSum);
			        if(matcher.find()) {
			            String resultFinal = textSum.substring(0, textSum.length() -2);
			            textField.setText(resultFinal);
			        }else {
			        	textField.setText(Double.toString(sum));
			        }
					
				}else if(division) {
					
					sum = numberOneDouble / numberTwoDouble;
					String textSum = Double.toString(sum);
					pattern = Pattern.compile(".0");
			        matcher = pattern.matcher(textSum);
			        if(matcher.find()) {
			            String resultFinal = textSum.substring(0, textSum.length() -2);
			            textField.setText(resultFinal);
			        }else {
			        	textField.setText(Double.toString(sum));
			        }
				}
				
			}
		});
		
		button_egal.setBounds(350, 322, 160, 55);
		frmCalculatrice.getContentPane().add(button_egal);
	}
}
