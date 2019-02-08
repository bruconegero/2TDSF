package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Aluno;

public class TesteTabela {

	public static void main(String[] args) {

		// Exercicio

		// Instanciar um Aluno
		Aluno aluno = new Aluno();

		// Exibir o nome da tabela
		Tabela anotacao = aluno.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM "+ anotacao.nome());

	}

}
