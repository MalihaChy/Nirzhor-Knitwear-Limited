/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nirzhorknitwearmanagement;

/**
 *
 * @author Asus
 */
public class ManagementHomePage extends javax.swing.JFrame {

    /**
     * Creates new form ManagementHomePage
     */
    public ManagementHomePage() {
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

        jPanel1 = new javax.swing.JPanel();
        orderInputButton = new javax.swing.JButton();
        dateWiseSearch = new javax.swing.JButton();
        productionStatus = new javax.swing.JButton();
        completedOrder = new javax.swing.JButton();
        productionstatushourlybutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        orderInputButton.setBackground(new java.awt.Color(255, 255, 255));
        orderInputButton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        orderInputButton.setForeground(new java.awt.Color(54, 18, 46));
        orderInputButton.setText("Order Input");
        orderInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderInputButtonActionPerformed(evt);
            }
        });

        dateWiseSearch.setBackground(new java.awt.Color(255, 255, 255));
        dateWiseSearch.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        dateWiseSearch.setForeground(new java.awt.Color(54, 18, 46));
        dateWiseSearch.setText("Date Wise Search");
        dateWiseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateWiseSearchActionPerformed(evt);
            }
        });

        productionStatus.setBackground(new java.awt.Color(255, 255, 255));
        productionStatus.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        productionStatus.setForeground(new java.awt.Color(54, 18, 46));
        productionStatus.setText("Production Status");
        productionStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionStatusActionPerformed(evt);
            }
        });

        completedOrder.setBackground(new java.awt.Color(255, 255, 255));
        completedOrder.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        completedOrder.setForeground(new java.awt.Color(54, 18, 46));
        completedOrder.setText("Completed Order");
        completedOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completedOrderActionPerformed(evt);
            }
        });

        productionstatushourlybutton.setBackground(new java.awt.Color(255, 255, 255));
        productionstatushourlybutton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        productionstatushourlybutton.setForeground(new java.awt.Color(54, 18, 46));
        productionstatushourlybutton.setText("Production Status Hourly");
        productionstatushourlybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionstatushourlybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productionStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderInputButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateWiseSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(productionstatushourlybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateWiseSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productionstatushourlybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productionStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completedOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );

        jPanel2.setBackground(new java.awt.Color(54, 18, 46));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Nirzhor Knitwear Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1488, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1510, 866));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderInputButtonActionPerformed
        new OrderInput().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_orderInputButtonActionPerformed

    private void dateWiseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateWiseSearchActionPerformed
        new DateWiseProductionReportSearch().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dateWiseSearchActionPerformed

    private void productionStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionStatusActionPerformed
        new ProductionStatusFormSkeleton().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_productionStatusActionPerformed

    private void completedOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completedOrderActionPerformed
        new CompletedOrderJava().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_completedOrderActionPerformed

    private void productionstatushourlybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionstatushourlybuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HourlyProductionStatus().setVisible(true);
        
    }//GEN-LAST:event_productionstatushourlybuttonActionPerformed

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
            java.util.logging.Logger.getLogger(ManagementHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completedOrder;
    private javax.swing.JButton dateWiseSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton orderInputButton;
    private javax.swing.JButton productionStatus;
    private javax.swing.JButton productionstatushourlybutton;
    // End of variables declaration//GEN-END:variables
}
