package no.noroff.accelerate.piglatin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PigLatinApplication {

	public static void main(String[] args) {
		SpringApplication.run(PigLatinApplication.class, args);
		PigLatinTranslator plt = new PigLatinTranslator();
		System.out.println(plt.pigLatinSentence("this is pig latin")); // Output: "isthay isway igpay atinlay"
		System.out.println(plt.pigLatinSentence("wall street journal")); // Output: "allway eetstray ournaljay"
		System.out.println(plt.pigLatinSentence("raise the bridge")); // Output: "aiseray ethay idgebray"
		System.out.println(plt.pigLatinSentence("all pigs oink")); // Output: "allway igspay oinkway"
	}

}
