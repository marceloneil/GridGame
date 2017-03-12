package yamanaka.mio;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int players = input.nextInt();
		int length = input.nextInt();
		
		Board one = new Board(length, length);
		for (int i = 0; i <= 5; i++) {
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			one.addShip(x1, y1, x2, y2);
		}
		
		if (players == 1) {
			Board two = new Board(length, length);
			// random ship placements
		} else {
			Board two = new Board(length, length);
				for (int i = 0; i <= 5; i++) {
					int x1 = input.nextInt();
					int y1 = input.nextInt();
					int x2 = input.nextInt();
					int y2 = input.nextInt();
					two.addShip(x1, y1, x2, y2);
				}
		} boolean win = false;
		while (!win){
			
		}
		
		input.close();
	}
	
	private static boolean attack(int x, int y, Board b){
		
		
	}

}
