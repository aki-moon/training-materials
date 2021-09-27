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
}
