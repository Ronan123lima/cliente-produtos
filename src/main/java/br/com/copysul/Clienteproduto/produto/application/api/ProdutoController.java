package br.com.copysul.Clienteproduto.produto.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class ProdutoController implements ProdutoAPI {

	@Override
	public ProdutoResponse postProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest) {
		log.info("[inicia} ProdutoController - postProduto");
		log.info("[idClienteidCliente} {}", idCliente);
		log.info("[finaliza} ProdutoController - postProduto");
		return null;
	}

}
