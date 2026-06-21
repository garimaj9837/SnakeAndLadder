package com.lld;
import java.util.List;

public class Game {

	Board board;
	List<Player> players;
	Dice dice;
	Game(Board board, List<Player> players,Dice dice){
		this.board=board;
		this.players=players;
		this.dice=dice;
	}
	
	public void play() {
		System.out.println("Game Started...");
		boolean hasWinner=false;
		int current=0;
		int temp=0;
		int finalVal=0;
		Player winner=null;
		
		
		while(!hasWinner) {
			for(Player p:players) {
				System.out.println("Player "+p.getName()+" rolling...");
				
				int val=dice.roll();
				System.out.println("dice roll: "+val);
				
				current=p.getPosition();
				temp=current+val;
				if(temp<=board.getBoardSize()) {
					if(board.hasJump(temp)) {
						finalVal=board.getNewPosition(temp);
						if(finalVal>temp)
					        System.out.println(p.getName()+" jumped a ladder from "+current+" to "+temp+" to "+finalVal);
						else {
							System.out.println(p.getName()+" bitten by a snake from "+current+" to "+temp+" to "+finalVal);
						}
					}else {
						finalVal=temp;
					}
					p.setPosition(finalVal);
					System.out.println("position changes from: "+current+" -> "+finalVal);
				} else {
					System.out.println("Value overshoot................");
				}
				
				if(finalVal==board.getBoardSize()) {
					hasWinner=true;
					winner=p;
				}
				
			}
		}
		
		System.out.println("Winner is :"+winner.getName());
	}
	
}
