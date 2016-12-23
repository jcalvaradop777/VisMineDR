/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * miConfigureKmeans.java
 *
 * Created on 19-jun-2012, 10:07:32
 */
package gui.Icons.Cluster.configureCluster;

import javax.swing.JLabel;

/**
 *
 * @author Juan Carlos
 */


public class miConfigureClarans extends javax.swing.JFrame {
    private clusterIcon ci;
    public  boolean tipo;

    /** Creates new form miConfigureKmeans */
    public miConfigureClarans(clusterIcon ci) {
        initComponents();
        this.ci=ci;
    }
    
    public miConfigureClarans() {
        initComponents();
    }
    
    public void updateIcon(clusterIcon icon){
        this.ci = icon;
        jspnumcluster.setValue(this.ci.numcluster);
        jcbdistancia.setSelectedIndex(this.ci.distanciakm.getTipo());
   
        if (this.ci.numInteraciones == 0){
            rb1.setSelected(true);
            rb2.setSelected(false);
        }else{
            rb1.setSelected(false);
            rb2.setSelected(true);
            jspNumIterar.setEnabled(true);
            jspNumIterar.setValue(this.ci.numInteraciones);
        }
        
        jspnumlocal.setValue(this.ci.numlocal);
        jspmaxvecinos.setValue(this.ci.maxvecinos);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jspnumcluster = new javax.swing.JSpinner();
        jcbdistancia = new javax.swing.JComboBox();
        jl1 = new javax.swing.JLabel();
        jspnumlocal = new javax.swing.JSpinner();
        jl2 = new javax.swing.JLabel();
        jspmaxvecinos = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        jspNumIterar = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Number of cluster");

        jLabel2.setText("Distance");

        jspnumcluster.setToolTipText("Numero de cluster");
        jspnumcluster.setName("jsnumcluster"); // NOI18N

        jcbdistancia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euclidiana", "Manhattan", "Minkowski" }));
        jcbdistancia.setName("jcbdistancia"); // NOI18N

        jl1.setText("Local number");

        jspnumlocal.setToolTipText("Numero de cluster");
        jspnumlocal.setName("jsnumcluster"); // NOI18N

        jl2.setText("Maximum number of neighbors");

        jspmaxvecinos.setToolTipText("Numero de cluster");
        jspmaxvecinos.setName("jsnumcluster"); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        jButton2.setText("Play");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb1);
        rb1.setSelected(true);
        rb1.setText("Converge");
        rb1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb2);
        rb2.setText("Number of iterations");
        rb2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        jspNumIterar.setToolTipText("Numero de cluster");
        jspNumIterar.setEnabled(false);
        jspNumIterar.setName("jsnumcluster"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jspnumlocal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jspNumIterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspnumcluster, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbdistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(rb1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl2)
                                .addGap(18, 18, 18)
                                .addComponent(jspmaxvecinos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton2)
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspnumcluster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbdistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rb1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb2)
                    .addComponent(jspNumIterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl1)
                    .addComponent(jspnumlocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl2)
                    .addComponent(jspmaxvecinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO: Agrege su codigo aqui:
        int nc = Integer.parseInt(""+jspnumcluster.getValue());
        ci.setNumcluster(nc);
        if (rb1.isSelected()){
            ci.setNumIterar(0);
        }else{
            int ni = Integer.parseInt(""+jspNumIterar.getValue());
            ci.setNumIterar(ni);
        }
        
        ci.distanciakm.setTipo(jcbdistancia.getSelectedIndex());
        //  ci.distanciakm.setAtriColumna(this.atriColumnas);
        ci.setInfo("Numero de cluster obtener: " + jspnumcluster + "");// +
        ci.mnuRun.setEnabled(true);
        ci.numlocal = Integer.parseInt(jspnumlocal.getValue().toString());
        ci.maxvecinos=Integer.parseInt(jspmaxvecinos.getValue().toString());
        
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        if (rb1.isSelected()){
            jspNumIterar.setEnabled(false);
        }else if(rb2.isSelected()){
            jspNumIterar.setEnabled(true);
        }
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        if (rb1.isSelected()){
            jspNumIterar.setEnabled(false);
        }else if(rb2.isSelected()){
            jspNumIterar.setEnabled(true);
        }
    }//GEN-LAST:event_rb2ActionPerformed

    public void setnumcluster(Object valor) {
      jspnumcluster.setValue(valor);
    }
      public void setDistancia(int valor) {
      jcbdistancia.setSelectedIndex(valor);
    }
      
    public void setNumlocal(int numlo){
      jspnumlocal.setValue(numlo);    
    }
    
    public void setMaxVecinos(int maxve){
      jspmaxvecinos.setValue(maxve);    
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                miConfigureClarans cp = new miConfigureClarans(new clusterIcon(new JLabel(), 0 , 0, 0));
                cp.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbdistancia;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JSpinner jspNumIterar;
    private javax.swing.JSpinner jspmaxvecinos;
    private javax.swing.JSpinner jspnumcluster;
    private javax.swing.JSpinner jspnumlocal;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    // End of variables declaration//GEN-END:variables
}
