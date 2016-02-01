/**
 * 
 */
package score;

import supply.DemandMethods;
import supply.Intervalle;

/**
 * @author guitt
 *
 */
public abstract class IntervalleScore extends Score<Intervalle> {
		// ATTRIBUTS
	protected float val;		// Contient la valeur encapsul�e par un objet IntervalleScore.
	protected boolean desc;		// D�finit l'�tat dans lequel on est entre : une valeur inf�rieur est moins grave qu'une valeure sup�rieur ou inverse.
	protected float ratioNeg;	// Ratio appliqu� si on va vers des valeurs peu int�ressante.
	protected float ratioPos;	// Ratio applique si on va vers des valeurs dont c'est moins grave.
		// CONSTRUCTEUR
	public IntervalleScore(float item)
	{
		super();
		val      = item;
		scoreMax = 100;
		ratioNeg = (float) 0.5;
		ratioPos   = 1;
	}
	
		// METHODES 
	/**
	 * Fonction de calcul du score pour les crit�res par intervalle.
	 * @return scoreMax : dans le cas o� la valeur de l'offre est comprise dans l'intervalle souhait�. 
	 * @return scoreMax - 0.5*diff : dans le cas ou l'intervalle d�pass� (sup � la borne sup ou ing � la borne inf) est mois grave le score d�cr�ment 2 fois moins vite (>=0).
	 * @return scoreMax - diff : dans le cas ou l'intervalle d�pass� (sup � la borne sup ou ing � la borne inf)est plus grave le socre d�cr�ment 2 fois moins vite (>=0).
	 */
	public int getScore(DemandMethods myDemand)
	{
		Intervalle field = extractD(myDemand);
		
		// Si la valeur est dans l'intervalle demand�.
		if(val >= field.getFirst() && val<=field.getSecond())
			return score = scoreMax;
		else
		{
			// Si une valeur inf�rieure � la borne inf�rieur est moins grave.
			if(desc)
				return score = (val< field.getFirst())? (int) Math.max((ratioPos*scoreMax*(val/field.getFirst())),0):(int)Math.max(ratioNeg*scoreMax*(val/field.getSecond()),0);
				// Si une valeur sup�rieur � la borne supp�rieur est monis grave.
			else
				return score = (val< field.getFirst())? (int) Math.max((ratioNeg*scoreMax*(val/field.getFirst())),0):(int)Math.max(ratioPos*scoreMax*(val/field.getSecond()),0);				
		}
	}
	
	public String toString(){
		return val+"("+score+")";
	}
}
