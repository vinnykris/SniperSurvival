import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Enemy3 extends Entity2{
	

	public int startY;
	public int speed = 3;

	public Enemy3(int x, int y) {
		super(x, y);
		startY = y;
		
	
		// TODO Auto-generated constructor stub
	
	}
	public void update(){
		y += speed;

	}
	
	public void draw(Graphics2D g2d){
		g2d.drawImage(getObstacleImg(), x, y, null);

	}
	
	public Image getObstacleImg(){

		ImageIcon ic = new ImageIcon(getClass().getResource("/resources/enemy.png"));
		return ic.getImage();
		
		
	}
	

}