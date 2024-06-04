package View;

import Controller.MakananController;
import Controller.TokoController;
import Model.DriverOnlineShop;
import Model.Makanan;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class DetailToko extends javax.swing.JFrame {

    /**
     * Creates new form DetailToko
     */
    
    private DriverOnlineShop driver;
    private TokoController tokoCNTRL;
    private MakananController mknCNTRL;
    private DefaultTableModel table_model;
    public int idToko;
    public String namaToko, alamat;
    
    
    public DetailToko() {
        tokoCNTRL = new TokoController();
        mknCNTRL = new MakananController();
        
        initComponents();
    }
    
    public void DetailToko(int idToko, String namaToko, String alamat){
        this.idToko = idToko;
        this.namaToko = namaToko;
        this.alamat = alamat;
        
        namaTokoDisplay.setText(namaToko);
        alamatTokoDisplay.setText(alamat);
        
        String[] judulTable = {"id makanan", "nama makanan", "harga"};
        table_model = new DefaultTableModel(judulTable, 0);
        tableMakanan.setModel(table_model);
        
        loadData(idToko);
    }
    
    public void loadData(int idToko){
        List<Makanan> dataMakanan = mknCNTRL.getMakananByToko(idToko);
        
        if (dataMakanan == null) {
            System.out.println("null");
        } else {
            System.out.println(dataMakanan.size());
            System.out.println(idToko);
            for(Makanan makanan : dataMakanan){
            Object[] rowData = {
                makanan.getId_makanan(),
                makanan.getNamaBarang(),
                makanan.getHarga()
            };
                table_model.addRow(rowData);
            }
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMakanan = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alamatTokoDisplay = new javax.swing.JLabel();
        kembaliBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nama toko");

        namaTokoDisplay.setText("nama toko display");

        tableMakanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMakanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMakananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMakanan);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Detail menu toko");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Alamat toko");

        alamatTokoDisplay.setText("alamat toko display");

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
                    .addComponent(jLabel1)
                    .addComponent(namaTokoDisplay)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(alamatTokoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembaliBTN))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembaliBTN)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTokoDisplay)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatTokoDisplay)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    private void tableMakananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMakananMouseClicked
        int selectedRow = tableMakanan.getSelectedRow();
        if (selectedRow != -1) {
            int idMakanan = (int) table_model.getValueAt(selectedRow, 0);
            String namaMakanan = table_model.getValueAt(selectedRow, 1).toString();
            double harga = Double.parseDouble(table_model.getValueAt(selectedRow, 2).toString());
            
            addToKeranjang addkeranjang = new addToKeranjang();
            addkeranjang.addToKeranjang(namaToko, alamat, idMakanan, namaMakanan, harga);
            addkeranjang.setVisible(true);
        }
    }//GEN-LAST:event_tableMakananMouseClicked

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
            java.util.logging.Logger.getLogger(DetailToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailToko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatTokoDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JLabel namaTokoDisplay;
    private javax.swing.JTable tableMakanan;
    // End of variables declaration//GEN-END:variables
}
