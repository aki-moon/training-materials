package vendingmachine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	@Test
	void コインを入れていない時はINSERT_COINが表示されること() {
		VendingMachine vendingMachine = new VendingMachine();
		String actual = vendingMachine.display();
		String expected = "INSERT_COIN";
		assertEquals(expected, actual);
	}

	@Test
	void 最初に5セントを入れた時は5セントが表示されること() {
		VendingMachine vendingMachine = new VendingMachine();
		Weight weight = Weight.FIVE;
		Size size = Size.FIVE;
		Coin coin = new Coin(weight, size);
		vendingMachine.accept(coin);
		String actual = vendingMachine.display();
		String expected = "5";
		assertEquals(expected, actual);
	}

	@Test
	void 最初に10セントを入れた時は10セントが表示されること() {
		VendingMachine vendingMachine = new VendingMachine();
		Weight weight = Weight.TEN;
		Size size = Size.TEN;
		Coin coin = new Coin(weight, size);
		vendingMachine.accept(coin);
		String actual = vendingMachine.display();
		String expected = "10";
		assertEquals(expected, actual);
	}

}
