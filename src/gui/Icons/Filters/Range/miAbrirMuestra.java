/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * miAbrirMuestra.java
 *
 * Created on 25-may-2012, 14:18:55
 */
package gui.Icons.Filters.Range;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Juan Carlos
 */
public class miAbrirMuestra extends javax.swing.JFrame {
    
    AbstractTableModel datosEntrada;
    int rbtsel = 0, valmuestra = 0;  // valmuestra es el valor de la muestra que puede ser el de la
    // semilla o el de los valores de n, rbtsel es cual rbtn fue seleccionado

    /** Creates new form miAbrirMuestra */
    public miAbrirMuestra(AbstractTableModel dataIn) {
        datosEntrada = dataIn;
        initComponents();
    }
    
    public miAbrirMuestra() {
        initComponents();
    }
    
    public void setDatas(AbstractTableModel di, int rangeValue, int optionRange) {
        this.datosEntrada = di;
        if(optionRange==0){
            RbtnAle.setSelected(true);
            TexSem.setText(String.valueOf(rangeValue));
            
            TexSem.setEnabled(true);
            jLabel1.setEnabled(true);
            Tex1enn.setEnabled(false);
            jLabel2.setEnabled(false);
            TexPrim.setEnabled(false);
            jLabel3.setEnabled(false);
        }else if(optionRange==1){
            Rbtn1enn.setSelected(true);
            Tex1enn.setText(String.valueOf(rangeValue));
            
            TexSem.setEnabled(false);
            jLabel1.setEnabled(false);
            Tex1enn.setEnabled(true);
            jLabel2.setEnabled(true);
            TexPrim.setEnabled(false);
            jLabel3.setEnabled(false);
        }else if(optionRange==2){
            RbtnPrim.setSelected(true);
            TexPrim.setText(String.valueOf(rangeValue));
            
            TexSem.setEnabled(false);
            jLabel1.setEnabled(false);
            Tex1enn.setEnabled(false);
            jLabel2.setEnabled(false);
            TexPrim.setEnabled(true);
            jLabel3.setEnabled(true);
        }
 
    }
    
    public int getSelRbtn() {
        return rbtsel;
    }
    
