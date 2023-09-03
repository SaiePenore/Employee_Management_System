package Admin;

import java.awt.Color;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JTextField tfUser, tfPassword;
	
	Login(){
		
		getContentPane().setBackground(Color.white);
        setLayout(null);
		
		// creating a JLabel for username and a text field
        JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(40, 20, 100, 30);
		//lblUsername.setSize(100,40);
		add(lblUsername);
		
	    tfUser = new JTextField();
		tfUser.setBounds(150, 20, 150, 30);
		add(tfUser);
		
		//creating a JLabel for password and a text field
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40, 70, 100, 30);
		add(lblPassword);
		
	    tfPassword = new JTextField();
		tfPassword.setBounds(150, 70, 150, 30);
		add(tfPassword);
		
		// Creating a JButton for login
		JButton login = new JButton("LOGIN");
		login.setBounds(150, 140, 100, 30);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		String imagePath = "C:/Users/saiep/eclipse-workspace/Employee Management System/src/icons/man.png";
		ImageIcon imageIcon = new ImageIcon(imagePath);
		Image i1 = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel imageLabel = new JLabel(i2);
        imageLabel.setBounds(350, 0, 200 , 200);
        add(imageLabel);
        
        
		
		setSize(600, 300);
		setLocation(450, 200);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args)
	{
		new Login();
	
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			String username = tfUser.getText();
			String password = tfPassword.getText();
			
			Conn c = new Conn();
			String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
			
			ResultSet rs = c.s.executeQuery(query);
			if(rs.next()) {
				setVisible(false);
				new Home();
			}else {
				JOptionPane.showMessageDialog(null, "Invalid username or password");
				setVisible(false);
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
}
