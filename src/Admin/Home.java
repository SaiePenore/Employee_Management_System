package Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
	
	JButton view, add, update, remove;
	 
	Home(){
		
		setLayout(null);
		
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
        
        add = new JButton("Add Employee");
        add.setBounds(300, 200, 250, 50);
        add.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        add.setBackground(Color.blue);
        add.addActionListener(this);;
        imageLabel.add(add);
        
        view = new JButton("View Employee");
        view.setBounds(600, 200, 250, 50);
        view.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        view.setBackground(Color.blue);
        view.addActionListener(this);;
        imageLabel.add(view);
        
        update = new JButton("Update Employee");
        update.setBounds(300, 300, 250, 50);
        update.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        update.setBackground(Color.blue);
        update.addActionListener(this);;
        imageLabel.add(update);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(600, 300, 250, 50);
        remove.setFont(new Font("Engravers MT", Font.PLAIN, 13));
        remove.setBackground(Color.blue);
        remove.addActionListener(this);;
        imageLabel.add(remove);
		
		setSize(1200, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {
		
		new Home();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == add) {
			setVisible(false);
			//new AddEmployee
		}else if(e.getSource() == view) {
			setVisible(false);
			//new ViewEmployee
		}else if(e.getSource() == update) {
			setVisible(false);
			//new UpdateEmployee
		}else {
			setVisible(false);
			//new DeleteEmployee
		}
		
	}

}
