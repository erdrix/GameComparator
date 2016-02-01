package demand;

public class DDifficulty {
		// ATTRIBUTS
	protected int difficulty;	// Num�ro de la difficult�.
	
		// CONSTRUCTEUR
	public DDifficulty(int d)
	{
		difficulty = d;
	}
	
		// METHODES
	/**
	 * Fonction retournant le num�ro correspondant � la difficult� du jeu.
	 * @return difficulty : entier repr�sentant le choix de la difficult�.
	 */
	public int getDifficulty()
	{
		return difficulty;
	}
}
