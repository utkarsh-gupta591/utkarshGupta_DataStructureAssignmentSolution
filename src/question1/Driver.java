package question1;

import java.util.*;

public class Driver {
	public static void main(String g[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		// nf represents number of floors
		int nf = sc.nextInt();
		int[] floorSizes = new int[nf];
		for (int i = 1; i <= nf; i++) {
			System.out.println("enter the floor size given on day: " + i);
			floorSizes[i - 1] = sc.nextInt();
		}
		Skyscraper skyscraper = new Skyscraper(floorSizes, nf);
		skyscraper.assembleTheFloors();

		System.out.println("The order of construction is as follows");
		skyscraper.printOrderOfConstruction();

		sc.close();
	}
}
