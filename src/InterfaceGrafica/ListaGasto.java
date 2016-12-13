package InterfaceGrafica;

import Database.ConexaoJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaGasto extends javax.swing.JFrame {


    ConexaoJDBC con = new ConexaoJDBC();
    String[] column = {"Estacionamento", "Entrada", "Saída", "Permanencia", "Valor"};
    String sql;

    public ListaGasto() {
        initComponents();
        atualizaCombo();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public void atualizaCombo() {
        try {
            con.conecta();
            con.stm = con.con.prepareStatement("select * from veiculo order by id", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            con.rs = con.stm.executeQuery();
            con.rs.first();
            veiculo.removeAllItems();
            do {
                veiculo.addItem(new String(con.rs.getString("placa") + ":" + con.rs.getInt("id")));
            } while (con.rs.next());
            con.desconecta();
        } catch (SQLException ex) {
            Logger.getLogger(CadastraPonto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        buscabutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Dados = new javax.swing.JTable();
        veiculo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buscabutton.setText("Buscar");
        buscabutton.setToolTipText("Limpa o filtro de pesquisa");
        buscabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscabuttonMouseClicked(evt);
            }
        });
        buscabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscabuttonActionPerformed(evt);
            }
        });

        Dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Dados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Dados);

        veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Listagem de Gastos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscabutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
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

    private void DadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DadosMouseClicked

    }//GEN-LAST:event_DadosMouseClicked

    private void buscabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscabuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscabuttonActionPerformed

    private void buscabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscabuttonMouseClicked
        preencherTabela(sql, column);
    }//GEN-LAST:event_buscabuttonMouseClicked

    private void veiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoActionPerformed

    public void preencherTabela(String SQL, String[] col) {
        ArrayList dados = new ArrayList();
        String[] colunas = col;
        ResultSet extra;
        con.conecta();
        try {
            String i = (String) veiculo.getSelectedItem();
            int in = i.lastIndexOf(":");
            in = Integer.valueOf(i.substring(in + 1));
            con.stm = con.con.prepareStatement("select est.nome cm.data_inicio, cm.data_fim, est.preco_minuto from comanda cm where id_veiculo = " + in + "join estacionamento est on (cm.id_estacionamento = est.id);", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            con.rs = con.stm.executeQuery();
            extra = con.rs;
            extra.first();
            do {
                con.stm = con.con.prepareStatement("SELECT EXTRACT(EPOCH FROM (" + extra.getTimestamp("data_fim") + " - " + extra.getTimestamp("data_inicio") + "))", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                con.rs = con.stm.executeQuery();
                con.rs.first();
                float tempo = con.rs.getFloat(1);
                dados.add(new Object[]{extra.getString("nome"), extra.getTimestamp("data_inicio"), extra.getTimestamp("data_fim"), tempo, tempo * extra.getFloat("preco_minuto")});
            } while (extra.next());

        } catch (SQLException e) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, e);
        }

        ModeloTabela tabela = new ModeloTabela(dados, colunas);
        Dados.setModel(tabela);
        con.desconecta();
    }

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
            java.util.logging.Logger.getLogger(ListaGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Dados;
    private javax.swing.JButton buscabutton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> veiculo;
    // End of variables declaration//GEN-END:variables
}
