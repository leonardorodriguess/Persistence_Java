/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.livraria.bean;

import br.com.caelum.livraria.dao.DAO;
import br.com.caelum.livraria.modelo.Autor;
import br.com.caelum.livraria.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author placido
 */
@ManagedBean
@ViewScoped
public class FuncionarioBeanb {
    private Funcionario funcionario = new Funcionario();
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private boolean alterar = false;

    public Funcionario getFuncionario() {
        return funcionario;
    }
    

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public void adicionaFuncionarios(){
        if (alterar) 
            funcionarios.set(funcionarios.indexOf(funcionario), funcionario);
        else
            funcionarios.add(funcionario);
        alterar=false;
        funcionario = new Funcionario();
    }
    

	public void carregar(Funcionario funcionario) {
		System.out.println("Carregando Funcionario");
                alterar=true;
		this.funcionario = funcionario;
	}

	public void remover(Funcionario funcionario) {
            this.funcionarios.remove(funcionario);
            alterar=false;
            System.out.println("removeu");
	}
	

}
