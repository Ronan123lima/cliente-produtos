package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.copysul.Clienteproduto.produto.application.api.ProdutoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProdutoApplicationService implements ProdutoService {

	@Override
	public ProdutoResponse criaProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoApplicationService - criaProduto ");
		
		log.info("[finish] ProdutoApplicationService - criaProduto ");
		return null;
	}

}
