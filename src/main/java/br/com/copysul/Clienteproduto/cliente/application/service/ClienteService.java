package br.com.copysul.Clienteproduto.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.copysul.Clienteproduto.cliente.application.api.ClienteDetalhadoResponse;
import br.com.copysul.Clienteproduto.cliente.application.api.ClienteListResponse;
import br.com.copysul.Clienteproduto.cliente.application.api.ClienteRequest;
import br.com.copysul.Clienteproduto.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
 