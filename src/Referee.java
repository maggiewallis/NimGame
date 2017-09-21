import java.util.InputMismatchException;
import java.util.Scanner;

public class Referee
{
	private Board theBoard;
	private int whosTurn;
	
	public Referee()
	{
		//-----------------------
		theBoard = new Board();
		whosTurn = 1;
		//------------------------
	}
	
	
	
	public void playGame()
	{
		System.out.println("Start of game");
		

		
		while (theBoard.rowIsEmpty(1) == false || theBoard.rowIsEmpty(2) == false || theBoard.rowIsEmpty(3) == false)
		{
			//display a picture of the new board
			theBoard.displayBoard(); 
			//go to player one and ask them what row they want to choose (1,2,3)
			System.out.println("Player " + whosTurn + ", choose a row");
			int n = getInt();
			//if they say a row that doesn't exist, tell them to choose from 1,2,3
			if (n != 1 && n != 2 && n != 3)
			{
				System.out.println("This row doesn't exist. Pick a different one.");
				n = getInt();
			}
			//if they say an empty row, tell them to pick a different one
			while (theBoard.rowIsEmpty(n) == true)
			{
				//if it doesn't have any stars then tell them to pick a different row
				System.out.println("This row is empty. Pick one of the other rows");
				n = getInt();
			}
		
			//if the row has at least one star then ask how many stars they want to take
			System.out.println("How many chips do you want to remove?");
			int remove = getInt();
			//if they want to take less stars than are left , then remove that many stars
			while (theBoard.isLegalMove(n, remove) == false)
			{
				System.out.println("This row does not have enough chips. Choose less chips to remove.");
				remove = getInt();
			}
			
			//make the move
				theBoard.makeMove(n, remove);

			//switch between players
			if (whosTurn == 1)
			{
				whosTurn = 2;
			}
			else if (whosTurn == 2)
			{
				whosTurn = 1;
			}
		
		}
		
		//------------------------
		//end game
		System.out.println("Game over.");
		System.out.println("Player" + whosTurn + ", you lose.");
		
		// ask whether they want to play again
		// restart the game
	}
	
	
	public int getInt()
	{ 
		Scanner keyboardReader = new Scanner(System.in);
		int result;
		while (true)
		{
			
			try 
			{
				result = keyboardReader.nextInt();
				break; // leave the loop now.
			}
			catch (InputMismatchException nfe)
			{
				System.out.println("Please enter an integer.");
			}
			keyboardReader.next(); // clears any extra characters.
		}
		return result;
	}
}
