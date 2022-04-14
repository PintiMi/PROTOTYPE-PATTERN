package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import companies.Apple;
import companies.Samsung;

import factory.PhoneFactory;

import java.awt.Color;
import javax.swing.DropMode;
import java.awt.SystemColor;
import java.awt.Font;

public class PhonePrototypePattern {

	private JFrame frmPhoneFactory;
	private JTextField list1;
	private JTextField text1A;
	private JTextField text2A;
	private JTextField text3A;
	private JTextField text4A;
	private JTextField text1S;
	private JTextField text2S;
	private JTextField text3S;
	private JTextField text4S;
	private JTextField list2;
	
	private static String modelChosen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhonePrototypePattern window = new PhonePrototypePattern();
					window.frmPhoneFactory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws CloneNotSupportedException 
	 */
	public PhonePrototypePattern() throws CloneNotSupportedException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws CloneNotSupportedException 
	 */
	private void initialize() throws CloneNotSupportedException {
		
		PhoneFactory phoneFactory = new PhoneFactory();
		
 
        Apple iphone13 = new Apple("128GB", "Graphite", 4000.0D, "iPhone 13");
        Apple clonedIphone = (Apple)phoneFactory.CreateClone(iphone13);

		Samsung galaxyS21 = new Samsung("256GB", "Phantom Black", 5400.0D, "Galaxy S21");
        Samsung clonedSamsung = (Samsung)phoneFactory.CreateClone(galaxyS21);
        
		frmPhoneFactory = new JFrame();
		frmPhoneFactory.getContentPane().setFont(new Font("Broadway", Font.BOLD, 20));
		frmPhoneFactory.getContentPane().setBackground(SystemColor.activeCaption);
		frmPhoneFactory.setResizable(false);
		frmPhoneFactory.setTitle("Phone Factory");
		frmPhoneFactory.setBounds(100, 100, 666, 656);
		frmPhoneFactory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhoneFactory.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Status:");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		lblNewLabel.setBounds(69, 72, 111, 23);
		frmPhoneFactory.getContentPane().add(lblNewLabel);
		
		list1 = new JTextField();
		list1.setBackground(new Color(255, 240, 245));
		list1.setHorizontalAlignment(SwingConstants.CENTER);
		list1.setEditable(false);
		list1.setBounds(69, 95, 533, 76);
		frmPhoneFactory.getContentPane().add(list1);
		list1.setColumns(100);
		
		JLabel lblNewLabel_1 = new JLabel("Customize Apple phone:");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 202, 221, 23);
		frmPhoneFactory.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customize Samsung phone:");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		lblNewLabel_2.setBounds(350, 202, 268, 23);
		frmPhoneFactory.getContentPane().add(lblNewLabel_2);
		
		text1A = new JTextField();
		text1A.setBounds(10, 247, 165, 20);
		frmPhoneFactory.getContentPane().add(text1A);
		text1A.setColumns(10);
		
		text2A = new JTextField();
		text2A.setBounds(10, 278, 165, 20);
		frmPhoneFactory.getContentPane().add(text2A);
		text2A.setColumns(10);
		
		text3A = new JTextField();
		text3A.setBounds(10, 309, 165, 20);
		frmPhoneFactory.getContentPane().add(text3A);
		text3A.setColumns(10);
		
		text4A = new JTextField();
		text4A.setBounds(10, 340, 165, 20);
		frmPhoneFactory.getContentPane().add(text4A);
		text4A.setColumns(10);
		
