
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyAdapt extends KeyAdapter{
	
	Player2 p;
	
	public KeyAdapt(Player2 player){
		p = player;
		
	}
	
	public void keyPressed(KeyEvent e){
		p.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e){
		p.keyReleased(e);
	}

}