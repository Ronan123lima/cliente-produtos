package br.com.copysul.Clienteproduto.produto.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.copysul.Clienteproduto.produto.domain.Produto;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, UUID> {

}
