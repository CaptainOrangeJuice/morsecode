package morsecode;

import java.util.Scanner;

public class MorseCodeRunner {
	static Scanner keyboard = new Scanner(System.in);
	static char stop = 'Y';
	static morsecode test = new morsecode();
	public static void main(String[] args) {
		
		while (Character.toUpperCase(stop) == 'Y') {
			System.out.println("Input text or morse code: [Press enter to see alphabet]");
			test.setText(keyboard.nextLine());
			System.out.println(test.toString());
			System.out.println("Continue? Y/N ");
			stop = keyboard.next().charAt(0);
			keyboard.nextLine();
		}
	}
}
