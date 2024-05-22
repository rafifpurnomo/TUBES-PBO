/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.MakananController;
import Controller.TokoController;
import Model.DriverOnlineShop;
import Model.UserSession;
import Model.Toko;
import static java.awt.Frame.NORMAL;
import static java.awt.image.ImageObserver.ERROR;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Rafif A.P
 */
public class MenuPembeli extends javax.swing.JFrame {

    /**
     * Creates new form MenuPembeli
     */
    
    private DriverOnlineShop driver;
    private TokoController tokoCNTRL;
    private MakananController mknCNTRL;
    private DefaultTableModel table_model;
    
    public MenuPembeli() {
        driver = new DriverOnlineShop(this);
        tokoCNTRL = new TokoController();
        mknCNTRL = new MakananController();
        
        initComponents();
        int idUser = UserSession.getId();
        
        String namaUser = UserSession.getNama();
        String noTelpon = UserSession.getNoTelpon();
        String Username = UserSession.getUsername();
        
        NamaUserHome.setText(namaUser);
        NamaUserProfile.setText(namaUser);
        NoTelpUserProfile.setText(noTelpon);
        UsernameUserProfile.setText(Username);        
        
        String[] judulTabel = {"id toko", "nama toko", "alamat toko"};
        table_model = new DefaultTableModel(judulTabel, 0);
        daftarTokoMakanan.setModel(table_model);
        
        loadToko();
    }
    
