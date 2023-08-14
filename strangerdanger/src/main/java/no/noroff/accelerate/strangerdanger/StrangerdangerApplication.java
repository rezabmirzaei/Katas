package no.noroff.accelerate.strangerdanger;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrangerdangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrangerdangerApplication.class, args);
		runStrangerDanger("See Spot run. See Spot jump. Spot likes jumping. See Spot fly.");
		runStrangerDanger("I don't like apples. I don't like 'apples'. No I really don't like apples.");
		runStrangerDanger(
				"My friend Joe is a friend of another friend Joe who used to be my friend. Sadly, Joe is no longer my friend.");
	}

	private static void runStrangerDanger(String sentence) {
		StrangerDanger sd = new StrangerDanger();
		List<List<String>> result = sd.noStrangers(sentence);
		System.out.println(result);
	}

}
