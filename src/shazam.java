package extras;

import javax.swing.JOptionPane;

public class shazam {
	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog(null, "Input a word");
	 String num = JOptionPane.showInputDialog(null, "Input a number");
	 int mun = Integer.parseInt(num);
	 for (int i = 0; i < mun; i++) {
		System.out.print(word+"\n");
		
	}
	
	}
	
}
