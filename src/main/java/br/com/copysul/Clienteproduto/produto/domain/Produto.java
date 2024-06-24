package br.com.copysul.Clienteproduto.produto.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@NotBlank
	private String nomeProduto;
	@Enumerated(EnumType.STRING)
	private ModeloProduto modeloProduto;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoProduto tipo;

	private LocalDateTime dataHoraDoChamado;
	private LocalDateTime dataHoraDaUltimaAlteracao;
}
