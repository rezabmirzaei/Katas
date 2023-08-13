package no.noroff.accelerate.maximumprofit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaximumprofitTest {

	@Autowired
	private MaximumProfit maximumProfit;

	@Test
	public void test_maximumProfit_solid_profit() {
		int expected = 14;
		assertEquals(expected, maximumProfit.maximumProfit(new int[] { 8, 5, 12, 9, 19, 1 }));
	}

	@Test
	public void test_maximumProfit_decent_profit() {
		int expected = 7;
		assertEquals(expected, maximumProfit.maximumProfit(new int[] { 2, 4, 9, 3, 8 }));
	}

	@Test
	public void test_maximumProfit_no_profit() {
		int expected = 0;
		assertEquals(expected, maximumProfit.maximumProfit(new int[] { 21, 12, 11, 9, 6, 3 }));
	}

	@Test
	public void test_maximumProfit_not_enough_entries() {
		int expected = 0;
		assertEquals(expected, maximumProfit.maximumProfit(new int[] { 7 }));
	}

	@Test
	public void test_maximumProfit_null_entry() {
		int expected = 0;
		assertEquals(expected, maximumProfit.maximumProfit(null));
	}

}
