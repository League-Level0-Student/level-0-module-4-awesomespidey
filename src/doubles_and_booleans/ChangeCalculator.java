package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
  
String input=JOptionPane.showInputDialog("How many nickles do you have??");
int numNick = Integer.parseInt(input);
		// Ask the user how many dimes they have, and convert their answer
String inputt = JOptionPane.showInputDialog("How many dimes do you have??");
int numDimes = Integer.parseInt(inputt);
		// Ask the user how many quarters they have, and convert their answer
String inputtt = JOptionPane.showInputDialog("How many quarters do you have??");
int numQuart = Integer.parseInt(inputtt);
		// Calculate how much money the user has and save it in a double variable 
double sum = 0;
sum+=5 * numNick;
sum+=10 * numDimes;
sum+=25 * numQuart;

		// Tell the user how much money they have
JOptionPane.showMessageDialog(null,"$" + sum/100);
	}
}

