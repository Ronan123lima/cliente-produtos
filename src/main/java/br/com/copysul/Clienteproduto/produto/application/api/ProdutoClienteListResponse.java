package br.com.copysul.Clienteproduto.produto.application.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.copysul.Clienteproduto.produto.domain.ModeloProduto;
import br.com.copysul.Clienteproduto.produto.domain.Produto;
import br.com.copysul.Clienteproduto.produto.domain.TipoProduto;
import lombok.Value;

@Value
public class ProdutoClienteListResponse {
	private UUID idProduto;
	private String nomeProduto;
	private ModeloProduto modeloProduto;
	private TipoProduto tipo;
	private LocalDateTime dataHoraDoChamado;

	public static List<ProdutoClienteListResponse> converte(List<Produto> produtosDoCliente) {
		return produtosDoCliente.stream().map(ProdutoClienteListResponse::new).collect(Collectors.toList());
	}

	public ProdutoClienteListResponse(Produto produto) {
		this.idProduto = produto.getIdCliente();
		this.nomeProduto = produto.getNomeProduto();
		this.modeloProduto = produto.getModeloProduto();
		this.tipo = produto.getTipo();
		this.dataHoraDoChamado = produto.getDataHoraDaUltimaAlteracao();
	}

}
