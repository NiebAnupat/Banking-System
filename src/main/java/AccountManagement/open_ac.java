/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package AccountManagement;

import Main.DB_Connection;
import Main.LoginPage;
import Main.Method;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author niebz
 */
public class open_ac extends javax.swing.JDialog {

    /**
     * Creates new form open_ac
     */

    private String ac_number = null, bank_id = null, customer_name = null, ac_balance = null;
    private String current_id = LoginPage.currentid();

    public open_ac(java.awt.Frame parent, boolean modal) {
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

        open_ac_next_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bank_combobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        money_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(458, 147));
        setResizable(false);
        setSize(new java.awt.Dimension(458, 147));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        open_ac_next_btn.setFont(new java.awt.Font("RSU", 0, 14)); // NOI18N
        open_ac_next_btn.setText("Next");
        open_ac_next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_ac_next_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("RSU", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Open an account");

        bank_combobox.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        bank_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bank_combobox.setMinimumSize(new java.awt.Dimension(500, 400));
        bank_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bank_comboboxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("RSU", 0, 24)); // NOI18N
        jLabel4.setText("Input money");

        jLabel5.setFont(new java.awt.Font("RSU", 0, 24)); // NOI18N
        jLabel5.setText("Choose bank");

        money_input.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(open_ac_next_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(bank_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(money_input, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(money_input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addComponent(bank_combobox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(open_ac_next_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void open_ac_next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_ac_next_btnActionPerformed
        // TODO add your handling code here:

        if (Method.isNumeric(money_input.getText())){
            if(!money_input.getText().equals("")){
                this.setVisible(false);
                open_ac_submit ac_submit = new open_ac_submit(null,false);
                ac_submit.setVisible(true);
            }else {
                Method.displayError("Please enter your money for open an account!");
            }
        }else Method.displayError("Please enter number");


    }//GEN-LAST:event_open_ac_next_btnActionPerformed

    private void bank_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bank_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bank_comboboxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        String query;
        DB_Connection db = new DB_Connection();
        ResultSet rs = null;

        try {
            query = String.format("SELECT bank_name FROM Bank");
            rs = db.getResultSet(query);
            while (rs.next()) {
                bank_combobox.addItem(rs.getString(1));
            }
        }catch (Exception e) {
            Method.displayError("Error : "+e);
        }

        
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
            java.util.logging.Logger.getLogger(open_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(open_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(open_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(open_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                open_ac dialog = new open_ac(new javax.swing.JFrame(), true);
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


    public static String getBank_selected_name (){ return String.valueOf(bank_combobox.getSelectedItem()); }


    public static String getInput_money_openAc (){
        return String.valueOf(money_input.getText()); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JComboBox<String> bank_combobox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    protected static javax.swing.JTextField money_input;
    private javax.swing.JButton open_ac_next_btn;
    // End of variables declaration//GEN-END:variables
}
