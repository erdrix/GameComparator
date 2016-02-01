package score;

import supply.DemandMethods;

public abstract class Score<E> {
	protected int score;
	public abstract E extractD(DemandMethods myDemand);
	public abstract int getScore(DemandMethods myDemand);
	protected int scoreMax;											// Valeur maximale offerte par ce crit�re.
	
	public Score(){
		score = 0;
	}
	public String toString(){
		return "Le score de ce crit�re est: "+score;
	}
}
