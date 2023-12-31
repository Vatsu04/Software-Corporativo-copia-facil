/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package copiafacil;

import javax.swing.JOptionPane;

/**
 *
 * @author edsoo
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        CPF = new javax.swing.JTextField();
        Telefone = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 110, -1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 110, -1));
        getContentPane().add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 110, -1));
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 110, -1));
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, -1));

        Voltar.setContentAreaFilled(false);
        Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 70, 30));

        Cadastrar.setContentAreaFilled(false);
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Página de cadastro cliente.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 541, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        
        new LoginCliente().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
         Cliente clientes = new Cliente();
            clientes.setNome(Nome.getText());
            clientes.setTelefone(Telefone.getText());
          clientes.setSenha(Senha.getText());
            clientes.setEmail(Email.getText());
            clientes.setCpf(CPF.getText());
            
            /*
                private String Nome;
    private String Telefone;
    private String Endereco; 
    private String Email; 
    private String Cpf; 
            */
            if (
                    (CPF.getText().isEmpty()) ||
                    (Telefone.getText().isEmpty()) ||
                    (Email.getText().isEmpty()) ||
                      (Senha.getText().isEmpty()) ||
                    (Nome.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
                
            }
            else{
            ClienteDAO dao = new ClienteDAO();
            dao.adiciona(clientes);
            JOptionPane.showMessageDialog(null, " Cliente "+Nome.getText()+" Inserido(a) com sucesso! ");
    }
    
    CPF.setText("");
    Telefone.setText("");
    Email.setText("");
    Nome.setText("");   
    Senha.setText("");  // TODO add your handling code here:
    }//GEN-LAST:event_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField Telefone;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
