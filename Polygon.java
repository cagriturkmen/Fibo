package com.bilgeadam.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

//n:kenar sayısı
//s:bir kenar uzunluğu
//(n*s^2)/(4*tan(pi/n))

public class Polygon {

	public static void main(String[] args) {
		final double PI_NUMBER= 3.14;

		int n;
		int s;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kenar sayısını giriniz:");
		n = scanner.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Lütfen kenar uzunluğunu giriniz:");
		s = scanner.nextInt();
		double square = (n*(Math.pow(s, 2)))/(4*(Math.tan(PI_NUMBER/n)));
		System.out.println(n+"gen alanı: "+square);
		
	}

}