		JButton capA = new JButton("SET CAPACITY");
		capA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				clonedIphone.setCapacity(text1A.getText());
		        phoneFactory.AddCloneToFactory(clonedIphone);
			}
		});
		capA.setBounds(185, 246, 120, 23);
		frmPhoneFactory.getContentPane().add(capA);
		
		
		JButton colA = new JButton("SET COLOR");
		colA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedIphone.setColor(text2A.getText());
		        phoneFactory.AddCloneToFactory(clonedIphone);
			}
		});
		colA.setBounds(185, 277, 120, 23);
		frmPhoneFactory.getContentPane().add(colA);
		
		JButton priceA = new JButton("SET PRICE");
		priceA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedIphone.setPrice(Double.parseDouble(text3A.getText()));
		        phoneFactory.AddCloneToFactory(clonedIphone);
			}
		});
		priceA.setBounds(185, 308, 120, 23);
		frmPhoneFactory.getContentPane().add(priceA);
		
		JButton modelA = new JButton("SET MODEL");
		modelA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedIphone.setModel(text4A.getText());
		        phoneFactory.AddCloneToFactory(clonedIphone);
			}
		});
		modelA.setBounds(185, 339, 120, 23);
		frmPhoneFactory.getContentPane().add(modelA);
		
		text1S = new JTextField();
		text1S.setBounds(350, 247, 165, 20);
		frmPhoneFactory.getContentPane().add(text1S);
		text1S.setColumns(10);
		
		text2S = new JTextField();
		text2S.setBounds(350, 278, 165, 20);
		frmPhoneFactory.getContentPane().add(text2S);
		text2S.setColumns(10);
		
		text3S = new JTextField();
		text3S.setBounds(350, 309, 165, 20);
		frmPhoneFactory.getContentPane().add(text3S);
		text3S.setColumns(10);
		
		text4S = new JTextField();
		text4S.setBounds(350, 340, 165, 20);
		frmPhoneFactory.getContentPane().add(text4S);
		text4S.setColumns(10);
		
		JButton capS = new JButton("SET CAPACITY");
		capS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedSamsung.setCapacity(text1S.getText());
		        phoneFactory.AddCloneToFactory(clonedSamsung);
			}
		});
		capS.setBounds(525, 246, 120, 23);
		frmPhoneFactory.getContentPane().add(capS);
		
		JButton colS = new JButton("SET COLOR");
		colS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedSamsung.setColor(text2S.getText());
		        phoneFactory.AddCloneToFactory(clonedSamsung);
			}
		});
		colS.setBounds(525, 277, 120, 23);
		frmPhoneFactory.getContentPane().add(colS);
		
		JButton priceS = new JButton("SET PRICE");
		priceS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedSamsung.setPrice(Double.parseDouble(text3S.getText()));
		        phoneFactory.AddCloneToFactory(clonedSamsung);
			}
		});
		priceS.setBounds(525, 308, 120, 23);
		frmPhoneFactory.getContentPane().add(priceS);
		
		JButton modelS = new JButton("SET MODEL");
		modelS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clonedSamsung.setModel(text4S.getText());
		        phoneFactory.AddCloneToFactory(clonedSamsung);
			}
		});
		modelS.setBounds(525, 339, 120, 23);
		frmPhoneFactory.getContentPane().add(modelS);
		
		list2 = new JTextField();
		list2.setBackground(new Color(230, 230, 250));
		list2.setHorizontalAlignment(SwingConstants.CENTER);
		list2.setEditable(false);
		list2.setBounds(69, 504, 533, 76);
		frmPhoneFactory.getContentPane().add(list2);
		list2.setColumns(100);
		
		JLabel lblNewLabel_3 = new JLabel("Your option:");
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.BOLD, 17));
		lblNewLabel_3.setForeground(new Color(47, 79, 79));
		lblNewLabel_3.setBounds(69, 479, 162, 14);
		frmPhoneFactory.getContentPane().add(lblNewLabel_3);
		
		JButton avApple = new JButton("Check Apple availability");
		avApple.setBackground(new Color(255, 255, 240));
		avApple.setForeground(new Color(0, 0, 0));
		avApple.setFont(new Font("Calibri Light", Font.BOLD, 17));
		avApple.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			modelChosen = "Apple";
			list1.setText(iphone13.toString());
			
			}
		});
		avApple.setBounds(61, 26, 244, 28);
		frmPhoneFactory.getContentPane().add(avApple);
		
		JButton avSamsung = new JButton("Check Samsung availability");
		avSamsung.setFont(new Font("Calibri Light", Font.BOLD, 17));
		avSamsung.setBackground(new Color(255, 255, 240));
		avSamsung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelChosen = "Samsung";
		        list1.setText(galaxyS21.toString());
			}
		});
		avSamsung.setBounds(350, 26, 252, 28);
		frmPhoneFactory.getContentPane().add(avSamsung);
		
		JButton gen = new JButton("GENERATE");
		gen.setBackground(new Color(245, 255, 250));
		gen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelChosen == "Apple") {
					list2.setText(clonedIphone.toString());
				} else if(modelChosen == "Samsung"){
					list2.setText(clonedSamsung.toString());
				}
				  
			}
		});
		gen.setBounds(249, 433, 171, 28);
		frmPhoneFactory.getContentPane().add(gen);
			
	}
}
