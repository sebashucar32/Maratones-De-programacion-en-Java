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

/*
#include <cstring>
#include <cstdlib>
#include <iostream>
#include <cmath>
#include <algorithm>
#include <list>
#include <stack>
#include <utility>
#include <set>
#include <ctime>
#include <string>
#include <map>
#include <vector>

#define LongInt long long
#define SIZE 1002
#define max3(a, b, c) max(a, b) > max(b, c) ? max(a, b) : max(b, c)
#define min3(a, b, c) min(a, b) < min(b, c) ? min(a, b) : min(b, c)

#define digit(c) (c - '0')
#define CONST 141.421356237f

using namespace std;

int a[SIZE][SIZE];

	//freopen("out.txt", "w", stdout);
	
#include <stdio.h>
#include <math.h>
int main()
{
	//freopen("input.txt", "r", stdin);
	
	int tc, i, j, k, m, n, ans;
	
	scanf("%d", &tc);
	
	for(i = 0; i < tc; i++)
	{
		scanf("%d %d", &m, &n);
		
		if(m == 1)
			ans = n;
		else if(n == 1)
			ans = m;
		else if(n == 2)
		{
			ans = (m / 4) * 4;
			if(m % 4 == 1)
				ans += 2;
			else if(m % 4 > 1)
				ans += 4;
		}
		else if(m == 2)
		{
			ans = (n / 4) * 4;
			if(n % 4 == 1)
				ans += 2;
			else if(n % 4 > 1)
				ans += 4;
		}
		else
			ans = ((m * n) + 1) / 2;
		
		printf("Case %d: %d\n", i + 1, ans);
	}
	
	return 0;
}
*/