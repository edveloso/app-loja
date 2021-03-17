package br.edu.infnet.loja.controller.to;

import java.util.List;

public class CompraTO {
	
	private List<ProdutoTO> itens;
	
	private EnderecoTO endereco;

	
	public List<ProdutoTO> getItens() {
		return itens;
	}

	public void setItens(List<ProdutoTO> itens) {
		this.itens = itens;
	}

	public EnderecoTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoTO endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "CompraTO [itens=" + itens + ", endereco=" + endereco + "]";
	}

	
	
	
	

}
