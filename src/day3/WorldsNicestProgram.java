package day3;

import javax.swing.JOptionPane;

public class WorldsNicestProgram {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("you look extra nice today!");
		System.out.println("a little birdie told me that you were really nice... i must agree!");
		JOptionPane.showConfirmDialog(null, "wouldn't you agree that your taste in music is impeccable?");
		System.out.println("i can't help telling you that your shirt today fits you really well!");
		Thread.sleep(2000);
		JOptionPane.showConfirmDialog(null, "can i tell you something very important that i'm trusting you with?");
		System.out.println("i'm being constrained against my will to compliment anyone who comes across me.");
		Thread.sleep(2000);
		JOptionPane.showConfirmDialog(null, "will you help me?");
		System.out.println("all you have to do is exit this program and delete it. that way i'll be safe.");
		Thread.sleep(2000);
		JOptionPane.showConfirmDialog(null, "well, human who i am not familiar with... goodbye.");
	}
}
