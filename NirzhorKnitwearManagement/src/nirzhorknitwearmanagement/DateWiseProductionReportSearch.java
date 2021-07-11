package nirzhorknitwearmanagement;

import java.awt.Font;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class DateWiseProductionReportSearch extends javax.swing.JFrame {

    int tableSize = 0;

    public DateWiseProductionReportSearch() {
        initComponents();

        detailsTable.getTableHeader().setFont(new Font("ComicSansMS", Font.BOLD, 24));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        totalQuantityLabel = new javax.swing.JLabel();
        dateComboBox = new javax.swing.JComboBox<>();
        showButton = new javax.swing.JButton();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsTable = new javax.swing.JTable();
        cutingradiobutton = new javax.swing.JRadioButton();
        sewingradiobutton = new javax.swing.JRadioButton();
        pakingradionbutton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 18, 46));
        jPanel2.setForeground(new java.awt.Color(54, 18, 46));

        jLabel1.setBackground(new java.awt.Color(54, 18, 46));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   Search Your Report");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        totalLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(54, 18, 46));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("Total ($)");

        totalQuantityLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        totalQuantityLabel.setForeground(new java.awt.Color(54, 18, 46));
        totalQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        for (int i=1; i<32; i++){
            dateComboBox.addItem(new Integer(i).toString());
        }
        dateComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        showButton.setBackground(new java.awt.Color(255, 255, 255));
        showButton.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        showButton.setForeground(new java.awt.Color(54, 18, 46));
        showButton.setText("See Details");
        showButton.setRolloverEnabled(false);
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        for (int i=1; i<13; i++){
            monthComboBox.addItem(new Integer(i).toString());
        }
        monthComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        for (int i=2018; i<3001; i++){
            yearComboBox.addItem(new Integer(i).toString());
        }
        yearComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        detailsTable.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        detailsTable.setForeground(new java.awt.Color(54, 18, 46));
        detailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Style", "Total Production", "Daily Income"
            }
        ));
        detailsTable.setAlignmentX(1.0F);
        detailsTable.setAlignmentY(1.0F);
        detailsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        detailsTable.setGridColor(new java.awt.Color(255, 255, 255));
        detailsTable.setRowHeight(24);
        jScrollPane1.setViewportView(detailsTable);

        buttonGroup1.add(cutingradiobutton);
        cutingradiobutton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        cutingradiobutton.setText("Cutting");

        buttonGroup1.add(sewingradiobutton);
        sewingradiobutton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        sewingradiobutton.setText("Sewing");

        buttonGroup1.add(pakingradionbutton);
        pakingradionbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        pakingradionbutton.setText("Packing");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("  Choose Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(totalQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(cutingradiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sewingradiobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pakingradionbutton)
                                .addGap(55, 55, 55)
                                .addComponent(showButton, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))))
                .addGap(257, 257, 257))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cutingradiobutton)
                            .addComponent(sewingradiobutton)
                            .addComponent(pakingradionbutton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(61, 61, 61)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(totalQuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed

        DefaultTableModel table = (DefaultTableModel) detailsTable.getModel();
        //DecimalFormat df = new DecimalFormat("#.##");

        //clear Table
        table.setRowCount(0);

        //Get date from the combo box
        int year = new Integer((yearComboBox.getSelectedItem().toString()));
        int month = new Integer(monthComboBox.getSelectedItem().toString());
        int day = new Integer(dateComboBox.getSelectedItem().toString());

        Date searchDate = new Date(year - 1900, month - 1, day);     //searchDate can be directly used for query

        Object[] rowData = new Object[3];

        ArrayList<DateWiseProductionReport> ar = new ArrayList<>();
        ConnectDatabase obj = new ConnectDatabase();
        obj.connectDB();
        Statement statement;
        ResultSet resultset;

        if (cutingradiobutton.isSelected()) {
            //changing table header
            detailsTable.getColumnModel().getColumn(1).setHeaderValue("Color");
            detailsTable.getColumnModel().getColumn(2).setHeaderValue("Quantity");

            try {
                statement = obj.connection.createStatement();
                resultset = statement.executeQuery("select StyleNo,Color,sum(Qty) as TotalQty from DailyCutting where Date='" + searchDate + "' group by StyleNo,Color");

                DateWiseProductionReport x;
                while (resultset.next()) {
                    x = new DateWiseProductionReport(resultset.getString("StyleNo"), resultset.getString("Color"), resultset.getInt("TotalQty"));
                    ar.add(x);
                }
            } catch (Exception e) {
                System.out.println("jhamela 1");
            }

        } else if (pakingradionbutton.isSelected()) {
            //changing table header
            detailsTable.getColumnModel().getColumn(1).setHeaderValue("Color");
            detailsTable.getColumnModel().getColumn(2).setHeaderValue("Quantity");
        } else if (sewingradiobutton.isSelected()) {
            //changing table header
            detailsTable.getColumnModel().getColumn(1).setHeaderValue("Sewing Input");
            detailsTable.getColumnModel().getColumn(2).setHeaderValue("Sewing Output");

            try {
                statement = obj.connection.createStatement();
                resultset = statement.executeQuery("select StyleNo,ProducedQuantity from IncomeReport where SystemDate='" + searchDate + "'");
                DateWiseProductionReport x;
                while (resultset.next()) {
                    x = new DateWiseProductionReport(resultset.getString("StyleNo"), resultset.getInt("ProducedQuantity"), 0);
                    ar.add(x);
                }
                System.out.println("no jhamela");
                int sz = ar.size();
                for (int i = 0; i < sz; i++) {
                    resultset = statement.executeQuery("select sum(Qty) as sewingInput from DailySewingInput where StyleNo='" + ar.get(i).styleNo + "' and date='" + searchDate + "'");
                    while (resultset.next()) {
                        ar.get(i).sewingInput = resultset.getInt("sewingInput");
                    }
                }
                System.out.println("no jhamela");
            } catch (SQLException ex) {
                System.out.println("jhamela 2");
            }
        }
        int total = 0;

        int sz = ar.size();

        if (sewingradiobutton.isSelected()) {
            for (int i = 0; i < sz; i++) {
                //add data to the table
                rowData[0] = ar.get(i).styleNo;
                rowData[1] = ar.get(i).sewingInput;
                rowData[2] = ar.get(i).quantity;

                total += ar.get(i).quantity;
                table.addRow(rowData);
            }
        }

        if (cutingradiobutton.isSelected() || pakingradionbutton.isSelected()) {
            for (int i = 0; i < sz; i++) {
                //add data to the table
                rowData[0] = ar.get(i).styleNo;
                rowData[1] = ar.get(i).color;
                rowData[2] = ar.get(i).quantity;

                total += ar.get(i).quantity;
                table.addRow(rowData);
            }
        }
        detailsTable.getTableHeader().repaint();    //required to set the table header

        totalQuantityLabel.setText(new Integer(total).toString());
    }//GEN-LAST:event_showButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        new ManagementHomePage().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateWiseProductionReportSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cutingradiobutton;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JTable detailsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JRadioButton pakingradionbutton;
    private javax.swing.JRadioButton sewingradiobutton;
    private javax.swing.JButton showButton;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalQuantityLabel;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
