package yamanaka.mio;

import java.util.Scanner;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int players = input.nextInt();
		int length = input.nextInt();
		int p1hits = 0;
		int p2hits = 0;
		
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
			//
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
			if (one.getBoard()[x1][y1].getHit()){
				p1hits += 1;
			}
			if (p1hits == length * length) {
				System.out.println("Player 2 wins!");
				break;
			}
			if (players == 2) {
				int x2 = input.nextInt();
				int y2 = input.nextInt();
				attack(x2, y2, one);
			} else {
				// AI
			} if (p2hits == length * length) {
				System.out.println("Player 2 wins!");
				break;
			} else if (p1hits == length * length - 1 && p1hits == p2hits){
				System.out.println("Tie!");
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
}
