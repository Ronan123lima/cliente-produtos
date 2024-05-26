package br.com.copysul.Clienteproduto.cliente.application.repository;

import java.util.List;

import br.com.copysul.Clienteproduto.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}
