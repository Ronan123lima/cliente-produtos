package br.com.copysul.Clienteproduto.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.copysul.Clienteproduto.cliente.domain.Cliente;

public interface ClienteSpringDatJPARepository extends JpaRepository<Cliente, UUID> {

}
