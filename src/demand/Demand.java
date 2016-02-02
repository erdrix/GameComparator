
/**
 * @author guitt
 *
 */

package demand;

import supply.DemandMethods;
import supply.Intervalle;
import supply.Triplet;

/* Titre - Description - Editeur - Prix -
Note du jeu - Date de sortie - Mode de jeu - 
Mode de paiement - Difficult� - Dur�e de vie - 
Style de l'histoire - Support de jeu - Jouable avec accessoires - Lieu d'achat - Type de jeu*/ 

public class Demand implements DemandMethods{
		// ATTRIBUTS
	private DTitle dtitle;		// El�ments pr�sent dans le titre du jeu.
	private DDescription ddesc;	// El�ments pr�sent dans la descrition.
	private DEditor dedit;		// El�ments pr�sent dans le nom de l'�diteur.
	
	private DMark dmark;		// Intervalle de note du jeu.
	private DReleaseDate drd;	// Intervalle de sortie du jeu.
	
	private DGameType dgt;		// Choix du mode de jeu.
	private DBuyMethod dbm;		// Choix de la forme de paiement (Licenses | abonnement).
	
	private DDifficulty ddiff;	// Choix de la difficulut� du jeu.
	private DLifeTime dlt;		// Dur�e moyenne de vie du jeu.
	
	private DGameStyle dgst;	// Choix du style de jeu (AA | A-RPG | Action ...)
	
	private DStoryType dst;		// Ensemble des styles d'histoire.
	private DGameSupport dgs;	// Ensemble des supports compatibles avec le jeu.
	private DAccessory dacce;	// Ensemble des accessoires permettant de jouer au jeu.
	private DSale[] dsa;		// Ensemble des lieux de vente accept�s.

		// CONSTRUCTUEUR
	/**
	 * Constructeur initialisant la demande du client avec l'ensemble des champs d'une offre (champs pouvant potentiellement �tre nuls)
	 * @param title : DTitle objet contenant les mots-clefs du titre du jeu.
	 * @param desc  : DDescription objet contenant les mots-clefs de la description.
	 * @param edit  : DEditor objet contenant les mots-clefs de l'�diteur.
	 * @param mark  : DMark objet contenant un intervalle de note pour le jeu.
	 * @param rd    : DReleaseDate objet contenant un intervalle de date (timestamp) pour la date de sortie du jeu.
	 * @param gt    : DGameType objet contenant le mode de jeu.
	 * @param bm    : DBuyMethod objet contenant la forme de paiement.
	 * @param diff  : DDifficulty objet contenant le choix de la difficult�.
	 * @param lt    : DLifeTime objet contenant le choix de la dur�e moyenne de jeu.
	 * @param gst   : DGameStyle objet contenant le choix du style de jeu.
	 * @param st    : DStoryType objet contenant l'ensemble des styles d'histoire.
	 * @param gs    : DGameSupport objet contenant l'ensemblre des supports voulus.
	 * @param acce  : DAccessory objet contenant l'ensemblre des accessoire voulus.
	 * @param sa    : DSale objet contenant l'ensemblre des lieu de ventes voulus.
	 * @param nSale : int nombre de lieux de ventes s�lectionn�s par le client.
	 */
	public Demand(DTitle title, DDescription desc, DEditor edit, DMark mark, DReleaseDate rd, DGameType gt, DBuyMethod bm, DDifficulty diff, DLifeTime lt, DGameStyle gst, DStoryType st, DGameSupport gs, DAccessory acce, DSale[] sa, int nSale)
	{
		dtitle = title;
		ddesc  = desc;
		dedit  = edit;
		dmark  = mark;
		drd    = rd;
		dgt    = gt;
		dbm    = bm;
		ddiff  = diff;
		dlt    = lt;
		dgst   = gst;
		dst    = st;
		dgs    = gs;
		dacce  = acce;
		
		dsa = new DSale[nSale];
		for (int i=0; i < nSale; i++)
			dsa[i] = sa[i];
	}
	
