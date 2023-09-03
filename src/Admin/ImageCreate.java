package Admin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageCreate implements ActionListener {
	    public static void main(String[] args) {
	        //SwingUtilities swingUtilities = new SwingUtilities();
			//swingUtilities.createAndShowGUI();
	    }
	    
	    public void actionPerformed(ActionEvent ae){
	    	
	    	//frame.setVisible(false);
	    	new Login();
	    	
	    }

	    public void createAndShowGUI() {
	        // Prepare the image path. Adjust this path as per your image location.
	        String imagePath = "C:/Users/saiep/eclipse-workspace/Employee Management System/src/icons/Front1.jpg"; // Replace with your image path

	        // Load the image from the specified path or resource
	        ImageIcon imageIcon = new ImageIcon(imagePath);

	        // Create a JFrame to display the image
	        JFrame frame = new JFrame("Image Display Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(1200, 600); // Set the window size
	        
	        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	        heading.setBounds(130, 50, 1200, 60);
			heading.setFont(new Font("serif", Font.PLAIN, 60));
			heading.setForeground(Color.white);
	        frame.add(heading);
	        

	        // Create a JLabel and set the image to display
	        Image i1 = imageIcon.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
	        ImageIcon i2 = new ImageIcon(i1);
	        JLabel imageLabel = new JLabel(i2);
	        imageLabel.setBounds(50, 100, 1050 , 500);

	        // Create a JButton to accesss another page
	        
	        JButton clickHere = new JButton("CLICK HERE TO CONTINUE");
	        clickHere.setBounds(450, 200, 300, 70);
	        clickHere.addActionListener(this);;
	        imageLabel.add(clickHere);
	        
	        // Add the imageLabel to the frame's content pane
	        frame.getContentPane().add(imageLabel);

	        // Center the frame on the screen
	        frame.setLocationRelativeTo(null);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}



