/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tanciskola;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author Hp
 */
public class TancIskolaGUI extends javax.swing.JFrame {

     /**
      * Creates new form TancIskolaGUI
      */
     DefaultListModel tancModell = new DefaultListModel();

     List<Tanc> tancok = new ArrayList<>();

     public TancIskolaGUI() {
          initComponents();
          myInit();
     }

     /**
      * This method is called from within the constructor to initialize the
      * form. WARNING: Do NOT modify this code. The content of this method is
      * always regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          buttonGroup1 = new javax.swing.ButtonGroup();
          jComboBox1 = new javax.swing.JComboBox<>();
          jScrollPane1 = new javax.swing.JScrollPane();
          jList1 = new javax.swing.JList<>();
          jLabel1 = new javax.swing.JLabel();
          jPanel1 = new javax.swing.JPanel();
          jRadioButton1 = new javax.swing.JRadioButton();
          jRadioButton2 = new javax.swing.JRadioButton();
          jRadioButton3 = new javax.swing.JRadioButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("Tánciskolai Vizsga");

          jComboBox1.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jComboBox1ItemStateChanged(evt);
               }
          });

          jScrollPane1.setViewportView(jList1);

          buttonGroup1.add(jRadioButton1);
          jRadioButton1.setText("Leány");
          jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
               public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jRadioButton1StateChanged(evt);
               }
          });

          buttonGroup1.add(jRadioButton2);
          jRadioButton2.setText("Fiú");
          jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
               public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jRadioButton2StateChanged(evt);
               }
          });

          buttonGroup1.add(jRadioButton3);
          jRadioButton3.setText("Tánc");
          jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener() {
               public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jRadioButton3StateChanged(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(82, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jRadioButton1)
                    .addGap(24, 24, 24)
                    .addComponent(jRadioButton2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(34, 34, 34)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(64, 64, 64)
                              .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(102, 102, 102))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(120, 120, 120)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(33, 33, 33)
                              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(57, 57, 57)
                              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(18, 18, 18)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(118, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton1StateChanged
          comboBoxFeltolt();
     }//GEN-LAST:event_jRadioButton1StateChanged

     private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
          comboBoxFeltolt();
     }//GEN-LAST:event_jRadioButton2StateChanged

     private void jRadioButton3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton3StateChanged
          comboBoxFeltolt();
     }//GEN-LAST:event_jRadioButton3StateChanged

     private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
          
          if(jComboBox1.getItemCount()==0){
               return;
          }
          tancModell.clear();
          String ertek= jComboBox1.getSelectedItem().toString();
          jLabel1.setText("A kiválasztott elem: " +ertek);
          for (Tanc tanc : tancok) {
               if(tanc.vanBenne(ertek)){
                    tancModell.addElement(tanc.masikKetto(ertek));
               }
          }
     }//GEN-LAST:event_jComboBox1ItemStateChanged

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
               java.util.logging.Logger.getLogger(TancIskolaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(TancIskolaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(TancIskolaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(TancIskolaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new TancIskolaGUI().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup buttonGroup1;
     private javax.swing.JComboBox<String> jComboBox1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JList<String> jList1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButton jRadioButton3;
     private javax.swing.JScrollPane jScrollPane1;
     // End of variables declaration//GEN-END:variables

     private void myInit() {
          jList1.setModel(tancModell);
          feltolt("tancrend.txt");
     }

     private void feltolt(String fileName) {

          try {
               RandomAccessFile bemenet = new RandomAccessFile(fileName, "r");
               while (bemenet.getFilePointer() < bemenet.length()) {
                    tancok.add(new Tanc(bemenet.readLine(), bemenet.readLine(), bemenet.readLine()));
               }
               bemenet.close();
          } catch (IOException e) {
               System.out.println("Hiba: " + e.getMessage());
          }

     }

     private void comboBoxFeltolt() {
          
          TreeSet<String> listahoz = new TreeSet<>();
          if(jRadioButton1.isSelected()){ //leány
               for (Tanc elem : tancok) {
                    listahoz.add(elem.getLany());
               }
          }
          if(jRadioButton2.isSelected()){ //fiú
               for (Tanc elem : tancok) {
                    listahoz.add(elem.getFiu());
               }
          }
          
          if(jRadioButton3.isSelected()){ //tánc
               for (Tanc elem : tancok) {
                    listahoz.add(elem.getNev());
               }
          }

//          for (Tanc elem : tancok) {
//               if(jRadioButton1.isSelected() ){
//                    listahoz.add(elem. getLany());
//               }
//               
//               if(jRadioButton2.isSelected() ){
//                    listahoz.add(elem. getFiu());
//               }
//               
//               if(jRadioButton3.isSelected() ){
//                    listahoz.add(elem. getNev());
//               }
//          }

               jComboBox1.removeAllItems();
               for (String elem : listahoz) {
                    jComboBox1.addItem(elem);
          }
               jComboBox1.setSelectedItem(0);
               
               

     }
}