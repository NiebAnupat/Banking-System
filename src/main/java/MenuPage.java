import javax.swing.*;

public class MenuPage extends javax.swing.JFrame {

    public MenuPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        withdraw_btn = new javax.swing.JButton();
        manage_ac_btn = new javax.swing.JButton();
        deposit_btn = new javax.swing.JButton();
        summary_btn = new javax.swing.JButton();
        transfer_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        exit_btn1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        withdraw_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        withdraw_btn.setText("withdraw");
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });

        manage_ac_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        manage_ac_btn.setText("manage account");
        manage_ac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_ac_btnActionPerformed(evt);
            }
        });

        deposit_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        deposit_btn.setText("deposit");
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });

        summary_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        summary_btn.setText("summary");
        summary_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summary_btnActionPerformed(evt);
            }
        });

        transfer_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        transfer_btn.setText("transfer");
        transfer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_btnActionPerformed(evt);
            }
        });

        logout_btn.setFont(new java.awt.Font("Tahoma", 0, 14));
        logout_btn.setText("logout");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        exit_btn1.setFont(new java.awt.Font("Tahoma", 0, 14));
        exit_btn1.setText("exit");
        exit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manage_ac_btn)
                    .addComponent(deposit_btn)
                    .addComponent(withdraw_btn)
                    .addComponent(transfer_btn)
                    .addComponent(summary_btn)
                    .addComponent(logout_btn)
                    .addComponent(exit_btn1))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manage_ac_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deposit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transfer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(summary_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        pack();
    }

    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void manage_ac_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void summary_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void transfer_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this,"You are logging out");
        this.dispose();
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }

    private void exit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton exit_btn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton manage_ac_btn;
    private javax.swing.JButton summary_btn;
    private javax.swing.JButton transfer_btn;
    private javax.swing.JButton withdraw_btn;
    // End of variables declaration//GEN-END:variables
}
