/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.dao.CadastroUsuarioDao;
import model.dao.CpfDao;

/**
 *
 * @author Dih
 */
public class CpfSenha extends javax.swing.JDialog {

    private char s = '\u0000';
    private CpfDao cpf1 = new CpfDao();
    private CadastroUsuarioDao dao = new CadastroUsuarioDao();
    static Tela tela;
   
    public CpfSenha(java.awt.Frame parent, boolean modal,Tela tela) {
        super(parent, modal);
        initComponents();
        olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
        this.tela=tela;
        alerta1.setVisible(false);
        alerta2.setVisible(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cpft = new javax.swing.JLabel();
        senhat = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        cpfT = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        mostrarsenha = new javax.swing.JButton();
        olhoaberto = new javax.swing.JLabel();
        olhofechado = new javax.swing.JLabel();
        alerta2 = new javax.swing.JLabel();
        alerta1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        cpft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpft.setText("CPF");
        jPanel1.add(cpft);
        cpft.setBounds(50, 30, 50, 22);

        senhat.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        senhat.setText("Senha");
        jPanel1.add(senhat);
        senhat.setBounds(50, 60, 60, 22);

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(confirmar);
        confirmar.setBounds(40, 110, 100, 20);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(180, 110, 120, 20);

        try{
            javax.swing.text.MaskFormatter cpf2= new javax.swing.text.MaskFormatter("###.###.###-##");
            cpfT = new javax.swing.JFormattedTextField(cpf2);
        }
        catch (Exception e){
        }
        cpfT.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cpfT);
        cpfT.setBounds(90, 30, 170, 23);

        senha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(senha);
        senha.setBounds(110, 60, 150, 23);

        mostrarsenha.setBorder(null);
        mostrarsenha.setContentAreaFilled(false);
        mostrarsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarsenhaActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarsenha);
        mostrarsenha.setBounds(270, 60, 40, 20);

        olhoaberto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Olho-senha-ativado.png"))); // NOI18N
        jPanel1.add(olhoaberto);
        olhoaberto.setBounds(260, 50, 60, 40);

        olhofechado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icone-senha-oculta.png"))); // NOI18N
        jPanel1.add(olhofechado);
        olhofechado.setBounds(260, 50, 50, 40);

        alerta2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        alerta2.setForeground(new java.awt.Color(255, 0, 51));
        alerta2.setText("Senha Incorreta");
        jPanel1.add(alerta2);
        alerta2.setBounds(110, 80, 80, 20);

        alerta1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        alerta1.setForeground(new java.awt.Color(255, 0, 0));
        alerta1.setText("CPF incorreto");
        jPanel1.add(alerta1);
        alerta1.setBounds(110, 0, 70, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela menu.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-260, -70, 600, 220);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 30, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarsenhaActionPerformed
        if(s=='\u0000'){
            senha.setEchoChar(s);
            s = '\u25cf';
             olhoaberto.setVisible(true);
        olhofechado.setVisible(false);
        }else{
            senha.setEchoChar(s);
            s = '\u0000';
        olhoaberto.setVisible(false);
        olhofechado.setVisible(true);
        }
    }//GEN-LAST:event_mostrarsenhaActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(String.valueOf(cpfT.getText()).equals(cpf1.retornar())){
        if(String.valueOf(senha.getPassword()).equals(dao.retornar(cpf1.retornar()))){
           dispose();
           new Excluir(null,true,tela);
        }else{
            alerta2.setVisible(true);
            alerta1.setVisible(true);
        }
        }else{
            alerta1.setVisible(true);
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CpfSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CpfSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CpfSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CpfSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CpfSenha dialog = new CpfSenha(new javax.swing.JFrame(), true,tela);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta1;
    private javax.swing.JLabel alerta2;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cpfT;
    private javax.swing.JLabel cpft;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mostrarsenha;
    private javax.swing.JLabel olhoaberto;
    private javax.swing.JLabel olhofechado;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhat;
    // End of variables declaration//GEN-END:variables
}
