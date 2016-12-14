package InterfaceGrafica;

import Database.ConexaoJDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class CadastraPonto extends javax.swing.JFrame {

    MaskFormatter mask;
    MaskFormatter mask2;
    ConexaoJDBC con = new ConexaoJDBC();

    public CadastraPonto() {
        try {
            this.mask = new MaskFormatter("##/##/####");
            this.mask.setPlaceholderCharacter('_');
            this.mask2 = new MaskFormatter("##:##:##");
            this.mask2.setPlaceholderCharacter('_');

            initComponents();
            atualizaCombo();
        } catch (ParseException ex) {
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
        jLabel1 = new javax.swing.JLabel();
        longilabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField(mask);
        veiculo = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        latitude = new javax.swing.JFormattedTextField();
        longitude = new javax.swing.JFormattedTextField();
        latLabel = new javax.swing.JLabel();
        hora = new javax.swing.JFormattedTextField(mask2);
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data");

        longilabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        longilabel.setText("Longitude");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Veiculo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cadastro de Pontos");

        salvar.setText("Salvar");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarMouseClicked(evt);
            }
        });

        latLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        latLabel.setText("Latitude");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(latLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(196, 196, 196))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(longilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(longitude, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(21, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(longitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longilabel))
                .addGap(18, 18, 18)
                .addComponent(salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarMouseClicked
        String pontemp1;
        String pontemp2;
        String ID;
        float diferenca;
        float distancia;
        String estacionamento = "";
        ResultSet auxiliar;
        try {
            con.conecta();
            String i = (String) veiculo.getSelectedItem();
            int in = i.lastIndexOf(":");
            in = Integer.valueOf(i.substring(in + 1));
            con.stm = con.con.prepareStatement("insert into ponto (pointo,data,id_veiculo) values (ST_GeomFromText('POINT(" + longitude.getText() + " " + latitude.getText() + ")',4326),to_timestamp('" + data.getText() + " " + hora.getText() + "', 'DD/MM/YYYY hh24:mi:ss'),"+in+")");
//            con.stm.setString(1, longitude.getText() + " " + latitude.getText());
//            con.stm.setString(1, data.getText() + " " + hora.getText());
            con.stm.execute();
            con.stm = con.con.prepareStatement("select id,data,st_astext(pointo) as pointo,id_veiculo from ponto order by id", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            con.rs = con.stm.executeQuery();
            con.rs.first();
            if (con.rs.isLast()) {
                ID = con.rs.getString(1);
                if (MenuPrincipal.testaEstacionamento(con.rs.getString("pointo"))) {
                    con.stm = con.con.prepareStatement("select nome from estacionamento where id = " + MenuPrincipal.id, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    con.rs = con.stm.executeQuery();
                    estacionamento = " e no estacionamento " + con.rs.getString(1);
                }
                JOptionPane.showMessageDialog(null, "Primeiro ponto" + estacionamento);
            } else {
                con.rs.last();
                ID = con.rs.getString(1);
                con.rs.previous();
                pontemp1 = con.rs.getString("data");
                con.rs.next();
                pontemp2 = con.rs.getString("data");
                auxiliar = con.getRs();
                con.stm = con.con.prepareStatement("SELECT EXTRACT(EPOCH FROM (to_timestamp('" + pontemp2 + "', 'YYYY/MM/DD hh24:mi:ss') - to_timestamp('" + pontemp1 + "', 'YYYY/MM/DD hh24:mi:ss')))", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                con.rs = con.stm.executeQuery();
                con.rs.first();
                diferenca = con.rs.getFloat(1);
                auxiliar.last();
                pontemp1 = auxiliar.getString("pointo");
                auxiliar.previous();
                pontemp2 = auxiliar.getString("pointo");
                con.stm = con.con.prepareStatement("select ST_Distance_Sphere(ST_GeomFromText('" + pontemp2 + "',4326),ST_GeomFromText('" + pontemp1 + "',4326))", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                con.rs = con.stm.executeQuery();
                con.rs.first();
                distancia = con.rs.getFloat(1);
                auxiliar.last();
                if (MenuPrincipal.testaEstacionamento(auxiliar.getString("pointo"))) {
                    con.stm = con.con.prepareStatement("select nome from estacionamento where id = " + MenuPrincipal.id, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    con.rs = con.stm.executeQuery();
                    con.rs.first();
                    estacionamento = " e no estacionamento " + con.rs.getString(1);
                } else {
                }
                JOptionPane.showMessageDialog(null, "Ponto incluido com sucesso e está a " + ((distancia / diferenca) * 3.6) + estacionamento);
            }
            con.desconecta();
            dispose();
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir ponto : " + e.getMessage());
        }
    }//GEN-LAST:event_salvarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastraPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraPonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastraPonto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel latLabel;
    private javax.swing.JFormattedTextField latitude;
    private javax.swing.JLabel longilabel;
    private javax.swing.JFormattedTextField longitude;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> veiculo;
    // End of variables declaration//GEN-END:variables
}
