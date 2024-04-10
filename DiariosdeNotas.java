
package com.mycompany.diariosdenotas;

import javax.swing.JOptionPane;


public class DiariosdeNotas {

    public static void main(String[] args) {
        
        String usuario = JOptionPane.showInputDialog("Digite 1 para Aluno, 2 para Professor");
        
        if (usuario.equals("2")){
            Professor a2 = new Professor();
            a2.AcessoProfessor();
        }else if (usuario.equals("1")){
            Aluno a1 = new Aluno();
            a1.AcessoAluno();
        }
       
    }
}

