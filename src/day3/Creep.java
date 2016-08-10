package day3;

import javax.swing.JOptionPane;

public class Creep {  // by Radiohead
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("H3LL0 WH47 15 Y0UR N4M3");
		String age = JOptionPane.showInputDialog("H3LL0 " + name + " H0W 0LD 4R3 Y0U");
		String where = JOptionPane.showInputDialog("WH3R3 4R3 Y0U FR0M");
		String bankyn = JOptionPane.showInputDialog("D0 Y0U H4V3 4 B4NK 4CC0UN7");
		if (bankyn.equals("y") || bankyn.equals("Y") || bankyn.equals("yes") || bankyn.equals("Yes") || bankyn.equals("YES")) {
			JOptionPane.showConfirmDialog(null, "3X3LL3N7\nL37 U5 C0N71NU3");
			String banknum = JOptionPane.showInputDialog("WH47 15 Y0UR CR3D17 C4RD NUMB3R");
			
		}else if(bankyn.equals("n") || bankyn.equals("N") || bankyn.equals("no") || bankyn.equals("No") || bankyn.equals("NO")){
			String address= JOptionPane.showInputDialog("D4MN\n4LR1GH7 7H3N\nWH47 15 Y0UR 4DDR355");
		}else{
			bankyn = JOptionPane.showInputDialog("");
		}
	}
}
