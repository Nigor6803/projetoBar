package entidade;

public class ProdutoDaCasa {
	
	private String produto;
	private Double valor;
	
	public ProdutoDaCasa() {
		}
	public ProdutoDaCasa(String produto, Double valor) {
		this.produto = produto;
		this.valor = valor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
