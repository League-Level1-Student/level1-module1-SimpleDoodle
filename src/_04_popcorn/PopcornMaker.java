package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
System.out.println("There is uncooked popcorn on the counter");
String CornFlavor = JOptionPane.showInputDialog(null, "What flavor popcorn do you want?");
String Minutes = JOptionPane.showInputDialog(null,"How long do you want the popcorn to cook?");
System.out.println("The " + CornFlavor + " flavored popcorn is cooking for " + Minutes + " minutes.");
System.out.println("3");
System.out.println("2");
System.out.println("1");
System.out.println("Your " + CornFlavor + " popcorn is ready.");
}
}
