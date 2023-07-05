/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author wfeli
 */
  public class SistemaEscola {
	        private final AlunoDAO dao = new AlunoDAO();
	        private static final BufferedReader entrada =
					                                    new BufferedReader(
					                                    new InputStreamReader(System.in));
		
	        private void exibir(Aluno aluno){
		               System.out.println("Aluno: "+aluno.nome+
					                                   "\nMatricula: "+aluno.matricula+
					                                   "\tEntrada: "+aluno.ano+
				                                    "\n==========================");
	        }
		
	        public void exibirTodos(){
		              dao.obterTodos().forEach(aluno->exibir(aluno));
	        }
                
                 public void inserirAluno() throws IOException{
	        Aluno aluno = new Aluno();
	        System.out.println("Nome:");
	        aluno.nome = entrada.readLine();
	        System.out.println("Matricula:");
	        aluno.matricula = entrada.readLine();
	        System.out.println("Entrada:");
	        aluno.ano = Integer.parseInt(entrada.readLine());
	        dao.incluir(aluno);
  }
	
                  public void excluirAluno() throws IOException{
	        System.out.println("Matricula:");
	        String matricula = entrada.readLine();
	       dao.excluir(matricula);
  }
  }
