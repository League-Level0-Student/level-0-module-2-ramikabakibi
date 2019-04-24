package random;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How tall are you in inches");
		int a= Integer.parseInt(answer);
				if(a > 48) {
				JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");	
				}
				else if(a<= 48) {
					JOptionPane.showMessageDialog(null, "Boi you need to grow more");
	}

}
}
