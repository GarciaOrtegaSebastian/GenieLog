package tp_genielog;

public class UseSuperPile
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		remplirPile(9);
		System.out.println();

		SuperPile.getInstance().taille();
		SuperPile.getInstance().sommet();
		SuperPile.getInstance().sousSommet();
		System.out.println();

		viderPile(10);
		SuperPile.getInstance().taille();
		System.out.println();

		testGit();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	private static void remplirPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}

	private static void viderPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().depiler();
			}
		}
	private static void testGit()
	{
	System.out.println("GIT!!!");
	}
	}