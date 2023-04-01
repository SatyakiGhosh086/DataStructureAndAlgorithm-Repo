package com.JavaProgram.Matrix;

public class SnakePattern 
{
	public static void main(String args[])
	{
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println("Snake Pattern............");
		for(int i = 1;i <= 4;i++)
		{
			if(i%2 != 0)
			{
				for(int j = 0;j < 4;j++)
				{
					System.out.print(arr[i-1][j]+" ");
				}
			}
			else
			{
				for(int j = 3;j >=0;j--)
				{
					System.out.print(arr[i-1][j]+" ");
				}
			}
		}
		System.out.println();
		System.out.println("Boundary Elements............");
			int i = 0,j = 0;
			for(;j < 4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			j--;
			i++;
			for(;i < 4;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			i--;
			j--;
			for(;j >= 0;j--)
			{
				System.out.print(arr[i][j]+" ");
			}
			j++;
			i--;
			for(;i > 0;i--)
			{
				System.out.print(arr[i][j]+" ");
			}
			
		
	}
}
