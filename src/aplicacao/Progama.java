package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;
import entidade.Conta;
import entidade.ProdutoDaCasa;
import entidade.SaidaDePedido;
import entidade.enuns.SituacaoAtual;

public class Progama {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner edd = new Scanner(System.in);
		
		System.out.println("CLIENTE");
		System.out.print("NOME:");
		String nome = edd.nextLine();
		System.out.print("EMAIL:");
		String email = edd.nextLine();
		System.out.print("DIA DO ANIVERSARIO:");
		Date diaDoAniversario = sdf.parse(edd.next());
		
		Cliente cliente = new Cliente(nome,email,diaDoAniversario);
		
		System.out.println("INFORMAÇÃO DO PEDIDO");
		System.out.print("STATUS:");
		SituacaoAtual status = SituacaoAtual.valueOf(edd.next());
		
		Conta conta = new Conta(new Date(),status,cliente);
		
		System.out.print("QUANTIDADE DE INTENS:");
		int n = edd.nextInt();
		for (int i = 1;i<=n;i++) {
			System.out.println("PRODUTO N°"+i+":");
			System.out.print("PRODUTO:");
			edd.nextLine();
			String produto = edd.nextLine();
			System.out.print("PREÇO:");
			double valor = edd.nextDouble();
			System.out.print("QUANTIDADE:");
			int quantidade = edd.nextInt();
			
			ProdutoDaCasa produtoDaCasa = new ProdutoDaCasa(produto,valor);
			
			SaidaDePedido it = new SaidaDePedido(quantidade,valor,produtoDaCasa);
			
			conta.addIntens(it);
		}
		
		System.out.println();
		System.out.println(conta);
		
		edd.close();
	}

}
