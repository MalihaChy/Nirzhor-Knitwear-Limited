/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementversion2;

import java.util.ArrayList;
import javax.swing.JTextField;
import nirzhorknitwearmanagement.OrderInputClass;

/**
 *
 * @author User
 */
public class SecondInputPage extends javax.swing.JFrame {

    ArrayList<JTextField> colorTextFieldList;
    ArrayList<JTextField> quantityTextFieldList;
    public static OrderInputClass newOrder;
    boolean properInput;

    public SecondInputPage() {
        initComponents();

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);
        initColorTextFields();
        initQuantityTextFields();
    }

    private void addColorTextFieldsToList() {
        colorTextFieldList = new ArrayList<>();

        colorTextFieldList.add(color01);
        colorTextFieldList.add(color02);
        colorTextFieldList.add(color03);
        colorTextFieldList.add(color04);
        colorTextFieldList.add(color05);
        colorTextFieldList.add(color06);
        colorTextFieldList.add(color07);
        colorTextFieldList.add(color08);
        colorTextFieldList.add(color09);
        colorTextFieldList.add(color10);
    }

    private void addQuantityTextFieldsToList() {
        quantityTextFieldList = new ArrayList<>();

        quantityTextFieldList.add(quantityofcolor1);
        quantityTextFieldList.add(quantityofcolor2);
        quantityTextFieldList.add(quantityofcolor3);
        quantityTextFieldList.add(quantityofcolor4);
        quantityTextFieldList.add(quantityofcolor5);
        quantityTextFieldList.add(quantityofcolor6);
        quantityTextFieldList.add(quantityofcolor7);
        quantityTextFieldList.add(quantityofcolor8);
        quantityTextFieldList.add(quantityofcolor9);
        quantityTextFieldList.add(quantityofcolor10);
    }

    private void initColorTextFields() {
        addColorTextFieldsToList();

        for (int i = newOrder.noOfColors; i < colorTextFieldList.size(); i++) {
            colorTextFieldList.get(i).setVisible(false);
        }
    }

    private void initQuantityTextFields() {
        addQuantityTextFieldsToList();

        for (int i = newOrder.noOfColors; i < quantityTextFieldList.size(); i++) {
            quantityTextFieldList.get(i).setVisible(false);
        }
    }

    private void checkProperInput() {

        int i;
        for (i = 0; i < newOrder.noOfColors; i++) {
            if (colorTextFieldList.get(i).getText().equalsIgnoreCase("") && quantityTextFieldList.get(i).getText().equalsIgnoreCase("")) {
                System.out.println("Enter data for every color");
                break;
            } else if (colorTextFieldList.get(i).getText().equalsIgnoreCase("") && !quantityTextFieldList.get(i).getText().equalsIgnoreCase("")) {
                //error, show in dialogue
                System.out.println("Give proper Input");
                break;
            } else if (!colorTextFieldList.get(i).getText().equalsIgnoreCase("") && quantityTextFieldList.get(i).getText().equalsIgnoreCase("")) {
                //error, show in dialogue
                System.out.println("Give proper Input");
                break;
            }

        }

        if (i >= newOrder.noOfColors) {
            properInput = true;
        }
    }

    private void getColorWiseQuantity() {
        if (properInput) {
            for (int i = 0; i < newOrder.noOfColors; i++) {
                String colorName = new String();
                String quantityInString = new String();

                colorName = colorTextFieldList.get(i).getText();
                quantityInString = quantityTextFieldList.get(i).getText();

                newOrder.nameOfColors.add(colorName);
                newOrder.quantityOfColors.add(new Integer(quantityInString));
                
                SecondInputPageRecheck.newOrder = newOrder;
                new SecondInputPageRecheck().setVisible(true);
                this.setVisible(false);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        color01 = new javax.swing.JTextField();
        color02 = new javax.swing.JTextField();
        color03 = new javax.swing.JTextField();
        color04 = new javax.swing.JTextField();
        color05 = new javax.swing.JTextField();
        color06 = new javax.swing.JTextField();
        color07 = new javax.swing.JTextField();
        color08 = new javax.swing.JTextField();
        color09 = new javax.swing.JTextField();
        color10 = new javax.swing.JTextField();
        quantityofcolor1 = new javax.swing.JTextField();
        quantityofcolor2 = new javax.swing.JTextField();
        quantityofcolor3 = new javax.swing.JTextField();
        quantityofcolor4 = new javax.swing.JTextField();
        quantityofcolor5 = new javax.swing.JTextField();
        quantityofcolor6 = new javax.swing.JTextField();
        quantityofcolor7 = new javax.swing.JTextField();
        quantityofcolor8 = new javax.swing.JTextField();
        quantityofcolor9 = new javax.swing.JTextField();
        quantityofcolor10 = new javax.swing.JTextField();
        colors = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        color01.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color02.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color03.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color04.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color05.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color06.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color07.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color08.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color09.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        color10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        quantityofcolor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityofcolor4ActionPerformed(evt);
            }
        });

        quantityofcolor5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        quantityofcolor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityofcolor5ActionPerformed(evt);
            }
        });

        quantityofcolor6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        quantityofcolor10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        colors.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        colors.setForeground(new java.awt.Color(54, 18, 46));
        colors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colors.setText("Colors");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 18, 46));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantity ");

        nextbutton.setBackground(new java.awt.Color(255, 255, 255));
        nextbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        nextbutton.setForeground(new java.awt.Color(54, 18, 46));
        nextbutton.setText("NEXT");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(color10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(color02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color04, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color05, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color06, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color07, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color08, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(color01, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(colors, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(299, 299, 299)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor10, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 618, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(489, 489, 489))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colors, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color01, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(quantityofcolor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color02, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(quantityofcolor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color03, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(quantityofcolor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color04, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color05, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color06, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(color07, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color08, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(quantityofcolor8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityofcolor9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(color10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityofcolor10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(nextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(54, 18, 46));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Input Color-wise Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1213, 934));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quantityofcolor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityofcolor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityofcolor5ActionPerformed

    private void quantityofcolor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityofcolor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityofcolor4ActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
        checkProperInput();
        getColorWiseQuantity();

        if (properInput) {
            for (int i = 0; i < newOrder.quantityOfColors.size(); i++) {
                System.out.println(newOrder.nameOfColors.get(i));
            }

            System.out.println(newOrder.totalQuantity());

        }
    }//GEN-LAST:event_nextbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(SecondInputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondInputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondInputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondInputPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondInputPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color01;
    private javax.swing.JTextField color02;
    private javax.swing.JTextField color03;
    private javax.swing.JTextField color04;
    private javax.swing.JTextField color05;
    private javax.swing.JTextField color06;
    private javax.swing.JTextField color07;
    private javax.swing.JTextField color08;
    private javax.swing.JTextField color09;
    private javax.swing.JTextField color10;
    private javax.swing.JLabel colors;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextbutton;
    private javax.swing.JTextField quantityofcolor1;
    private javax.swing.JTextField quantityofcolor10;
    private javax.swing.JTextField quantityofcolor2;
    private javax.swing.JTextField quantityofcolor3;
    private javax.swing.JTextField quantityofcolor4;
    private javax.swing.JTextField quantityofcolor5;
    private javax.swing.JTextField quantityofcolor6;
    private javax.swing.JTextField quantityofcolor7;
    private javax.swing.JTextField quantityofcolor8;
    private javax.swing.JTextField quantityofcolor9;
    // End of variables declaration//GEN-END:variables
}
