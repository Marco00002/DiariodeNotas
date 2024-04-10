
package com.mycompany.diariosdenotas;

import javax.swing.JOptionPane;


public class Aluno {
    String nome;
    String RA;
    String email;
    String telefone;
    int idade;
    
    public void AcessoAluno(){
        nome = JOptionPane.showInputDialog("Digite seu Nome ");
        RA = JOptionPane.showInputDialog("Digite seu RA ");
        email = JOptionPane.showInputDialog("Digite seu Email ");
        telefone = JOptionPane.showInputDialog("Digite seu Telefone ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade "));
        
        JOptionPane.showMessageDialog(null, "Bem vindo Aluno "+nome);
        JOptionPane.showMessageDialog(null, "Seu RA  "+RA);
        JOptionPane.showMessageDialog(null, "Seu Email  "+email);
        JOptionPane.showMessageDialog(null, "Seu Telefone  "+telefone);
        JOptionPane.showMessageDialog(null, "Sua Idade "+idade);
    }
    
}
