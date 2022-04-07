// Write a program to display the first name and last name from the JTextBox when you click on button.

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class nameDisplay implements ActionListener{
	JFrame jf;
	JLabel jl, jl2;
	JTextField jtf, jtf2;
	JButton jb, jb1, jb2;
	
	public nameDisplay(){
		jf = new JFrame();
		jl = new JLabel("Enter first name : ");
		jtf = new JTextField(20);
		jl2 = new JLabel("Enter last name : ");
		jtf2 = new JTextField(20);
		jb = new JButton("First Name");
		jb1 = new JButton("Last Name");
		jb2 = new JButton("Full Name");
		//jb2.setBounds(45,85,65,32)//for the no layout
		
		jf.add(jl);
		jf.add(jtf);
		jf.add(jl2);
		jf.add(jtf2);
		jf.add(jb);
		jf.add(jb1);
		jf.add(jb2);
		jb.addActionListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jf.setLayout(new FlowLayout(FlowLayout.LEFT));
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jb){
			JOptionPane.showMessageDialog(jf,"First Name: " + jtf.getText(), "DISPLAY", JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getSource() == jb1){
			JOptionPane.showMessageDialog(jf,"Last Name : " + jtf2.getText(), "DISPLAY", JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(jf,"Full Name: " + jtf.getText() + " " + jtf2.getText(), "DISPLAY", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args){
		new nameDisplay();
	}
}