
public class Nonfiction extends Book
	{
		private int numberOfFacts;
		
		public Nonfiction()
			{
				
			}
		
		public Nonfiction(int numberOfFacts)
				{
					this.numberOfFacts = numberOfFacts;
				}

		public int getNumberOfFacts()
			{
				return numberOfFacts;
			}

		public void setNumberOfFacts(int numberOfFacts)
			{
				this.numberOfFacts = numberOfFacts;
			}
		
		public void openBook()
		{
			System.out.println("You opened a non-fiction book!");
		}
		
	}
