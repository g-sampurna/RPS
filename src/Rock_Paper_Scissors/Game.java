package Rock_Paper_Scissors;

public class Game {
	private Player player1,player2,player3,player4;
	private int player1_Score,player2_Score,player3_Score,player4_Score;
	private int numberOfGames;

	//initializing the instance variables
	public Game() {
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
		player4 = new Player();
		player1_Score = 0;
		player2_Score = 0;
		player3_Score = 0;
		player4_Score = 0;
		numberOfGames = 0;
	}
	public static void main(String[] args) {

		Game rps = new Game();//Initialization made.
		rps.startGame();
	}
	//This function is called recursively.
	public void startGame() {
		int player1input=-1,player2input=-1,player3input=-1,player4input=-1;
		if(numberOfGames<50)
		{
			player1input = player1.getInput();
			Driver.display(player1.getName(), player1input);
			player2input = player2.getInput();
			Driver.display(player2.getName(), player2input);
			player3input = player3.getInput();
			Driver.display(player3.getName(), player3input);
			player4input = player4.getInput();
			Driver.display(player4.getName(), player4input);
			System.out.println();
		}
		
		while(numberOfGames<50)
		{
			numberOfGames++;
			player1_Score+=Driver.compareSelections(player1input, player2input);
			player1_Score+=Driver.compareSelections(player1input, player3input);
			player1_Score+=Driver.compareSelections(player1input, player4input);
			player2_Score+=Driver.compareSelections(player2input, player1input);
			player2_Score+=Driver.compareSelections(player2input, player3input);
			player2_Score+=Driver.compareSelections(player2input, player4input);
			player3_Score+=Driver.compareSelections(player3input, player1input);
			player3_Score+=Driver.compareSelections(player3input, player2input);
			player3_Score+=Driver.compareSelections(player3input, player4input);
			player4_Score+=Driver.compareSelections(player4input, player1input);
			player4_Score+=Driver.compareSelections(player4input, player2input);
			player4_Score+=Driver.compareSelections(player4input, player3input);
			printStats();
			startGame();
		}
		
	}
	//Prints the result.
	public void printStats()
	{
		System.out.println("Number of games played is "+numberOfGames);
		System.out.println(player1.getName()+"'s score "+player1_Score);
		System.out.println(player2.getName()+"'s score "+player2_Score);
		System.out.println(player3.getName()+"'s score "+player3_Score);
		System.out.println(player4.getName()+"'s score "+player4_Score);
	}
}
