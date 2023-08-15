package no.noroff.accelerate.numberofboomerangs;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberOfBoomerangsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberOfBoomerangsApplication.class, args);
		runNumberOfBoomerangs(Arrays.asList(9, 5, 9, 5, 1, 1, 1));
		runNumberOfBoomerangs(Arrays.asList(5, 6, 6, 7, 6, 3, 9));
		runNumberOfBoomerangs(Arrays.asList(4, 4, 4, 9, 9, 9, 9));
		runNumberOfBoomerangs(Arrays.asList(1, 7, 1, 7, 1, 7, 1));
		runNumberOfBoomerangs(Arrays.asList());
		runNumberOfBoomerangs(Arrays.asList(1, 7));
		// runNumberOfBoomerangs(Arrays.asList(1, 7, 1, 7, "one", 7, 1));
	}

	public static void runNumberOfBoomerangs(List<Object> numbers) {
		NumberOfBoomerangs nob = new NumberOfBoomerangs();
		int boomerangCount = nob.countBoomerangs(numbers);
		System.out.println(String.format("%s -> %s", numbers, boomerangCount));
	}

}
