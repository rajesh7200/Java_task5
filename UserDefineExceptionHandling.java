package task5;

public class UserDefineExceptionHandling
{
	static void submit() throws VoterIdException
	{
		int age=11;
		if(age>=18)
		{
			System.out.println("you elligible for apply voter Id card");
		}
		else
		{
			throw new VoterIdException("you are not elligible now,wait...");
		}
	}

	
	public static void main(String[] args) 
	{
	try {
		submit();
	}
	catch(VoterIdException e)
	{
		System.out.println(e.getmsg());
	}

	}

}

class VoterIdException extends Exception
{
String msg;
VoterIdException(String msg)
{
	this.msg=msg;
}
public String getmsg()
	{
	return msg;
	}
}
