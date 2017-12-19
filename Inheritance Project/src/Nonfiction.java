
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
		
		// these are the methods for this class:
		
		public void learning()
		{
			System.out.println("Wow you have learned so much!!");
		}
		
		public void educated()
		{
			System.out.println("You are so educated!");
		}
		
	}
