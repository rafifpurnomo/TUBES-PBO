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
    public int idToko, idMakanan, totalPorsi;
    public String namaToko, alamat, namaMakanan;
    public double harga, totalHarga;
    
    
    public addToKeranjang() {
        tokoCNTRL = new TokoController();
        mknCNTRL = new MakananController();
        driver = new DriverOnlineShop(this);
        keranjangCNTRL = new KeranjangController();
        
        initComponents();
        
    }
    
    public void addToKeranjang(String namaToko, String alamat, int idMakanan,String namaMakanan, double harga){
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.idMakanan = idMakanan;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        
        namaTokoDisplay.setText(namaToko);
        alamatTokoDisplay.setText(alamat);
        namaMakananDisplay.setText(namaMakanan);
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

        jPanel1 = new javax.swing.JPanel();
        kembaliBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namaTokoDisplay = new javax.swing.JLabel();
        alamatTokoDisplay = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        namaMakananDisplay = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        hargaMakananDisplay = new javax.swing.JLabel();
        tambahMakanan = new javax.swing.JButton();
        totalHargaMakananDisplay = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jlabel4 = new javax.swing.JLabel();
        loadTotalHarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(196, 202, 196));

        kembaliBTN.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        kembaliBTN.setText("<-");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel2.setText("Pesanan Makanan");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nama toko:");

        namaTokoDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        namaTokoDisplay.setText("nama toko display");

        alamatTokoDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alamatTokoDisplay.setText("alamat toko display");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Alamat toko:");

        jlabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabel.setText("Nama Makanan:");

        namaMakananDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        namaMakananDisplay.setText("namaMakananDisplay");

        jlabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabel2.setText("Harga Makanan:");

        hargaMakananDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hargaMakananDisplay.setText("harga makanan");

        tambahMakanan.setBackground(new java.awt.Color(85, 102, 85));
        tambahMakanan.setText("Tambahkan ke Keranjang");
        tambahMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahMakananActionPerformed(evt);
            }
        });

        totalHargaMakananDisplay.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalHargaMakananDisplay.setText("total harga makanan");

        jlabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabel3.setText("Total Harga:");

        jlabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlabel4.setText("Berapa Porsi?");

        loadTotalHarga.setBackground(new java.awt.Color(85, 102, 85));
        loadTotalHarga.setText("Refresh");
        loadTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTotalHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 308, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alamatTokoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaMakananDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaTokoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hargaMakananDisplay))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalHargaMakananDisplay))
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(243, 243, 243))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembaliBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(tambahMakanan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(387, 387, 387))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loadTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBTN)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(namaMakananDisplay))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaTokoDisplay))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamatTokoDisplay))
                .addGap(36, 36, 36)
                .addComponent(jlabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel2)
                    .addComponent(hargaMakananDisplay))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel3)
                    .addComponent(totalHargaMakananDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(tambahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loadTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JButton loadTotalHarga;
    private javax.swing.JLabel namaMakananDisplay;
    private javax.swing.JLabel namaTokoDisplay;
    private javax.swing.JButton tambahMakanan;
    private javax.swing.JLabel totalHargaMakananDisplay;
    // End of variables declaration//GEN-END:variables
}
