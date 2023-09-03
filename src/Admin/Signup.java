package Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener {
	
    JTextField tfUser, tfPassword1, tfPassword2;
	
	Signup(){
		
		getContentPane().setBackground(Color.white);
        setLayout(null);
		
		// creating a JLabel for username and a text field
        JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(40, 20, 100, 30);
		//lblUsername.setSize(100,40);
		add(lblUsername);
		
	    tfUser = new JTextField();
		tfUser.setBounds(190, 20, 150, 30);
		add(tfUser);
		
		//creating a JLabel for password and a text field
		JLabel lblPassword1 = new JLabel("Password");
		lblPassword1.setBounds(40, 70, 100, 30);
		add(lblPassword1);
		
	    tfPassword1 = new JTextField();
		tfPassword1.setBounds(190, 70, 150, 30);
		add(tfPassword1);
		
		JLabel lblPassword2 = new JLabel("Confirm Password");
		lblPassword2.setBounds(40, 120, 120, 30);
		add(lblPassword2);
		
	    tfPassword2 = new JTextField();
		tfPassword2.setBounds(190, 120, 150, 30);
		add(tfPassword2);
		
		// Creating a JButton for login
		JButton signup = new JButton("Sign Up");
		signup.setBounds(190, 190, 100, 30);
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		add(signup);
		
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
		

	public static void main(String[] args) {
		
		new Signup();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			String username = tfUser.getText();
			String password1 = tfPassword1.getText();
			String password2 = tfPassword2.getText();
			
			Conn c = new Conn();
			String query = "insert into login values('"+username+"', '"+password1+"')";
			String checkquery = "select * from login where username = '"+username+"' and password = '"+password1+"'";
			
		     
			if(password1.equals(password2))
			{
				ResultSet rs = c.s.executeQuery(checkquery);
				if(rs.next()) {
					JOptionPane.showMessageDialog(null,"Already signuped! please login");
					setVisible(false);
					new Login();
				}else {
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "SignUp Successful! Login to get access");
					setVisible(false);
					new Login();
				}

			    
			}else {
				JOptionPane.showMessageDialog(null, "Password is not Same");
				setVisible(false);
			
			}
				
			
			
		}catch(Exception e1){
			e1.printStackTrace();
			
		}
		
	}

}
