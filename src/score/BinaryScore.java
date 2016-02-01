package score;

import java.util.ArrayList;

import supply.DemandMethods;

public abstract class BinaryScore extends Score<Integer>{
		// ATTRIBUTS
	ArrayList<String> elements;	// Contients les deux choix possibles pour un crit�re.
	int val;					// Valeur encapsul�e par l'offre.
	
		// CONSTRUCTEURS
	public BinaryScore(int value, String...item)
	{
		super();
		elements = new ArrayList<String>();
		// Cr�ation de la correspondance entre 0 et 1 et signification.
		for(String c : item)
			elements.add(c);
		val         = value;
		scoreMax    = 50;
	}
	
		// METHODES
	/**
	 * D�finition de la m�thode h�rit� de Score.
	 * @return score : int correspondant au score de ce champ.
	 */
	public int getScore(DemandMethods myDemand) {
		Integer field = extractD(myDemand);
		//V�rifie si le crit�re de l'offre correspond � la demande.
		return score = (val == field)? scoreMax+getScoreSpe(myDemand) : 0+getScoreSpe(myDemand);	
	}
	
	public String toString(){
		return val+"("+score+")";
	}
	
	public abstract int getScoreSpe(DemandMethods myDemand);
}
