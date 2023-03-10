/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalprojectnew;

/**
 *
 * @author Gihani Kulasinghe
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        panelButtons = new javax.swing.JPanel();
        btnwarrenty = new javax.swing.JButton();
        btnAquTai = new javax.swing.JButton();
        btnPlant3000 = new javax.swing.JButton();
        btnPlant5000 = new javax.swing.JButton();
        btnPlant10000 = new javax.swing.JButton();
        panelTopic = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        btnRepair = new javax.swing.JButton();
        btnPurhase = new javax.swing.JButton();
        btnUpdateCustomer = new javax.swing.JButton();
        btnTechReg = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();
        panelLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setResizable(false);

        panelButtons.setBackground(new java.awt.Color(153, 255, 153));

        btnwarrenty.setBackground(new java.awt.Color(0, 102, 153));
        btnwarrenty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnwarrenty.setText("Domestic(With Warranty)");
        btnwarrenty.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnwarrenty.setMaximumSize(new java.awt.Dimension(73, 25));
        btnwarrenty.setMinimumSize(new java.awt.Dimension(73, 25));
        btnwarrenty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwarrentyActionPerformed(evt);
            }
        });

        btnAquTai.setBackground(new java.awt.Color(0, 102, 153));
        btnAquTai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAquTai.setText("AquTai");
        btnAquTai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAquTai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAquTaiActionPerformed(evt);
            }
        });

        btnPlant3000.setBackground(new java.awt.Color(0, 102, 153));
        btnPlant3000.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPlant3000.setText("3000L Plant");
        btnPlant3000.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlant3000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlant3000ActionPerformed(evt);
            }
        });

        btnPlant5000.setBackground(new java.awt.Color(0, 102, 153));
        btnPlant5000.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPlant5000.setText("5000L Plant ");
        btnPlant5000.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlant5000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlant5000ActionPerformed(evt);
            }
        });

        btnPlant10000.setBackground(new java.awt.Color(0, 102, 153));
        btnPlant10000.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPlant10000.setText("10000L Plant");
        btnPlant10000.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlant10000.setMaximumSize(new java.awt.Dimension(87, 23));
        btnPlant10000.setMinimumSize(new java.awt.Dimension(87, 23));
        btnPlant10000.setPreferredSize(new java.awt.Dimension(87, 23));
        btnPlant10000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlant10000ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonsLayout = new javax.swing.GroupLayout(panelButtons);
        panelButtons.setLayout(panelButtonsLayout);
        panelButtonsLayout.setHorizontalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnwarrenty, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
            .addComponent(btnAquTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPlant3000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPlant5000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPlant10000, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelButtonsLayout.setVerticalGroup(
            panelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonsLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnwarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAquTai, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlant3000, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlant5000, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlant10000, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTopic.setBackground(new java.awt.Color(153, 255, 255));

        lblTopic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectnew/main2.PNG"))); // NOI18N

        javax.swing.GroupLayout panelTopicLayout = new javax.swing.GroupLayout(panelTopic);
        panelTopic.setLayout(panelTopicLayout);
        panelTopicLayout.setHorizontalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTopicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );
        panelTopicLayout.setVerticalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopicLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );

        panelBody.setBackground(new java.awt.Color(153, 255, 255));

        btnRepair.setBackground(new java.awt.Color(51, 153, 0));
        btnRepair.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnRepair.setText("Repair");
        btnRepair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairActionPerformed(evt);
            }
        });

        btnPurhase.setBackground(new java.awt.Color(51, 153, 0));
        btnPurhase.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnPurhase.setText("Purchase");
        btnPurhase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPurhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurhaseActionPerformed(evt);
            }
        });

        btnUpdateCustomer.setBackground(new java.awt.Color(51, 153, 0));
        btnUpdateCustomer.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnUpdateCustomer.setText("Update Customer");
        btnUpdateCustomer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomerActionPerformed(evt);
            }
        });

        btnTechReg.setBackground(new java.awt.Color(51, 153, 0));
        btnTechReg.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnTechReg.setText("Technician Registration");
        btnTechReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTechReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTechRegActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(0, 102, 153));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setText("Log-out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btnCount.setBackground(new java.awt.Color(51, 153, 0));
        btnCount.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        btnCount.setText("Count");
        btnCount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(33, 33, 33))
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTechReg, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPurhase, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPurhase, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTechReg, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addContainerGap())
        );

        panelLogo.setBackground(new java.awt.Color(153, 255, 153));

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectnew/drop.PNG"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLogoLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(lblLogo1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLogoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblLogo1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTopic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTopic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(716, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlant3000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlant3000ActionPerformed
        dispose();
        new Plant3000L().setVisible(true);
    }//GEN-LAST:event_btnPlant3000ActionPerformed

    private void btnAquTaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAquTaiActionPerformed
        dispose();
        new AquTaiForm().setVisible(true);
    }//GEN-LAST:event_btnAquTaiActionPerformed

    private void btnPlant5000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlant5000ActionPerformed
        dispose();
        new Plant5000L().setVisible(true);
    }//GEN-LAST:event_btnPlant5000ActionPerformed

    private void btnPurhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurhaseActionPerformed
         dispose();
        new CustomerRegistrationForm().setVisible(true);
    }//GEN-LAST:event_btnPurhaseActionPerformed

    private void btnUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomerActionPerformed
         dispose();
        new CustomerUpdateForm().setVisible(true);
    }//GEN-LAST:event_btnUpdateCustomerActionPerformed

    private void btnTechRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTechRegActionPerformed
        dispose();
        new TechnicianRegistrationForm().setVisible(true);
    }//GEN-LAST:event_btnTechRegActionPerformed

    private void btnwarrentyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwarrentyActionPerformed
        dispose();
        new DomesticWithWarranty().setVisible(true);
    }//GEN-LAST:event_btnwarrentyActionPerformed

    private void btnPlant10000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlant10000ActionPerformed
        dispose();
        new Plant10000L().setVisible(true);
    }//GEN-LAST:event_btnPlant10000ActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        dispose();
        new PasswordForm().setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        dispose();
        new RepairForm().setVisible(true);
    }//GEN-LAST:event_btnRepairActionPerformed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        // TODO add your handling code here:
        dispose();
        new CountsForm().setVisible(true);
    }//GEN-LAST:event_btnCountActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAquTai;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnPlant10000;
    private javax.swing.JButton btnPlant3000;
    private javax.swing.JButton btnPlant5000;
    private javax.swing.JButton btnPurhase;
    private javax.swing.JButton btnRepair;
    private javax.swing.JButton btnTechReg;
    private javax.swing.JButton btnUpdateCustomer;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnwarrenty;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelTopic;
    // End of variables declaration//GEN-END:variables
}
