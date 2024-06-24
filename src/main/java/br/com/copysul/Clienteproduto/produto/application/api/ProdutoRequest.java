package br.com.copysul.Clienteproduto.produto.application.api;

import br.com.copysul.Clienteproduto.produto.domain.ModeloProduto;
import br.com.copysul.Clienteproduto.produto.domain.TipoProduto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProdutoRequest {
	@NotBlank
	private String nomeProduto;
	@NotNull
	private ModeloProduto modeloProduto;
	@NotNull
	private TipoProduto tipo;
//	@NotNull
//	private LocalDateTime dataHoraDoChamado;
}
