/**
 * 
 */
package supply;

/**
 * @author guitt
 *
 */
public class Intervalle {
		// ATTRIBUTS
	protected float first;
	protected float second;
		
		// CONSTRUCTEUR
	public Intervalle(float f, float s)
	{
		first = Math.min(f, s);
		second = Math.max(f, s);
	}
	
		// METHODES
	/**
	 * Fonction retournant la borne inf�rieur de l'intervalle
	 * @return first : float repr�sentant la borne inf�rieur de l'intervalle
	 */
	public float getFirst()
	{
		return first;
	}
	
	/**
	 * Fonction retournant la borne sup�rieur de l'intervalle
	 * @return second : float repr�sentant la borne sup�rieur de l'intervalle
	 */
	public float getSecond()
	{
		return second;
	}
}
