package com.bilgeadam.basic;

import java.text.DecimalFormat;
import java.util.Formatter;

import javax.swing.JOptionPane;

public class PrintFunctions {

	public static void main(String[] args) {
		
		String hello = "Hello";
		String world = "world";
		System.out.println(hello);
		System.out.println(world);
		System.out.print(hello);
		System.out.println(world);
		
	JOptionPane.showMessageDialog(null, "Hello World!","Greeting",JOptionPane.INFORMATION_MESSAGE);		
	JOptionPane.showConfirmDialog(null, "Son kararınız mı?");
	
	//Number Formatting
	double d = 12.1111111232;
	//Printf Kullanarak
	System.out.printf("%n%.4f",d);
	System.out.println();
	//Formatter Kullanarak
	Formatter formatter = new Formatter();
	System.out.println(formatter.format("%.3f", d));
	//Decimal formatter kullanarak
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	System.out.println(numberFormat.format(d));
	
	//array
		int[] x= {3,5};
		int x1 = x[0];
		int x2 = x[1];
		
	}

}
