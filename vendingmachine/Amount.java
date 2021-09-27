package vendingmachine;

import java.math.BigDecimal;

public class Amount {
	public static final Amount ZERO = new Amount("0");
	private BigDecimal value;

	public Amount(String value) {
		this(new BigDecimal(value));
	}

	public Amount(BigDecimal value) {
		this.value = value;
	}

	public Amount add(Amount amount) {
		return new Amount(this.value.add(amount.value));
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
