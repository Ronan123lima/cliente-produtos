package br.com.copysul.Clienteproduto.produto.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.copysul.Clienteproduto.produto.application.service.ProdutoService;
import br.com.copysul.Clienteproduto.produto.domain.Produto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoController implements ProdutoAPI {
	 private final ProdutoService produtoService;
	@Override
	public ProdutoResponse postProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest) {
		log.info("[inicia} ProdutoController - postProduto");
		log.info("[idClienteidCliente} {}", idCliente);
		ProdutoResponse produto = produtoService.criaProduto(idCliente,produtoRequest);
		log.info("[finaliza} ProdutoController - postProduto");
		return produto;
	}

}
