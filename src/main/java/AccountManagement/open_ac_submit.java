/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package AccountManagement;

import Main.DB_Connection;
import Main.LoginPage;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Random;

/**
 *
 * @author niebz
 */
public class open_ac_submit extends javax.swing.JDialog {

    /**
     * Creates new form open_ac_submit
     */

    private String ac_number = null, bank_id = null, customer_name = null, ac_balance = null;
    private String current_id = LoginPage.currentid();

    public open_ac_submit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ac_name_label = new javax.swing.JLabel();
        ac_balance_label = new javax.swing.JLabel();
        bank_name_label = new javax.swing.JLabel();
        open_ac_submit_btn = new javax.swing.JButton();
        ac_number_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Account Infomation");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Account name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Bank name :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Account balance :");

        ac_name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ac_name_label.setText("#####");

        ac_balance_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ac_balance_label.setText("#####");

        bank_name_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bank_name_label.setText("#####");

        open_ac_submit_btn.setText("Submit");
        open_ac_submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_ac_submit_btnActionPerformed(evt);
            }
        });

        ac_number_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ac_number_label.setText("#####");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Account number :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(open_ac_submit_btn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ac_number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ac_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bank_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ac_balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ac_number_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ac_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bank_name_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ac_balance_label))
                .addGap(18, 18, 18)
                .addComponent(open_ac_submit_btn)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void open_ac_submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_ac_submit_btnActionPerformed
        // TODO add your handling code here:

        String bank_name = open_ac.getBank_selected_name();
        ac_balance = open_ac.getInput_money_openAc();
        current_id = LoginPage.currentid();

        String query;
        boolean temp;
        ResultSet rs = null;
        DB_Connection db = new DB_Connection();

        try {
            query = String.format("SELECT bank_id FROM bank WHERE bank_name='%s'",bank_name);
            rs = db.getResultSet(query);
            rs.next();
            bank_id = rs.getString(1);
            rs.close();
            db.disconnect();

            query = String.format("SELECT customer_name FROM customers WHERE customer_id='%s'",current_id);
            rs = db.getResultSet(query);
            rs.next();
            customer_name = rs.getString(1);
            rs.close();
            db.disconnect();

            query = String.format("INSERT INTO account VALUES('%s','%s','%s','%s','%s');",current_id,ac_number,bank_id,customer_name,ac_balance);
            temp = db.execute(query);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error : "+e);
            temp = false;
        }

        if(temp){
            JOptionPane.showMessageDialog(this, "Success");
        }else JOptionPane.showMessageDialog(this, "Fail");
        //

    }//GEN-LAST:event_open_ac_submit_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String query = null;
        String bank_name = open_ac.getBank_selected_name();
        ac_balance = open_ac.getInput_money_openAc();
        current_id = LoginPage.currentid();
        ResultSet rs = null;
        DB_Connection db = new DB_Connection();
        Random rd = new Random();
        boolean temp;
        try {
            do {
                ac_number = String.valueOf(rd.nextInt(100000));
                query = String.format("SELECT ac_number FROM account WHERE customer_id='%s'",current_id);
                rs = db.getResultSet(query);
                rs.next();
                if(rs.getString(1).equals(ac_number) ){
                    temp = true;
                }else temp = false;
                rs.close();
                db.disconnect();
            }while (temp);

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error : "+e);
        }

        try{

            query = String.format("SELECT customer_name FROM customers WHERE customer_id='%s'",current_id);
            rs = db.getResultSet(query);
            rs.next();
            customer_name = rs.getString(1);
            rs.close();
            db.disconnect();

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error : "+e);
        }


        ac_number_label.setText(ac_number);
        ac_name_label.setText(customer_name);
        bank_name_label.setText(bank_name);
        ac_balance_label.setText(ac_balance);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(open_ac_submit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(open_ac_submit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(open_ac_submit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(open_ac_submit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                open_ac_submit dialog = new open_ac_submit(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel ac_balance_label;
    private javax.swing.JLabel ac_name_label;
    private javax.swing.JLabel ac_number_label;
    private javax.swing.JLabel bank_name_label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton open_ac_submit_btn;
    // End of variables declaration//GEN-END:variables
}