package br.com.aula11; 
 
import javax.swing.JOptionPane; 
import java.sql.Connection; 
 
public class AppAluno { 
 
    public static void main(String[] args) { 
 
        Connection conn = Conexao.getConnection(); 
        AlunoDAO dao = new AlunoDAO(); 
 
        if (conn == null) { 
            JOptionPane.showMessageDialog(null, "Falha na conexão!"); 
            return; 
        } 
 
        int opcao = 0; 
 
        while (opcao != 5) { 
 
            opcao = Integer.parseInt(JOptionPane.showInputDialog( 
                "===== MENU ALUNOS =====\n\n" + 
                "1 - Inserir aluno\n" + 
                "2 - Listar alunos\n" + 
                "3 - Atualizar aluno\n" + 
                "4 - Excluir aluno\n" + 
                "5 - Sair\n\n" + 
                "Escolha uma opção:" 
            )); 
 
            switch (opcao) { 
                case 1: 
                    dao.inserir(conn); 
                    break; 
 
                case 2: 
                    dao.listar(conn); 
                    break; 
 
                case 3: 
                    dao.atualizar(conn); 
                    break; 
 
                case 4: 
                    dao.excluir(conn); 
                    break; 
 
                case 5: 
                    JOptionPane.showMessageDialog(null, "Encerrando..."); 
                    break; 
 
                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida!"); 
            } 
        } 
    } 
 
}