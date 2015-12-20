import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GameFrame2 extends JPanel implements ActionListener{
	
//	Timer mainTimer;
	Player2 player;
	Building building;
	Building building2;
	Civilian civilian;
	
	int playerH = 48;
	int playerW = 26;
	
	int enemyCount;
	int spacing;
	int level = 1;
	
	Color c = new Color(153, 204, 255);
	
	static ArrayList<Enemy1> enemies1 = new ArrayList<Enemy1>();
	static ArrayList<Enemy2> enemies2 = new ArrayList<Enemy2>();
	static ArrayList<Enemy3> enemies3 = new ArrayList<Enemy3>();

	Random rand = new Random();
	
	ArrayList <Integer> scores = new ArrayList<Integer>();
	
	public GameFrame2(){
		this.setBackground(c);
		setFocusable(true);
		player = new Player2(475, 275);
		building = new Building(0, 180);
		
		
		addKeyListener(new KeyAdapt(player));
		
//		mainTimer = new Timer(10, this);
//		mainTimer.start();
		
		startGame();
		
		
	}

	private void startGame() {
		// TODO Auto-generated method stub
		System.out.print("check");
		enemyCount = 3;
		spacing =0;
		for(int i=0; i<enemyCount; i++){
			addEnemy(new Enemy1(100+spacing, 240));
			System.out.print("check");
			spacing+=25;
		}
		spacing =0;
		for(int i=0; i<enemyCount; i++){
			addEnemy2(new Enemy2(240+spacing, 270));
			
			System.out.print("check");
			spacing+=25;
		}
		for(int i=0; i<enemyCount; i++){
			addEnemy3(new Enemy3(310+spacing, 259));
			System.out.print("check");
			spacing+=25;
		}
		
		moveEnemy();
		
		
		
	}

	private void moveEnemy() {
		// TODO Auto-generated method stub
		for(int i=0; i<enemies1.size(); i++){
			while(enemies1.get(i).x<200 && enemies1.get(i).x>50)
				enemies1.get(i).update();
		}
		for(int i=0; i<enemies2.size(); i++){
			enemies2.get(i).update();
		}
		for(int i=0; i<enemies3.size(); i++){
			enemies3.get(i).update();
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for(int i=0; i<enemies1.size(); i++){
			while(enemies1.get(i).x<200 && enemies1.get(i).x>50)
				enemies1.get(i).update();
		}
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		building.draw(g2d);
		player.draw(g2d);
		
		for(int i=0; i<enemies1.size(); i++){
			Enemy1 temp = enemies1.get(i);
			temp.draw(g2d);
		}
		for(int i=0; i<enemies2.size(); i++){
			Enemy2 temp = enemies2.get(i);
			temp.draw(g2d);
		}
		for(int i=0; i<enemies3.size(); i++){
			Enemy3 temp = enemies3.get(i);
			temp.draw(g2d);
		}
		
		
		
		
	}
	
	
	public void addEnemy(Enemy1 e1){
		enemies1.add(e1);
	}
	public void addEnemy2(Enemy2 e2){
		enemies2.add(e2);
	}
	public void addEnemy3(Enemy3 e3){
		enemies3.add(e3);
	}
	
	
}