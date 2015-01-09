/**
 * 
 */
package com.schresearch.sch2048;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

/**
 * @author Amit Scheer
 *
 */
public class Sch2048 extends JFrame {
	/**
	 * 
	 */
	public Sch2048() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		setSize(500, 600);
		setTitle("Sch2048");
		setLocationRelativeTo(null);
		getContentPane().add(new JPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//generate panel
		JPanel pnl2048 = new JPanel();
		pnl2048.setSize(400, 400);
		add(pnl2048);

		//generate labels
		JLabel lbl2048 = new JLabel("Welcome to sch2048");
		lbl2048.setText("Welcome to sch2048");
		pnl2048.add(lbl2048);
		
		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sch2048 game  = new Sch2048();
		game.setVisible(true);
	}

}
