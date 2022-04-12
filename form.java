// Form

import javax.swing.*;
import java.awt.*;
public class form extends JFrame{
	
	JProgressBar jpb;
	JLabel jl, jl1,jl2,jl3,jl4,jl5;
	Font font;
	int i=0,num=0;
	
	public form(){
		jpb = new JProgressBar(0,100);
		jpb.setBounds(10,80,500,50);
		jpb.setValue(0);
		add(jpb);
		setSize(600,400);
		setLayout(null);		
		
		//label
		jl1 = new JLabel();
		jl1.setBounds(490,50,50,30);
		add(jl1);
		
	}
	public void form(){
			//font style
			font = new Font("David",Font.BOLD,15);
						
			//name label
			jl = new JLabel("Name :");
			jl.setBounds(10,10,200,30);
			add(jl);
			jl.setFont(font);
			
			//name text field
			JTextField jtb = new JTextField();
			jtb.setBounds(70,15,200,18);
			add(jtb);
			jtb.setFont(font);
			
			//address label
			jl2 = new JLabel("Address : ");
			jl2.setBounds(10,30,200,30);
			add(jl2);
			jl2.setFont(font);
			
			//address textarea
			JTextArea jta = new JTextArea();
			jta.setBounds(80,35,200,15);
			add(jta);
			jta.setFont(font);
			
			//submit button
			JButton jb = new JButton("Submit");
			jb.setBounds(10,60,100,20);
			add(jb);
			jb.setFont(font);
			
	}
	public void iterate(){
		for(i=0; i<=100; i++)
		{
			jpb.setValue(i);
			jl1.setText(jpb.getString());
			i+=1;
			try{
				Thread.sleep(40);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//System.out.println(i);
		
		if(i >= 100){
			jpb.setVisible(false);
			jl1.setVisible(false);
			form();
			jl.setVisible(true);
			jl2.setVisible(true);
		}else{
			System.out.println("something worng");
		}
	}
	public static void main(String[] args){
		form f = new form();
		f.setVisible(true);
		f.iterate();
	}
}
