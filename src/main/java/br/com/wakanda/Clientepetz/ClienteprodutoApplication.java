package br.com.wakanda.Clientepetz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteprodutoApplication {
	@GetMapping
	public String getHomeTeste() {
		return "Cliente Produto - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteprodutoApplication.class, args);
	}

}
