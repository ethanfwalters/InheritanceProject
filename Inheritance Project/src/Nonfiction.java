
public class Nonfiction extends Book
	{
		private int numberOfFacts;
		
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
		
	}
