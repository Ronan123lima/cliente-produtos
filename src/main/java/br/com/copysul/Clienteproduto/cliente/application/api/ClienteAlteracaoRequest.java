package br.com.copysul.Clienteproduto.cliente.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	private String telefone;
	@NotNull
	private String dataNascimento;
	@NotNull
	private Boolean aceitaTermos;
}
