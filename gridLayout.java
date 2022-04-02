// Grid Layout

import java.awt.*;
import javax.swing.*;

public class gridLayout{
	public static void main(String[] args){
		Frame f1 = new Frame();
		f1.setSize(250,250);
		GridLayout gl = new GridLayout(2,2);
		f1.setLayout(gl);
		Panel p1 = new Panel();
		Label l1 = new Label("Enter name : ");
		TextField tf = new TextField(10);
		
		Button b1 = new Button("Submit");
		p1.add(l1);
		p1.add(tf);
		p1.add(b1);
		f1.add(p1);
		
		Panel p2 = new Panel();
		f1.add(p2);
		Panel p3 = new Panel();
		f1.add(p3);
		Label l2 = new Label("Welcome to world...");
		f1.add(l2);
		f1.setVisible(true);
	}
}