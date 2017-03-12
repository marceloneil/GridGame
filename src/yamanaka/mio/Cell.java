package yamanaka.mio;

public class Cell {
	private boolean hit;
	private boolean ship;
	
	public Cell() {
		this.hit = false;
		this.ship = false;
	}
	
	public void addShip() {
		this.ship = true;
	}
	
	public void bomb() {
		this.hit = true;
	}
	
	public boolean getHit() {
		return this.hit;
	}
	
	public boolean getShip() {
		return this.ship;
	}
	
}
