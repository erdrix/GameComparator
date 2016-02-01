/**
 * 
 */
package supply;

/**
 * @author guitt
 *
 */
public class Triplet<A,B,C> extends Couple<A,B>{
		// ATTRIBUTS
	private C third;
	
		// CONSTRUCUTEURS
	public Triplet(A f, B s, C t)
	{
		super(f,s);
		third = t;
	}
	
		// METHODES
	/**
	 * Fonction retournant le troisi�me �l�ment du couple.
	 * @return first : du type d�clar� par C, repr�sente le troisi�me item du couple.
	 */
	public C getThird()
	{
		return third;
	}
}
