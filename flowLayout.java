// Flow layout 
import java.awt.*;
import javax.swing.*;
public class flowLayout
{
	flowLayout(){
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("Enter Your Name :");
		JTextField tf1 = new JTextField(100);
		JButton b1 = new JButton("Send");
		f.add(l1);
		f.add(tf1);
		f.add(b1);
		// flow layout in right layout
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new flowLayout();
	}
}