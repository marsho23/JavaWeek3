package com.qa.enums;
import java.util.Random;

public class GameRunner {
	
	private Random rand = new Random();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameRunner gameRunner = new GameRunner();
		System.out.println(gameRunner.game(GameEnum.ROCK));

	}
	
	public boolean game(GameEnum call) {
		int randNumber = this.rand.nextInt(4);
		System.out.println(randNumber);

		GameEnum result;
		if (randNumber==1)
			result = GameEnum.ROCK;
		else if (randNumber==2)
			result = GameEnum.PAPER;
		else
			result = GameEnum.SCISSORS;		
		return call== result;
	}

}
