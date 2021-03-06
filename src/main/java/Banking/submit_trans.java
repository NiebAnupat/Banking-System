/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Banking;

import Main.DB_Connection;
import Main.LoginPage;
import Main.Method;
import java.awt.Toolkit;

import javax.swing.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author niebz
 */
public class submit_trans extends javax.swing.JDialog {

    /**
     * Creates new form submit_trans
     */

    String ac_number_treansferor ;
    String ac_number_recipiebt ;
    String bank_name_recipiebt ;
    String bank_id_recipiebt;
    Double money_input = Double.parseDouble(transfer.money_input_st);

    public submit_trans(java.awt.Frame parent, boolean modal) {
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

        trans_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ac_number_transferor = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bank_name_transferor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_transferor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name_reciever = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bank_name_reciever = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ac_number_reciever = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amount_of_transfer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        trans_cancel_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 447));
        setResizable(false);
        setSize(new java.awt.Dimension(370, 447));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        trans_btn.setFont(new java.awt.Font("RSU", 0, 14)); // NOI18N
        trans_btn.setText("Transfer");
        trans_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("RSU", 1, 36)); // NOI18N
        jLabel1.setText("Transfers");

        jLabel2.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel2.setText("account number : ");

        ac_number_transferor.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        ac_number_transferor.setText("######");

        jLabel4.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel4.setText("Bank : ");

        bank_name_transferor.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        bank_name_transferor.setText("######");

        jLabel6.setFont(new java.awt.Font("RSU", 0, 24)); // NOI18N
        jLabel6.setText("To");

        jLabel5.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel5.setText("Name : ");

        name_transferor.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        name_transferor.setText("######");

        jLabel7.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel7.setText("Name : ");

        name_reciever.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        name_reciever.setText("######");

        jLabel8.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel8.setText("Bank : ");

        bank_name_reciever.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        bank_name_reciever.setText("######");

        jLabel3.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel3.setText("account number : ");

        ac_number_reciever.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        ac_number_reciever.setText("######");

        jLabel9.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel9.setText("Amount of transfer :");

        amount_of_transfer.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        amount_of_transfer.setText("######");

        jLabel10.setFont(new java.awt.Font("RSU", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("__________________________________________________");

        trans_cancel_btn.setFont(new java.awt.Font("RSU", 0, 14)); // NOI18N
        trans_cancel_btn.setText("Cancel");
        trans_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trans_cancel_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_transferor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_reciever))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trans_cancel_btn)
                        .addGap(16, 16, 16)
                        .addComponent(trans_btn))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bank_name_reciever))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ac_number_transferor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ac_number_reciever))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amount_of_transfer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bank_name_transferor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ac_number_transferor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bank_name_transferor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name_transferor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ac_number_reciever))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bank_name_reciever))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(name_reciever))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(amount_of_transfer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trans_cancel_btn)
                    .addComponent(trans_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trans_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_btnActionPerformed
        // TODO add your handling code here:
        String query;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfSql = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        String dateSql = sdfSql.format(new Date());
        boolean temp1,temp2,temp3,temp4,temp5;
        try{

            query = String.format("SELECT bank_id FROM account WHERE ac_number = '%s'",transfer.ac_number_treansferor);
            DB_Connection db = new DB_Connection();
            ResultSet  rs = db.getResultSet(query);
            rs.next();
            String bank_id = rs.getString(1);

            query = String.format("SELECT bank_balance FROM bank WHERE bank_id = '%s';",bank_id);
            rs = db.getResultSet(query);
            rs.next();
            Double bank_balance = rs.getDouble(1);

            if (money_input > bank_balance) throw new Exception("Your bank not enough money");

            Double update_balance_transferor = transfer.update_balance_transferor;
            query = String.format("UPDATE account SET ac_balance = '%s' WHERE ac_number = '%s'",update_balance_transferor,transfer.ac_number_treansferor);
            temp1= db.execute(query);
            db.disconnect();

            Double update_balance_recipiebt = transfer.update_balance_recipiebt;
            query = String.format("UPDATE account SET ac_balance = '%f' WHERE ac_number = '%s'",update_balance_recipiebt,transfer.ac_number_recipiebt);
            temp2 = db.execute(query);
            db.disconnect();

            query = String.format("INSERT INTO moneytransfer (tf_money,ac_number_treansferor,ac_number_recipiebt) VALUES ('%f','%s','%s');",money_input,transfer.ac_number_treansferor,transfer.ac_number_recipiebt);
            temp3 = db.execute(query);
            db.disconnect();

            query = String.format("SELECT MAX(tf_id) FROM moneytransfer ;");
            rs = db.getResultSet(query);
            rs.next();
            String tf_id = rs.getString(1);
            query = String.format("INSERT INTO total_statement (stm_date,type_id,ac_number,banking_id,amount) VALUES ('%s','%d','%s','%s','%f');",dateSql,3,transfer.ac_number_treansferor,tf_id,money_input);
            temp4 = db.execute(query);

            query = String.format("UPDATE bank SET bank_balance = (SELECT  sum(ac_balance) FROM account WHERE bank_id = '%s') WHERE bank_id ='%s';",bank_id,bank_id);
            temp5 = db.execute(query);

        }catch(Exception e){
            temp1 = false;
            temp2 = false;
            temp3 = false;
            temp4 = false;
            temp5 = false;
            Method.displayError(e.getMessage());
        }

        if ((temp1) && (temp2) && (temp3) && (temp4 && (temp5))){
            Method.displayInfo("You have transferred amount : "+money_input+" ???\nTransaction time : "+date);
            Method.displayInfo("Transfer Succeed");
            this.dispose();
        }else {
            Method.displayError("Transfer Failed");
            this.dispose();
        }

    }//GEN-LAST:event_trans_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        int lebar = this.getWidth()/2;
        int tinggi = this.getHeight()/2;
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width/2)-lebar;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height/2)-tinggi;
        this.setLocation(x, y);
        
        ac_number_transferor.setText(transfer.ac_number_treansferor);

        String query = String.format("SELECT bank_id FROM account WHERE ac_number = '%s';",transfer.ac_number_treansferor);
        String bank_id_transferor = null;
        String bank_name_transferor_st = null;
        String name_transferor_st = null;
        String name_reciever_st = null;
        try {
            DB_Connection db = new DB_Connection();
            ResultSet rs = db.getResultSet(query);
            if (rs.next()){
                bank_id_transferor = rs.getString(1);
            }
            else throw new Exception();
            db.disconnect();

            query = String.format("SELECT bank_name From bank WHERE bank_id = '%s'",bank_id_transferor);
            rs = db.getResultSet(query);
            if (rs.next()) {
                bank_name_transferor_st = rs.getString(1);
            }
            else throw new Exception();
            db.disconnect();

            query = String.format("SELECT ac_name FROM account WHERE ac_number = '%s'",transfer.ac_number_treansferor );
            rs = db.getResultSet(query);
            if (rs.next()){
                name_transferor_st = rs.getString(1);
            }
            else throw new Exception();
            db.disconnect();

            query = String.format("SELECT ac_name FROM account WHERE ac_number = '%s'",transfer.ac_number_recipiebt);
            rs = db.getResultSet(query);
            if (rs.next()){
                name_reciever_st = rs.getString(1);
            }
            else throw new Exception();
            db.disconnect();


        }catch(Exception e){

        }

        bank_name_transferor.setText(bank_name_transferor_st);
        name_transferor.setText(name_transferor_st);
        ac_number_reciever.setText(transfer.ac_number_recipiebt);
        bank_name_reciever.setText(transfer.bank_name_recipiebt);
        name_reciever.setText(name_reciever_st);
        amount_of_transfer.setText(transfer.money_input_st+" ???");

    }//GEN-LAST:event_formWindowOpened

    private void trans_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trans_cancel_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_trans_cancel_btnActionPerformed

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
            java.util.logging.Logger.getLogger(submit_trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submit_trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submit_trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submit_trans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                submit_trans dialog = new submit_trans(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel ac_number_reciever;
    private javax.swing.JLabel ac_number_transferor;
    private javax.swing.JLabel amount_of_transfer;
    private javax.swing.JLabel bank_name_reciever;
    private javax.swing.JLabel bank_name_transferor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name_reciever;
    private javax.swing.JLabel name_transferor;
    private javax.swing.JButton trans_btn;
    private javax.swing.JButton trans_cancel_btn;
    // End of variables declaration//GEN-END:variables
}
