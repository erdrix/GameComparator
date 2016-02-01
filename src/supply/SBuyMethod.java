/**
 * 
 */
package supply;
import score.BinaryScore;

/**
 * @author guitt
 *
 */
public class SBuyMethod extends BinaryScore{
		//	ATTRIBUTS
	protected SPrice price;
	
		//CONSTRUCTEURS
	/**
	 * Constructeur par d�faut.
	 * @param prix : prix du jeu.
	 * @param c    : forme de paiement pour ce jeu.c
	 */
	public SBuyMethod(SPrice prix, int c)
	{
		super(c, "Abonnement", "Licence");
		price = prix;
	}

		// METHODES
	/**
	 * Methode permettant d'extraire la valeur du crit�re correspondant dans la demande.
	 * @return myDemand.getDBuyMethod() : int correspondant au choix du client pour la forme de paiement.
	 */
	public Integer extractD(DemandMethods myDemand)
	{
		return myDemand.getDBuyMethod();
	}
	
	/**
	 * Methode permettant d'appeler la methode getScore() de l'objet SPrice encapsul� par cette classe.
	 * @return price.getScore(myDemand) : int repr�sentant le score du prix de l'offre par rapport � la demande.
	 */
	public int getScoreSpe(DemandMethods myDemand) {
		return price.getScore(myDemand);
	}
	
	/**
	 * M�thode donnant acc� � l'objet SPrice encapsul�.
	 * @return price : SPrice �tant le prix de l'offre.
	 */
	public SPrice getPrice()
	{
		return price;
	}
	

}
