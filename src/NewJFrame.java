/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        
        start();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldNama = new javax.swing.JTextField();
        textFieldNomor = new javax.swing.JTextField();
        textFieldCari = new javax.swing.JTextField();
        comboBoxKategori = new javax.swing.JComboBox<>();
        buttonTambah = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonCari = new javax.swing.JButton();
        buttonEkspor = new javax.swing.JButton();
        buttonImpor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKontak = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pengelolaan Kontak");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("No. Telp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Kategori");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cari");

        textFieldNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textFieldNomor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        textFieldCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        comboBoxKategori.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kerja" }));

        buttonTambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonTambah.setText("Tambah");

        buttonUbah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonUbah.setText("Ubah");

        buttonHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonHapus.setText("Hapus");

        buttonCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCari.setText("Cari");

        buttonEkspor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonEkspor.setText("Ekspor");

        buttonImpor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonImpor.setText("Impor");

        tableKontak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Nomor", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(tableKontak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonHapus)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonEkspor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonImpor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCari)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(textFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonUbah)
                    .addComponent(buttonHapus)
                    .addComponent(buttonEkspor)
                    .addComponent(buttonImpor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muatKontak() {
        DefaultTableModel tableModel = (DefaultTableModel) tableKontak.getModel();
        tableModel.setRowCount(0);
        try (ResultSet rs = Contact.getKontak()) {
            while (rs != null && rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nama"),
                        rs.getString("nomor"),
                        rs.getString("kategori")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private class tambahKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textFieldNama.getText();
            String phone = textFieldNomor.getText();
            String category = comboBoxKategori.getSelectedItem().toString();
            if (validasiNomor(phone)) {
                Contact.tambahKontak(new Contact(name, phone, category));
                muatKontak();
                bersihkanField();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid phone number!");
            }
        }
    }

    private class ubahKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableKontak.getModel();
            int selectedRow = tableKontak.getSelectedRow();
            if (selectedRow >= 0) {
                String id = tableModel.getValueAt(selectedRow, 0).toString();
                String name = textFieldNama.getText();
                String phone = textFieldNomor.getText();
                String category = comboBoxKategori.getSelectedItem().toString();
                if (validasiNomor(phone)) {
                    Contact.ubahKontak(Integer.parseInt(id), new Contact(name, phone, category));
                    muatKontak();
                    bersihkanField();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid phone number!");
                }
            }
        }
    }

    private class hapusKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableKontak.getModel();
            int selectedRow = tableKontak.getSelectedRow();
            if (selectedRow >= 0) {
                String id = tableModel.getValueAt(selectedRow, 0).toString();
                Contact.hapusKontak(Integer.parseInt(id));
                muatKontak();
                bersihkanField();
            }
        }
    }

    private class cariKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel tableModel = (DefaultTableModel) tableKontak.getModel();
            String query = textFieldCari.getText();
            tableModel.setRowCount(0);
            try (ResultSet rs = Contact.cariKontak(query)) {
                while (rs != null && rs.next()) {
                    tableModel.addRow(new Object[]{
                            rs.getInt("id"),
                            rs.getString("nama"),
                            rs.getString("nomor"),
                            rs.getString("kategori")
                    });
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
  
    private class eksporKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Contact.eksporKeCSV();
        }
    }

    private class imporKontakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Contact.imporDariCSV();
            muatKontak();
        }
    }

    private void bersihkanField() {
        textFieldNama.setText("");
        textFieldNomor.setText("");
        comboBoxKategori.setSelectedIndex(0);
        tableKontak.clearSelection();
    }

    private boolean validasiNomor(String phone) {
        return phone.matches("\\d{10,15}");
    }
    
    private void start() {
        buttonTambah.addActionListener(new tambahKontakListener());
        buttonUbah.addActionListener(new ubahKontakListener());
        buttonHapus.addActionListener(new hapusKontakListener());
        buttonCari.addActionListener(new cariKontakListener());
        buttonEkspor.addActionListener(new eksporKontakListener());
        buttonImpor.addActionListener(new imporKontakListener());
        
        comboBoxKategori.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String kategoriTerpilih = (String) comboBoxKategori.getSelectedItem();
                    String deskripsi = "";

                    switch (kategoriTerpilih) {
                        case "Keluarga":
                            deskripsi = "Kontak yang merupakan anggota keluarga.";
                            break;
                        case "Teman":
                            deskripsi = "Kontak yang merupakan teman pribadi.";
                            break;
                        case "Kerja":
                            deskripsi = "Kontak yang merupakan rekan kerja.";
                            break;
                        case "Lainnya":
                            deskripsi = "Kontak yang tidak termasuk dalam kategori di atas.";
                            break;
                    }
//                    JOptionPane.showMessageDialog(null, deskripsi);
                    System.out.println(deskripsi);
                }
            }
        });
        
        tableKontak.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                DefaultTableModel tableModel = (DefaultTableModel) tableKontak.getModel();
                int selectedRow = tableKontak.getSelectedRow();
                if (selectedRow >= 0) {
                    textFieldNama.setText(tableModel.getValueAt(selectedRow, 1).toString());
                    textFieldNomor.setText(tableModel.getValueAt(selectedRow, 2).toString());
                    comboBoxKategori.setSelectedItem(tableModel.getValueAt(selectedRow, 3).toString());
                }
            }
        });
        
        muatKontak();
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Database.createDatabase();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCari;
    private javax.swing.JButton buttonEkspor;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonImpor;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> comboBoxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKontak;
    private javax.swing.JTextField textFieldCari;
    private javax.swing.JTextField textFieldNama;
    private javax.swing.JTextField textFieldNomor;
    // End of variables declaration//GEN-END:variables
}
