/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author jessl
 */
public class Mesas extends javax.swing.JPanel {

    /**
     * Creates new form Mesas
     */
    public Mesas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _Display = new javax.swing.JPanel();
        M1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        M1Estado = new javax.swing.JLabel();
        M2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        M2Estado = new javax.swing.JLabel();
        M3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        M3Estado = new javax.swing.JLabel();
        M4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        M4Estado = new javax.swing.JLabel();

        _Display.setBackground(new java.awt.Color(238, 230, 220));
        _Display.setAlignmentX(0.0F);
        _Display.setAlignmentY(0.0F);
        _Display.setPreferredSize(new java.awt.Dimension(450, 450));

        M1.setBackground(new java.awt.Color(53, 29, 27));
        M1.setAlignmentX(0.0F);
        M1.setAlignmentY(0.0F);
        M1.setMinimumSize(new java.awt.Dimension(210, 210));
        M1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                M1MouseExited(evt);
            }
        });
        M1.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Enmascarar grupo 1.png"))); // NOI18N
        M1.add(jLabel9);
        jLabel9.setBounds(60, 60, 80, 80);

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mesa 1");
        M1.add(jLabel5);
        jLabel5.setBounds(60, 10, 80, 40);

        M1Estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"))); // NOI18N
        M1.add(M1Estado);
        M1Estado.setBounds(50, 160, 100, 30);

        M2.setBackground(new java.awt.Color(53, 29, 27));
        M2.setAlignmentX(0.0F);
        M2.setAlignmentY(0.0F);
        M2.setMinimumSize(new java.awt.Dimension(210, 210));
        M2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                M2MouseExited(evt);
            }
        });
        M2.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Enmascarar grupo 1.png"))); // NOI18N
        M2.add(jLabel8);
        jLabel8.setBounds(70, 60, 80, 80);

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mesa 2");
        M2.add(jLabel6);
        jLabel6.setBounds(70, 10, 80, 40);

        M2Estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"))); // NOI18N
        M2.add(M2Estado);
        M2Estado.setBounds(60, 160, 100, 30);

        M3.setBackground(new java.awt.Color(53, 29, 27));
        M3.setAlignmentX(0.0F);
        M3.setAlignmentY(0.0F);
        M3.setMinimumSize(new java.awt.Dimension(210, 210));
        M3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                M3MouseExited(evt);
            }
        });
        M3.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Enmascarar grupo 1.png"))); // NOI18N
        M3.add(jLabel7);
        jLabel7.setBounds(60, 60, 80, 80);

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa 3");
        M3.add(jLabel4);
        jLabel4.setBounds(60, 10, 80, 40);

        M3Estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"))); // NOI18N
        M3.add(M3Estado);
        M3Estado.setBounds(50, 160, 100, 30);

        M4.setBackground(new java.awt.Color(53, 29, 27));
        M4.setAlignmentX(0.0F);
        M4.setAlignmentY(0.0F);
        M4.setMinimumSize(new java.awt.Dimension(210, 210));
        M4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                M4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                M4MouseExited(evt);
            }
        });
        M4.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Enmascarar grupo 1.png"))); // NOI18N
        M4.add(jLabel2);
        jLabel2.setBounds(70, 60, 80, 80);

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mesa 4");
        M4.add(jLabel10);
        jLabel10.setBounds(70, 10, 80, 40);

        M4Estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"))); // NOI18N
        M4.add(M4Estado);
        M4Estado.setBounds(60, 160, 100, 30);

        javax.swing.GroupLayout _DisplayLayout = new javax.swing.GroupLayout(_Display);
        _Display.setLayout(_DisplayLayout);
        _DisplayLayout.setHorizontalGroup(
            _DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        _DisplayLayout.setVerticalGroup(
            _DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(_DisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(_DisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(_Display, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(_Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void M1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M1MouseEntered
        // TODO add your handling code here:
        M1.setBackground(DarkBrown);
    }//GEN-LAST:event_M1MouseEntered

    private void M1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M1MouseExited
        // TODO add your handling code here:
        M1.setBackground(DeepBrown);
    }//GEN-LAST:event_M1MouseExited

    private void M2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseEntered
        // TODO add your handling code here:
        M2.setBackground(DarkBrown);
    }//GEN-LAST:event_M2MouseEntered

    private void M2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseExited
        // TODO add your handling code here:
        M2.setBackground(DeepBrown);
    }//GEN-LAST:event_M2MouseExited

    private void M3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M3MouseEntered
        // TODO add your handling code here:
        M3.setBackground(DarkBrown);
    }//GEN-LAST:event_M3MouseEntered

    private void M3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M3MouseExited
        // TODO add your handling code here:
        M3.setBackground(DeepBrown);
    }//GEN-LAST:event_M3MouseExited

    private void M4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MouseEntered
        // TODO add your handling code here:
        M4.setBackground(DarkBrown);
    }//GEN-LAST:event_M4MouseEntered

    private void M4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MouseExited
        // TODO add your handling code here:
        M4.setBackground(DeepBrown);
    }//GEN-LAST:event_M4MouseExited

    private void M1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M1MouseClicked
        // TODO add your handling code here:
        DisplayOrden OrdenM1 = new DisplayOrden(1);
        OrdenM1.setBounds(0,0,450,460);
        try {
            OrdenM1.setHoraDeUso();
        } catch (IOException ex) {
            Logger.getLogger(Mesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        _Display.removeAll();
        _Display.add(OrdenM1);
        _Display.updateUI();
    }//GEN-LAST:event_M1MouseClicked

    private void M2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M2MouseClicked
        // TODO add your handling code here:
        DisplayOrden OrdenM2 = new DisplayOrden(2);
        try {
            OrdenM2.setHoraDeUso();
        } catch (IOException ex) {
            Logger.getLogger(Mesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        setDisplay(OrdenM2);
    }//GEN-LAST:event_M2MouseClicked

    private void M3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M3MouseClicked
        // TODO add your handling code here:
        DisplayOrden OrdenM3 = new DisplayOrden(3);
        try {
            OrdenM3.setHoraDeUso();
        } catch (IOException ex) {
            Logger.getLogger(Mesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        setDisplay(OrdenM3);
    }//GEN-LAST:event_M3MouseClicked

    private void M4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M4MouseClicked
        // TODO add your handling code here:
        DisplayOrden OrdenM4 = new DisplayOrden(4);
        try {
            OrdenM4.setHoraDeUso();
        } catch (IOException ex) {
            Logger.getLogger(Mesas.class.getName()).log(Level.SEVERE, null, ex);
        }
        setDisplay(OrdenM4);
    }//GEN-LAST:event_M4MouseClicked
/******************************************************************************/
    
    public void setDisplay(JPanel a){
        a.setBounds(0,0,450,460);
        _Display.removeAll();
        _Display.add(a);
        _Display.updateUI();
    }
    
    public void ChangeIcon1() throws FileNotFoundException, IOException{    
        
        FileInputStream fis = new FileInputStream("m1libre.bin");
        DataInputStream dis = new DataInputStream(fis);
        
        if(dis.readBoolean()){
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"));
            M1Estado.setIcon(ic);
        }
        else{
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa 2.png"));
            M1Estado.setIcon(ic);
        }
        
        fis.close();
        dis.close();
        
    }
    
    public void ChangeIcon2() throws FileNotFoundException, IOException{    
        
        FileInputStream fis = new FileInputStream("m2libre.bin");
        DataInputStream dis = new DataInputStream(fis);
        
        if(dis.readBoolean()){
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"));
            M2Estado.setIcon(ic);
        }
        else{
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa 2.png"));
            M2Estado.setIcon(ic);
        }
        
        fis.close();
        dis.close();
        
    }
    
    public void ChangeIcon3() throws FileNotFoundException, IOException{    
        
        FileInputStream fis = new FileInputStream("m3libre.bin");
        DataInputStream dis = new DataInputStream(fis);
        
        if(dis.readBoolean()){
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"));
            M3Estado.setIcon(ic);
        }
        else{
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa 2.png"));
            M3Estado.setIcon(ic);
        }
        
        fis.close();
        dis.close();
        
    }
    
    public void ChangeIcon4() throws FileNotFoundException, IOException{    
        
        FileInputStream fis = new FileInputStream("m4libre.bin");
        DataInputStream dis = new DataInputStream(fis);
        
        if(dis.readBoolean()){
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa.png"));
            M4Estado.setIcon(ic);
        }
        else{
            ImageIcon ic = new ImageIcon(getClass().getResource("/Icons/Estado de mesa 2.png"));
            M4Estado.setIcon(ic);
        }
        
        fis.close();
        dis.close();
        
    }
    
    Color DeepBrown = new Color(53,29,27);
    Color DarkBrown = new Color(80, 40, 0);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel M1;
    private javax.swing.JLabel M1Estado;
    private javax.swing.JPanel M2;
    private javax.swing.JLabel M2Estado;
    private javax.swing.JPanel M3;
    private javax.swing.JLabel M3Estado;
    private javax.swing.JPanel M4;
    private javax.swing.JLabel M4Estado;
    private javax.swing.JPanel _Display;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
