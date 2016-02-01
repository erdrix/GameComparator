package demand;

public class DGameType {
		// ATTRIBUTS
	private int type;	// Num�ro contenant le Mode de jeu.
	
		// CONSTRUCTUEUR
	public DGameType(int item)
	{
		type = item;
	}
	
		// METHODE
	/**
	 * Fonction retournant le num�ro du type de jeu dont il s'agit (En ligne | Hors ligne).
	 * @return type : entier repr�sentant le choix du type de jeu.
	 */
	public int getType()
	{
		return type;
	}
}
