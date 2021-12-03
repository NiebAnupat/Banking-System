/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Banking;

import Main.DB_Connection;
import Main.LoginPage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author niebz
 */
public class deposit extends javax.swing.JDialog {

    /**
     * Creates new form deposit
     */
    public deposit(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        view_ac_table = new javax.swing.JTable();
        deposit_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Deposit");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select your account : ");

        view_ac_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 4"
            }
        ));
        view_ac_table.setPreferredSize(new java.awt.Dimension(200, 200));
        view_ac_table.setShowGrid(true);
        jScrollPane1.setViewportView(view_ac_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        deposit_btn.setText("Deposit");
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });

        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(back_btn, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deposit_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(back_btn))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deposit_btnActionPerformed
        // TODO add your handling code here:

        String ac_number = view_ac_table.getValueAt(view_ac_table.getSelectedRow(),1).toString();
        String ac_balance_st = null;
        //String date = null;


        String query = String.format("SELECT ac_balance FROM account WHERE ac_number = '%s'",ac_number);

        try {
            DB_Connection db = new DB_Connection();
            ResultSet rs = db.getResultSet(query);
            rs.next();
            ac_balance_st = rs.getString(1);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : "+e);
        }

        Double money_input = Double.parseDouble(JOptionPane.showInputDialog("Amount to deposit : "));
        Double ac_balance = money_input + Double.parseDouble(ac_balance_st);
        boolean temp;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfSql = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        String dateSql = sdfSql.format(new Date());

        try{
            query = String.format("UPDATE account SET ac_balance = '%f' WHERE ac_number = '%s' ;",ac_balance,ac_number);
            DB_Connection db = new DB_Connection();
            temp = db.execute(query);

            query = String.format("INSERT INTO moneydeposit (dp_money,ac_number) VALUES ('%f','%s');",money_input,ac_number);
            temp = db.execute(query);

            query = String.format("SELECT MAX(dp_id) FROM moneydeposit ;");
            ResultSet rs = db.getResultSet(query);
            rs.next();
            String dp_id = rs.getString(1);
            query = String.format("INSERT INTO total_statement (stm_date,type_id,banking_id,amount) VALUES ('%s','%d','%s','%f')",dateSql,1,dp_id,money_input);
            temp = db.execute(query);

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : "+e);
            temp = false;
        }



        if (temp){
            JOptionPane.showMessageDialog(this, "You have deposited amount : "+money_input+" ฿\nTransaction time : "+date);
            JOptionPane.showMessageDialog(this,"Successful deposit");
        }
        else JOptionPane.showMessageDialog(this,"Deposit failed");

        
    }//GEN-LAST:event_deposit_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setTable();

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    private void setTable(){

        String current_id = LoginPage.currentid();
        String[] fieldName = {"#","Account Number","Bank"};
        DefaultTableModel model = new DefaultTableModel(fieldName,0);

        String query = String.format("SELECT ac_number , bank.bank_name " +
                "FROM account INNER JOIN bank " +
                "ON account.bank_id = bank.bank_id " +
                "WHERE customer_id = '%s';",current_id);

        try {
            DB_Connection db = new DB_Connection();
            ResultSet rs = db.getResultSet(query);
            int i = 0;
            while (rs.next()){
                i++;
                String ac_number = rs.getString(1);
                String  bank_name = rs.getString(2);
                String[] row = {String.valueOf(i),ac_number,bank_name};

                model.addRow(row);
            }
            db.disconnect();
            view_ac_table.setModel(model);

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error : "+e);
        }
    }

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
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                deposit dialog = new deposit(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton back_btn;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable view_ac_table;
    // End of variables declaration//GEN-END:variables
}
