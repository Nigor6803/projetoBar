package entidade;

public class SaidaDePedido {
	
	private Integer quantidade;
	private Double valor;
	
	private ProdutoDaCasa prodDaCasa; 
	
	public SaidaDePedido() {
		}
	
	public SaidaDePedido(Integer quantidade,Double valor,ProdutoDaCasa prodDaCasa) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.prodDaCasa = prodDaCasa;
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
	
	public ProdutoDaCasa getprodutoDaCasa() {
		return prodDaCasa;
	}
	
	public void setProdDaCasa(ProdutoDaCasa prodDaCasa) {
		this.prodDaCasa = prodDaCasa;
	}

	@Override
	public String toString() {
		return getprodutoDaCasa().getProduto()
				+ String.format(" %.2f", valor)
				+" , QUANTIDADE:"
				+quantidade
				+", SUBTOTAL:"
				+String.format("R$"+"%.2f", subTotal());
	}
}
