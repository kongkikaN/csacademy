package shoePairs;

public class Shoe {
	int size;
	char LorR;
	boolean paired;
	public Shoe (int size, char LorR) {
		this.size = size;
		this.LorR = LorR;
		this.paired = false;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public char getLorR() {
		return this.LorR;
	}
	
	public void setPaired() {
		this.paired = true;
	}
	public boolean getPaired() {
		return this.paired;
	}
}
