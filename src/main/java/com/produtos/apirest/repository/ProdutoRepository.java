package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.models.Produto;

//JPA repository já possui metodos prontos para fazer persistencia no banco de dados !!! facilitando a vida do dev
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	//Buscando produto por id
	Produto findById(long id);
	
}
