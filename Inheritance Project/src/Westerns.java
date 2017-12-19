
public class Westerns extends Fiction
{
	private String stateIsIn;
	private boolean isViolent;
	
	public Westerns() 
	{
	
	}
	
	public Westerns(String stateIsIn , boolean isViolent)
		{
			this.stateIsIn = stateIsIn;
			this.isViolent = isViolent;
		}

	public boolean isViolent() {
			return isViolent;
		}

		public void setViolent(boolean isViolent) {
			this.isViolent = isViolent;
		}

	public String getStateIsIn() {
		return stateIsIn;
		}

	public void setStateIsIn(String stateIsIn) {
		this.stateIsIn = stateIsIn;
		}
	
	// these are the methods for this class:
	
	public void rideHorce()
	{
		System.out.println("Weee! Im  riding a horce!");
	}
	
	
	// this is the over ridden method
	
	public void createHero()
	{
		System.out.println("Wow! you just made a Western hero, probably a cowboy.");
	}
		
}
