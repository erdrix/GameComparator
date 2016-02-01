/**
 * 
 */
package supply;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import score.MultipleScore;

/**
 * @author guitt
 *
 */
public abstract class SEquipement extends MultipleScore<Triplet<String, String, Integer>[]>{
		// ATTRIBUTS
	protected TreeMap<String, ArrayList<Couple<String, String>>> equipements;
	//protected Triplet<String, String, String>[] equipements;
	
		// CONSTRUCTEUR
	public SEquipement(String[] c, String[] n, String[] t)
	{
		super();
		ArrayList<Couple<String, String>> init = new ArrayList<Couple<String, String>>();
		equipements = new TreeMap<String, ArrayList<Couple<String, String>>>();
		
		// Cr�ation du TreeMap contenant en cl� les noms des type d'�quipements et en valeur un ArrayList de couple repr�sentant le Constructeur et le nom.
		if(t == null)
			equipements = null;
		
		for(int i=0; t!=null && i < t.length  ; i++)
		{
			// Si on rencontre pour la premi�re fois ce type d'�quipement.
			if(!equipements.containsKey(t[i]))
			{
				init.add(new Couple<String, String>(c[i], n[i]));	
				equipements.put(t[i],init);	// On initialise la nouvelle entr�e avec un premier couple (constructeur, nom).
			}
			else // Sinon 
			{
				equipements.get(t[i]).add(new Couple<String, String>(c[i], n[i]));	// On ajoute un couple (constructeur, nom).
			}
		}
	}
	
		// METHODES
	public abstract ArrayList<String> getTypeE();
	
	public boolean compareField(String type, String c, String n)
	{
		boolean ok = false;
		Iterator<Couple<String, String>> it = equipements.get(type).iterator();
		Couple<String, String> recept;
		while(it.hasNext())
		{
			recept = it.next();
			if(recept.getFirst() == c && recept.getSecond()==n)
				ok = true;
		}
		return ok;
	}
	public int getScore(DemandMethods myDemand) {
		// On r�cup�re l'ensemble des choix du client
		
		Triplet<String, String, Integer>[] fields = extractD(myDemand);
		ArrayList<String> typeE = getTypeE();
		String type;
		int cpt = 0; // Compteur servant � connaitre le nombre d'�l�ment de la demande pr�sent dans �quipement.
		
		
		if(fields != null && equipements != null)
		{
			// Pour chaque choix du client
			for(Triplet<String, String, Integer> f : fields)
			{
				type = typeE.get(f.getThird());

				// Si l'�quipement contient au moins un objet du type voulu et que le couple(constructeur, nom) appartient � l'arrayList associ�.
				if(equipements.containsKey(type) && compareField(type, f.getFirst(), f.getSecond()))
					cpt++;
			}
			
			double s = 1.0*scoreMax;
			
			return score =(int) (cpt*(s/fields.length));
		}
		else 
			return score = 0;
	}	
}
