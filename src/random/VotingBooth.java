package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("How old are you in years?");
	int a= Integer.parseInt(answer);
	if(a>18) {
	JOptionPane.showInputDialog("Who should the next president be?");
	}
	else if(a<=18) {
	JOptionPane.showMessageDialog(null, "Bruh nobody cares what you think");	
	}
	}
	}
	


