package br.com.copysul.Clienteproduto.produto.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.copysul.Clienteproduto.produto.application.service.ProdutoService;
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
		ProdutoResponse produto = produtoService.criaProduto(idCliente, produtoRequest);
		log.info("[finaliza} ProdutoController - postProduto");
		return produto;
	}

	@Override
	public List<ProdutoClienteListResponse> getProdutosDoClienteComId(UUID idCliente) {
		log.info("[inicia} ProdutoController - getProdutosDoClienteComId");
		log.info("[idCliente] {}", idCliente);
		List<ProdutoClienteListResponse> produtosDoCliente = produtoService.buscaProdutosDoClienteComID(idCliente);
		log.info("[finaliza} ProdutoController - getProdutosDoClienteComId");
		return produtosDoCliente;
	}

	@Override
	public ProdutoClienteDetalheResponse getProdutoDoClienteComId(UUID idCliente, UUID idProduto) {
		log.info("[inicia} ProdutoController - getProdutoDoClienteComId");
		log.info("[idCliente] {} - [idProduto] {}", idCliente, idProduto);		
		ProdutoClienteDetalheResponse produto = produtoService.buscaProdutoDoClienteComID(idCliente, idProduto);
		log.info("[finaliza} ProdutoController - getProdutoDoClienteComId");
		return produto;
	}
}
