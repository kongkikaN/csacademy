package donkeyParadox;

public class Cell {
	int x, y;
	boolean hasHay;
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		hasHay = false;
	}
	
	public void setHasHay() {
		this.hasHay = true;
	}
}
