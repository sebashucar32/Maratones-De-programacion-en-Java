package com.sebastian.maratones.ejercicio1;

import java.util.Scanner;

public class CaballeroEnTableroDeAjedrez 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t, m, n, caballeros;
		t = sc.nextInt();
		
		for(int i=0; i < t; i++) 
		{
			m = sc.nextInt();
			n = sc.nextInt();
			
			if(m == 1)
				caballeros = n;
			else if(n == 1)
				caballeros = m;
			else if(n == 2)
			{
				caballeros = (m / 4) * 4;
				if(m % 4 == 1)
					caballeros += 2;
				else if(m % 4 > 1)
					caballeros += 4;
			}
			else if(m == 2)
			{
				caballeros = (n / 4) * 4;
				if(n % 4 == 1)
					caballeros += 2;
				else if(n % 4 > 1)
					caballeros += 4;
			}
			else
				caballeros = ((m * n) + 1) / 2;
			
			System.out.println("Case " + i+1 +":  " + caballeros);
		}
		
		sc.close();
	}
}


/*
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