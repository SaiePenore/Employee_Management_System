package Admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class AddEmployee extends JFrame {
	
	AddEmployee(){
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JLabel heading = new JLabel("Add Employee Detail");
		heading.setBounds(320, 30, 500, 50);
		heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
		add(heading);
		
		JLabel labelname = new JLabel("Name");
		labelname.setBounds(50,150,150,30);
		labelname.setFont(new Font("serif",Font.PLAIN, 20));
		add(labelname);
		
		JTextField tname = new JTextField();
		tname.setBounds(200, 150, 150, 30);
		add(tname);
		
		JLabel labelfname = new JLabel("Fathers Name");
		labelfname.setBounds(400,150,150,30);
		labelfname.setFont(new Font("serif",Font.PLAIN, 20));
		add(labelfname);
		
		JTextField tfname = new JTextField();
		tfname.setBounds(600, 150, 150, 30);
		add(tfname);
		
		setSize(900, 700);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		
		new AddEmployee();

	}

}
