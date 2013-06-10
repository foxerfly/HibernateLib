/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edwin.App;

import com.edwin.Hibernate.SqlStart;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author EDWIN
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        this.setLocationRelativeTo(this);
//        showText();
//        LookAndFeelManager.isMetalLookAndFeel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        MB001 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        materialPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        laborePrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        madePrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cooperationPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sumPrice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta.setColumns(20);
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta);

        jButton1.setText("commit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        MB001.setText("MB001");

        jLabel1.setText("品号：");

        jLabel2.setText("料费：");

        materialPrice.setText("0");

        jLabel3.setText("工费：");

        laborePrice.setText("0");

        jLabel4.setText("制费：");

        madePrice.setText("0");

        jLabel5.setText("加工费：");

        cooperationPrice.setText("0");

        jLabel6.setText("单价：");

        sumPrice.setText(getSumPrice().toString().trim());
        sumPrice.setEnabled(false);

        jScrollPane2.setViewportView(jXTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(MB001, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(materialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(laborePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(madePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cooperationPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(sumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(MB001, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(materialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(laborePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(madePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(1, 1, 1)
                .addComponent(cooperationPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(sumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showText();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    public BigDecimal getSumPrice() {
        BigDecimal b = BigDecimal.ZERO;

        b = b.add(BigDecimal.valueOf(Double.valueOf(materialPrice.getText().trim())));
        b = b.add(BigDecimal.valueOf(Double.valueOf(madePrice.getText().trim())));
        b = b.add(BigDecimal.valueOf(Double.valueOf(cooperationPrice.getText().trim())));
        b = b.add(BigDecimal.valueOf(Double.valueOf(laborePrice.getText().trim())));

        return b;
    }
    private SessionFactory s = SqlStart.getSessionFactory();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MB001;
    private javax.swing.JTextField cooperationPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JTextField laborePrice;
    private javax.swing.JTextField madePrice;
    private javax.swing.JTextField materialPrice;
    private javax.swing.JTextField sumPrice;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

    private void showText() throws HibernateException {
        // TODO add your handling code here:
        Session session = s.openSession();
        Transaction tx;
        tx = session.beginTransaction();
        //        InvmbdId bId = new InvmbdId();

//        bId.setMb001(null);
        Query qr = session.createQuery("from Copma as a where a.ma001='10000001'");
        List invmbd = qr.list();

//        for (Iterator it = invmbd.iterator(); it.hasNext();) {
//            Copma idc = (Copma) it.next();
////            System.out.println(idc.getId() + "----------------" + idc.getId().getMb001());
//            idc.setCompany(MB001.getText().trim());
//            ta.append(idc.getMa001() + "-----------------" + idc.getCompany() + "\n");
//        }
        tx.commit();
        session.close();
    }
}
