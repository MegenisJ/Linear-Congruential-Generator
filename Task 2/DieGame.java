import java.io.*;
import java.util.*;
public class DieGame extends Game{
	private static HashSet<Integer> numbersRolled=new HashSet<Integer>();
	@Override
  void initialiseGame(){
    
  }
  @Override
	void mainGame(){
    try{
		  for (int i=0; i<2; i++) {
        System.out.println("Hit <RETURN> to roll the die");
        br.readLine();
        int dieRoll=(int)(r.next() * 6) + 1;

        System.out.println("You rolled " + dieRoll);
        numbersRolled.add(new Integer(dieRoll));
      }
      // Display the numbers rolled
      System.out.println("Numbers rolled: " + numbersRolled);
    }
    catch(IOException e){
        System.err.println("IOException");

    }
	}
	@Override
	void declareWinner(){
		// Declare the winner:

      // User wins if at least one of the die rolls is a 1
    if (numbersRolled.contains(new Integer(1))) {
      System.out.println("You won!");
    }
    else System.out.println("You lost!");
	}
}