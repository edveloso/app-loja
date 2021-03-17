package br.edu.infnet.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.loja.controller.to.CompraTO;
import br.edu.infnet.loja.model.client.ProdutoClient;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	private ProdutoClient produtoClient;

	@PostMapping
	public void realizarCompra(   ) {
		System.out.println("Cheguei na compra... " + produtoClient.consultar() );
	}
	
	
}
