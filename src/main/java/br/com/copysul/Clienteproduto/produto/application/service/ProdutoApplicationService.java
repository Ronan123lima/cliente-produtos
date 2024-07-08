package br.com.copysul.Clienteproduto.produto.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.copysul.Clienteproduto.cliente.application.service.ClienteService;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoClienteDetalheResponse;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoClienteListResponse;
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

	@Override
	public List<ProdutoClienteListResponse> buscaProdutosDoClienteComID(UUID idCliente) {
		log.info("[start] ProdutoApplicationService - buscaProdutosDoClienteComID ");
		clienteService.buscaClienteAtravesId(idCliente);		
		List<Produto> produtosDoCliente = produtoRepository.buscaProdutosDoClienteComID(idCliente);
		log.info("[finish] ProdutoApplicationService - buscaProdutosDoClienteComID");
		return ProdutoClienteListResponse.converte(produtosDoCliente);
	}

	@Override
	public ProdutoClienteDetalheResponse buscaProdutoDoClienteComID(UUID idCliente, UUID idProduto) {
		log.info("[start] ProdutoApplicationService - buscaProdutoDoClienteComID ");
		clienteService.buscaClienteAtravesId(idCliente);		
		Produto produto = produtoRepository.buscaProduto(idProduto);
		log.info("[finish] ProdutoApplicationService - buscaProdutoDoClienteComID ");
		return new ProdutoClienteDetalheResponse(produto);
	}

	@Override
	public void deleteProdutoDoClienteComID(UUID idCliente, UUID idProduto) {
		log.info("[start] ProdutoApplicationService - deleteProdutoDoClienteComID ");
		clienteService.buscaClienteAtravesId(idCliente);		
		Produto produto = produtoRepository.buscaProduto(idProduto);
		produtoRepository.deletaProduto(produto);
		log.info("[finish] ProdutoApplicationService - deleteProdutoDoClienteComID ");
		
	}

}
