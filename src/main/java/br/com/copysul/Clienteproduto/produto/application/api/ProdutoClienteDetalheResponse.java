package br.com.copysul.Clienteproduto.produto.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.copysul.Clienteproduto.produto.domain.ModeloProduto;
import br.com.copysul.Clienteproduto.produto.domain.Produto;
import br.com.copysul.Clienteproduto.produto.domain.TipoProduto;
import lombok.Value;

@Value
public class ProdutoClienteDetalheResponse {

	private UUID idProduto;
	private String nomeProduto;
	private ModeloProduto modeloProduto;
	private TipoProduto tipo;

	private LocalDateTime dataHoraDoChamado;

	public ProdutoClienteDetalheResponse(Produto produto) {
		this.idProduto = produto.getIdProduto();
		this.nomeProduto = produto.getNomeProduto();
		this.modeloProduto = produto.getModeloProduto();
		this.tipo = produto.getTipo();
		this.dataHoraDoChamado = produto.getDataHoraDaUltimaAlteracao();
	}
}
