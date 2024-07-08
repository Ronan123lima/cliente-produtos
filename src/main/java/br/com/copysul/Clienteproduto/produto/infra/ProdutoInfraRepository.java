package br.com.copysul.Clienteproduto.produto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.copysul.Clienteproduto.handler.APIException;
import br.com.copysul.Clienteproduto.produto.application.service.ProdutoRepository;
import br.com.copysul.Clienteproduto.produto.domain.Produto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ProdutoInfraRepository implements ProdutoRepository {
	private final ProdutoSpringDataJPARepository produtoSpringDataJPARepository;
	
	@Override
	public Produto salvaProduto(Produto produto) {
		log.info("[start] ProdutoInfraRepository - salvaProduto ");
		produtoSpringDataJPARepository.save(produto);
		log.info("[finish] ProdutoInfraRepository - salvaProduto ");
		return produto;
	}

	@Override
	public List<Produto> buscaProdutosDoClienteComID(UUID idCliente) {
		log.info("[start] ProdutoInfraRepository - buscaProdutosDoClienteComID ");
		var produtos = produtoSpringDataJPARepository.findByIdCliente(idCliente);
		log.info("[finish] ProdutoInfraRepository - buscaProdutosDoClienteComID ");
		return produtos;
	}

	@Override
	public Produto buscaProduto(UUID idProduto) {
		log.info("[start] ProdutoInfraRepository - buscaProduto");
		var produto = produtoSpringDataJPARepository.findById(idProduto) 
				.orElseThrow(() -> APIException.build(HttpStatus.
						NOT_FOUND, "Produto não encontrado para o idProduto =" + idProduto));
		log.info("[finish] ProdutoInfraRepository - buscaProduto");
		return produto;
	}

	@Override
	public void deletaProduto(Produto produto) {
		log.info("[start] ProdutoInfraRepository - deletaProduto");
		produtoSpringDataJPARepository.delete(produto);
		log.info("[finish] ProdutoInfraRepository - deletaProduto");
		
	}
}
