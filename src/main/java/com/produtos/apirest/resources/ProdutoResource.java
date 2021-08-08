package com.produtos.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;


@RestController
@RequestMapping(value="/api")
public class ProdutoResource{ // Recebe as requisições HTTP

	// GET -Pesquisar
	@Autowired
	//Lista todos produtos salvo no BD
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List <Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value="id")long id){
		return produtoRepository.findById(id);
	}
	
	
	//POST - Cadastra
	//recebe atraves do corpo da requisição e salva!
	@PostMapping("/cadastraProduto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//DELETE - Deleta
	@DeleteMapping("/deletaProduto")
	public void deletaProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	//ATUALIZAR
	@PutMapping("/atualizaProduto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto); //Salva via ID
	}
}
