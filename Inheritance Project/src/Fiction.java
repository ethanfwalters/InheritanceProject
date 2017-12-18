
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
		
		public void createHeo()
		{
			System.out.println("You have just made a hero!");
		}
		
		public void openBook()
		{
			System.out.println("You opened a Fiction Book!");
		}
	
}
