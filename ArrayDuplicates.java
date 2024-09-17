package ArrayCodingPrograms;

import java.util.HashSet;

public class ArrayDuplicates {
	
	public static void duplicate(int a[])
	{
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hset.add(a[i])==false)
			{
			System.out.println(a[i]+" is duplicated in array");
			}
			
		}
		System.out.println(hset);
	}
	

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 6, 4, 3, 5,4 };

		System.out.println("Duplicate elements in array is :");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}

		}
		
		duplicate(arr);
	}

}
