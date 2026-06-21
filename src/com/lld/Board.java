package com.lld;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board{

	public static final int BOARD_SIZE=100;
	final Map<Integer,Integer> jumps=new HashMap<>();
	
	public Board(List<Snake> snakes ,List<Ladder> ladders) {
		for(Snake s:snakes) {
			jumps.put(s.getStart(), s.getEnd());
		}
		
		for(Ladder l:ladders) {
			jumps.put(l.getStart(), l.getEnd());
		}
	}
	
	public int getBoardSize() {
		return BOARD_SIZE;
	}
	
	public boolean hasJump(int position) {
		return jumps.containsKey(position);
	}
	
	public int getNewPosition(int position) {
		return jumps.getOrDefault(position, position);
	}
}
