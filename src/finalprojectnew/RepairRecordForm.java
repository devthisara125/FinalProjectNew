/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalprojectnew;
import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Gihani Kulasinghe
 */
public class RepairRecordForm extends javax.swing.JFrame {
    public String DB_URL;
    public String USER;
    public String PASS;
    public Connection conn;
    public Statement stmt;
    /**
     * Creates new form RepairRecordForm
     */
    public RepairRecordForm() {
        initComponents();
        DB_URL = "jdbc:mysql://localhost/FinalProject";
        USER = "root";
        PASS = "";
        conn = null;
        stmt = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTopic = new javax.swing.JPanel();
        lblTopic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNIC = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnNICclear = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        panelDetails = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblTP = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblFType = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        lblgetName = new javax.swing.JLabel();
        lblgetAddress = new javax.swing.JLabel();
        lblgetTP = new javax.swing.JLabel();
        lblgetEmail = new javax.swing.JLabel();
        lblgetArea = new javax.swing.JLabel();
        lblgetFtype = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTopic.setBackground(new java.awt.Color(153, 255, 255));

        lblTopic.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lblTopic.setText("Record Repair Request");

        javax.swing.GroupLayout panelTopicLayout = new javax.swing.GroupLayout(panelTopic);
        panelTopic.setLayout(panelTopicLayout);
        panelTopicLayout.setHorizontalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopicLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        panelTopicLayout.setVerticalGroup(
            panelTopicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTopicLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTopic)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(panelTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblNIC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNIC.setText("NIC");

        txtNIC.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnSearch.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnNICclear.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        btnNICclear.setText("Clear");
        btnNICclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNICclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblNIC)
                .addGap(30, 30, 30)
                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNICclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(129, 129, 129))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNICclear))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNIC)
                            .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 700, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalprojectnew/drop.PNG"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelDetails.setBackground(new java.awt.Color(255, 255, 255));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name              :");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddress.setText("Address           :");

        lblTP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTP.setText("Telephone No :");

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblArea.setText("Area               :");

        lblFType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFType.setText("Filter Type      :");

        btnBack1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email              :");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDate.setText("Date              :");

        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelDetailsLayout = new javax.swing.GroupLayout(panelDetails);
        panelDetails.setLayout(panelDetailsLayout);
        panelDetailsLayout.setHorizontalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsLayout.createSequentialGroup()
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetailsLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDetailsLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(119, 119, 119)
                        .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblgetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgetTP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgetEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgetArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblgetFtype, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txtDate))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        panelDetailsLayout.setVerticalGroup(
            panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetailsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblgetName))
                .addGap(26, 26, 26)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(lblgetAddress))
                .addGap(28, 28, 28)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTP)
                    .addComponent(lblgetTP))
                .addGap(28, 28, 28)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblgetEmail))
                .addGap(29, 29, 29)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(lblgetArea))
                .addGap(26, 26, 26)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFType)
                    .addComponent(lblgetFtype))
                .addGap(17, 17, 17)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panelDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack1))
                .addGap(35, 35, 35))
        );

        getContentPane().add(panelDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 285, -1, 420));

        setSize(new java.awt.Dimension(716, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
        {
            //searching customer
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();

            String sql="SELECT * FROM CustomerDetails where NIC = '"+txtNIC.getText()+"'";

            ResultSet rs = stmt.executeQuery(sql);
            String Cnic = "", Cname = "", Caddress = "",Ctp = "",Cemail = "",Carea = "",Cftype = "", Cdate="";

            while(rs.next())
            {
                Cnic = rs.getString("NIC");
                Cname = rs.getString("C_Name");
                Caddress = rs.getString("Address");
                Ctp = rs.getString("Tp_No");
                Cemail = rs.getString("Email");
                Carea = rs.getString("Area");
                Cftype = rs.getString("F_type");
                Cdate = rs.getString("Date");
            }
            rs.close();
            lblgetName.setText(Cname);
            lblgetAddress.setText(Caddress);
            lblgetTP.setText(Ctp);
            lblgetArea.setText(Carea);
            lblgetFtype.setText(Cftype);
            lblgetEmail.setText(Cemail);
            txtDate.setText(Cdate);

            if(Cname == "")
            {
                //if entered NIC is not in the database
                JOptionPane.showMessageDialog(this,"Wrong NIC!!");
            }

        }catch(Exception ee){System.out.println(ee.toString());}
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNICclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNICclearActionPerformed
        txtNIC.setText("");
    }//GEN-LAST:event_btnNICclearActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lblgetName.setText("");
        lblgetAddress.setText("");
        lblgetTP.setText("");
        lblgetEmail.setText("");
        lblgetArea.setText("");
        lblgetFtype.setText("");
        txtDate.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         String Name = lblgetName.getText();
         String GetDate = txtDate.getText();
         int name = Name.length();
        if(name == 0)
        {
            //if customer is not selected
           JOptionPane.showMessageDialog(this,"Select a customer!!"); 
        }
        else
        {
            try
                {
                    //inserting repair record
                 Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();

                  String sql ="insert into RepairRecords values('"+txtNIC.getText()+"',"+"'"+lblgetName.getText()+"',"+"'"+lblgetAddress.getText()+"',"+"'"+lblgetTP.getText()+"',"+"'"+lblgetEmail.getText()+"',"+"'"+lblgetArea.getText()+"',"+"'"+lblgetFtype.getText()+"',"+"'"+GetDate+"',"+"'"+"Pending"+"');";



                 stmt.executeUpdate(sql);
                 JOptionPane.showMessageDialog(this,"Data is inserted");
                 
                }
                catch(Exception ee)
                {System.out.println(ee.toString());
                JOptionPane.showMessageDialog(this,"Repair already in progress");
                }
                
                try
                {
                 Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();
            
                 String sql="DELETE FROM CustomerMail";
            
                 stmt.executeUpdate(sql);
            
            
                }catch(Exception ee){System.out.println(ee.toString());}
                try
                {
                 Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();

                  String sql ="insert into CustomerMail values('"+lblgetTP.getText()+"',"+"'"+lblgetName.getText()+"',"+"'"+lblgetAddress.getText()+"',"+"'"+lblgetFtype.getText()+"');";



                 stmt.executeUpdate(sql);
                 dispose();
                 new UpdateTechnician().setVisible(true); 
                }
                catch(Exception ee)
                {System.out.println(ee.toString());
                
                }
                
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        dispose();
        new RepairForm().setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

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
            java.util.logging.Logger.getLogger(RepairRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RepairRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RepairRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RepairRecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepairRecordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnNICclear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFType;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTP;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JLabel lblgetAddress;
    private javax.swing.JLabel lblgetArea;
    private javax.swing.JLabel lblgetEmail;
    private javax.swing.JLabel lblgetFtype;
    private javax.swing.JLabel lblgetName;
    private javax.swing.JLabel lblgetTP;
    private javax.swing.JPanel panelDetails;
    private javax.swing.JPanel panelTopic;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtNIC;
    // End of variables declaration//GEN-END:variables
}
