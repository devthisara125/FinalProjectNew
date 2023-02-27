/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalprojectnew;

/**
 *
 * @author Gihani Kulasinghe
 */
public class AquTaiForm extends javax.swing.JFrame {

    /**
     * Creates new form AquTaiForm
     */
    public AquTaiForm() {
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

        lblLogo = new javax.swing.JLabel();
        panelTopic = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        PanelBody = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblAqutia = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblWarrantyPeriod = new javax.swing.JLabel();
        lblNoOfMonths = new javax.swing.JLabel();
        lblFeatures = new javax.swing.JLabel();
        lblFeature1 = new javax.swing.JLabel();
        lblFeature2 = new javax.swing.JLabel();
        lblFeature3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectnew/drop.PNG"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelTopic.setBackground(new java.awt.Color(153, 255, 255));

        lblTopic.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTopic.setText("AquTai Water Filter");

        javax.swing.GroupLayout panelTopicLayout = new javax.swing.GroupLayout(panelTopic);
        panelTopic.setLayout(panelTopicLayout);
        panelTopicLayout.setHorizontalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopicLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        panelTopicLayout.setVerticalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopicLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lblTopic)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        getContentPane().add(panelTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 570, 190));

        PanelBody.setBackground(new java.awt.Color(204, 255, 204));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblAqutia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectnew/Aqutia1.PNG"))); // NOI18N

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrice.setText("Price                    :");

        lblPrice2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrice2.setText("Rs.80,000/=");

        lblWarrantyPeriod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWarrantyPeriod.setText("Warranty period  :");

        lblNoOfMonths.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNoOfMonths.setText("12 Months");

        lblFeatures.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFeatures.setText("Features              :");

        lblFeature1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFeature1.setText("Alkaline purified RO water  ");

        lblFeature2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFeature2.setText("Normal,hot,cold water");

        lblFeature3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFeature3.setText("Ozone fruit vegetable meat purifier");

        javax.swing.GroupLayout PanelBodyLayout = new javax.swing.GroupLayout(PanelBody);
        PanelBody.setLayout(PanelBodyLayout);
        PanelBodyLayout.setHorizontalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblWarrantyPeriod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblFeatures))
                .addGap(33, 33, 33)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFeature1)
                    .addComponent(lblPrice2)
                    .addComponent(lblNoOfMonths, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFeature2)
                    .addComponent(lblFeature3))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                        .addComponent(lblAqutia, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        PanelBodyLayout.setVerticalGroup(
            PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAqutia)
                .addGap(55, 55, 55)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(lblPrice2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarrantyPeriod)
                    .addComponent(lblNoOfMonths))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeatures)
                    .addComponent(lblFeature1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFeature2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFeature3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(PanelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        setSize(new java.awt.Dimension(716, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AquTaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AquTaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AquTaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AquTaiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AquTaiForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBody;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAqutia;
    private javax.swing.JLabel lblFeature1;
    private javax.swing.JLabel lblFeature2;
    private javax.swing.JLabel lblFeature3;
    private javax.swing.JLabel lblFeatures;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNoOfMonths;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblWarrantyPeriod;
    private javax.swing.JPanel panelTopic;
    // End of variables declaration//GEN-END:variables
}