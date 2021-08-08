package com.produtos.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Classe que faz a ligação com BD
@Entity
@Table(name="TB_PRODUTO")
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id // Id da tabela do bd
	@GeneratedValue(strategy=GenerationType.AUTO) // Indicando que os ID vão ser criados automaticamente
	private long id;
	
	private String nome;
	
	private BigDecimal quantidade;
	
	private BigDecimal valor;

	
	//Getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
