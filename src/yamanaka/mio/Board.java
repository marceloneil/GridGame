package yamanaka.mio;

public class Board {
	private Cell[][] board;
	private int rows;
	private int cols;

	public Board(int rows, int cols) {
		this.board = new Cell[rows][cols];
		this.rows = rows;
		this.cols = cols;
	}

	public void addShip(int x1, int y1, int x2, int y2) {
		int xmin = Math.min(x1, x2);
		int xmax = Math.max(x1, x2);
		int ymin = Math.min(y1, y2);
		int ymax = Math.max(y1, y2);
		for (int x = xmin; x < xmax; x++) {
			for (int y = ymin; y < ymax; y++) {
				this.board[y][x].addShip();
			}
		}
	}
	
	public Cell[][] getBoard() {
		return this.board;
	}

}
