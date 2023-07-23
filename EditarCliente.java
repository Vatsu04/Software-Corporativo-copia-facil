/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package copiafacil;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edsoo
 */
public class EditarCliente extends javax.swing.JFrame {

    /**
     * Creates new form EditarCliente
     */
    public EditarCliente() {
        initComponents();
        listarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID = new javax.swing.JTextField();
        Nome = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Carregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 100, -1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 80, -1));
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 110, -1));

        Limpar.setContentAreaFilled(false);
        Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        getContentPane().add(Limpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 60, 30));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 60, 30));

        Editar.setContentAreaFilled(false);
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 60, 30));

        Excluir.setContentAreaFilled(false);
        Excluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 60, 30));

        Carregar.setContentAreaFilled(false);
        Carregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarActionPerformed(evt);
            }
        });
        getContentPane().add(Carregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 60, 30));

        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email", "Telefone", "CPF"
            }
        ));
        jScrollPane1.setViewportView(TabelaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, 520, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Editar Cliente.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 539, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
                if (LoginFuncionario.role.equals("ADMIN")) {
    // Show admin menu
            new MenuAdm().setVisible(true);
            
            this.dispose();
} else if (LoginFuncionario.role.equals("FUNCIONARIO")) {
    new MenuFuncionario().setVisible(true);
            
            this.dispose();
} else {
    // Handle invalid role or show a default menu
    JOptionPane.showMessageDialog(this, "Função inválida, fechando o software.");
    
    this.dispose();
}
    }//GEN-LAST:event_VoltarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        ExcluirCliente();
        listarValores();
        LimparCampos(); 
    }//GEN-LAST:event_ExcluirActionPerformed

    private void CarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarActionPerformed
        // TODO add your handling code here:
        CarregarCampos();
    }//GEN-LAST:event_CarregarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        AlterarClientes();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_EditarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
        LimparCampos();    
    }//GEN-LAST:event_LimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JButton Carregar;
    private javax.swing.JButton Editar;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Excluir;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Limpar;
    private javax.swing.JTextField Nome;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void listarValores() { //Declaração do método listarValores(). Esse método é provavelmente parte de uma classe e é responsável por preencher uma tabela ou lista com valores obtidos de algum lugar, como um banco de dados.
        try {
            ClienteDAO objClienteDAO = new ClienteDAO();
            DefaultTableModel model = (DefaultTableModel) TabelaCliente.getModel();
            model.setNumRows(0);

            ArrayList<Cliente> lista = objClienteDAO.PesquisarCliente();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_Cliente(),
                     lista.get(num).getNome(),
                   
                    lista.get(num).getEmail(),
                    lista.get(num).getTelefone(),
                     lista.get(num).getCpf(),
              
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores :" + erro);
        }
    }

  private void CarregarCampos() {
/*
        Esse método é responsável por carregar os campos de texto da interface com os valores selecionados na tabela. Ele faz o seguinte:

Obtém o índice da linha selecionada na tabela através do método getSelectedRow().
Através do modelo da tabela (TabelaClientes.getModel()), obtém os valores correspondentes da linha selecionada.
Define os valores obtidos nos campos de texto Id, User, Telefone e Email.
 */        
        int setar = TabelaCliente.getSelectedRow();

        ID.setText(TabelaCliente.getModel().getValueAt(setar, 0).toString());
        
           Nome.setText(TabelaCliente.getModel().getValueAt(setar, 1 ).toString());
         
         Email.setText(TabelaCliente.getModel().getValueAt(setar, 2).toString());
        Telefone.setText(TabelaCliente.getModel().getValueAt(setar, 3).toString());
        CPF.setText(TabelaCliente.getModel().getValueAt(setar, 4).toString());
     
    }

    private void LimparCampos() {
/*
        Esse método é responsável por limpar os campos de texto da interface. Ele simplesmente define o texto vazio para os campos Id, User, Telefone e Email.
 */        
        ID.setText("");
        
        CPF.setText("");
        
        Telefone.setText("");
        Email.setText("");
        Nome.setText("");
    }

    private void AlterarClientes() {
 /*
 Esse método é responsável por alterar as informações de um usuário. Ele faz o seguinte:

Obtém os valores dos campos Id, User, Telefone e Email.
Cria uma instância da classe Clientes e define os valores obtidos nos respectivos atributos.
Cria uma instância da classe ClientesDAO.
Chama o método AlterarClientes() da classe ClientesDAO, passando o objeto objClientes como argumento para realizar a alteração no banco de dados.   
 */         
        int id_cliente;
       
     
       
        String cpf;
        String telefone;
        String email;
        String nome; 

        id_cliente = Integer.parseInt(ID.getText());
      
          cpf = CPF.getText();
        telefone = Telefone.getText();
      
        
        email = Email.getText();
        nome = Nome.getText();
        
        Cliente objClientes = new Cliente();
        objClientes.setId_Cliente(id_cliente);
       
         objClientes.setCpf(cpf);
        objClientes.setTelefone(telefone);
        objClientes.setEmail(email);
        objClientes.setNome(nome);

        ClienteDAO objClientesDAO = new ClienteDAO();
        objClientesDAO.AlterarCliente(objClientes);

    }

    private void ExcluirCliente() {
 /*
 Esse método é responsável por excluir um usuário. Ele faz o seguinte:

Obtém o valor do campo Id e converte para o tipo inteiro.
Cria uma instância da classe Cliente e define o valor do ID obtido no atributo id.
Cria uma instância da classe ClienteDAO.
Chama o método ExcluirCliente() da classe ClienteDAO, passando o objeto objCliente como argumento para realizar a exclusão no banco de dados.   
 */            
        int id = 0;

        id = Integer.parseInt(ID.getText());

        Cliente objCliente = new Cliente();
        objCliente.setId_Cliente(id);

        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.ExcluirCliente(objCliente);
    }

}