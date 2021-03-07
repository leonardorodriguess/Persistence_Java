/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Funcionario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author placido
 */
@ManagedBean
@ViewScoped
public class FuncionarioBean {

	private Funcionario funcionario = new Funcionario();
        private DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public List<Funcionario> getFuncionarios() {
		return dao.listaTodos();
	}

	public void adicionaFuncionarios() {
		System.out.println("Gravando Funcionario " + this.funcionario.getNome());

		if (this.funcionario.getId() == null) {
			dao.adiciona(this.funcionario);
		} else {
			dao.atualiza(this.funcionario);
		}

		this.funcionario = new Funcionario();

	}

	public void carregar(Funcionario funcionario) {
		System.out.println("Carregando Funcionario");
		this.funcionario = funcionario;
	}

	public void remover(Funcionario funcionario) {
		System.out.println("Removendo autor");
		dao.remove(funcionario);
	}

}
