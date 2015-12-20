import java.awt.Color;

import javax.swing.JFrame;


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Sniper Survival");
		
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
//		frame.setAlwaysOnTop(true);
		frame.setLocation(200, 50);
		
//		frame.getContentPane().setBackground(Color.GRAY);
		System.out.print("1");
		frame.setVisible(true);
		frame.add(new GameFrame2());
		System.out.print("2");
	
		
	}

}

