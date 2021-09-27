package vendingmachine;

public class Coin {
	private Weight weight;
	private Size size;

	public Coin(Weight weight, Size size) {
		this.weight = weight;
		this.size = size;
	}

	public Weight weight() {
		return this.weight;
	}

	public Size size() {
		return this.size;
	}
}