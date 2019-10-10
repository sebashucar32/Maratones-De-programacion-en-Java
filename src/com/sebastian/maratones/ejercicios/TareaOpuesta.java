package com.sebastian.maratones.ejercicios;

import java.util.Scanner;

public class TareaOpuesta   //Para que lo acepte el juez se debe cambiar el nombre de la clase TareaOpuesta a Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t, n, i, a, b, tope;
		int vector[];
		vector = new int[25];
		
		for(int j=0; j<vector.length; j++) {
			vector[j] = 0;
		}
		
		t = sc.nextInt();
		
		for(i=1; i <= t; i++) {
			n = sc.nextInt();
			if(n == 0){
				System.out.println("0 0");
			}
			else if(n < 11){
				a = vector[n];
				b = Math.abs(n - vector[n]);
				vector[n]++;
				
				System.out.println(a + " " + b);
			}
			else {
				tope = n - 10;
				System.out.println(10 + " " + tope);
			}
		}
		
		sc.close();
	}
}
