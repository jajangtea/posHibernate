/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import pos.util.Barang;
import pos.util.PenjualanDetil;
import pos.util.PenjualanMaster;
import java.util.*;
import pos.util.HibernateUtil;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author jajangtea
 */
public class TransaksiBarang extends javax.swing.JFrame {

    Float a, sub;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    Date tgl;
    /**
     * Creates new form TransaksiBarang
     */
    public TransaksiBarang() {
        initComponents();
        fillTable(jTable1, txtNo.getText().trim());
        this.setLocationRelativeTo(null);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lbHarga = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtJml = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbSubTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setText("Nama Barang");

        lbHarga.setText("#");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setText("Harga");

        lbTotal.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lbTotal.setText("#####");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("Total Belanja");

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel7.setText("Jumlah");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("Tanggal");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        txtKode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeKeyPressed(evt);
            }
        });

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setText("No Transaksi");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        lbNama.setText("#");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButton1.setText("Baru");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButton2.setText("Hitung");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButton3.setText("Simpan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbSubTotal.setText("#");

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setText("Sub Total");

        jButton4.setText("Selesai");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNama, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(3, 3, 3)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(lbHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJml, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSubTotal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotal)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNama))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHarga))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        if (txtKode.getText().equals("")) {
          //new ListBarang().setVisible(true);
            //dispose();
             cari(txtKode.getText());
        } else {
            cari(txtKode.getText());
            txtJml.requestFocus();
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void jXDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker1ActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.getSelectedRow();
        txtNo.setText(jTable1.getValueAt(baris, 1).toString());
        txtKode.setText(jTable1.getValueAt(baris, 2).toString());
        txtJml.setText(jTable1.getValueAt(baris, 4).toString());
        jXDatePicker1.setDate(getTanggalFromTable(0));
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kodeOtomatis();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        PenjualanMaster pm = new PenjualanMaster();
        pm.setNoTransaksi(txtNo.getText());
        if (jXDatePicker1.getDate() == null) {

            try {
                tgl = dateFormat.parse(dateFormat.format(cal.getTime()).toString());
                pm.setTanggal(tgl);
                jXDatePicker1.setDate(tgl);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
        } else {
            pm.setTanggal(jXDatePicker1.getDate());
        }
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(pm);
        tx.commit();
        s.flush();
        s.close();
        txtKode.requestFocus();
        fillTable(jTable1, txtNo.getText().trim());
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        txtKode.setText("");
        txtJml.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        sub = a * Float.parseFloat(txtJml.getText());
        //lbHarga.setText(NumberFormat.getNumberInstance().format(a));
        lbSubTotal.setText(NumberFormat.getNumberInstance().format(sub));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        PenjualanDetil pd = new PenjualanDetil();
        PenjualanMaster p = new PenjualanMaster();
        Barang b = new Barang();
        pd.setPenjualanMaster(p);
        p.setNoTransaksi(txtNo.getText());
        pd.setBarang(b);
        b.setKodeBarang(txtKode.getText());
        pd.setJumlah(Integer.parseInt(txtJml.getText()));
        // (NumberFormat.getNumberInstance().format(a));
        //Double d=Double.parseDouble(lbSubTotal.getText());

        double f = (double) sub;
        pd.setSubTotal(f);
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(pd);
        tx.commit();
        s.flush();
        s.close();

        totalpertrx(txtNo.getText());
        //  ubahTotal(txtNo.getText().trim());
        fillTable(jTable1, txtNo.getText().trim());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ubahTotal(txtNo.getText().trim());
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton1.setEnabled(true);
        txtKode.setText("");
        txtJml.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtKodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cari(txtKode.getText());
        }
    }//GEN-LAST:event_txtKodeKeyPressed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void kodeOtomatis() {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            String sql = "select max(right(NoTransaksi,4)) from penjualan_master";
            Query q = s.createSQLQuery(sql);
            if (q.uniqueResult() == null) {
                txtNo.setText("TRX-0001");
            } else {
                System.out.println(q.uniqueResult());
                int i = Integer.parseInt(q.uniqueResult().toString());
                String no = String.valueOf(i + 1);
                int noLong = no.length();
                for (int a = 0; a < 4 - noLong; a++) {
                    no = "0" + no;
                }

                txtNo.setText("TRX-" + no);
                s.flush();
                tx.commit();
                s.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void totalpertrx(String notrx) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            String sql = "select sum(subtotal) from penjualan_detil where NoTransaksi='" + notrx + "'";
            Query q = s.createSQLQuery(sql);
            Float total = Float.parseFloat(q.uniqueResult().toString());
            lbTotal.setText(NumberFormat.getNumberInstance().format(total));
            s.flush();
            tx.commit();
            s.close();

        } catch (NumberFormatException | HibernateException e) {
            System.out.println(e);
        }

    }

    private void fillTable(final JTable table, String notrx) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            Query q = s.createQuery("FROM PenjualanDetil where NoTransaksi='" + notrx + "'");
            List resultList = q.list();
            Vector<String> tableHeaders = new Vector<String>();
            Vector tableData = new Vector();
            tableHeaders.add("Tanggal");
            tableHeaders.add("No Transaksi");
            tableHeaders.add("Kode");
            tableHeaders.add("Nama Barang");
            tableHeaders.add("Jumlah");
            tableHeaders.add("Sub Total");
            for (Object o : resultList) {
                PenjualanDetil pd = (PenjualanDetil) o;
                Vector<Object> oneRow = new Vector<Object>();
                oneRow.add(pd.getPenjualanMaster().getTanggal().toString());
                oneRow.add(pd.getPenjualanMaster().getNoTransaksi().toString());
                oneRow.add(pd.getBarang().getKodeBarang());
                oneRow.add(pd.getBarang().getNamaBarang());
                oneRow.add(pd.getJumlah());
                oneRow.add(NumberFormat.getNumberInstance().format(pd.getSubTotal()));
                tableData.add(oneRow);
            }
            jTable1.setModel(new DefaultTableModel(tableData, tableHeaders));
            s.flush();
            tx.commit();
            s.close();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    private Date getTanggalFromTable(int i) {
        String str_tgl = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), i));
        Date tanggal = null;
        try {
            tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(str_tgl);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return tanggal;
    }

    public void cari(final String kode) {
        try {

            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session s = sf.openSession();
            Transaction tx = s.beginTransaction();
            // String sql="FROM Barang b where b.kodeBarang=:kodeBarang";
            String sql = "select * from barang where kodeBarang=:kodeBarang";
            Query q = s.createSQLQuery(sql);
            q.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            q.setParameter("kodeBarang", kode);
            List brg = q.list();
            if (brg.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan.", "Informasi", JOptionPane.WARNING_MESSAGE);
                txtKode.setText("");
                txtKode.requestFocus();
            } else {
                for (Object br : brg) {
                    Map row = (Map) br;
                    lbNama.setText(row.get("NamaBarang").toString());
                    a = Float.parseFloat(row.get("Harga").toString());
                    lbHarga.setText(NumberFormat.getNumberInstance().format(a));
                    txtJml.requestFocus();
                }
                s.flush();
                tx.commit();
                s.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void ubahTotal(String notrx) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        PenjualanMaster pm = new PenjualanMaster();
        pm.setNoTransaksi(notrx);
        pm.setTotal(Double.parseDouble(lbTotal.getText().toString()));
        Transaction tx = s.beginTransaction();
        s.saveOrUpdate(pm);
        tx.commit();
        s.flush();
        s.close();
        txtKode.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(TransaksiBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbSubTotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtJml;
    public javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}
