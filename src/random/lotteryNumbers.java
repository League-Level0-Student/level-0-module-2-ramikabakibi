package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomMaker= new Random();
		int zero = randomMaker.nextInt(51);
		
		int one = randomMaker.nextInt(51);
		
		int two = randomMaker.nextInt(51);
		
		int three = randomMaker.nextInt(51);
		
		int four = randomMaker.nextInt(51);
		JOptionPane.showMessageDialog(null, "numbers " + zero + " " + one + " "+ two +" "+ three+ " " + four);
	}

}
