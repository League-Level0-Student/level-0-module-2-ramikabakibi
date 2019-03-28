package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		for (int i = 0; i < 10; i++) {

			String response = JOptionPane.showInputDialog("Which animal would you fancy my good sir?");
			if (response.equals("llama")) {
				playNoise(llamaFile);
			}
			if (response.equals("duck")) {
				playNoise(quackFile);
			}
			if (response.equals("cow")) {
				playNoise(mooFile);
			}
			if (response.equals("dog")) {
				playNoise(woofFile);
			}
			if (response.equals("cat")) {
				playNoise(meowFile);
			} /* 2. Make it so that the user can keep entering new animals. */
			else {
				playNoise(llamaFile);
			}
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
