// Border Layout

import java.awt.*;
public class borderLayout
{
	public static void main(String[] ags)
	{
		Frame f1 = new Frame();
		f1.setSize(250,300);
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("West");
		Button b4 = new Button("East");
		Button b5 = new Button("Center");
		f1.add(b1,BorderLayout.NORTH);
		f1.add(b2,BorderLayout.SOUTH);
		f1.add(b3,BorderLayout.WEST);
		f1.add(b4,BorderLayout.EAST);
		f1.add(b5);
		f1.setVisible(true);		
	}
}