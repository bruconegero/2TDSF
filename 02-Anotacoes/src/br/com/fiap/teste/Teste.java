package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Cliente;

public class Teste {
	
	public static void main (String[] args) {
	
		//Instanciar um cliente
		Cliente cliente = new Cliente();
		
		//API de Reflection para recuperar os métodos
		Method[] metodos = cliente.getClass().getDeclaredMethods();
		//DIFERENÇA entre getMethods( pega todos os métodos até os gerdados pelo object e 
		//getDeclaredMethods (pega todos os métodos declarados)
		for(int i = 0; i<metodos.length; i++) {
			System.out.println(metodos[i].getName());
		}
		
		//Recuperar os atributos (sempre usar FIELD)
		Field[] atributos = cliente.getClass().getDeclaredFields();
		for (Field item : atributos) {
			System.out.println(item.getName());
			//recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			System.out.println("Coluna: "+anotacao.nome());
			System.out.println("Obrigatório: "+anotacao.obrigatorio());
		}
		
		//Exibir o nome da classe
		System.out.println(cliente.getClass().getName());
	}

	
}
