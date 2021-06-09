/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pjsf;
import java.util.ArrayList;
import java.util.List;
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



public class PessoaBean {
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private List<String> nomes = new ArrayList<String>();
    //private HtmlCommandButton commandButton;

    public void addNome(){
        nomes.add(nome);

        //if (nomes.size() > 3)
            //commandButton.setDisabled(true);
        
        System.out.println(nomes);
        //return "";
    }


    public void juntarNome(){
         nomeCompleto = nome + " "+  sobrenome;
        //return "";
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    /*public HtmlCommandButton getCommandButton() {
        return commandButton;
    }

    public void setCommandButton(HtmlCommandButton commandButton) {
        this.commandButton = commandButton;
    }*/


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
