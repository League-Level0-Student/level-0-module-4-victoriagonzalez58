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
String nicc =JOptionPane.showInputDialog(null, "How many nickels do you have?");
int nick = Integer.parseInt(nicc);
String dim =JOptionPane.showInputDialog(null, "How many dimes do you have?");
int dime = Integer.parseInt(dim);
String qua =JOptionPane.showInputDialog(null, "How many quarters do you have?");
int quart = Integer.parseInt(qua);
double nickle = nick*0.05;
double dimmme=dime*0.1;
double quarter=quart*0.25;
double Totalmoney = nickle+quarter+dimmme;
JOptionPane.showMessageDialog(null, "Your total is $"+Totalmoney);
		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

