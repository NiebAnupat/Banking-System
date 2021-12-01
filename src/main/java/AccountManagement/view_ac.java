/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package AccountManagement;

import Main.DB_Connection;
import Main.LoginPage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author niebz
 */
public class view_ac extends javax.swing.JDialog {

    /**
     * Creates new form view_ac
     */

    private String ac_number = null, bank_id = null, customer_name = null, ac_balance = null;
    private String current_id = LoginPage.currentid();

    public view_ac(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refresh_view_ac_btn = new javax.swing.JButton();
        back_view_ac_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        view_ac_pane = new javax.swing.JScrollPane();
        view_ac_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        refresh_view_ac_btn.setText("Refresh");
        refresh_view_ac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_view_ac_btnActionPerformed(evt);
            }
        });

        back_view_ac_btn.setText("Back");
        back_view_ac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_view_ac_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View your account");

        view_ac_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        view_ac_pane.setViewportView(view_ac_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refresh_view_ac_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back_view_ac_btn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(view_ac_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(view_ac_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refresh_view_ac_btn)
                    .addComponent(back_view_ac_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh_view_ac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_view_ac_btnActionPerformed
        // TODO add your handling code here:
        setTable();
    }//GEN-LAST:event_refresh_view_ac_btnActionPerformed

    private void back_view_ac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_view_ac_btnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_back_view_ac_btnActionPerformed

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
            java.util.logging.Logger.getLogger(view_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_ac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view_ac dialog = new view_ac(new javax.swing.JFrame(), true);
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

    private void setTable() {

        String current_id = LoginPage.currentid();
        String query = String.format
                ("SELECT ac_number, Bank.bank_name, ac_name, ac_balance " +
                "FROM Account " +
                "INNER JOIN Bank ON Account.bank_id = Bank.bank_id " +
                "WHERE customer_id='%s';",current_id);

        String[] fieldName = {"#","Number","Bank","Name","Balance"};
        DefaultTableModel model = new DefaultTableModel(fieldName,0);

        try {
            DB_Connection db = new DB_Connection();
            ResultSet rs = db.getResultSet(query);

            int i=0;
            while (rs.next()) {
                i++;
                String rownumber = String.valueOf(i);
                String ac_number = rs.getString("ac_number");
                String bank_id = rs.getString("bank_name");
                String ac_name = rs.getString("ac_name");
                String ac_balance = (rs.getString("ac_balance")+" ฿");
                String[] row = {rownumber,ac_number, bank_id, ac_name, ac_balance};

                model.addRow(row);
            }
            db.disconnect();

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : "+e);
        }

        view_ac_table.setModel(model);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_view_ac_btn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton refresh_view_ac_btn;
    private javax.swing.JScrollPane view_ac_pane;
    private javax.swing.JTable view_ac_table;
    // End of variables declaration//GEN-END:variables
}
