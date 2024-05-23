package View;

import Controller.KeranjangController;
import Controller.MakananController;
import Controller.TokoController;
import Model.DriverOnlineShop;
import Model.UserSession;
import javax.swing.table.DefaultTableModel;

public class addToKeranjang extends javax.swing.JFrame {

    /**
     * Creates new form DetailToko
     */
    
    private DriverOnlineShop driver;
    private TokoController tokoCNTRL;
    private MakananController mknCNTRL;
    private KeranjangController keranjangCNTRL;
    private DefaultTableModel table_model;
    public int idToko, stok, idMakanan, totalPorsi;
    public String namaToko, alamat, namaMakanan;
    public double harga, totalHarga;
    
    
    public addToKeranjang() {
        tokoCNTRL = new TokoController();
        mknCNTRL = new MakananController();
        driver = new DriverOnlineShop(this);
        keranjangCNTRL = new KeranjangController();
        
        initComponents();
        
    }
    
    public void addToKeranjang(String namaToko, String alamat, int idMakanan,String namaMakanan, int stok, double harga){
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.idMakanan = idMakanan;
        this.namaMakanan = namaMakanan;
        this.stok = stok;
        this.harga = harga;
        
        namaTokoDisplay.setText(namaToko);
        alamatTokoDisplay.setText(alamat);
        namaMakananDisplay.setText(namaMakanan);
        stokMakananDisplay.setText(String.valueOf(stok));
        hargaMakananDisplay.setText(String.valueOf(harga));
        
        totalHargaMakananDisplay.setText("");
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
        namaTokoDisplay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alamatTokoDisplay = new javax.swing.JLabel();
        kembaliBTN = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        namaMakananDisplay = new javax.swing.JLabel();
        jlabel1 = new javax.swing.JLabel();
        stokMakananDisplay = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        hargaMakananDisplay = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        totalHargaMakananDisplay = new javax.swing.JLabel();
        tambahMakanan = new javax.swing.JButton();
        loadTotalHarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nama toko");

        namaTokoDisplay.setText("nama toko display");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Alamat toko");

        alamatTokoDisplay.setText("alamat toko display");

        kembaliBTN.setText("kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        jlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel.setText("Nama Makanan");

        namaMakananDisplay.setText("namaMakananDisplay");

        jlabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel1.setText("Stok");

        stokMakananDisplay.setText("Stok makanan");

        jlabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel2.setText("Harga Makanan");

        hargaMakananDisplay.setText("harga makanan");

        jlabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel3.setText("Total Harga");

        jlabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabel4.setText("Berapa porsi ?");

        totalHargaMakananDisplay.setText("total harga makanan");

        tambahMakanan.setText("masukan ke keranjang");
        tambahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahMakananActionPerformed(evt);
            }
        });

        loadTotalHarga.setText("refresh harga");
        loadTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTotalHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokMakananDisplay)
                    .addComponent(kembaliBTN)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(namaTokoDisplay))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamatTokoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jlabel)
                    .addComponent(namaMakananDisplay)
                    .addComponent(jlabel1)
                    .addComponent(jlabel2)
                    .addComponent(hargaMakananDisplay)
                    .addComponent(tambahMakanan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel4)
                    .addComponent(totalHargaMakananDisplay)
                    .addComponent(jlabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadTotalHarga)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBTN)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTokoDisplay)
                    .addComponent(alamatTokoDisplay))
                .addGap(66, 66, 66)
                .addComponent(jlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaMakananDisplay)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel1)
                    .addComponent(jlabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokMakananDisplay)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadTotalHarga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(jlabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaMakananDisplay)
                    .addComponent(totalHargaMakananDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(tambahMakanan)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    private void loadTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTotalHargaActionPerformed
        totalPorsi = (int) jSpinner1.getValue();
        totalHarga = totalPorsi * harga;
        totalHargaMakananDisplay.setText(String.valueOf(totalHarga));
    }//GEN-LAST:event_loadTotalHargaActionPerformed

    private void tambahMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahMakananActionPerformed
        boolean status = keranjangCNTRL.tambahKeranjang(UserSession.getId(), idMakanan, namaMakanan, totalPorsi, totalHarga);
        int stokSekarang = stok - totalPorsi;
        boolean cek = mknCNTRL.updateStokMakanan(idMakanan, stokSekarang);
        driver.tambahKeranjang(status);
       
    }//GEN-LAST:event_tambahMakananActionPerformed

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
            java.util.logging.Logger.getLogger(addToKeranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addToKeranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addToKeranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addToKeranjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addToKeranjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatTokoDisplay;
    private javax.swing.JLabel hargaMakananDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JButton loadTotalHarga;
    private javax.swing.JLabel namaMakananDisplay;
    private javax.swing.JLabel namaTokoDisplay;
    private javax.swing.JLabel stokMakananDisplay;
    private javax.swing.JButton tambahMakanan;
    private javax.swing.JLabel totalHargaMakananDisplay;
    // End of variables declaration//GEN-END:variables
}