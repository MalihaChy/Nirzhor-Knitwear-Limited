/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementversion2;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import nirzhorknitwearmanagement.ConnectDatabase;
import nirzhorknitwearmanagement.OrderInputClass;

/**
 *
 * @author User
 */
public class SecondInputPageRecheck extends javax.swing.JFrame {

    public static OrderInputClass newOrder;

    public SecondInputPageRecheck() {
        initComponents();
        
        colorWiseQuantityTable.getTableHeader().setFont(new Font("ComicSansMS", Font.BOLD, 24));
        initTable();
    }

    private void initTable() {
        int totalQuantity = 0;
        DefaultTableModel table = (DefaultTableModel) colorWiseQuantityTable.getModel();
        table.setRowCount(0);
        Object[] rowData = new Object[2];
        int sz = newOrder.nameOfColors.size();
        for (int i = 0; i < sz; i++) {
            rowData[0] = newOrder.nameOfColors.get(i);
            rowData[1] = newOrder.quantityOfColors.get(i);

            totalQuantity += newOrder.quantityOfColors.get(i).intValue();
            table.addRow(rowData);
        }
        newOrder.OrderQuantity = totalQuantity;
        System.out.println(totalQuantity);
        totalquantitylabel.setText(new Integer(totalQuantity).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        colorWiseQuantityTable = new javax.swing.JTable();
        confirmbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        totalquantitylabel = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        colorWiseQuantityTable.setBorder(new javax.swing.border.MatteBorder(null));
        colorWiseQuantityTable.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        colorWiseQuantityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colors", "Quantity"
            }
        ));
        colorWiseQuantityTable.setToolTipText("");
        colorWiseQuantityTable.setRowHeight(24);
        jScrollPane1.setViewportView(colorWiseQuantityTable);

        confirmbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        confirmbutton.setText("Confirm");
        confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setText("Total Quantity");

        totalquantitylabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        backbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(totalquantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalquantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(54, 18, 46));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Color-wise Quantity Recheck");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
        //Run your query here
        ConnectDatabase obj = new ConnectDatabase();
        obj.connectDB();
        Statement statement;
        ResultSet resultset;
        
        int OrderId = 0;
        String StyleNo = newOrder.StyleNo;
        
        try {
            //  get the order id
            statement = obj.connection.createStatement();
            resultset = statement.executeQuery("select max(OrderId) as OrderId from OrderInput");
            while(resultset.next())
            {
                OrderId = resultset.getInt("OrderId");
            }
            
            System.out.println("Fetched OrderId "+OrderId+" StyleNo "+StyleNo);
            
        } catch (SQLException ex) {
            System.out.println("Could not fetch the OrderId");
        }
        
        int i = 0;
        try {
            // insertion in loop
            statement = obj.connection.createStatement();
            
            int sz = newOrder.noOfColors;
            for(i=0;i<sz;i++)
            {
                statement.executeUpdate("insert into ColorWiseOrderInput values("+OrderId+",'"+StyleNo+"','"+newOrder.nameOfColors.get(i)+"',"+newOrder.quantityOfColors.get(i)+")");
                System.out.println("Inserted "+i);
            }
            
        } catch (SQLException ex) {
            System.out.println("Could not insert "+i);
        }
        
        try {
            // insertion the total quantity
            statement = obj.connection.createStatement();
            statement.executeUpdate("update OrderInput set OrderQuantity="+newOrder.OrderQuantity+" where OrderId="+OrderId);
            System.out.println("Inserted total OrderQuantity in OrderInput table");
        } catch (SQLException ex) {
            System.out.println("Could not insert total OrderQuantity in OrderInput table");
        }
        
        try {
            statement = obj.connection.createStatement();
            statement.executeUpdate("update ProductionStatus set OrderQuantity = "+newOrder.OrderQuantity+", Remaining = "+newOrder.OrderQuantity+" where OrderId = "+OrderId);
            System.out.println("Updated ProductionStatus table");
        } catch (SQLException ex) {
            System.out.println("Could not update ProductionStatus table");
        }
        
    }//GEN-LAST:event_confirmbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
         new SecondInputPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(SecondInputPageRecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondInputPageRecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondInputPageRecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondInputPageRecheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondInputPageRecheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTable colorWiseQuantityTable;
    private javax.swing.JButton confirmbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalquantitylabel;
    // End of variables declaration//GEN-END:variables

}
