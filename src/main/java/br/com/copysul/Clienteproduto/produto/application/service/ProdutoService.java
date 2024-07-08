package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.List;
import java.util.UUID;

import br.com.copysul.Clienteproduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoClienteDetalheResponse;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoClienteListResponse;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoResponse;
import jakarta.validation.Valid;

public interface ProdutoService {
	ProdutoResponse criaProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest);
	List<ProdutoClienteListResponse> buscaProdutosDoClienteComID(UUID idCliente);
	ProdutoClienteDetalheResponse buscaProdutoDoClienteComID(UUID idCliente, UUID idProduto);
	void deleteProdutoDoClienteComID(UUID idCliente, UUID idProduto);
	void alteraProdutoDoClienteComID(UUID idCliente, UUID idProduto,
			 ProdutoAlteracaoRequest produtoAlteracaoRequest);
}
