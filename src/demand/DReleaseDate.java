package demand;

import java.util.Calendar;
import supply.Intervalle;

public class DReleaseDate {
		// ATTRIBUT
	protected Intervalle range;	// Contient l'intervalle de date de sortie.
	
		// CONSTRUCTEUR
	public DReleaseDate(Calendar d, Calendar f)
	{
		if( d != null && f!= null)
			range = new Intervalle(d.getTimeInMillis(), f.getTimeInMillis());	// Cr�er un intervalle de double en convertissant la date en TimeStamp.
		else 
			range = new Intervalle(0,0);
	}
	
		// METHODE
	/**
	 * Fonction retournant l'intervalle de temps souhait� pour la sortie du jeu.
	 * @return range : Intervalle repr�sentant la date de sortie.
	 */
	public Intervalle getRange()
	{
		return range;
	}
}
