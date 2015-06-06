package com.karl;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	public static String note50Amt;
	public static String note20Amt;
	public static String note10Amt;
	public static String note5Amt;
	public static String coin2Amt;
	public static String coin1Amt;
	public static String cent50Amt;
	public static String cent20Amt;
	public static String cent10Amt;
	public static String cent5Amt;
	public static String cent2Amt;
	public static String cent1Amt;
	public static String bagsAmt;
	
	public static ArrayList <String> bagsAmount = new ArrayList <String> ();
	
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Read in the users input.
		note50Amt = JOptionPane.showInputDialog("Amount of €50:");
		note20Amt = JOptionPane.showInputDialog("Amount of €20:");
		note10Amt = JOptionPane.showInputDialog("Amount of €10:");
		note5Amt = JOptionPane.showInputDialog("Amount of €5:");
		coin2Amt = JOptionPane.showInputDialog("Amount of €2:");
		coin1Amt = JOptionPane.showInputDialog("Amount of €1:");
		cent50Amt = JOptionPane.showInputDialog("Amount of 50c:");
		cent20Amt = JOptionPane.showInputDialog("Amount of 20c:");
		cent10Amt = JOptionPane.showInputDialog("Amount of 10c:");
		cent5Amt = JOptionPane.showInputDialog("Amount of 5c:");
		cent2Amt = JOptionPane.showInputDialog("Amount of 2c:");
		cent1Amt = JOptionPane.showInputDialog("Amount of 1c:");
		bagsAmt = JOptionPane.showInputDialog("Do you have any bags of coints?\n(Only works if coin bags are counted correctly)");
		
		if(toInt(bagsAmt) > 0) {
			for (int i = 0 ; i < toInt(bagsAmt) ; i ++) {
				bagsAmount.add(JOptionPane.showInputDialog("Amount in bag " + (i + 1) + ":"));
			}
		}
		
		// Print the total savings of the user.
		JOptionPane.showMessageDialog(null,
				"Total savings:\n" + df.format(calcTotal()),
				"Total", 
				JOptionPane.PLAIN_MESSAGE );
	}
	
	public static double calcTotal() {
		double note50 = toInt(note50Amt) * 50.0;
		System.out.println("€50: " + note50);
		
		double note20 = toInt(note20Amt) * 20.0;
		System.out.println("€20: " + note20);
		
		double note10 = toInt(note10Amt) * 10.0;
		System.out.println("€10: " + note10);
		
		double note5 = toInt(note5Amt) * 5.0;
		System.out.println("€5: " + note5);
		
		double euro2 = toInt(coin2Amt) * 2.0;
		System.out.println("€2: " + euro2);
		
		double euro1 = toInt(coin1Amt) * 1.0;
		System.out.println("€1: " + euro1);
		
		double cent50 = toInt(cent50Amt) * 0.50;
		System.out.println("50c: " + cent50);
		
		double cent20 = toInt(cent20Amt) * 0.20;
		System.out.println("20c: " + cent20);
		
		double cent10 = toInt(cent10Amt) * 0.10;
		System.out.println("10c: " + cent10);
		
		double cent5 = toInt(cent5Amt) * 0.05;
		System.out.println("5c: " + cent5);
		
		double cent2 = toInt(cent2Amt) * 0.020;
		System.out.println("2c: " + cent2);
		
		double cent1 = toInt(cent1Amt) * 0.01;
		System.out.println("1c: " + cent1);
		
		double total = 0;
		
		total += note50 + note20 + note10 + note5 + euro2 + euro1 + cent50 + cent20 + cent10 + cent5 + cent2 + cent1;
		
		for (int i = 0 ; i < toInt(bagsAmt) ; i++ ) {
			total += toInt(bagsAmount.get(i));
			System.out.println("Bag " + i + ": " + toInt(bagsAmount.get(i)));
		}
		
		System.out.println("Total: " + total);
		
		return total;
	}
	
	// Method to convert the strings into integers
	public static Integer toInt(String number) {
		
		int num = Integer.parseInt(number);
		
		return num;
	}
}
