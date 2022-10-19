package task5;

public class Assending {

	public static void main(String[] args) 
	{
		
	Sample s1=new Sample();
	s1.assending_order();
		
	}

}

class Sample
{
	void assending_order()
	{
	int[] arr=new int[]{1,5,9,3,8,5,4,7,10,75,95,45};
	for(int i=1;i<arr.length;i++)
	{
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j-1]>arr[j])
			{
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	for(int k=0; k<arr.length;k++)
	{
		System.out.print(arr[k] + " ");
	}
	
}
}