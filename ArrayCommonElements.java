package ArrayCodingPrograms;

public class ArrayCommonElements {

	public static void commonElements(int a[],int b[],int c[])
	{
		int x=0;int y=0;int z=0;
		
		while(x <a.length && y<b.length && z<c.length)
		{
			if(a[x]==b[y]&& b[y]== c[z])
			{
				System.out.println(a[x]);
				x++;
				y++;
				z++;
			}
			else if(a[x]>b[y])
			{
				y++;
			}
			else if (b[y]>c[z]) 
			{
				z++;
				
			}
			else
			{
				x++;
			}
		}
			}

	

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10, 20, 40, 80 };
		int arr2[] = { 6, 7, 20, 80, 100 };
		int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };
		
		commonElements(arr1, arr2, arr3);

	}

}
