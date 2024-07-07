package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.copysul.Clienteproduto.cliente.application.service.ClienteService;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoResponse;
import br.com.copysul.Clienteproduto.produto.domain.Produto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProdutoApplicationService implements ProdutoService {
	private final ClienteService clienteService;
	private final ProdutoRepository produtoRepository;

	@Override
	public ProdutoResponse criaProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest) {
		log.info("[start] ProdutoApplicationService - criaProduto ");
		clienteService.buscaClienteAtravesId(idCliente);
		Produto produto = produtoRepository.salvaProduto(new Produto(idCliente, produtoRequest));
		log.info("[finish] ProdutoApplicationService - criaProduto ");
		return new ProdutoResponse(produto.getIdProduto());
	}

}
