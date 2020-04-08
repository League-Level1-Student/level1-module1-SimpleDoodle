package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
String s = "";
s = JOptionPane.showInputDialog("What flavor do you want your popcorn?");
Popcorn p = new Popcorn(s);
Microwave m = new Microwave();
String t = JOptionPane.showInputDialog(null, "How long do you want to cook the popcorn?");
int time = Integer.parseInt(t);
m.setTime(time);
m.putInMicrowave(p);
m.startMicrowave();
}
}
