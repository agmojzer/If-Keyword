
public class CodeblocksApp{

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
//		if(score < 5000 && score >1000) {
//			System.out.println("Your score was less than 5000 but greater than 1000.");
//		} else if (score <1000) {
//			System.out.println("Your score was less than 1000.");
//		} else {
//			System.out.println("Got here");
//		}
			//"This was executed line is conditional to if statement inside curly brackets.
			// If it were outside the brackets, the sentence would print regardless.
		
		//Code below runs because the gameOver is defined within same codeblock...{}
		if(gameOver ==true) // could also write if(gameOver), it would equate to if(gameOver ==true)
			{
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
			}
		
//	boolean newGameOver = true;
//	int newScore = 10000;
//	int newLevelCompleted = 8;
//	int newBonus = 200;{
//	
//	if(newGameOver==true)
//		{int finalScore = newScore + (newLevelCompleted * newBonus);
//		System.out.println("Your final score was " + finalScore);
//	
//		}
		
		int secScore = 10000;
		}
	
}
	}



