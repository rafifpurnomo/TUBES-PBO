/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AkunController;
import Controller.KeranjangController;
import Controller.MakananController;
import Controller.TokoController;
import Controller.TransaksiController;
import Model.DriverOnlineShop;
import Model.UserSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafif Purnomo
 */
public class Checkout extends javax.swing.JFrame {

    /**
     * Creates new form Checkout
     */
    private MakananController makananCNTRL;
    private AkunController akunCNTRL;
    private TokoController tokoCNTRL;
    private KeranjangController keranjangCNTRL;
    private TransaksiController transaksiCNTRL;
    private DriverOnlineShop driver;
    
    public int id_keranjang, id_makanan, banyakPorsi, id_user;
    public String namaMakanan, namaRestaurant;
    public double harga;
    
    public Checkout() {
        driver = new DriverOnlineShop(this);
        makananCNTRL = new MakananController();
        tokoCNTRL = new TokoController();
        keranjangCNTRL = new KeranjangController();
        transaksiCNTRL = new TransaksiController();
        
        initComponents();
    }

    public void Checkout(int id_keranjang,int id_user, int id_makanan, int banyakPorsi, String namaMakanan, String namaRestaurant, double harga) {
        this.id_keranjang = id_keranjang;
        this.id_user = id_user;
        this.id_makanan = id_makanan;
        this.banyakPorsi = banyakPorsi;
        this.namaMakanan = namaMakanan;
        this.namaRestaurant = namaRestaurant;
        this.harga = harga;
    
        namaMakananDisplay.setText(namaMakanan);
        namaRestaurantDisplay.setText(namaRestaurant);
        banyakPorsiDisplay.setText(String.valueOf(banyakPorsi));
        totalhargaDisplay.setText(String.valueOf(harga));
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
        namaMakananDisplay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaRestaurantDisplay = new javax.swing.JLabel();
        banyakPorsiDisplay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalhargaDisplay = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CheckoutBTN = new javax.swing.JButton();
        BatalkanPesananBTN = new javax.swing.JButton();
        kembaliBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Checkout makanan kamu sekarang");

        namaMakananDisplay.setText("nama makanan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("nama makanan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Resturant");

        namaRestaurantDisplay.setText("nama restaurant");

        banyakPorsiDisplay.setText("banyak porsi");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Banyaknya porsi");

        totalhargaDisplay.setText("total harga");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total Harga");

        CheckoutBTN.setText("Checkout");
        CheckoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutBTNActionPerformed(evt);
            }
        });

        BatalkanPesananBTN.setText("batalkan pesanan");
        BatalkanPesananBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalkanPesananBTNActionPerformed(evt);
            }
        });

        kembaliBTN.setText("kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaMakananDisplay)
                    .addComponent(jLabel3)
                    .addComponent(namaRestaurantDisplay)
                    .addComponent(banyakPorsiDisplay)
                    .addComponent(totalhargaDisplay)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BatalkanPesananBTN))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CheckoutBTN))
                        .addComponent(jLabel1))
                    .addComponent(kembaliBTN))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBTN)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaMakananDisplay)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(CheckoutBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaRestaurantDisplay)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BatalkanPesananBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(banyakPorsiDisplay)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalhargaDisplay)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutBTNActionPerformed
        boolean status = transaksiCNTRL.tambahHistoryTransaksi(UserSession.getId(), namaMakanan, banyakPorsi, harga, "selesai");
        if (status) {
            keranjangCNTRL.hapusKeranjang(id_keranjang);
            driver.statusCheckoutBerhasil(status);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan pada checkout");
        }
        
    }//GEN-LAST:event_CheckoutBTNActionPerformed

    private void BatalkanPesananBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalkanPesananBTNActionPerformed
        boolean status = transaksiCNTRL.tambahHistoryTransaksi(UserSession.getId(), namaMakanan, banyakPorsi, harga, "dibatalkan");
        if (status) {
            keranjangCNTRL.hapusKeranjang(id_keranjang);
            driver.statusCheckoutDiBatalkan(status);
        } else {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan pada pembatalan pesanan");
        }
        
    }//GEN-LAST:event_BatalkanPesananBTNActionPerformed

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalkanPesananBTN;
    private javax.swing.JButton CheckoutBTN;
    private javax.swing.JLabel banyakPorsiDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JLabel namaMakananDisplay;
    private javax.swing.JLabel namaRestaurantDisplay;
    private javax.swing.JLabel totalhargaDisplay;
    // End of variables declaration//GEN-END:variables
}