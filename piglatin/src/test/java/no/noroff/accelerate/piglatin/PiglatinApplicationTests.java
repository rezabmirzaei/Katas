package no.noroff.accelerate.piglatin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PiglatinApplicationTests {

	private static PigLatinTranslator plt;

	@BeforeAll
	static void setup() {
		plt = new PigLatinTranslator();
	}

	@Test
	public void testTranslate_this_is_pig_latin() {
		String expected = "isthay isway igpay atinlay";
		assertEquals(expected, plt.translate("this is pig latin"));
	}

	@Test
	public void testTranslate_wall_street_journal() {
		String expected = "allway eetstray ournaljay";
		assertEquals(expected, plt.translate("wall street journal"));
	}

	@Test
	public void testTranslate_raise_the_bridge() {
		String expected = "aiseray ethay idgebray";
		assertEquals(expected, plt.translate("raise the bridge"));
	}

	@Test
	public void testTranslate_all_pigs_oink() {
		String expected = "allway igspay oinkway";
		assertEquals(expected, plt.translate("all pigs oink"));
	}

}