    public int getValMues() {
        return valmuestra;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RbtnAle = new javax.swing.JRadioButton();
        Rbtn1enn = new javax.swing.JRadioButton();
        RbtnPrim = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        TexSem = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        Tex1enn = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        TexPrim = new javax.swing.JTextField();
        BtnAplicar = new javax.swing.JButton();
        BtnCerrar = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RbtnAle.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnAle);
        RbtnAle.setFont(new java.awt.Font("Tahoma", 1, 12));
        RbtnAle.setSelected(true);
        RbtnAle.setText("Random");
        RbtnAle.setToolTipText("Random");
        RbtnAle.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        RbtnAle.setBorderPainted(true);
        RbtnAle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RbtnAle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnAleActionPerformed(evt);
            }
        });

        Rbtn1enn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Rbtn1enn);
        Rbtn1enn.setFont(new java.awt.Font("Tahoma", 1, 12));
        Rbtn1enn.setText("1 in n");
        Rbtn1enn.setToolTipText("1 in n");
        Rbtn1enn.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Rbtn1enn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Rbtn1enn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn1ennActionPerformed(evt);
            }
        });

        RbtnPrim.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(RbtnPrim);
        RbtnPrim.setFont(new java.awt.Font("Tahoma", 1, 12));
        RbtnPrim.setText("n First");
        RbtnPrim.setToolTipText("n First");
        RbtnPrim.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        RbtnPrim.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RbtnPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnPrimActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel1.setText("Rows:");
        jLabel1.setBounds(10, 20, 40, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TexSem.setFont(new java.awt.Font("Tahoma", 0, 14));
        TexSem.setForeground(new java.awt.Color(0, 0, 204));
        TexSem.setToolTipText("Numbers of rows selected by random");
        TexSem.setBounds(70, 10, 70, 40);
        jLayeredPane1.add(TexSem, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setText("n Value:");
        jLabel2.setEnabled(false);
        jLabel2.setBounds(10, 20, 50, 20);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Tex1enn.setFont(new java.awt.Font("Tahoma", 0, 14));
        Tex1enn.setForeground(new java.awt.Color(0, 0, 204));
        Tex1enn.setToolTipText("This value is the jump of n ");
        Tex1enn.setEnabled(false);
        Tex1enn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tex1ennActionPerformed(evt);
            }
        });
        Tex1enn.setBounds(70, 10, 70, 40);
        jLayeredPane2.add(Tex1enn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("n Value :");
        jLabel3.setEnabled(false);
        jLabel3.setBounds(10, 20, 60, 20);
        jLayeredPane4.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TexPrim.setFont(new java.awt.Font("Tahoma", 0, 14));
        TexPrim.setForeground(new java.awt.Color(0, 0, 204));
        TexPrim.setToolTipText("n is the number of rows from first");
        TexPrim.setEnabled(false);
        TexPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexPrimActionPerformed(evt);
            }
        });
        TexPrim.setBounds(70, 10, 70, 40);
        jLayeredPane4.add(TexPrim, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BtnAplicar.setForeground(new java.awt.Color(51, 51, 51));
        BtnAplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        BtnAplicar.setText("Play");
        BtnAplicar.setToolTipText("execute the Configuration");
        BtnAplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAplicar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAplicarActionPerformed(evt);
            }
        });

        BtnCerrar.setForeground(new java.awt.Color(51, 51, 51));
        BtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit2.png"))); // NOI18N
        BtnCerrar.setText("Close");
        BtnCerrar.setToolTipText("Close the Configuration");
        BtnCerrar.setEnabled(false);
        BtnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnReset.setForeground(new java.awt.Color(51, 51, 51));
        BtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/undo.png"))); // NOI18N
        BtnReset.setText("Reset");
        BtnReset.setToolTipText("Resete the Parameters");
        BtnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnResetMouseClicked(evt);
            }
        });
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RbtnAle)
                    .addComponent(Rbtn1enn)
                    .addComponent(RbtnPrim)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jLayeredPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReset, 0, 0, Short.MAX_VALUE)
                    .addComponent(BtnAplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RbtnAle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Rbtn1enn))
                    .addComponent(BtnAplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(RbtnPrim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnReset)))
                .addGap(20, 20, 20))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbtnAleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnAleActionPerformed
        jLabel1.setEnabled(true);
        TexSem.setEnabled(true);
        jLabel2.setEnabled(false);
        Tex1enn.setEnabled(false);
        jLabel3.setEnabled(false);
        TexPrim.setEnabled(false);
        rbtsel = 0;
}//GEN-LAST:event_RbtnAleActionPerformed

    private void Rbtn1ennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn1ennActionPerformed
        jLabel1.setEnabled(false);
        TexSem.setEnabled(false);
        jLabel2.setEnabled(true);
        Tex1enn.setEnabled(true);
        jLabel3.setEnabled(false);
        TexPrim.setEnabled(false);
        rbtsel = 1;
}//GEN-LAST:event_Rbtn1ennActionPerformed

    private void RbtnPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnPrimActionPerformed
        jLabel1.setEnabled(false);
        TexSem.setEnabled(false);
        jLabel2.setEnabled(false);
        Tex1enn.setEnabled(false);
        jLabel3.setEnabled(true);
        TexPrim.setEnabled(true);
        rbtsel = 2;
}//GEN-LAST:event_RbtnPrimActionPerformed

    private void Tex1ennActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tex1ennActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_Tex1ennActionPerformed

    private void TexPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexPrimActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TexPrimActionPerformed

    private void BtnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAplicarActionPerformed
        String cad;
        char uc;
        int bdSem = 0, bdenn = 0, bdPrim = 0, x = 0, fils = 0, val = 0;
        String valmen = null;
        // -----------------------
        fils = datosEntrada.getRowCount();
        
        if(RbtnAle.isSelected()==true){
            cad = TexSem.getText();
            for(int y = 0; y < cad.length(); y++) {
                uc = cad.charAt(y);
                if(uc>47 && uc<58) x++;
            }
            if(x==cad.length()) bdSem = 1;
            else bdSem = 0;
            if(cad.equals("")) bdSem = 0;
            
            if(bdSem == 0) {
                JOptionPane.showMessageDialog(this, "Rows must contain numerical values.",
                        "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
            } else {
                val = Integer.parseInt(TexSem.getText());
                if(val < 0 || val > fils ) {
                    valmen = "The values of Rows must be included between 0 and " + Integer.toString(fils);
                    JOptionPane.showMessageDialog(this, valmen,
                            "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
                } else {
                    valmuestra = Integer.parseInt(cad);
                    BtnCerrar.setEnabled(true);
                }
            }
        }
        
        if(Rbtn1enn.isSelected()==true){
            x = 0;
            cad = Tex1enn.getText();
            for(int y = 0; y < cad.length(); y++) {
                uc = cad.charAt(y);
                if(uc>47 && uc<58) x++;
            }
            if(x==cad.length()) bdenn = 1;
            else bdenn = 0;
            if(cad.equals("")) bdenn = 0;
            
            if(bdenn == 0) {
                JOptionPane.showMessageDialog(this, "Value of n of 1 in n must contain numerical values",
                        "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
            } else {
                val = Integer.parseInt(Tex1enn.getText());
                if(val < 0 || val > fils ) {
                    valmen = "The values of 1 in n must be included between 0 and " + Integer.toString(fils);
                    JOptionPane.showMessageDialog(this, valmen,
                            "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
                } else {
                    valmuestra = Integer.parseInt(cad);
                    BtnCerrar.setEnabled(true);
                }
            }
        }
        
        if(RbtnPrim.isSelected()==true){
            x = 0;
            cad = TexPrim.getText();
            for(int y = 0; y < cad.length(); y++) {
                uc = cad.charAt(y);
                if(uc>47 && uc<58) x++;
            }
            if(x==cad.length()) bdPrim = 1;
            else bdPrim = 0;
            if(cad.equals("")) bdPrim = 0;
            
            if(bdPrim == 0) {
                JOptionPane.showMessageDialog(this, "Value of n of First n must contain numerical values",
                        "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
            } else {
                val = Integer.parseInt(TexPrim.getText());
                if(val < 0 || val > fils ) {
                    valmen = "The values of First n must be included between 0 and " + Integer.toString(fils);
                    JOptionPane.showMessageDialog(this, valmen,
                            "Error in Configure Range.",JOptionPane.ERROR_MESSAGE);
                } else {
                    valmuestra = Integer.parseInt(cad);
                    BtnCerrar.setEnabled(true);
                }
            }
        }
}//GEN-LAST:event_BtnAplicarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        //System.exit( 0 );
        this.dispose();
}//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnResetMouseClicked
        
}//GEN-LAST:event_BtnResetMouseClicked

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
       RbtnAle.setSelected(true);  
       Rbtn1enn.setSelected(false);
       RbtnPrim.setSelected(false);
       
       TexSem.setText("");
       Tex1enn.setText("");
       Tex1enn.setEnabled(false);
       TexPrim.setText("");
       TexPrim.setEnabled(false);
}//GEN-LAST:event_BtnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
//                new miAbrirMuestra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAplicar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnReset;
    private javax.swing.JRadioButton Rbtn1enn;
    private javax.swing.JRadioButton RbtnAle;
    private javax.swing.JRadioButton RbtnPrim;
    private javax.swing.JTextField Tex1enn;
    private javax.swing.JTextField TexPrim;
    private javax.swing.JTextField TexSem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}