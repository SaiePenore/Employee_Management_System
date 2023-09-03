package Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener {
	
	JButton signup, login;

	Splash() {
		
		getContentPane().setBackground(Color.white);
		
		String imagePath = "C:/Users/saiep/eclipse-workspace/Employee Management System/src/icons/Front1.jpg"; 
		ImageIcon imageIcon = new ImageIcon(imagePath);
		Image i1 = imageIcon.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel imageLabel = new JLabel(i2);
        imageLabel.setBounds(0, 0, 1200 , 600);
        add(imageLabel);
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(130, 50, 1200, 60);
		heading.setFont(new Font("serif", Font.PLAIN, 60));
		heading.setForeground(Color.white);
        imageLabel.add(heading);
        
        signup = new JButton("Sign Up");
        signup.setBounds(400, 200, 150, 50);
        signup.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        signup.setBackground(Color.blue);
        signup.addActionListener(this);;
        imageLabel.add(signup);
        
        login = new JButton("Login");
        login.setBounds(600, 200, 150, 50);
        login.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        login.setBackground(Color.blue);
        login.addActionListener(this);;
        imageLabel.add(login);
		
		setSize(1200, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
		
		
	
	public static void main(String[] args) {
		new Splash();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == signup){
			
			setVisible(false);
			new Signup();
			
		}else {
			setVisible(false);
			new Login();
		}
		
	}

	

}
