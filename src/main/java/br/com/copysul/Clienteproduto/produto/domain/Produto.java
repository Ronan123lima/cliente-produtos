package br.com.copysul.Clienteproduto.produto.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.copysul.Clienteproduto.produto.application.api.ProdutoAlteracaoRequest;
import br.com.copysul.Clienteproduto.produto.application.api.ProdutoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idProduto", updatable = false, unique = true, nullable = false)
	private UUID idProduto;
	@NotNull
	@Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeProduto;
	@Enumerated(EnumType.STRING)
	private ModeloProduto modeloProduto;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoProduto tipo;

	
	private LocalDateTime dataHoraDoChamado;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Produto(UUID idCliente, @Valid ProdutoRequest produtoRequest) {
		this.idCliente = idCliente;
		this.nomeProduto = produtoRequest.getNomeProduto();
		this.modeloProduto = produtoRequest.getModeloProduto();
		this.tipo = produtoRequest.getTipo();
		this.dataHoraDoChamado = LocalDateTime.now();
	}

	public void altera(ProdutoAlteracaoRequest produtoRequest) {
		this.nomeProduto = produtoRequest.getNomeProduto();
		this.modeloProduto = produtoRequest.getModeloProduto();
		this.tipo = produtoRequest.getTipo();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}
