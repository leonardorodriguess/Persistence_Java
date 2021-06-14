/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pjsf;
import br.com.dao.DaoGeneric;
import br.com.entidades.Pessoa;
import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.faces.component.html.HtmlCommandButton;

/**
 *
 * @author Leonardo R
 */
//@RequestScoped //vida curta perde os dados da requisição anterior
//@ApplicationScoped //o que um usuario fazer os outros vão olhar, ira ter um cópia identica indepente se abrir outro navegador
//@ViewScoped //segura os dados na memoria
//@ManagedBean(name = "pessoaBean")



public class PessoaBean implements Serializable {
    private Pessoa pessoa = new Pessoa();
    private DaoGeneric <Pessoa> daoGeneric = new DaoGeneric<Pessoa>();

    /*public void salvar(){
        daoGeneric.salvar(pessoa);
        pessoa = new Pessoa();
    }*/

    public void salvar(){
        pessoa = daoGeneric.merge(pessoa);
    }

    public DaoGeneric<Pessoa> getDaoGeneric() {
        return daoGeneric;
    }

    public void setDaoGeneric(DaoGeneric<Pessoa> daoGeneric) {
        this.daoGeneric = daoGeneric;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
