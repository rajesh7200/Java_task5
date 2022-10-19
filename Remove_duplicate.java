package task5;
import java.util.TreeSet;

public class Remove_duplicate {

	public static void main(String[] args)
	{
		Memo m1=new Memo();
		m1.remove_dupli();
	}

}

class Memo
{


	void remove_dupli()
	{
	int[] arr=new int[]{1,5,9,1,3,8,5,4,4,7,10,75,75,95,45};

	TreeSet t1=new TreeSet();
	for(int i=0;i<arr.length;i++)
	{
		t1.add(arr[i]);

	}
	
	System.out.print(t1+" ");
	}
}


