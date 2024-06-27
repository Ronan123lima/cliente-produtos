package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.UUID;

import br.com.copysul.Clienteproduto.produto.application.api.ProdutoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoResponse;
import jakarta.validation.Valid;

public interface ProdutoService {
	ProdutoResponse criaProduto(UUID idCliente, @Valid ProdutoRequest produtoRequest);
}
