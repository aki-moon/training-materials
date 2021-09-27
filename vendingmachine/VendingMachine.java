package vendingmachine;

public class VendingMachine {
	private static final String DEFAULT_DISPLAY_STATUS = "INSERT_COIN";

	private static final Amount ZERO = Amount.ZERO;

	private Amount currentAmount = Amount.ZERO;

	public String display() {
		if (currentAmount.equals(ZERO)) {
			return DEFAULT_DISPLAY_STATUS;
		}
		return currentAmount.toString();
	}

	public void accept(Coin coin) {
		Amount amount = convertCoinToAmount(coin);
		currentAmount = currentAmount.add(amount);
	}

	private Amount convertCoinToAmount(Coin coin) {
		if (coin.weight() == Weight.FIVE && coin.size() == Size.FIVE) {
			return new Amount("5");
		}
		return new Amount("10");
	}
}
