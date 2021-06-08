package input02;

import javax.swing.*;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não tem nada, somente a mensagem",
                "Título",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Título da Caixa de Diálogo",
                2,
                null,
                null,
                "Digite algo aqui.");
        
        //int x = Integer.parseInt(input1);
        
        String[] acceptableValues = {"Escolha 1", "Escolha 2", "Escolha 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Título da Caixa de Diálogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
        
        /*int input3 = Integer.parseInt ((String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Usando Parser",
                2,
                null,
                null,
                "Digite um número"));*/
        
        //System.out.println(input1);
        //System.out.println("x: "+x);
        //System.out.println(input2);
        //System.out.println(input3);
        
    //Integer.parseInt            
    }
}
