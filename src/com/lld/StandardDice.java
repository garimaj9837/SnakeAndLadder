package com.lld;
import java.util.Random;

public class StandardDice implements Dice {

	@Override
	public int roll() {
		Random random=new Random();
		return random.nextInt(6)+1;
	}
}
