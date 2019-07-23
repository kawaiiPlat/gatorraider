package edu.ufl.cise.gatorraider.controllers;

import edu.ufl.cise.gatorraider.controllers.DefenderController;
import edu.ufl.cise.gatorraider.models.Defender;
import edu.ufl.cise.gatorraider.models.Game;

import java.util.List;

public final class StudentDefenderController implements DefenderController
{
	public void init(Game game) { }

	public void shutdown(Game game) { }
	
	private enum defenders {UGA, UT,FSU,LSU}

	public int[] update(Game game,long timeDue)
	{
		
		
		int[] actions = new int[Game.NUM_DEFENDER];
		List<Defender> enemies = game.getDefenders();


		
		//Chooses a random LEGAL action if required. Could be much simpler by simply returning
		//any random number of all of the ghosts
		for(int i = 0; i < actions.length; i++)
		{
			Defender defender = enemies.get(i);
			List<Integer> possibleDirs = defender.getPossibleDirs();
			if (possibleDirs.size() != 0)
				actions[i]=possibleDirs.get(Game.rng.nextInt(possibleDirs.size()));
			else
				actions[i] = -1;
		}

		return actions;
	}
	/*Create a public int CollegeDefender(Game, game){
	Defender gaDefender = game.getDefender(College);
	Attacker attacker = game.getAttacker();
	List<Interger> possibleDirs = gaDefender.getPossibleDirs;

	if(gaDefender.isVunerable){
		if(possibleDirs.contains(attacker.getDirection())){
		return attacker.getDirection()}
		}
		else{
		return possibleDirs.get()}
	else {
	if (possibleDirs.contains(attacker.getDirection())){
		return attacker.getDirection()}
		}
	else{
		return possibleDirs.get()}
	}

	 */
}