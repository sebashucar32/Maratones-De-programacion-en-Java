package com.sebastian.maratones.ejercicios;

import java.util.Scanner;

public class SaludosDesdeLightOJ  //Si se va a probar el ejercicio en el juez se debe cambiar el nombre de la clase a Main
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