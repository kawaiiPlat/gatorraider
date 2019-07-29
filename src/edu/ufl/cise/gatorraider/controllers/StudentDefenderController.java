package edu.ufl.cise.cs1.controllers;

import game.controllers.DefenderController;
import game.models.*;

import java.util.List;

public final class StudentDefenderController implements DefenderController
{
	public void init(Game game) { }

	public void shutdown(Game game) { }
	
	private enum defenders {UGA, UT,FSU,LSU}

	public int[] update(Game game,long timeDue)
	{
		
		//
		int[] actions = new int[Game.NUM_DEFENDER]; //holds the moves for each defender
		List<Defender> enemies = game.getDefenders();

		for (Defender defender: enemies) {
			System.out.println(defender.getLocation());

		}
		
		//Chooses a random LEGAL action if required. Could be much simpler by simply returning
		//any random number of all of the ghosts
		for(int i = 0; i < actions.length; i++) {
			Defender defender = enemies.get(i);
			List<Integer> possibleDirs = defender.getPossibleDirs();

			switch (i) {
				case 0: //uga
					actions[i] = UGAMove(possibleDirs);
					break;
				case 1: //ut
					actions[i] = UTMove(possibleDirs);
					break;
				case 2: //fsu
					actions[i] = FSUMove(possibleDirs);
					break;
				case 3: // lsu
					actions[i] = LSUMove(possibleDirs);
					break;

			}

//			if (possibleDirs.size() != 0)
//				actions[i]=possibleDirs.get(Game.rng.nextInt(possibleDirs.size()));
//			else
//				actions[i] = -1;
//			}
		}

			return actions;
	}


	private int genericMove(List<Integer> possMoves){
		int[] prefMove = {1,2,4,3}; // order preffered array of moves

		//some logic, sets prefMove

		//compare pref list to possible moves
		for (int dir: prefMove) {
			if(possMoves.contains(dir)){
				return dir;
			}
		}
		return -1;

	}

	private int UGAMove(List<Integer> possMoves){
		int[] prefMove = {1,2,4,3}; // order preffered array of moves

		//some logic, sets prefMove

		//compare pref list to possible moves
		for (int dir: prefMove) {
			if(possMoves.contains(dir)){
				return dir;
			}
		}
		return -1;

	}

	private int UTMove(List<Integer> possMoves){
		int[] prefMove = {1,2,4,3}; // order preffered array of moves

		//some logic, sets prefMove

		//compare pref list to possible moves
		for (int dir: prefMove) {
			if(possMoves.contains(dir)){
				return dir;
			}
		}
		return -1;

	}

	private int FSUMove(List<Integer> possMoves){
		int[] prefMove = {1,2,4,3}; // order preffered array of moves

		//some logic, sets prefMove

		//compare pref list to possible moves
		for (int dir: prefMove) {
			if(possMoves.contains(dir)){
				return dir;
			}
		}
		return -1;

	}

	private int LSUMove(List<Integer> possMoves){
		int[] prefMove = {1,2,4,3}; // order preffered array of moves

		//some logic, sets prefMove

		//compare pref list to possible moves
		for (int dir: prefMove) {
			if(possMoves.contains(dir)){
				return dir;
			}
		}
		return -1;

	}
}
