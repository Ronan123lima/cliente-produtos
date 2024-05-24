package br.com.copysul.Clienteproduto.cliente.application.service;

import br.com.copysul.Clienteproduto.cliente.application.api.ClienteRequest;
import br.com.copysul.Clienteproduto.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}
 