/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otszazgui;

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
public class NewJFrame extends javax.swing.JFrame {

     /**
      * Creates new form NewJFrame
      */
     
     
     
     List<Vasarlas> vasarlasok= new ArrayList<>();
     
     DefaultListModel cikkekModell = new DefaultListModel();
     DefaultListModel vasarlasokIdModell = new DefaultListModel();
     
     public NewJFrame() {
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

          jButton1 = new javax.swing.JButton();
          jLabel1 = new javax.swing.JLabel();
          jSlider1 = new javax.swing.JSlider();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jButton2 = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          jList1 = new javax.swing.JList<>();
          jLabel5 = new javax.swing.JLabel();
          jComboBox1 = new javax.swing.JComboBox<>();
          jLabel6 = new javax.swing.JLabel();
          jLabel7 = new javax.swing.JLabel();
          jScrollPane2 = new javax.swing.JScrollPane();
          jList2 = new javax.swing.JList<>();
          jButton3 = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("otszazKisatlakitassal");

          jButton1.setText("Kilepes");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          jLabel1.setText("Aprosagok boltja");

          jSlider1.setMinimum(1);
          jSlider1.setValue(1);
          jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
               public void stateChanged(javax.swing.event.ChangeEvent evt) {
                    jSlider1StateChanged(evt);
               }
          });

          jLabel2.setText("1");

          jLabel3.setText("jLabel3");

          jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
          jLabel4.setText("1");

          jButton2.setText("Feldolgozas");
          jButton2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
               }
          });

          jScrollPane1.setViewportView(jList1);

          jComboBox1.addItemListener(new java.awt.event.ItemListener() {
               public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    jComboBox1ItemStateChanged(evt);
               }
          });

          jLabel6.setText("V?s?rolt term?kek");

          jLabel7.setText("Ezen sorsz?m? v?s?rl?skor vettek ilyen term?ket");

          jScrollPane2.setViewportView(jList2);

          jButton3.setText("<==");
          jButton3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(277, 277, 277))
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(97, 97, 97)
                              .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(30, 30, 30)
                              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(layout.createSequentialGroup()
                              .addGap(73, 73, 73)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton3)
                                        .addGap(27, 27, 27)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(165, 165, 165)
                                        .addComponent(jLabel3)))))
                    .addGap(0, 54, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(23, 23, 23))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(jButton2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGroup(layout.createSequentialGroup()
                              .addGap(20, 20, 20)
                              .addComponent(jLabel6)
                              .addGap(40, 40, 40)
                              .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(40, 40, 40))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jButton2)
                         .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel6))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel7)
                              .addGap(18, 18, 18)
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addContainerGap(62, Short.MAX_VALUE))
                         .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addGap(18, 18, 18)))
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                   .addComponent(jButton1)
                                   .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(17, 17, 17))))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0);
     }//GEN-LAST:event_jButton1ActionPerformed

     private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
         jLabel4.setText(""+jSlider1.getValue());
     }//GEN-LAST:event_jSlider1StateChanged

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int index= jSlider1.getValue();
         // az id-k nem felt?tlen vannak sorban ?s lehet hi?nyos is
         
         Vasarlas teszt = new Vasarlas(index);
         Vasarlas keresett= vasarlasok.get(vasarlasok.indexOf(teszt) );
         List<String> cikkek= keresett .getCikkek();
         cikkekModell.clear();
          for (String egyCikk : cikkek) {
               cikkekModell.addElement(egyCikk);
          }
          
          jLabel5.setText(keresett.vasarlasErteke()+"Ft");
                  
     }//GEN-LAST:event_jButton2ActionPerformed

     private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
         
          int darabVasarlas= 0;
          String mibol= jComboBox1.getSelectedItem().toString();
          vasarlasokIdModell.clear();
          for (Vasarlas elem : vasarlasok) {
               if(elem.vettekIlyen(mibol)){
                    darabVasarlas++;
                    vasarlasokIdModell.addElement(elem.getId());
                    
               } 
          }
          
          jLabel7.setText(darabVasarlas+" vasarl? vett "+ mibol+" term?ket.");
     }//GEN-LAST:event_jComboBox1ItemStateChanged

     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
     }//GEN-LAST:event_jButton3ActionPerformed

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

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new NewJFrame().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JButton jButton3;
     private javax.swing.JComboBox<String> jComboBox1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JList<String> jList1;
     private javax.swing.JList<String> jList2;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JSlider jSlider1;
     // End of variables declaration//GEN-END:variables

     private void myInit() {
      //    Map<Integer,List<String>> vasarlasok= new HashMap<>();
      
      
      feltolt(vasarlasok,"otszaz.txt");
      
      sliderInit();
      
      jList1.setModel(cikkekModell);
      
      jList2.setModel(vasarlasokIdModell);
      legorduloTermekekFeltoltese();
      
     }

     private void feltolt(List<Vasarlas> vasarlasok, String otszaztxt) {
          
          try {
               RandomAccessFile bemenet = new RandomAccessFile(otszaztxt, "r");
               int vasalasSorszama=1;
               while(bemenet.getFilePointer()<bemenet.length()){
                    String result= "";
                    String olvasott = "";
                    do {                         
                       olvasott = bemenet.readLine();
                       if(olvasott.equals("F")){
                            break;
                       } else{
                            result+= olvasott+"\t";
                       }
                    } while (true);
                    vasarlasok.add(new Vasarlas(vasalasSorszama++, result.trim() )); 
               }
               bemenet.close();
          } catch (IOException e) {
               System.err.println("Hiba: "+ e.toString());
          }
     }

     private void sliderInit() {
          jLabel3.setText(""+ vasarlasok.size());
          jSlider1.setMaximum(vasarlasok.size());
          
          
     }

     private void legorduloTermekekFeltoltese() {
          TreeSet<String> aruCikkek = new TreeSet<>();
          for (Vasarlas elem: vasarlasok) {
               aruCikkek.addAll(elem.getCikkek());
               
           
          }
          
          for (String cikk : aruCikkek) {
               jComboBox1.addItem(cikk);
               
          }
          
          jComboBox1.setSelectedIndex(0);
     }
}
