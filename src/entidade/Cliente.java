package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nome;
	private String email;
	private Date diaDoAniversario;
		
	public Cliente() {
		}
	
	public Cliente (String nome,String email,Date diaDoAniversario) {
		this.nome = nome;
		this.email = email;
		this.diaDoAniversario = diaDoAniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(Date diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}
	@Override
	public String toString(){
		return nome+ " ("+ sdf.format(diaDoAniversario)+") - " + email;
	}
}