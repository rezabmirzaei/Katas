package no.noroff.accelerate.strangerdanger;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrangerdangerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrangerdangerApplication.class, args);

		StrangerDanger sd = new StrangerDanger();
		String input = "See Spot run. See Spot jump. Spot likes jumping. See Spot fly.";
		List<List<String>> result = sd.noStrangers(input);

		System.out.println(result);
	}

}
