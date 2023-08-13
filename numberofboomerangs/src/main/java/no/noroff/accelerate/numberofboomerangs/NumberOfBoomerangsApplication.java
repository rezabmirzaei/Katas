package no.noroff.accelerate.numberofboomerangs;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberOfBoomerangsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberOfBoomerangsApplication.class, args);

		NumberOfBoomerangs nob = new NumberOfBoomerangs();
		List<Integer> arr = Arrays.asList(9, 5, 9, 5, 1, 1, 1);
		int boomerangCount = nob.countBoomerangs(arr);
		System.out.println("Boomerang count: " + boomerangCount);

	}

}
