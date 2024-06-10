package br.com.copysul.Clienteproduto.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.copysul.Clienteproduto.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private String telefone;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
