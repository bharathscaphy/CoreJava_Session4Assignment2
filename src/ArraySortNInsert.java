import java.util.*;
public class ArraySortNInsert {

	public static void main(String[] args) {
		int temp,i,val;
		int arr[]=new int[11];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Values you want to Enter in an Array:");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" Array Values:");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the Value to be Inserted");
		val = sc.nextInt();
		i=n-1;
		while(val<arr[i] && i>=0)
		{
			arr[i+1] = arr[i];
			i--;
		}
		arr[i+1]=val;
		n++;
		System.out.println("Array after Insertion of a Value");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}