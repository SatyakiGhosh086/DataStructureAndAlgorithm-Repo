package com.JavaProgram.Hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountDistinct 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader instream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(instream);
		System.out.println("Enter the size of the array.......");
		int n = Integer.parseInt(stdin.readLine());
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array......");
		for(int i = 0;i < n;i++)
		{
			arr[i] = Integer.parseInt(stdin.readLine());
		}
		Arrays.sort(arr);
		System.out.println("Display the elements in the array....");
		for(int i = 0;i < n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int count = 1;
		int num = arr[0];
		for(int i = 1;i < n;i++)
		{
			if(num != arr[i])
			{
				count++;
				num = arr[i];
			}
		}
		System.out.println(count);
	}
}
