public class IAAmateur implements StrategieDeJeu 
{
	public IAAmateur()
	{}	
	
	public boolean jouer(Carte carteAJouer) 
	{
		return false;
	}

	public int choisirAction() 
	{
		return 0;
	}

	public Carte choisirCarte() 
	{
		return null;
	}

	public Carte choisirCarteApresHuit() 
	{
		return null;
	}

	public String choisirCarteSupplement() 
	{
		return null;
	}

}