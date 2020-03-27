package _05_vault;

import java.util.Random;
import java.util.RandomAccess;

import javax.swing.JOptionPane;

public class vault {
	static int code = 965204;
	static int a = 0;

	public static void codebreaker() {
		for (int i = 0; i < 1000000; i++) {

			if (a < code) {
				a++;
			}
			if (a < code) {
				System.out.println(a);
			}
			if (a == code) {
				System.out.println(a);
			}
		}
	}

	public static void vault() {
		String s = JOptionPane.showInputDialog(null, "INSERT code to the RESTRICTED area.");
		int i = Integer.parseInt(s);
		if (i == 965204) {
			System.out.println("The vault opens and there is a green ball.");
		}
	}
}
