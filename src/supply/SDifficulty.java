/**
 * 
 */
package supply;

import java.util.ArrayList;

import score.EcartScore;

/**
 * @author guitt
 *
 */
public class SDifficulty extends EcartScore{
		// CONSTRUCTEUR
	private static ArrayList<String> options = new ArrayList<String>();
	public SDifficulty(int c) {
		super(c,0.3, options);	
	}
	
		// METHODE
	/**
	 * Methode permettant d'extraire la valeur du crit�re correspondant dans la demande.
	 * @return myDemand.getDifficulty() : int correspondant � la difficult� demand� par le client.
	 */
	public Integer extractD(DemandMethods myDemand)
	{
		return myDemand.getDifficulty();
	}
	
	static public void Init()
	{
		options.add("D�butant"); 
		options.add("Interm�diaire");
		options.add("Confirm�");
		options.add("Exp�riment�");
	}
}
