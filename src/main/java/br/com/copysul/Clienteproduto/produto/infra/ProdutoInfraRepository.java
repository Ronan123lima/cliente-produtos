package br.com.copysul.Clienteproduto.produto.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

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
		log.info("[finish] ProdutoInfraRepository - buscaProdutosDoClienteComID ");
		return null;
	}
}
