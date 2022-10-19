package task5;

public class Descending {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.descending_order();

	}

}


class Demo
{
	void descending_order()
	{
	int[] arr=new int[]{1,103,9,3,-8,-5,5,4,7,10,75,95,45};
	for(int i=1;i<arr.length;i++)
	{
		for(int j=1; j<arr.length; j++)
		{
			if(arr[j-1]<arr[j])
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
