//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		for (int i = 0; i < 10; i++) {
			Random randomMaker = new Random();

			int randomNumber = randomMaker.nextInt(5);

			System.out.println(randomNumber);
			int randomChoice = new Random().nextInt(5);
			if (randomChoice == 0) {
				JOptionPane.showMessageDialog(null, "You are a sweaty soccer skin");
			} else if (randomChoice == 1) {
				JOptionPane.showMessageDialog(null, "You are good at coding ");
			} else if (randomChoice == 2) {
				JOptionPane.showMessageDialog(null, "You have two cats");
			} else if (randomChoice == 3) {
				JOptionPane.showMessageDialog(null, "You are Thanos");
			} else if (randomChoice == 4) {
				JOptionPane.showMessageDialog(null, "You have become Copernicus");
			}
			// 3. Find someone to test out your program. They will like it :)
		}
	}
}
