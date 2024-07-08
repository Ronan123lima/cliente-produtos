package br.com.copysul.Clienteproduto.produto.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/cliente/{idCliente}/produto")
public interface ProdutoAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ProdutoResponse postProduto(@PathVariable UUID idCliente, @Valid @RequestBody ProdutoRequest produtoRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ProdutoClienteListResponse> getProdutosDoClienteComId(@PathVariable UUID idCliente);

	@GetMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.OK)
	ProdutoClienteDetalheResponse getProdutoDoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idProduto);

	@DeleteMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deleteProdutoDoClienteComId(@PathVariable UUID idCliente, @PathVariable UUID idProduto);

	@PatchMapping(value = "/{idProduto}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchProduto(@PathVariable UUID idCliente, @PathVariable UUID idProduto,
			@Valid @RequestBody ProdutoAlteracaoRequest produtoAlteracaoRequest);

}
