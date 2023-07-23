/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package copiafacil;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement; 
import copiafacil.Cliente;
import com.mysql.jdbc.Driver;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *             
 * @author 62127512022.3
 */
public class ClienteDAO {
    private Connection connection;
     ArrayList<Cliente> lista = new ArrayList<>(); 
    int Id_Cliente;
    String Nome;
  String Telefone;
    String Cpf;
 String Senha;
 String Email;
 public ClienteDAO(){
        this.connection = (Connection) new ConnectionProject().getConnection();
    }
 public void adiciona(Cliente cliente){
        String sql = "INSERT INTO cliente(Nome, Telefone, CPF, Senha, Email) VALUES (?, ?, ?, ?,? )";
 // Comando para inserir os dados no banco de dados
        try{
            PreparedStatement stmt = connection.prepareStatement(sql); // Essa linha da o valor para o placeholder do comando (?), o numero é necessario para pegar a index do placenholder, e o valor é variavel é definida
            stmt.setString(1, cliente.getNome()); 
            stmt.setString(2, cliente.getTelefone());
            
            
            stmt.setString(3, cliente.getCpf());
         stmt.setString(4, cliente.getSenha());
            stmt.setString(5, cliente.getEmail());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u){
            throw new RuntimeException(u);
        }
}
 public ArrayList<Cliente> PesquisarCliente() {
        this.connection = (Connection) new ConnectionProject().getConnection(); // Obtém a conexão com o banco de dados
        String sql = "SELECT * from cliente";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs;
            rs = stmt.executeQuery(); // Executa a consulta SQL e armazena o resultado no ResultSet

            while (rs.next()) {
                Cliente objCliente = new Cliente();
                objCliente.setId_Cliente(rs.getInt("Id_Cliente"));  // Obtém o ID do usuário do resultado da consulta
                objCliente.setNome(rs.getString("Nome")); // Obtém o nome do usuário do resultado da consulta
                objCliente.setEmail(rs.getString("Email")); // Obtém o telefone do usuár
           
        
                objCliente.setTelefone(rs.getString("Telefone")); // Obtém a senha do usuário do resultado da consulta
               
                objCliente.setCpf(rs.getString("CPF"));
                objCliente.setSenha(rs.getString("Senha"));
                
                
                lista.add(objCliente); // Adiciona o usuário à lista
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar :" + erro);
        }
        return lista; // Retorna a lista de usuários

    }
  public void AlterarCliente(Cliente objCliente) {
        String sql = ("update cliente set Nome  = ?, Telefone = ?,  CPF = ?, Email = ? where Id_Cliente = ?");
        this.connection = (Connection) new ConnectionProject().getConnection(); // Obtém a conexão com o banco de dados

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, objCliente.getNome()); // Define o novo nome do usuário no comando SQL
            stmt.setString(2, objCliente.getTelefone()); // Define o novo telefone do usuário no comando SQL
           // Define o novo email do usuário no comandstmt.setString(3, objCliente.getEndereco()); // Define o novo telefone do usuário no comando SQL
         // Deo SQL
            stmt.setString(3, objCliente.getCpf()); 
            
  stmt.setString(4, objCliente.getEmail());// Define o ID do usuário no comando SQL
   stmt.setInt(5, objCliente.getId_Cliente()); // Define o ID do usuário no comando SQL
            stmt.execute(); // Executa o comando SQL
            stmt.close(); // Fecha o PreparedStatement

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Clientes Alterar :" + erro);
        }
    }

    public void ExcluirCliente(Cliente objCliente) {
        String sql = ("Delete from cliente where Id_Cliente = ?");
        this.connection = (Connection) new ConnectionProject().getConnection(); // Obtém a conexão com o banco de dados
        
        try {

            PreparedStatement stmt = connection.prepareStatement(sql); // Define o ID do usuário no comando SQL
            stmt.setInt(1, objCliente.getId_Cliente());

            stmt.execute(); // Executa o comando SQL
            stmt.close(); // Fecha o PreparedStatement

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Usuarios Excluir :" + erro);
        }
    }
}
