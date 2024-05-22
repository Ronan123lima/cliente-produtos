package br.com.copysul.Clienteproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.copysul.Clienteproduto.cliente.domain.Cliente;

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
