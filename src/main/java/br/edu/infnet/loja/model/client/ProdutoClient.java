package br.edu.infnet.loja.model.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081/produtos", name = "produtoClient")
public interface ProdutoClient {
	
	@GetMapping
	public List<ProdutoTO> consultar();

}
