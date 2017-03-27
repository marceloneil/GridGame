package yamanaka.mio;

import java.util.Scanner;
import java.util.Random;

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
		Board two = new Board(length, length);
		if (players == 1) {
			// random ship placements
		} else {
			for (int i = 0; i <= 5; i++) {
				int x1 = input.nextInt();
				int y1 = input.nextInt();
				int x2 = input.nextInt();
				int y2 = input.nextInt();
				two.addShip(x1, y1, x2, y2);
			}
		}
		boolean win = false;
		while (!win) {
			// player 1
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			attack(x1, y1, two);
			if (defeated(two)) {
				System.out.println("Player 1 wins!");
				break;
			}
			// player 2
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			attack(x2, y2, one);
			if (defeated(one)) {
				System.out.println("Player 2 wins!");
				break;
			}
		}

		input.close();
	}

	private static boolean attack(int x, int y, Board b) {
		if (b.getBoard()[x][y].getShip() == false) {
			b.getBoard()[x][y].bomb();
		}
		return b.getBoard()[x][y].getHit();
	}

	private static boolean defeated(Board b) {
		for (int i = 0; i < b.getBoard().length; i++) {
			for (int j = 0; j < b.getBoard()[0].length; j++) {
				if (b.getBoard()[i][j].getShip() == true && b.getBoard()[i][j].getHit() == true) {
					continue;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
