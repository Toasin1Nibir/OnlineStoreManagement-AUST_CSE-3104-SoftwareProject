/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.SwingConstants;
/**
 *
 * @author Simanta
 */
public class Benefit extends javax.swing.JFrame {

    /**
     * Creates new form Benefit
     */
    DBConnection db = new DBConnection();
    public Benefit() {
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

        jLabel1 = new javax.swing.JLabel();
        PurchaseShow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        BenifitShow = new javax.swing.JTextField();
        TotalLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TotalPurchaseText = new javax.swing.JTextField();
        TotalSaleText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("From");

        PurchaseShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PurchaseShow.setText("Show Benifit");
        PurchaseShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseShowActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("To");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jXDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker1ActionPerformed(evt);
            }
        });

        jXDatePicker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker2ActionPerformed(evt);
            }
        });

        BenifitShow.setEditable(false);
        BenifitShow.setBackground(new java.awt.Color(255, 255, 255));
        BenifitShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BenifitShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenifitShowActionPerformed(evt);
            }
        });

        TotalLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TotalLabel.setText("Total Sale");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Total Purchase");

        TotalPurchaseText.setEditable(false);
        TotalPurchaseText.setBackground(new java.awt.Color(255, 255, 255));
        TotalPurchaseText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalPurchaseText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPurchaseTextActionPerformed(evt);
            }
        });

        TotalSaleText.setEditable(false);
        TotalSaleText.setBackground(new java.awt.Color(255, 255, 255));
        TotalSaleText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalSaleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalSaleTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TotalPurchaseText, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addComponent(TotalSaleText)))
                            .addComponent(BenifitShow, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PurchaseShow, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(PurchaseShow, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TotalPurchaseText, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(TotalLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TotalSaleText)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BenifitShow, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PurchaseShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseShowActionPerformed
        // TODO add your handling code here:

        Date Date1 = jXDatePicker1.getDate();
        DateFormat oDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String sDate1 = oDateFormat1.format(Date1);
        Date Date2 = jXDatePicker2.getDate();
        DateFormat oDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        String sDate2 = oDateFormat2.format(Date2);
        double PurchaseSum=0;
        try{
            String sql3="SELECT SUM(PurchaseTotal) AS TS FROM PURCHASE WHERE PurchaseDate BETWEEN '"+sDate1+"' AND '"+sDate2+"'";
            PreparedStatement st = db.connection().prepareStatement(sql3);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                PurchaseSum= rs.getFloat("TS");
            }
            System.out.println(PurchaseSum);
            TotalPurchaseText.setHorizontalAlignment(SwingConstants.RIGHT);
            TotalPurchaseText.setText(Double.toString(PurchaseSum));
            db.connection().close();
        }
        catch(SQLException ex){

        }
        double SaleSum=0;
        try{
            String sql3="SELECT SUM(SaleTotal) AS TS FROM Sale WHERE SaleDate BETWEEN '"+sDate1+"' AND '"+sDate2+"'";
            PreparedStatement st =db.connection().prepareStatement(sql3);

            ResultSet rs=st.executeQuery();
            if(rs.next()){
                SaleSum= rs.getFloat("TS");
            }
            System.out.println(SaleSum);
            TotalSaleText.setHorizontalAlignment(SwingConstants.RIGHT);
            TotalSaleText.setText(Double.toString(SaleSum));
            db.connection().close();
        }
        catch(SQLException ex){

        }
        

        double benifit=SaleSum-PurchaseSum;
        BenifitShow.setHorizontalAlignment(SwingConstants.CENTER);
        BenifitShow.setText("Benifit From "+sDate1+" to "+sDate2+" is TK. "+benifit);

    }//GEN-LAST:event_PurchaseShowActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminPanel ob= new AdminPanel();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
        jXDatePicker1.setFormats(new String[]{"yyyy-MM-dd"});
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void jXDatePicker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker2ActionPerformed
        // TODO add your handling code here:
        jXDatePicker2.setFormats(new String[]{"yyyy-MM-dd"});
    }//GEN-LAST:event_jXDatePicker2ActionPerformed

    private void BenifitShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenifitShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BenifitShowActionPerformed

    private void TotalPurchaseTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPurchaseTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPurchaseTextActionPerformed

    private void TotalSaleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalSaleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalSaleTextActionPerformed

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
            java.util.logging.Logger.getLogger(Benefit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Benefit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Benefit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Benefit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Benefit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BenifitShow;
    private javax.swing.JButton PurchaseShow;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JTextField TotalPurchaseText;
    private javax.swing.JTextField TotalSaleText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables
}
