/**
 * 
 */
package supply;

/**
 * @author guitt
 *
 */
public class Couple<A, B> {
		// ATTRIBUTS
	protected A first;
	protected B second;
		
		// CONSTRUCUTEURS
	public Couple(A f, B s)
	{
		first = f;
		second = s;
	}
		// METHODES
	/**
	 * Fonction retournant le premier �l�ment du couple.
	 * @return first : du type d�clar� par A, repr�sente le premier item du couple.
	 */
	public A getFirst()
	{
		return first;
	}
		
	/**
	 * Fonction retournant le second �l�ment du couple.
     * @return first : du type d�clar� par B, repr�sente le second item du couple.
	 */
	public B getSecond()
	{
		return second;
	}
}
