package com.sebastian.maratones.ejercicio1;

import java.util.Scanner;

public class SaludosDesdeLightOJ 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t, a, b, i;
		t = sc.nextInt();
		
		for(i=1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case " + i +": " + (a + b));
		}
		
		sc.close();
	}
}


/*
 
//Es lo mismo que el de arriba solo que este lo acepta el juez porque la clase se llama main
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{ 
	    Scanner sc = new Scanner(System.in);
		int t, a, b, i;
		t = sc.nextInt();
		
		for(i=1; i <= t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case " + i +": " + (a + b));
		}
		
		sc.close();
	 }
}

*/