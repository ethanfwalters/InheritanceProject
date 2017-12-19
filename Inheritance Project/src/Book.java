
public abstract class Book
	{
		private int numOfPages;
		private boolean hardOrSoftCover;
		
		public Book()
			{
				
			}
		
		public Book(int numOfPages , boolean hardOrSoftCover)
			{
				this.numOfPages = numOfPages;
				this.hardOrSoftCover = hardOrSoftCover;
			}

			public int getNumOfPages()
				{
					return numOfPages;
				}

			public void setNumOfPages(int numOfPages)
				{
					this.numOfPages = numOfPages;
				}

			public boolean isHardOrSoftCover()
				{
					return hardOrSoftCover;
				}

			public void setHardOrSoftCover(boolean hardOrSoftCover)
				{
					this.hardOrSoftCover = hardOrSoftCover;
				}
			
			public void whatIsThis()
			{
				System.out.println("This is a book!");
			}
			
			public abstract void openBook();
	}
