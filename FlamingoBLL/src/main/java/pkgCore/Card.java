package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private int eRank;
	private int eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(int eRank, int eSuit)
	{
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit
	
	public int geteRank()
	{
		return this.eRank;
	}
	
	public int geteSuit();
	{
		return this.sSuit;
	}
	
	public void seteRank(int r)
	{
		this.eRank = r;
	}
	
	public void seteSuit(int s)
	{
		this.eSuit = s 
	}
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
