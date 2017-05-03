/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko; 

/**
 *
 * @author Purnomo
 */
public class home extends javax.swing.JFrame {
    
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();

    /**
     * Creates new form home
     */
    public home(String user) {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        txtadmin.setText(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        txtkode = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Btn_Cari = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbjenis = new javax.swing.JComboBox<>();
        Btn_Keluar = new javax.swing.JButton();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel1.setText("Kode Barang :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 150, 30);
        getContentPane().add(txtharga);
        txtharga.setBounds(240, 250, 110, 30);

        jLabel2.setFont(new java.awt.Font("COCOGOOSE", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Data Barang Mall Ruroh");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 10, 400, 50);

        jLabel3.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Admin Toko :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(590, 20, 110, 30);

        txtadmin.setEditable(false);
        getContentPane().add(txtadmin);
        txtadmin.setBounds(700, 20, 110, 30);
        getContentPane().add(txtnama);
        txtnama.setBounds(240, 130, 210, 30);

        jLabel4.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel4.setText("Pencarian Berdasarkan Kategori Makanan :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 330, 340, 30);

        jLabel5.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel5.setText("Nama Barang :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 130, 150, 30);

        jLabel6.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel6.setText("Kategori Barang :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 170, 150, 30);

        jLabel7.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Packaging :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 210, 150, 30);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(390, 330, 110, 30);
        getContentPane().add(txtkode);
        txtkode.setBounds(240, 90, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 70);

        Btn_Cari.setText("Cari");
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cari);
        Btn_Cari.setBounds(510, 330, 70, 30);

        Btn_Simpan.setBackground(new java.awt.Color(0, 204, 255));
        Btn_Simpan.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Simpan);
        Btn_Simpan.setBounds(640, 90, 110, 30);

        Btn_Ubah.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ubah);
        Btn_Ubah.setBounds(640, 210, 110, 30);

        Btn_Bersih.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Bersih);
        Btn_Bersih.setBounds(640, 170, 110, 30);

        Btn_Hapus.setBackground(new java.awt.Color(255, 0, 51));
        Btn_Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Hapus);
        Btn_Hapus.setBounds(640, 130, 110, 30);

        jLabel8.setFont(new java.awt.Font("COCOGOOSE", 0, 12)); // NOI18N
        jLabel8.setText("Harga :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 250, 150, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbjenis);
        cbjenis.setBounds(240, 210, 110, 30);

        Btn_Keluar.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Keluar.setText("Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Keluar);
        Btn_Keluar.setBounds(640, 250, 110, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbKategoriBrg);
        cbKategoriBrg.setBounds(240, 170, 110, 30);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        jScrollPane1.setViewportView(Tabel1);
        if (Tabel1.getColumnModel().getColumnCount() > 0) {
            Tabel1.getColumnModel().getColumn(0).setMinWidth(12);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 370, 680, 160);

        setBounds(0, 0, 851, 606);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_CariActionPerformed

    public JTextField getTxtKode()
    {
        return txtkode;
    }     
    
    public JTextField getTxtNama()
    {
        return txtnama;
    }
    
    public JTextField getTxtHarga()
    {
        return txtharga;
    }
    
    public JComboBox getCbKategori()
    {
        return cbKategoriBrg;
    }
    
    public JComboBox getCbJenis()
    {
        return cbjenis;
    }
    
    public JComboBox getCbCariKategori()
    {
        return CbCariKategori;
    }
    
    public JButton getButtonHapus()
    {
        return Btn_Hapus;
    }
    
    public JButton getButtonBersih()
    {
        return Btn_Bersih;
    }
    
    public JButton getButtonSimpan()
    {
        return Btn_Simpan;
    }
    
    public JButton getButtonUbah()
    {
        return Btn_Ubah;
    }
    
    public JButton getButtonKeluar()
    {
        return Btn_Keluar;
    }
    
    public JTable getTableData()
    {
        return Tabel1;
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
