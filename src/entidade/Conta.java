package entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidade.enuns.SituacaoAtual;

public class Conta {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momentoDoPedido;
	private SituacaoAtual statusCliente;
	
	private Cliente cliente;
	
	private List <SaidaDePedido> item = new ArrayList<>();
	
	public Conta() {
		}
	
	public Conta(Date momentoDoPedido,SituacaoAtual statusCliente, Cliente cliente) {
		this.momentoDoPedido = momentoDoPedido;
		this.statusCliente = statusCliente;
		this.cliente = cliente;
	}

	public Date getMomentoDoPedido() {
		return momentoDoPedido;
	}

	public void setMomentoDoPedido(Date momentoDoPedido) {
		this.momentoDoPedido = momentoDoPedido;
	}

	public SituacaoAtual getStatusCliente() {
		return statusCliente;
	}

	public void setStatusCliente(SituacaoAtual statusCliente) {
		this.statusCliente = statusCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<SaidaDePedido> getItem() {
		return item;
	}
	
	public void addIntens(SaidaDePedido itens) {
		item.add(itens);
	}
	
	public void removeIntens(SaidaDePedido itens) {
		item.remove(itens);
	}
	
	public double contaTotal() {
		double soma = 0;
		for(SaidaDePedido it: item) {
			soma += it.getValor();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("MOMENTO DO PEDIDO:");
		sb.append(sdf.format(momentoDoPedido)+"\n");
		sb.append("STATUS DO PEDIDO:");
		sb.append(statusCliente+"\n");
		sb.append("CLIENTE:");
		sb.append(cliente+"\n");
		sb.append("ORDEM DOS PEDIDOS:\n");
		for(SaidaDePedido item: item) {
			sb.append(item);
			sb.append("\n");
		}
		sb.append("VALOR FINAL: $");
		sb.append(String.format("%.2f", contaTotal()));
		return sb.toString();
	}
}
