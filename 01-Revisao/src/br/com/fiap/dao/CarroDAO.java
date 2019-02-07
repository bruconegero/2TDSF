package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Carro;

public interface CarroDAO {

	//somente as assinaturas dos m�todos
	List<Carro> buscarCarros();
	void criar(Carro carro);
	
}
