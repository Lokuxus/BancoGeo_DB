/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Database.ConexaoJDBC;

/**
 *
 * @author gustavo
 */
public class MenuPrincipal extends javax.swing.JFrame {
    public static String id;
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public static boolean testaEstacionamento(ConexaoJDBC con, String ponto){
     return true;   
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        buttonVeiculo = new javax.swing.JButton();
        buttonPonto = new javax.swing.JButton();
        buttonbuscaEsta = new javax.swing.JButton();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonVeiculo.setText("Cadastrar Veiculo");
        buttonVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVeiculoMouseClicked(evt);
            }
        });
        buttonVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVeiculoActionPerformed(evt);
            }
        });

        buttonPonto.setText("Cadastrar Ponto");
        buttonPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPontoMouseClicked(evt);
            }
        });
        buttonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPontoActionPerformed(evt);
            }
        });

        buttonbuscaEsta.setText("Buscar Estacionamentos");
        buttonbuscaEsta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonbuscaEstaMouseClicked(evt);
            }
        });
        buttonbuscaEsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbuscaEstaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonbuscaEsta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buttonVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonbuscaEsta)
                .addGap(0, 269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVeiculoActionPerformed

    private void buttonVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVeiculoMouseClicked
        CadastroVeiculo c = new CadastroVeiculo();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_buttonVeiculoMouseClicked

    private void buttonPontoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPontoMouseClicked
        CadastraPonto c = new CadastraPonto();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_buttonPontoMouseClicked

    private void buttonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPontoActionPerformed

    private void buttonbuscaEstaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonbuscaEstaMouseClicked
        ListaEstacionamentos c = new ListaEstacionamentos();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_buttonbuscaEstaMouseClicked

    private void buttonbuscaEstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbuscaEstaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonbuscaEstaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPonto;
    private javax.swing.JButton buttonVeiculo;
    private javax.swing.JButton buttonbuscaEsta;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
