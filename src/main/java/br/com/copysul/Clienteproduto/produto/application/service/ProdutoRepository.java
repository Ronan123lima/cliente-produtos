package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.List;
import java.util.UUID;

import br.com.copysul.Clienteproduto.produto.domain.Produto;

public interface ProdutoRepository {
	Produto salvaProduto(Produto produto);
	List<Produto> buscaProdutosDoClienteComID(UUID idCliente);
	Produto buscaProduto(UUID idProduto);
}
