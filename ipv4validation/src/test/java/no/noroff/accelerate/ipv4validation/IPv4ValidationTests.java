package no.noroff.accelerate.ipv4validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IPv4ValidationTests {

	@Test
	public void testValidIP_1_2_3_4() {
		assertTrue(IPv4Validation.isValidIP("1.2.3.4"));
	}

	@Test
	public void testValidIP_123_45_67_89() {
		assertTrue(IPv4Validation.isValidIP("123.45.67.89"));
	}

	@Test
	public void testValidIP_wildcard() {
		assertTrue(IPv4Validation.isValidIP("0.0.0.0"));
	}

	@Test
	public void testValidIP_localhost() {
		assertTrue(IPv4Validation.isValidIP("127.0.0.1"));
	}

	@Test
	public void testInValidIP_wrong_number_of_segments_short() {
		assertFalse(IPv4Validation.isValidIP("1.2.3"));
	}

	@Test
	public void testInValidIP_wrong_number_of_segments_long() {
		assertFalse(IPv4Validation.isValidIP("1.2.3.4.5"));
	}

	@Test
	public void testInValidIP_starts_with_zero() {
		assertFalse(IPv4Validation.isValidIP("01.2.3.04"));
	}

}
