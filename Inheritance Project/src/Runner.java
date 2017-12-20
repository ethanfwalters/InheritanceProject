import java.util.*;


public class Runner 
{
	public static void main(String[] args) 
	{
		
		makeLibraries();
		testOverride();
		//testCasting();
		
	}
	

	private static void makeLibraries()
		{
			ArrayList <Nonfiction> adultLibrary = new ArrayList <Nonfiction> ( );
			
			adultLibrary.add(new Art());
			adultLibrary.add(new Biographies());
			adultLibrary.add(new Nonfiction());
			
			adultLibrary.get(0).explainArtwork();
			
			ArrayList <Fiction> childLibrary = new ArrayList <Fiction> ( );
			
			childLibrary.add(new Westerns());
			childLibrary.add(new SciFi());
			childLibrary.add(new Fiction());
			
		}
	
	private static void testOverride()
		{
			System.out.println("Example of over-ridden method:");
			
			Fiction test1 = new Fiction();
			
			test1.createHero();
			
			Fiction x = new Westerns();
			
			x.createHero();
			
		}

	private static void testCasting()
		{
			System.out.println();
			System.out.println("Example of casting:");
			
			Nonfiction test2 = new Art();
			
			(Art).test2.explainArtwork();
			
		}
	
	
}
