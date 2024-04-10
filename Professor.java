
package com.mycompany.diariosdenotas;

import javax.swing.JOptionPane;

public class Professor {
    String nome;
    String email;
    String telefone;
    
    public void AcessoProfessor(){
        nome = JOptionPane.showInputDialog("Digite seu Nome ");
        email = JOptionPane.showInputDialog("Digite seu Email ");
        telefone = JOptionPane.showInputDialog("Digite seu Telefone ");
        
        JOptionPane.showMessageDialog(null, "Bem vindo Professor "+nome);
        JOptionPane.showMessageDialog(null, "Seu Email e"+email);
        JOptionPane.showMessageDialog(null, "Seu Telefone e "+telefone);
    }
    
}
