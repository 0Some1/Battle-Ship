package battleShip;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Input {

	private JFrame frmBattleShip;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	JLabel validStamp;
	JButton startBtn;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input window = new Input();
					window.frmBattleShip.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Input() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBattleShip = new JFrame();
		frmBattleShip.setTitle("BATTLE SHIP");
		frmBattleShip.setIconImage(Toolkit.getDefaultToolkit().getImage(Input.class.getResource("/resources/Games_BoardGames_Artboard_31-512.png")));
		frmBattleShip.getContentPane().setBackground(new Color(240, 248, 255));
		frmBattleShip.setResizable(false);
		frmBattleShip.setBounds(0, 0, 745, 475);
		frmBattleShip.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBattleShip.getContentPane().setLayout(null);
		frmBattleShip.setLocationRelativeTo(null);
	
		
		JLabel lblName = new JLabel("Name :");
		lblName.setBounds(34, 37, 46, 14);
		frmBattleShip.getContentPane().add(lblName);
		
		JLabel lblNumOfShips = new JLabel("num of Ships2 :");
		lblNumOfShips.setBounds(34, 62, 89, 14);
		frmBattleShip.getContentPane().add(lblNumOfShips);
		
		JLabel lblNumOfShips_1 = new JLabel("Num of Ships3 :");
		lblNumOfShips_1.setBounds(34, 87, 89, 14);
		frmBattleShip.getContentPane().add(lblNumOfShips_1);
		
		JLabel lblNumOfShips_2 = new JLabel("Num of Ships4 :");
		lblNumOfShips_2.setBounds(34, 112, 89, 14);
		frmBattleShip.getContentPane().add(lblNumOfShips_2);
		
		JLabel lblNumOfShips_3 = new JLabel("Num of Ships5 :");
		lblNumOfShips_3.setBounds(34, 137, 89, 14);
		frmBattleShip.getContentPane().add(lblNumOfShips_3);
		
		JLabel lblrockets = new JLabel("Rockets : ");
		lblrockets.setBounds(34, 163, 67, 16);
		frmBattleShip.getContentPane().add(lblrockets);
		
		JLabel lblRows = new JLabel("Rows :");
		lblRows.setBounds(34, 202, 46, 14);
		frmBattleShip.getContentPane().add(lblRows);
		
		JLabel lblColumns = new JLabel("Columns :");
		lblColumns.setBounds(34, 228, 67, 14);
		frmBattleShip.getContentPane().add(lblColumns);
		
		JLabel lblIsValid = new JLabel("Is valid :");
		lblIsValid.setBounds(34, 254, 46, 14);
		frmBattleShip.getContentPane().add(lblIsValid);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(150, 34, 114, 20);
		frmBattleShip.getContentPane().add(textField);
		textField.setColumns(10);
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 59, 114, 20);
		frmBattleShip.getContentPane().add(textField_1);
		textField_1.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 84, 114, 20);
		frmBattleShip.getContentPane().add(textField_2);
		textField_2.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(150, 109, 114, 20);
		frmBattleShip.getContentPane().add(textField_3);
		textField_3.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(150, 134, 114, 20);
		frmBattleShip.getContentPane().add(textField_4);
		textField_4.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(150, 199, 114, 20);
		frmBattleShip.getContentPane().add(textField_5);
		textField_5.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(150, 225, 114, 20);
		frmBattleShip.getContentPane().add(textField_6);
		textField_6.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		textField_7 = new JTextField();
		textField_7.setBounds(150, 161, 114, 20);
		frmBattleShip.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		textField_7.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				validation();
			}
		});
		
		validStamp = new JLabel("");
		validStamp.setBounds(108, 254, 97, 16);
		frmBattleShip.getContentPane().add(validStamp);
		
		startBtn = new JButton("Start");
		startBtn.setVisible(false);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBattleShip.dispose();
				Board.run(textField.getText(),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()),Integer.parseInt(textField_7.getText()));
			}
		});
		startBtn.setForeground(new Color(0, 0, 0));
		startBtn.setBackground(new Color(135, 206, 235));
		startBtn.setBounds(34, 345, 171, 62);
		frmBattleShip.getContentPane().add(startBtn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Input.class.getResource("/resources/battleship_png_103178.png")));
		label.setBounds(178, 48, 601, 355);
		frmBattleShip.getContentPane().add(label);
		
	}
	public void validation() {
		String nameString=textField.getText();
		try {
			int two=Integer.parseInt(textField_1.getText());
			int three=Integer.parseInt(textField_2.getText());
			int four=Integer.parseInt(textField_3.getText());		
			int five=Integer.parseInt(textField_4.getText());
			int rows=Integer.parseInt(textField_5.getText());
			int column=Integer.parseInt(textField_6.getText());
			int sum= two*2 + three*3 + four*4 + five*5 + 5;
			boolean valid = (rows >= 5 || column >= 5) && ((sum ) <= (rows*column) )&& ( Integer.parseInt(textField_7.getText()) >= sum );
			if (valid) {
				validStamp.setText("is valid");
				validStamp.setForeground(Color.green);
				startBtn.setVisible(true);
			}else {
				validStamp.setText("is not valid");
				validStamp.setForeground(Color.RED);
				startBtn.setVisible(false);
			}
		} catch (Exception e) {
			// TODO: handle exception
			validStamp.setText("is not valid");
			validStamp.setForeground(Color.RED);
			startBtn.setVisible(false);
			
		}
		
		
		
		
		
		
	}
}