    private void loadToko(){
        List<Toko> dataToko = tokoCNTRL.getAllToko();
        
        for(Toko toko : dataToko){
            Object[] rowData = {
                toko.getId_toko(),
                toko.getNamaToko(),
                toko.getAlamatToko()
        };
        table_model.addRow(rowData);
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

        MenuPembeli = new javax.swing.JTabbedPane();
        HomePembeli = new javax.swing.JPanel();
        SelamatDatang = new javax.swing.JLabel();
        NamaUserHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cariToko = new javax.swing.JTextField();
        cariTokoBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarTokoMakanan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        updateDaftarTokoBTN = new javax.swing.JButton();
        KeranjangPembeli = new javax.swing.JPanel();
        ProfilePembeli = new javax.swing.JPanel();
        LogoutBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UsernameUserProfile = new javax.swing.JLabel();
        NamaUserProfile = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NoTelpUserProfile = new javax.swing.JLabel();
        UbahNama = new javax.swing.JButton();
        UbahUsername = new javax.swing.JButton();
        UbahNoTelpon = new javax.swing.JButton();
        UbahPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SelamatDatang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SelamatDatang.setText("Selamat datang:");

        NamaUserHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NamaUserHome.setText("Nama User");

        jLabel3.setText("Cari toko");

        cariTokoBTN.setText("Cari toko");
        cariTokoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTokoBTNActionPerformed(evt);
            }
        });

        daftarTokoMakanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(daftarTokoMakanan);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Daftar toko makanan");

        updateDaftarTokoBTN.setText("update daftar toko");
        updateDaftarTokoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDaftarTokoBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePembeliLayout = new javax.swing.GroupLayout(HomePembeli);
        HomePembeli.setLayout(HomePembeliLayout);
        HomePembeliLayout.setHorizontalGroup(
            HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePembeliLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePembeliLayout.createSequentialGroup()
                        .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomePembeliLayout.createSequentialGroup()
                                .addComponent(SelamatDatang)
                                .addGap(5, 5, 5)
                                .addComponent(NamaUserHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(HomePembeliLayout.createSequentialGroup()
                                .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(HomePembeliLayout.createSequentialGroup()
                                        .addComponent(cariToko, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cariTokoBTN)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(HomePembeliLayout.createSequentialGroup()
                        .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(HomePembeliLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateDaftarTokoBTN)))
                        .addGap(0, 182, Short.MAX_VALUE))))
        );
        HomePembeliLayout.setVerticalGroup(
            HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePembeliLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelamatDatang)
                    .addComponent(NamaUserHome))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariToko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariTokoBTN))
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDaftarTokoBTN))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        MenuPembeli.addTab("Home", HomePembeli);

        javax.swing.GroupLayout KeranjangPembeliLayout = new javax.swing.GroupLayout(KeranjangPembeli);
        KeranjangPembeli.setLayout(KeranjangPembeliLayout);
        KeranjangPembeliLayout.setHorizontalGroup(
            KeranjangPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        KeranjangPembeliLayout.setVerticalGroup(
            KeranjangPembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        MenuPembeli.addTab("Keranjang", KeranjangPembeli);

        LogoutBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogoutBTN.setText("Logout");
        LogoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nama:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username:");

        UsernameUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsernameUserProfile.setText("username user");

        NamaUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NamaUserProfile.setText("nama user");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("No Telpon:");

        NoTelpUserProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NoTelpUserProfile.setText("no telpon user");

        UbahNama.setText("Ubah Nama");
        UbahNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNamaActionPerformed(evt);
            }
        });

        UbahUsername.setText("Ubah Username");
        UbahUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahUsernameActionPerformed(evt);
            }
        });

        UbahNoTelpon.setText("Ubah no Telpon");
        UbahNoTelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNoTelponActionPerformed(evt);
            }
        });

        UbahPassword.setText("Ubah Password");
        UbahPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfilePembeliLayout = new javax.swing.GroupLayout(ProfilePembeli);
        ProfilePembeli.setLayout(ProfilePembeliLayout);
        ProfilePembeliLayout.setHorizontalGroup(
            ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfilePembeliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfilePembeliLayout.createSequentialGroup()
                        .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePembeliLayout.createSequentialGroup()
                                .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addGap(10, 10, 10))
                            .addGroup(ProfilePembeliLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)))
                        .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NoTelpUserProfile)
                            .addComponent(UsernameUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NamaUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UbahNama)
                            .addComponent(LogoutBTN)
                            .addComponent(UbahUsername)
                            .addComponent(UbahNoTelpon)))
                    .addComponent(UbahPassword))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        ProfilePembeliLayout.setVerticalGroup(
            ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfilePembeliLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NamaUserProfile)
                    .addComponent(UbahNama))
                .addGap(18, 18, 18)
                .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UsernameUserProfile)
                    .addComponent(UbahUsername))
                .addGap(18, 18, 18)
                .addGroup(ProfilePembeliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NoTelpUserProfile)
                    .addComponent(UbahNoTelpon))
                .addGap(18, 18, 18)
                .addComponent(UbahPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(LogoutBTN)
                .addGap(145, 145, 145))
        );

        MenuPembeli.addTab("Profile", ProfilePembeli);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPembeli)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPembeli)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTNActionPerformed
        UserSession.clearSession();
        
        Login LoginScreen = new Login();
        LoginScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBTNActionPerformed

    private void UbahNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNamaActionPerformed
        UbahNamaUser changeName = new UbahNamaUser();
        changeName.setVisible(true);
    }//GEN-LAST:event_UbahNamaActionPerformed

    private void UbahNoTelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNoTelponActionPerformed
        UbahNoTelpon changeNoTelpon = new UbahNoTelpon();
        changeNoTelpon.setVisible(true);
    }//GEN-LAST:event_UbahNoTelponActionPerformed

    private void UbahPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahPasswordActionPerformed
        UbahPassword changePassword = new UbahPassword();
        changePassword.setVisible(true);
    }//GEN-LAST:event_UbahPasswordActionPerformed

    private void UbahUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahUsernameActionPerformed
        UbahUsername changeUsername = new UbahUsername();
        changeUsername.setVisible(true);
    }//GEN-LAST:event_UbahUsernameActionPerformed

    private void cariTokoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTokoBTNActionPerformed
        cariToko.getText();
        
        daftarTokoMakanan.removeAll();
        int rows = table_model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            table_model.removeRow(i);
        }
        
        Toko newToko = tokoCNTRL.getTokoByNama(cariToko.getText());
        if (newToko == null) {
            JOptionPane.showMessageDialog(null, "toko tidak ada", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            Object[] returnSearch = {
                newToko.getId_toko(),
                newToko.getNamaToko(),
                newToko.getAlamatToko()
            };
            table_model.addRow(returnSearch);
        }
    }//GEN-LAST:event_cariTokoBTNActionPerformed

    private void updateDaftarTokoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDaftarTokoBTNActionPerformed
        daftarTokoMakanan.removeAll();
        int rows = table_model.getRowCount();
        for (int i = rows - 1; i >= 0; i--) {
            table_model.removeRow(i);
        }
        
        loadToko();
    }//GEN-LAST:event_updateDaftarTokoBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePembeli;
    private javax.swing.JPanel KeranjangPembeli;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JTabbedPane MenuPembeli;
    private javax.swing.JLabel NamaUserHome;
    private javax.swing.JLabel NamaUserProfile;
    private javax.swing.JLabel NoTelpUserProfile;
    private javax.swing.JPanel ProfilePembeli;
    private javax.swing.JLabel SelamatDatang;
    private javax.swing.JButton UbahNama;
    private javax.swing.JButton UbahNoTelpon;
    private javax.swing.JButton UbahPassword;
    private javax.swing.JButton UbahUsername;
    private javax.swing.JLabel UsernameUserProfile;
    private javax.swing.JTextField cariToko;
    private javax.swing.JButton cariTokoBTN;
    private javax.swing.JTable daftarTokoMakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateDaftarTokoBTN;
    // End of variables declaration//GEN-END:variables
}
