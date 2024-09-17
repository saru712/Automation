package ArrayCodingPrograms;

import java.util.Arrays;

public class ShiftZeroRight {
	
	public static int[] shiftzerotoright(int[] a) {
		if(a.length==1)
		{
			return a;
		}
		int newarray[] = new int[a.length];
		int count =0;
		for (int num : a) {
			if(num!=0) {
				newarray[count] =num;
				count++;
			}
		}
		return newarray;
	}

	public static void main(String[] args) {
		int [] a = new int[] {1,0,3,0,5,2,0,7,0};
		
		System.out.println(Arrays.toString(shiftzerotoright(a)));	
		

	}

}
