import java.io.*;
import java.util.*;

public abstract class Game {
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	public static LinearCongruentialGenerator r=new LinearCongruentialGenerator();

	abstract void initialiseGame();
	abstract void mainGame();
	abstract void declareWinner();
	public final void play() {
		initialiseGame();
		mainGame();
		declareWinner();
	}
}

      