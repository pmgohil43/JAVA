import java.applet.*;
import java.awt.*;

public class demo1 extends Applet{
	public void paint(Graphics g){
		
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
	}	
}

/*
<applet code="demo1.class" height="400" width="1000" alt="Error loading applet!"></applet>
<h1>Prakash</h1>
*/
