package demand;

public class DBuyMethod {
		// ATTRIBUTS
	protected DPrice price;	// Prix du jeu.
	protected int method;	// Num�ro du mode de paiement.
	
		// CONSTRUCTEURS
	public DBuyMethod(DPrice prix, int m)
	{
		price = prix;
		method = m;
	}

		// METHODES
	/**
	 * Fonction retournant le num�ro correspondant � la m�thode de paiement utilis�e.
	 * @return method : entier repr�senant le choix du mode de paiement.
	 */
	public int getMethod()
	{
		return method;
	}
	
	/**
	 * Fonction retournant un object Dprice correspondant au prix du jeu.
	 * @return price : DPirce objet repr�sentant le prix du jeu.
	 */
	public DPrice getPrice()
	{
		return price;
	}
}

