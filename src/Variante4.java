import java.util.*;

public class Variante4 extends Variante
{	
	public Variante4(Partie partieAssociee) 
	{
		super(partieAssociee);
	}

	public void initialiserPioche(LinkedList<Carte> pioche, int nombreJeuxDeCartes) 
	{
				
	}
	
	public void appliquerEffetCarte(LinkedList<Carte> cartesAJouer, Joueur joueurCarte)
	{
		
	}	
	
	public int verifierMultiplicateurPioche()
	{
		return(0);
	}
	
	public Carte getDerniereCarteSpecialePosee()
	{
		return(null);
	}

	public boolean verifierConformiteCarte(Carte carteAJouer) 
	{
		return(false);
	}
}