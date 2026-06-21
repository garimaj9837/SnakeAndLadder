package com.lld;
import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadderApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Snake> snakes=new ArrayList<>();
		snakes.add(new Snake(98,2));
		snakes.add(new Snake(54,20));
		snakes.add(new Snake(93,10));
		snakes.add(new Snake(69,45));
		snakes.add(new Snake(38,14));
		
		List<Ladder> ladders=new ArrayList<>();
		ladders.add(new Ladder(8,51));
		ladders.add(new Ladder(30,75));
		ladders.add(new Ladder(7,66));
		ladders.add(new Ladder(41,86));
		
		Board board=new Board(snakes,ladders);
		System.out.println("Board setup completed...");
		
		//Game Start
		
		List<Player> players=new ArrayList<>();
		
		players.add(new Player("Garima"));
		players.add(new Player("Mahima"));
		players.add(new Player("Khushi"));
		players.add(new Player("Betu"));
		
		System.out.println("Player added...");
		
		Dice dice=new StandardDice();
		
		Game game=new Game(board,players,dice);
		game.play();
		
		
	}

}
