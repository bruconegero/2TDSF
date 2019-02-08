package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome= "TAB_ALUNO")// sempre colocar onde voce quer a informação
public class Aluno {
	
	@Coluna(nome= "cd_aluno", obrigatorio = true)
	private int id;
	
	@Coluna(nome= "nm_aluno", obrigatorio = true)
	private String nome;
	
	@Coluna(nome= "dt_nasc", obrigatorio = true)
	private Calendar dataNascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
