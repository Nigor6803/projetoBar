package entidade;

public class SaidaDePedido {
	
	private Integer quantidade;
	private Double valor;
	
	private SaidaDePedido() {
		}
	
	private SaidaDePedido(Integer quantidade,Double valor) {
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double subTotal() {
		return quantidade*valor;
	}
	
	@Override
	public String toString() {
		return
	}
}
