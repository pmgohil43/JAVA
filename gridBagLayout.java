// GridBag Layout
import java.awt.*;

public class gridBagLayout{
	public static void main(String[] args){
		Frame f1 = new Frame();
		f1.setSize(700,100);
		GridBagLayout gbl = new GridBagLayout();
		f1.setLayout(gbl);
		GridBagConstraints gbc = new GridBagConstraints();
		
		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.gridx = 0;
		gbc.gridy = 0;
		f1.add(b1,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		f1.add(b2,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		f1.add(b3,gbc);
		
		Button b4 = new Button("Button 4");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.ipady = 10;
		f1.add(b4,gbc);
		
		Button b5 = new Button ("Button 5");
		gbc.gridx = 2;
		gbc.gridx = 3;
		gbc.insets = new Insets(10,0,10,0);
		f1.add(b5,gbc);
		
		f1.pack();
		f1.setVisible(true);
	}
}