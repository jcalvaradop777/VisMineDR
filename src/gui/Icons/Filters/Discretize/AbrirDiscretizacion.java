/*
 * AbrirRemMissing.java
 *
 */

/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package gui.Icons.Filters.Discretize;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author  Tariy
 */
public class AbrirDiscretizacion extends javax.swing.JFrame {
    AbstractTableModel datosEntrada;
    String atributos[];
    int colsel, pa, val, bdrbtn;
    /** Creates new form AbrirRemMissing */
    public AbrirDiscretizacion(AbstractTableModel dataIn) {
        datosEntrada = dataIn;
        atributos = new String[datosEntrada.getColumnCount()+1];
        pa = 1;
        atributos[0] = "Select an attribute";
        for(int i = 0; i < datosEntrada.getColumnCount(); i++) {
          if(datosEntrada.getColumnClass(i).getSimpleName().equals("Integer")) {
             atributos[pa] = datosEntrada.getColumnName(i);
             pa ++;
          } 
        }
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BtnAplicar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CmbAtributos = new javax.swing.JComboBox();
        BtnReset = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        TexNR = new javax.swing.JTextField();
        TexTR = new javax.swing.JTextField();
        RbtnNR = new javax.swing.JRadioButton();
        RbtnTR = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configure Filter");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 81, 133));

        BtnAplicar.setForeground(new java.awt.Color(51, 51, 51));
        BtnAplicar.setText("Play");
        BtnAplicar.setToolTipText("Execute the Configuration");
        BtnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAplicarActionPerformed(evt);
            }
        });
        BtnAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAplicarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attribute   :");

        CmbAtributos.setFont(new java.awt.Font("Tahoma", 0, 12));
        CmbAtributos.setModel(new javax.swing.DefaultComboBoxModel(atributos));
        CmbAtributos.setToolTipText("Select an attribute");

        BtnReset.setForeground(new java.awt.Color(51, 51, 51));
        BtnReset.setText("Reset");
        BtnReset.setToolTipText("Reset the Parameters");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        BtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnResetMouseClicked(evt);
            }
        });

        BtnCerrar.setForeground(new java.awt.Color(51, 51, 51));
        BtnCerrar.setText("Close");
        BtnCerrar.setToolTipText("Close Configuration");
        BtnCerrar.setEnabled(false);
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Discretize by :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(185, 220, 255))); // NOI18N

        TexNR.setFont(new java.awt.Font("Tahoma", 0, 12));
        TexNR.setToolTipText("Number of Range");
        TexNR.setBounds(170, 20, 80, 30);
        jLayeredPane1.add(TexNR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TexTR.setFont(new java.awt.Font("Tahoma", 0, 12));
        TexTR.setToolTipText("Size of Range");
        TexTR.setEnabled(false);
        TexTR.setBounds(170, 70, 80, 30);
        jLayeredPane1.add(TexTR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(RbtnNR);
        RbtnNR.setSelected(true);
        RbtnNR.setText("Number of Range   :");
        RbtnNR.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        RbtnNR.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RbtnNR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RbtnNRItemStateChanged(evt);
            }
        });
        RbtnNR.setBounds(10, 30, 140, -1);
        jLayeredPane1.add(RbtnNR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonGroup1.add(RbtnTR);
        RbtnTR.setText("Size of Range         :");
        RbtnTR.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        RbtnTR.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RbtnTR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RbtnTRItemStateChanged(evt);
            }
        });
        RbtnTR.setBounds(10, 70, 140, -1);
        jLayeredPane1.add(RbtnTR, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(15, 15, 15)
                        .add(CmbAtributos, 0, 183, Short.MAX_VALUE))
                    .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(BtnAplicar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BtnReset, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(BtnCerrar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(CmbAtributos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(BtnAplicar)
                    .add(BtnReset)
                    .add(BtnCerrar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 253, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbtnNRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RbtnNRItemStateChanged
// TODO add your handling code here:
        TexNR.setEnabled(true);
        TexTR.setEnabled(false);
    }//GEN-LAST:event_RbtnNRItemStateChanged

    private void RbtnTRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RbtnTRItemStateChanged
// TODO add your handling code here:
        TexNR.setEnabled(false);
        TexTR.setEnabled(true);
    }//GEN-LAST:event_RbtnTRItemStateChanged

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        CmbAtributos.setModel(new javax.swing.DefaultComboBoxModel(atributos));
        TexNR.setText("");
        TexTR.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResetMouseClicked
        
    }//GEN-LAST:event_BtnResetMouseClicked

    private void BtnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAplicarActionPerformed
        String cad = "";
        char uc; 
        int x=0;
        //------------------------   
        colsel = datosEntrada.findColumn(CmbAtributos.getModel().getSelectedItem().toString());
        if(colsel == -1){
            TexNR.setText("");
            TexNR.setText("");                     
            JOptionPane.showMessageDialog(this, "you must select some attribute",
            "Error in Configure Discretize",JOptionPane.ERROR_MESSAGE);
        }
        else {
            
            if(RbtnNR.isSelected()) {
               cad = TexNR.getText();
               bdrbtn = 0;
            }
            else if(RbtnTR.isSelected()) {
               cad = TexTR.getText();
               bdrbtn = 1;
            }      
            x=0;
                      
            for(int y = 0; y < cad.length(); y++) { 
              uc = cad.charAt(y);
              if(uc>47 && uc<58) x++;              
            }
            if(x==cad.length()) {
                 val = Integer.parseInt(cad);
                 BtnCerrar.setEnabled(true);
            }
            else {
              JOptionPane.showMessageDialog(this, "The value must be numerical",
              "Error in Configure Rango Numerico",JOptionPane.ERROR_MESSAGE); 
            }              
        } 
    }//GEN-LAST:event_BtnAplicarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        dispose();    
        //System.exit( 0 );
    }//GEN-LAST:event_BtnCerrarActionPerformed
    
    private void BtnAplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAplicarMouseClicked
       
    }//GEN-LAST:event_BtnAplicarMouseClicked
    
    public int getColSelec () {
       return colsel; 
    }
    
    public int getValor () {
       return val; 
    }
      
    public int getSelRbtn () {
       return bdrbtn; 
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAplicar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnReset;
    private javax.swing.JComboBox CmbAtributos;
    private javax.swing.JRadioButton RbtnNR;
    private javax.swing.JRadioButton RbtnTR;
    private javax.swing.JTextField TexNR;
    private javax.swing.JTextField TexTR;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}