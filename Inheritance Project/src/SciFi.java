
public class SciFi extends Fiction
{
	private boolean isEarth;
	
	public SciFi()
	{
		
	}
	
	public SciFi(boolean isEarth)
		{
			this.isEarth = isEarth;
		}

	public boolean isEarth() {
		return isEarth;
	}

	public void setEarth(boolean isEarth) {
		this.isEarth = isEarth;
	}
	
	// these are the methods for this class:
	
	public void spaceSounds()
	{
		System.out.println("Zaaaaaap!");
	}
	
	public void alienAttack()
	{
		System.out.println("Oh God! The humanity!!");
	}
	

}
