import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;


public class Building extends Entity2{

	public Building(int x, int y) {
		super(x, y);
		startX = x;
		update();
		// TODO Auto-generated constructor stub
	}

	int startX;
	
	public void draw(Graphics2D g2d){
		
		
		g2d.drawImage(getPlayerImg(), x, y, null);

	}
	
	public Image getPlayerImg(){

		ImageIcon ic = new ImageIcon(getClass().getResource("/resources/building2.png"));

		return ic.getImage();
		
	}
}

