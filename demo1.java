import java.applet.*;
import java.awt.*;

public class demo1 extends Applet{
	public void paint(Graphics g){
		
		//head
		g.drawOval(150,50,100,100);
		//left eye
		g.drawOval(165,75,20,20);
		g.drawArc(155,70,40,40,60,60);
		//right eye
		g.drawOval(215,75,20,20);
		g.drawArc(205,70,40,40,60,60);
		//nose
		g.drawLine(200,95,195,120);
		g.drawLine(213,117,195,120);
		//lips
		g.drawArc(175,100,50,40,215,120);
		g.drawArc(175,110,50,30,215,120);
		//neck
		g.drawLine(180,190,180,145);
		g.drawLine(220,190,220,145);
		//body
		Color color2 = new Color(250,88,245);
		g.setColor(color2);
		g.drawRoundRect(145,190,110,180,20,20);
		//shirt design
		Color color1 = new Color(25,88,245);
		g.setColor(color1);
		g.drawRoundRect(145,190,110,180,100,100);
		Color color = new Color(34,139,34);
		g.setColor(color);
		g.fillOval(150,230,100,100);
		//pent design
	}
}

/*
<applet code="demo1.class" height="800" width="400" alt="Error loading applet!"></applet>
<h1>Prakash</h1>
*/
