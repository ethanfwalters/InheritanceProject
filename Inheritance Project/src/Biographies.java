
public class Biographies extends Nonfiction
{
	private String whoIsItAbout;
	private boolean isAutoBiography;
	
	public Biographies()
	{
		
	}
	
	public Biographies(String whoIsItAbout , boolean isAutoBiography)
		{
			this.whoIsItAbout = whoIsItAbout;
			this.isAutoBiography = isAutoBiography;
		}

	public String getWhoIsItAbout() {
		return whoIsItAbout;
	}

	public void setWhoIsItAbout(String whoIsItAbout) {
		this.whoIsItAbout = whoIsItAbout;
	}

	public boolean isAutoBiography() {
		return isAutoBiography;
	}

	public void setAutoBiography(boolean isAutoBiography) {
		this.isAutoBiography = isAutoBiography;
	}
	
	// these are the methods for this class:
	
	
	public void explainChildHood() 
	{
		System.out.println("Childhood is an important part of every person's life.");
	}
	
	public void adultLife()
	{
		System.out.println("Adult life is where the person does most of thier work.");
	}
	
}
