package nirzhorknitwearmanagement;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ProductionStatusFormSkeleton extends javax.swing.JFrame {

    DefaultTableModel model;

    public ProductionStatusFormSkeleton() {
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        InitialiseTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productionStatusTable = new javax.swing.JTable();
        searchTextField = new javax.swing.JTextField();
        showAllButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productionStatusTable.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        productionStatusTable.setForeground(new java.awt.Color(54, 18, 46));
        productionStatusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Style No.", "Issue Date", "Order Quantity", "Produced Quantity", "Remaining", "Status"
            }
        ));
        productionStatusTable.setRowHeight(24);
        productionStatusTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productionStatusTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productionStatusTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1450, 480));

        searchTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyReleased(evt);
            }
        });
        jPanel2.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 80));

        showAllButton.setBackground(new java.awt.Color(255, 255, 255));
        showAllButton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        showAllButton.setForeground(new java.awt.Color(54, 18, 46));
        showAllButton.setText("Show All");
        showAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllButtonActionPerformed(evt);
            }
        });
        jPanel2.add(showAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 311, 80));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 18, 46));
        jLabel2.setText("Type Here");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 1452, 630));

        jPanel1.setBackground(new java.awt.Color(54, 18, 46));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Production Status");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1452, -1));

        setSize(new java.awt.Dimension(1474, 929));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyReleased
        // TODO add your handling code here:
        if (!searchTextField.getText().equalsIgnoreCase("")) {
            model.setRowCount(0);

            try {
                String s = searchTextField.getText();
                ConnectDatabase obj = new ConnectDatabase();
                obj.connectDB();
                Statement statement = obj.connection.createStatement();
                ResultSet resultset = statement.executeQuery("select * from ProductionStatus where StyleNo like '%" + s + "%' order by Remaining desc");
                ArrayList<Integer> ar = new ArrayList<Integer>();
                Object[] rowData = new Object[6];
                while (resultset.next()) {
                    rowData[0] = resultset.getString("StyleNo");
                    rowData[2] = resultset.getInt("OrderQuantity");
                    rowData[3] = resultset.getInt("ProducedQuantity");
                    rowData[4] = resultset.getInt("Remaining");
                    rowData[5] = resultset.getString("Status");

                    model.addRow(rowData);
                    ar.add(resultset.getInt("OrderId"));
                }
                int sz = ar.size();
                for (int i = 0; i < sz; i++) {
                    resultset = statement.executeQuery("select Date from OrderInput where OrderId=" + ar.get(i));
                    while (resultset.next()) {
                        productionStatusTable.setValueAt(resultset.getDate("Date"), i, 1);
                    }
                }
            } catch (SQLException ex) {
                System.out.println("what");
            }
        }
    }//GEN-LAST:event_searchTextFieldKeyReleased

    private void showAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllButtonActionPerformed
        // TODO add your handling code here:
        InitialiseTable();
    }//GEN-LAST:event_showAllButtonActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        this.setVisible(false);
        new ManagementHomePage().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void productionStatusTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productionStatusTableMouseClicked
        try {
            // TODO add your handling code here:
            String s = (String) model.getValueAt(productionStatusTable.getSelectedRow(), 0);
            Date d = (Date) model.getValueAt(productionStatusTable.getSelectedRow(), 1);
            
            OrderInputClass x = new OrderInputClass();
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from OrderInput where StyleNo='"+s+"' and Date='"+d+"'");
            while(resultset.next())
            {
                x.BuyerName = resultset.getString("BuyerName");
                x.BuyingHouseName = resultset.getString("BuyingHouseName");
                x.CM = resultset.getDouble("CM");
                x.OrderQuantity = resultset.getInt("OrderQuantity");
                x.UnitPrice = resultset.getDouble("UnitPrice");
                x.StyleNo = s;
                
            }
            
            Details.oic = x;
        } catch (SQLException ex) {
            Logger.getLogger(ProductionStatusFormSkeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Details().setVisible(true);
        
    }//GEN-LAST:event_productionStatusTableMouseClicked

    public void InitialiseTable() {
        try {
            model = (DefaultTableModel) productionStatusTable.getModel();
            model.setRowCount(0);
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            ResultSet resultset = statement.executeQuery("select * from ProductionStatus where Status='Running' order by Remaining");
            ArrayList<Integer> ar = new ArrayList<Integer>();
            Object[] rowData = new Object[6];
            while (resultset.next()) {
                rowData[0] = resultset.getString("StyleNo");
                rowData[2] = resultset.getInt("OrderQuantity");
                rowData[3] = resultset.getInt("ProducedQuantity");
                rowData[4] = resultset.getInt("Remaining");
                rowData[5] = resultset.getString("Status");

                model.addRow(rowData);
                ar.add(resultset.getInt("OrderId"));
            }
            resultset = statement.executeQuery("select * from ProductionStatus where Status='Not Yet Started' order by Remaining");
          
       
            while (resultset.next()) {
                rowData[0] = resultset.getString("StyleNo");
                rowData[2] = resultset.getInt("OrderQuantity");
                rowData[3] = resultset.getInt("ProducedQuantity");
                rowData[4] = resultset.getInt("Remaining");
                rowData[5] = resultset.getString("Status");

                model.addRow(rowData);
                ar.add(resultset.getInt("OrderId"));
            }
            int sz = ar.size();
            for (int i = 0; i < sz; i++) {
                resultset = statement.executeQuery("select Date from OrderInput where OrderId=" + ar.get(i));
                while (resultset.next()) {
                    productionStatusTable.setValueAt(resultset.getDate("Date"), i, 1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductionStatusFormSkeleton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductionStatusFormSkeleton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productionStatusTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton showAllButton;
    // End of variables declaration//GEN-END:variables
}
