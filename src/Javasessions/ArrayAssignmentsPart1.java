package Javasessions;

import java.util.Arrays;

public class ArrayAssignmentsPart1{

	public static void main(String[] args) {
		 // WAP to remove 22 from below array
		int p[] = {1,4,5,2,3,22,31,2};
		
		int a[]= new int[p.length-1];
		
		int j =0;
		for (int e:p) {
			
			if (!(e==22)) {
				a[j]=e;
				j++;
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		// WAP to shift zeros to left 
		int t[] = {1,2,6,0,0,0,22,0,1};
		
		int q[] = new int[t.length];
		
		int k =0;
		
		for (int e:t)
		{
		if(!(e==0))
		{
			q[k]=e;
			k++;
		}
		
		}
		
		System.out.println(Arrays.toString(q));
	 
	}}
