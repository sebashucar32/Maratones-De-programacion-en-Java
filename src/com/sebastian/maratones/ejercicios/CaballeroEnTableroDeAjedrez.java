/*
Given an m x n chessboard where you want to place chess knights. You have to find the number of maximum knights that can be placed in the chessboard such that no two knights attack each other.
Those who are not familiar with chess knights, note that a chess knight can attack 8 positions in the board as shown in the picture below.

Input
Input starts with an integer T (≤ 41000), denoting the number of test cases.

Each case contains two integers m, n (1 ≤ m, n ≤ 200). Here m and n corresponds to the number of rows and the number of columns of the board respectively.

3

8 8
3 7
4 10

Output
For each case, print the case number and maximum number of knights that can be placed in the board considering the above restrictions.

Case 1: 32
Case 2: 11
Case 3: 20

*/

package com.sebastian.maratones.ejercicios;

import java.util.Scanner;


public class CaballeroEnTableroDeAjedrez 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t, m, n, caballeros=0, posicion, x;
		t = sc.nextInt();
		
		for(int i=0; i < t; i++) 
		{
			m = sc.nextInt();
			n = sc.nextInt();
			
			posicion = m * n;
	        if(m==1 || n==1) {
	        	caballeros = posicion;
	        }	
	        else if(m==2 || n==2)
	        {
	            if(m==2) 
	            	x = n;
	            else     
	            	x = m;
	            if(x%4 == 1)      
	            	caballeros = x+1;
	            else if(x%4 == 2) 
	            	caballeros = x+2;
	            else if(x%4 == 3) 
	            	caballeros = x+1;
	            else if(x%4 == 0) 
	            	caballeros = x;
	        }
	        else if(posicion%2 == 0) 
	        	caballeros = posicion/2;
	        else 
	        	caballeros = (posicion/2)+1;
			
			System.out.println("Case " + (i+1) +": " + caballeros);
		}
		
		sc.close();
	}
}

