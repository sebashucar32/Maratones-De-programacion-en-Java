package com.sebastian.maratones.ejercicio1;

import java.util.Scanner;

public class FantásticocumpleañosFibsieve 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x, y, flag=0, t;
		double s, tope, limite, techo, celdasRestantes, contador;
//		int matriz[][];
//		matriz = new int[5][5];
		
		t = sc.nextInt();
		
		for (int i = 0; i < t; i++) 
		{
			contador=1;
			s = sc.nextInt();
			x=1;
			y=1;
			tope=3;
			
			while(contador != s) {
				if(flag == 0 && contador != s) {
					y++;
					contador++;
					limite = tope / 2;
					techo = Math.ceil(limite);
					celdasRestantes = tope - techo;
					
					if(contador==s) {
						break;
					}
					
					for (int j = 1; (j < techo && contador != s); j++) {
						x++;
						contador++;
						
						if(contador==s) {
							break;
						}
					}
					
					for (int j = 0; (j < celdasRestantes && contador != s); j++) {
						y--;
						contador++;
						
						if(contador==s) {
							break;
						}
					}
					
					flag = 1;
					tope = tope + 2;
				}
				
				if(flag == 1 && contador != s) {
					x++;
					contador++;
					limite = tope / 2;
					techo = Math.ceil(limite);
					celdasRestantes = tope - techo;
					
					for (int j = 1; (j < techo && contador != s); j++) {
						y++;
						contador++;
						
						if(contador==s) {
							break;
						}
					}
					
					for (int j = 0; (j < celdasRestantes && contador != s); j++) {
						x--;
						contador++;
						
						if(contador==s) {
							break;
						}
					}
					
					flag = 0;
					tope = tope + 2;
				}
			}
			
			System.out.println("Case " + (i+1) +": " + x + " " + y);
			flag=0;
		}
				
		sc.close();
	}
}

