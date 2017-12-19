
public class Art extends Nonfiction
{
	private int numberOfArtists;
	String typeOfArt;
	
	public Art()
	{
		
	}
	
	public Art(int numberOfArtistis , String typeOfArt)
		{
			this.numberOfArtists = numberOfArtists;
			this.typeOfArt = typeOfArt;
		}

		public int getNumberOfArtists() {
			return numberOfArtists;
		}

		public void setNumberOfArtists(int numberOfArtists) {
			this.numberOfArtists = numberOfArtists;
		}

		public String getTypeOfArt() {
			return typeOfArt;
		}

		public void setTypeOfArt(String typeOfArt) {
			this.typeOfArt = typeOfArt;
		}
		
		// these are the methods for this class:
		
		public void explainArtwork()
		{
			System.out.println("Art is subjective, therefor impossible to explain.");
		}
		
}
