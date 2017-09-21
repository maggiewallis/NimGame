
public class Board
{
	private Row row1, row2, row3;
	
	
	public Board()
	{
		//-----------------------
		row1 = new Row(5);
		row2 = new Row(7);
		row3 = new Row(9);
		//------------------------
	}
	
	public int getNumChipsInRow(int whichRow)
	{
		int chips = 0;
		//-----------------------
		if (whichRow == 1)
		{
			chips = row1.getNumChips();
		}
		if (whichRow == 2)
		{
			chips = row2.getNumChips();
		}
		if (whichRow == 3)
		{
			chips = row3.getNumChips();
		}
		//------------------------
		return chips;		
	}
	
	
	public boolean rowIsEmpty(int whichRow)
	{
		boolean empty = false;
		//-----------------------
		if (whichRow == 1)
		{
			if (row1.getNumChips() == 0)
			{
				empty = true;
			}
				else 
				{
					empty = false;
				}
		}
		if (whichRow == 2)
		{
			if (row2.getNumChips() == 0)
			{
				empty = true;
			}
				else 
				{
					empty = false;
				}
		}
		if (whichRow == 3)
		{
			if (row3.getNumChips() == 0)
			{
				empty = true;
			}
				else 
				{
					empty = false;
				}
		}
		//------------------------
		return empty;
	}
	
	
	public boolean isLegalMove(int row, int numChips)
	{
		boolean legal = false;
		//-----------------------
		
		if (row == 1)
		{
			if (row1.hasNChipsAvaliable(numChips) == true)
			{
				legal = true;
			}
			else if (row1.hasNChipsAvaliable(numChips) == false)
			{
				legal = false;
			}
		}
		
		if (row ==2)
		{
			if (row2.hasNChipsAvaliable(numChips) == true)
			{
				legal = true;
			}
			else if (row2.hasNChipsAvaliable(numChips) == false)
			{
				legal = false;
			}	
		}
		
		if (row ==3)
		{
			if (row3.hasNChipsAvaliable(numChips) == true)
			{
				legal = true;
			}
			else if (row3.hasNChipsAvaliable(numChips) == false)
			{
				legal = false;
			}
		}
		
		//------------------------
		return legal;
	}
	
	
	public boolean makeMove(int row, int numChips)
	{
		boolean moveMade = false;
		//-----------------------
		if (row == 1)
		{
			if (row1.hasNChipsAvaliable(numChips) == true)
			{
				row1.removeNChips(numChips);
				moveMade = true;
			}
		}
		if (row == 2)
		{
			if (row2.hasNChipsAvaliable(numChips) == true)
			{
				row2.removeNChips(numChips);
				moveMade = true;
			}
		}
		if (row == 3)
		{
			if (row3.hasNChipsAvaliable(numChips) == true)
			{
				row3.removeNChips(numChips);
				moveMade = true;
			}
		}
		//------------------------
		return moveMade;
	}
	
	
	public boolean gameIsOver()
	{
		boolean gameOver = false;
		//-----------------------
		if (row1.getNumChips() == 0)
			if (row2.getNumChips() == 0)
				if (row3.getNumChips() == 0)
					gameOver = true;
		//------------------------
		return gameOver; 
	}
	
	
	public void displayBoard()
	{
		//-----------------------
		System.out.println("row 1 " + row1.toString());
		System.out.println("row 2 " + row2.toString());
		System.out.println("row 3 " + row3.toString());
		//------------------------
	}
}