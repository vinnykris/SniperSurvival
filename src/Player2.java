import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;


public class Player2 extends Entity2{
	
	int startX;
	int startY;
	int velX = 0;
	int velY = 0;
	int speed = 3;

	public Player2(int x, int y) {
		super(x, y);
		startX = x;
		startY = y;
		update();
		// TODO Auto-generated constructor stub
	}

	public void update(){
		
			x += velX;
			y += velY;
		}
	
	public void draw(Graphics2D g2d){
		
		
		g2d.drawImage(getPlayerImg(), x, y, null);

	}
	
	public Image getPlayerImg(){

		ImageIcon ic = new ImageIcon(getClass().getResource("/resources/scope.png"));

		return ic.getImage();
		
	}

	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT){
			
				
				velX = -speed;
				
			
		} else if (key == KeyEvent.VK_RIGHT){
		
				velX = speed;
				
		} else if (key == KeyEvent.VK_UP){
			
				velY = -speed;
				
		} else if (key == KeyEvent.VK_DOWN){
			
				velY = speed;
		}
		
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT){
			
			velX = 0;
			
		} else if (key == KeyEvent.VK_RIGHT){
			
			velX = 0;
			
		} else if (key == KeyEvent.VK_UP){
			
			velY = 0;
			
		} else if (key == KeyEvent.VK_DOWN){
		
			velY = 0;
		}
	}
}
