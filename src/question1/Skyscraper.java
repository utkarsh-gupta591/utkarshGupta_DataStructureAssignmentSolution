package question1;

import java.util.*;

public class Skyscraper {
	private int[] floorSizes;	// floorSizes contains different floor sizes
	private int nf;  // nf represents number of floors
	private Integer[][] resultant;	//resultant array will contain the final table

	private List<Integer> visited;	// if a floor can not be assembled on a particular day it will be stored in visited list
	private List<Integer> assembled; // assembled will contain list of assembled floors

	Skyscraper(int[] floorSizes, int nf)
	{
		this.nf = nf;
		this.floorSizes = floorSizes;
		this.resultant = new Integer[nf][nf];
		this.visited = new LinkedList<>();
		this.assembled = new LinkedList<>();
	}

	// following logic is based on the statement:
	// A floor cannot be assembled in the building until all floors larger in size are placed.
	public void assembleTheFloors() {
		int n;
		for (int i = 0, k = 0; i < nf; i++) {
			n = floorSizes[i];
			k = 0;
			if (assembled.contains(n + 1) || n == nf)
			{
				assembled.add(n);
				resultant[i][k] = n; // here i+1 represents day number
				k++;
				while (visited.contains(n - 1)) {
					n = n - 1;
					assembled.add(n);
					resultant[i][k] = n; // here i+1 represents day number
					k++;
				}
			}
			else {
				visited.add(n);
				resultant[i] = null;
			}
		}
	}

	public void printOrderOfConstruction() {
		for (int i = 1, j = 0; i <= nf; i++, j++) {
			System.out.println("Day: " + i); // here i is representing day number
			if (resultant[j] != null) {
				for (int k = 0; k < resultant[j].length && resultant[j][k] != null; k++) {
					if (k >= 1)
						System.out.print(" ");
					System.out.print(resultant[j][k]);
				}
			}
			System.out.println();
		}
	}
}
