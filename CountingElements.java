package com.JavaProgram.CountElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountingElements 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(instream);
		System.out.println("Enter the size of the array.....");
		int n = Integer.parseInt(stdin.readLine());
		System.out.println("Enter the values in the array....");
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt(stdin.readLine());
		}
		Arrays.sort(arr);
		System.out.println("Displaying the array in sorted order....");
		for(int i = 0; i < n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int k = 1;
		for(int i = 1;i < n;i++)
		{
			if(arr[i] ==  arr[i-1])
			{
				k++;
			}
			if(arr[i] != arr[i-1])
			{
				System.out.println("Element : "+arr[i-1]+" Count : "+k);
				k = 1;
			}
			if(i == n-1)
			{
				
					System.out.println("Element : "+arr[i]+" Count : "+k);
					
			}
		}
	}
}
