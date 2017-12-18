
public abstract class Book
	{
		public int numOfPages;
		public boolean hardOrSoftCover;
		
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
			
	}