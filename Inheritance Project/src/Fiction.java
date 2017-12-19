
public class Fiction extends Book
{
	private int numberOfHeros;
	
	public Fiction()
		{
		
		}
	
	public Fiction(int numberOfHeros)
		{
			this.numberOfHeros = numberOfHeros;
		}

		public int getNumberOfHeros() {
			return numberOfHeros;
		}

		public void setNumberOfHeros(int numberOfHeros) {
			this.numberOfHeros = numberOfHeros;
		}
		
		public void openBook()
		{
			System.out.println("You opened a Fiction Book!");
		}
		
		// these are the methods for this class:
		
		//this method should be overridden by the one in the westerns class.
		public void createHeo()
		{
			System.out.println("You have just made a hero!");
		}
		
		public void fun()
		{
			System.out.println("This is so much fun!");
		}
		
	
}
