/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Simanta
 */
public class AddNewProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddNewProduct
     */
    DBConnection db = new DBConnection();
    public AddNewProduct() {
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

        dealerField = new javax.swing.JTextField();
        addProductBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productField = new javax.swing.JTextField();
        addnewproductLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dealerField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dealerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerFieldActionPerformed(evt);
            }
        });

        addProductBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addProductBtn.setText("Add Product");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Product Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Dealer ID");

        productField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productFieldActionPerformed(evt);
            }
        });

        addnewproductLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        addnewproductLabel.setText("Add New Product");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addComponent(addnewproductLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(productField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dealerField, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addnewproductLabel)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dealerField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerFieldActionPerformed
    
    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        // TODO add your handling code here:
        try{
            if(productField.getText().isEmpty()||dealerField.getText().isEmpty())
            {
                jOptionPane1.showMessageDialog(null, "Fill up all the fields");
            }

            else{
                String SQL1 ="SELECT * FROM DEALER WHERE DealerName='"+dealerField.getText()+ "'";
                Statement statement=db.connection().createStatement();
                ResultSet namecheck = statement.executeQuery(SQL1);

                if(namecheck.next()){
                    String query="INSERT INTO PRODUCT (ProductName,Dealer) values (?,?)";
                    PreparedStatement pStatement = db.connection().prepareStatement(query);
                    pStatement.setString(1, productField.getText());
                    pStatement.setString(2, dealerField.getText());
                    pStatement.execute();
                    pStatement.close();
                    jOptionPane1.showMessageDialog(null, "This Product is added.");
                   
                    String q1 = "SELECT * FROM PRODUCT WHERE ProductName ='"+productField.getText()+"'";
                    System.out.println(productField.getText());
                    Statement statement1=db.connection().createStatement();
                    ResultSet namecheck1 = statement1.executeQuery(q1);
                    String q2 = "INSERT INTO STOCK(Stock, ProductId) VALUES(?, ?)";
                    PreparedStatement pStatement1 = db.connection().prepareStatement(q2);
                    int stt = 1;
                    if ( namecheck1.next() ) {
                        stt = namecheck1.getInt("ProductId");
                    }
                    pStatement1.setInt(1, 0);
                    pStatement1.setInt(2, stt);
                    pStatement1.execute();
                    pStatement1.close();
                    dealerField.setText("");
                    productField.setText("");
                }
                else{
                    jOptionPane1.showMessageDialog(null, "This Dealer ID is missing.");

                }

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_addProductBtnActionPerformed

    private void productFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminPanel ob= new AdminPanel();
        this.setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewProduct().setVisible(true);
               
            }
        });
    }
    private javax.swing.JOptionPane jOptionPane1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBtn;
    private javax.swing.JLabel addnewproductLabel;
    private javax.swing.JTextField dealerField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField productField;
    // End of variables declaration//GEN-END:variables
}
