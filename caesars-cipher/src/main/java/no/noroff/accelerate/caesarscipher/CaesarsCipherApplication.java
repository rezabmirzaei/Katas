package no.noroff.accelerate.caesarscipher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaesarsCipherApplication {

	public static void main(String[] args) {
		CaesarsCipher cc = new CaesarsCipher();
		System.out.println(String.format("middle-utz -> %s", cc.caesarCipher("middle-Outz", 2)));
		SpringApplication.run(CaesarsCipherApplication.class, args);
	}

}
