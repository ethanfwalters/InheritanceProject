
public class SciFi extends Fiction
{
	private boolean isEarth;
	
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
	
	public void spaceSounds()
	{
		System.out.println("Zaaaaaap!");
	}
	

}
