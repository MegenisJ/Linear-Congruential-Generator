import java.io.*;
import java.util.*;
public class ChooseGame{
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String [] args){
		try{
		System.out.print("Card (c) or Die (d) game? ");
    	String ans=br.readLine();
    	if (ans.equals("c")) {
		Game game = new CardGame();
		game.play();
    	}
    	else if (ans.equals("d")) {
		Game game = new DieGame();
		game.play();
    	}
    	else System.out.println("Input not understood");
   	  	}
   	  	  catch(IOException e){
      	System.err.println("IOException");
      }
  	}		
}