		// METHODES
	/**
	 * A COMPLETER !!!!!!!!!
	 */
	public String getTitle()
	{
		return dtitle.getField();
	}
	
	/**
	 * A COMPLETER !!!!!!!!!
	 */
	public String getDescription()
	{
		return ddesc.getField();
	}
	
	/**
	 *  A COMPLETER !!!!!!
	 */
	public String getEditor()
	{
		return dedit.getField();
	}
	
	/**
	 * Fonction retournant l'intervalle de prix souhait�s par la demande.
	 * @return dprice.getPrice() : Intervalle (double) repr�sentant le prix du jeu.
	 */
	public Intervalle getPrice()
	{
		DPrice price = (dbm ==null)? null:dbm.getPrice();
		return (price ==null)? null:price.getPrice();
	}
	
	/**
	 * Fonction retournant l'intervalle de notes souhait�s par la demande.
	 * @return dmark.getRange() : Intervalle (double) repr�sentant la note du jeu.
	 */
	public Intervalle getMark()
	{
		return (dmark ==null)? null:dmark.getRange();
	}
	
	/**
	 * Fonction retournant l'intervalle de dates de sortie souhait�es par la demande.
	 * @return drd.getRange() : Intervalle (double) repr�sentant la date de sortie du jeu.
	 */
	public Intervalle getReleaseDate()
	{
		return (drd ==null)? null:drd.getRange();
	}
	
	/**
	 * Fonction retournant le choix pour le type de jeu (solo ou multi)
	 * @return dgt.DGameType() : int symbolisant un type de jeu.
	 */
	public int getDGameType()
	{
		return (dgt ==null)? null:dgt.getType();
	}
	
	/**
	 * Fonction retournant le choix pour la forme de paiement (abonnement, licence)
	 * @return dbm.getMethod() : int symbolisant la forme de paiement du jeu.
	 */
	public int getDBuyMethod()
	{
		return (dbm ==null)? null:dbm.getMethod();
	}
	
	/**
	 * Fonction retournant le choix pour la difficult� du jeu (facile | interm�diaire | exp�riment�).
	 * @return dlt.getDifficulty() : int symbolisant une difficult�.
	 */
	public int getDifficulty()
	{
		return (ddiff ==null)? null:ddiff.getDifficulty();
	}
	
	/**
	 * Fonction retournant le choix pour la dur�e de vie du jeu (court | moyen | long).
	 * @return dlt.getTime() : int symbolisant un type de dur�e de vie.
	 */
	public int getDLifeTime()
	{
		return (dlt ==null)? null:dlt.getTime();
	}
	
	/**
	 * Fonction retournant le choix pour le style de jeu
	 * @return dgst.DGameStyle() : int symbolisant un style de jeu.
	 */
	public String getGameStyle()
	{
		return (dgst ==null)? null:dgst.getStyle();
	}
	
	/**
	 * Fonction retournant l'ensemble des choix pour le style d'histoire du jeu.
	 * @return dst.getType() : int[] symbolisant les styles d'histoires choisis.
	 */
	public int[] getStoryType()
	{
		return (dst ==null)? null:dst.getType();
	}

	/**
	 * Fonction retournant l'ensemble des choix pour les supports compatibles.
	 * @return dgs.getEquipements() :  Triplet<String, String, Integer>[] symbolisant les supports compatibles choisis (constructeur, nom, type).
	 */
	public Triplet<String, String, Integer>[] getGameSupportEquipements()
	{
		
		return (dgs == null)?null : dgs.getEquipements();
	}
	
	
	/**
	 * Fonction retournant l'ensemble des choix pour les accessoires compatibles.
	 * @return dgs.getEquipements() :  Triplet<String, String, Integer>[] symbolisant les accessoires compatibles choisis (constructeur, nom, type).
	 */
	public Triplet<String, String, Integer>[] getAccessoryEquipements()
	{
		return (dacce ==null)? null:dacce.getEquipements();
	}
}
