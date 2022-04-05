// Write a program which displays "TECHNOLOGY IS FUTURE" in blue color with bold and font size 30

import java.applet.*;
import java.awt.*;

public class nameDecoration extends Applet{
	Font f;
	public void init(){
		f = new Font("Arial",Font.BOLD,30);
	}
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.setFont(f);
		g.drawString("Tecnology is Future",30,30);
	}
}
/*
<applet code="nameDecoration.class" height="400" width="400" alt="Error loading applet!"></applet>
*/