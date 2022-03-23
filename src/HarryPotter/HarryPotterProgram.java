/*
 * Tejaswi
 */
package HarryPotter;

import java.util.Arrays;

public class HarryPotterProgram {

	
		public static void main(String[] args) {
			int movie_Series[]= {1,2,3,4,5,6,7,8};
			String movie_Names[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban",
									"Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
									"Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
			int release_Year[]= {2001,2002,2004,2005,2007,2009,2010,2011};

			int[] series_Array=new int[] {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
			System.out.println("Movie Series Array : "+Arrays.toString(series_Array));
			
			String[] names_Array=new String[] {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban",
					"Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince",
					"Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
			System.out.println("Movie Names Array : "+Arrays.toString(names_Array));
			
			int[] release_Array=new int[] {2001,2002,2004,2005,2007,2009,2010,2011};
			System.out.println("Year of Release Array :" + Arrays.toString(release_Array));
		

	}

}
