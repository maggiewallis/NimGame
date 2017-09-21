
public class Row
{
	private int numChips;
	
	
	public Row(int numChipsToStart)
	{
		//-----------------------
		numChips = numChipsToStart;
		//------------------------		
	}
	
	public int getNumChips()
	{
		return numChips;
	}
	
	
	public boolean isEmpty()
	{
		boolean iAmEmpty = false;
		//-----------------------
		if (numChips == 0)
		{
			iAmEmpty = true;
		}
		else if (numChips > 0)
		{
			iAmEmpty = false;
		}
				
		//------------------------
		return iAmEmpty; // replace this!
	}
	
	
	public boolean hasNChipsAvaliable(int N)
	{
		boolean hasEnough = false;
		//-----------------------
		if (numChips >= N)
		{
			hasEnough = true;
		}
		else if (numChips < N)
		{
			hasEnough = false;
		}
		//------------------------
		return hasEnough; // replace this!
	}
	
	public void removeNChips(int N)
	{
		//-----------------------
		numChips = numChips - N;
		//------------------------
	}
	
	
	public String toString()
	{
		String response = "";
		//-----------------------
		int i = 0;
		for(i = 0; i < numChips; i = i + 1)
		{
			response = response + "*";
		}
		
		//------------------------
		return response;
	}
}
