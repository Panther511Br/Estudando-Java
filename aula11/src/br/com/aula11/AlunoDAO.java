package br.com.aula11;

import java.sql.*; 
import javax.swing.JOptionPane;

public class AlunoDAO {
	// ----- MÉTODO INSERT ----- 
    public void inserir(Connection conn) { 
        try { 
            String nome = JOptionPane.showInputDialog("Nome:"); 
            String fone = JOptionPane.showInputDialog("Telefone:"); 
 
            String sql = "INSERT INTO alunos(nome, fone) VALUES (?, ?)"; 
             
            PreparedStatement stmt = conn.prepareStatement(sql); 
 
            stmt.setString(1, nome); 
            stmt.setString(2, fone); 
 
            stmt.executeUpdate(); 
            stmt.close(); 
 
            JOptionPane.showMessageDialog(null,  
                String.format("Aluno %s inserido com sucesso!", nome)); 
 
        } catch (SQLException e) { 
          JOptionPane.showMessageDialog(null, "Erro ao inserir: " + e.getMessage()); 
        } 
    } 
    
    // ----- MÉTODO LISTAR ----- 
    public void listar(Connection conn) { 
        try { 
            String sql = "SELECT * FROM alunos"; 
 
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery(sql); 
 
            StringBuilder lista = new StringBuilder("ALUNOS CADASTRADOS:\n\n"); 
 
            while (rs.next()) { 
                lista.append( 
                    rs.getInt("id") + " - " + 
                    rs.getString("nome") + " - " + 
                    rs.getString("fone") + "\n" 
                ); 
            } 
 
            JOptionPane.showMessageDialog(null, lista.toString()); 
 
            stmt.close(); 
            rs.close(); 
 
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, "Erro ao listar: " + e.getMessage()); 
        } 
    } 
     
    // ----- MÉTODO UPDATE ----- 
    public void atualizar(Connection conn) { 
        try { 
            int id = 
           Integer.parseInt(JOptionPane.showInputDialog("ID do aluno para atualizar:")); 
            String novoNome = JOptionPane.showInputDialog("Novo nome:"); 
            String novoFone = JOptionPane.showInputDialog("Novo telefone:"); 
 
            String sql = "UPDATE alunos SET nome = ?, fone = ? WHERE id = ?"; 
            PreparedStatement stmt = conn.prepareStatement(sql); 
 
            stmt.setString(1, novoNome); 
            stmt.setString(2, novoFone); 
            stmt.setInt(3, id); 
 
            int linhas = stmt.executeUpdate(); 
            stmt.close(); 
 
            if (linhas > 0) 
                JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!"); 
            else 
                JOptionPane.showMessageDialog(null, "Aluno não encontrado!"); 
 
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage()); 
        } 
    } 
     
    // ----- MÉTODO DELETE ----- 
    public void excluir(Connection conn) { 
        try { 
        	int id = Integer.parseInt(JOptionPane.showInputDialog("ID do aluno para excluir:")); 
 
            String sql = "DELETE FROM alunos WHERE id = ?"; 
            PreparedStatement stmt = conn.prepareStatement(sql); 
 
            stmt.setInt(1, id); 
 
            int linhas = stmt.executeUpdate(); 
            stmt.close(); 
 
            if (linhas > 0) 
                JOptionPane.showMessageDialog(null, "Aluno excluído com sucesso!"); 
            else 
                JOptionPane.showMessageDialog(null, "Aluno não encontrado!"); 
 
        } catch (SQLException e) { 
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage()); 
        } 
    } 
 
} 	

