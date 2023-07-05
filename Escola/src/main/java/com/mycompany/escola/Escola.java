package com.mycompany.escola;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Escola {
    public static void main(String[] args) throws IOException {
        SistemaEscola sistema = new SistemaEscola();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("1-Listar\t2-Inserir\t3-Excluir\t0-Sair");
            int opcao = Integer.parseInt(entrada.readLine());
            if (opcao == 0)
                break;
            switch (opcao) {
                case 1:
                    sistema.exibirTodos();
                    break;
                case 2:
                    sistema.inserirAluno();
                    break;
                case 3:
                    sistema.excluirAluno();
                    break;
            }
        }

        entrada.close();
    }
}


        /*try {  List<Aluno> lista = new ArrayList<>();
            // passo 1: carregar o driver do Derby
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            // passo 2: estabelecer a conexão com o banco de dados
            try (Connection c1 = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/escola", "escola", "escola")) {

                // passo 3: criar o Statement
                Statement st = c1.createStatement();

                // passo 4: executar a consulta
                ResultSet r1 = st.executeQuery("SELECT * FROM ALUNO");
                while(r1.next())
                lista.add(new Aluno(r1.getString("MATRICULA"),
                r1.getString("NOME"),
                    r1.getInt("ENTRADA")));
                r1.close();
                st.close();
                c1.close();
                for (Aluno aluno : lista) {
                    System.out.println("Aluno: " + aluno.nome +
                        "( " + aluno.matricula + ") - " +
                        aluno.ano);
                    }
                
                          }
                      } catch (ClassNotFoundException | SQLException e) {
                      }
                    AlunoDAO dao = new AlunoDAO();
                    dao.obterTodos().forEach(aluno -> {
                    System.out.println(aluno.matricula);
              });*/
        
    

