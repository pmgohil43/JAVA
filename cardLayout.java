// Card Layout
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;

public class cardLayout extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5;
	CardLayout cl;
	Container c;
	cardLayout(){
		b1 = new JButton("Btn1");
		b2 = new JButton("Btn2");
		b3 = new JButton("Btn3");
		b4 = new JButton("Btn4");
		b5 = new JButton("Btn5");
		c = this.getContentPane();
		cl = new CardLayout(1,2);
		c.setLayout(cl);
		c.add("Card1",b1);
		c.add("Card2",b2);
		c.add("Card3",b3);
		c.add("Card4",b4);
		c.add("Card5",b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		setVisible(true);
		setSize(300,200);
		setTitle("Card Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		cl.next(c);
	}
	public static void main(String[] args){
		new cardLayout();
	}
}
