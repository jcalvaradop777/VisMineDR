/*
 * Dinamico.java
 *
 * Created on 29 de agosto de 2007, 11:27 PM
 */

package gui.manual;

/**
 *
 * @author  TNRsoft
 */
public class Dinamico extends javax.swing.JPanel {
    
    /** Creates new form Dinamico */
    public Dinamico() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel17 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18));
        jLabel17.setForeground(new java.awt.Color(58, 123, 252));
        jLabel17.setText("Visualizaci\u00f3n Arbol Dinamico");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea1.setRows(5);
        jTextArea1.setText(" muestra el \u00e1rbol en forma jer\u00e1rquica");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/iconoArbolDinamico.png")));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/arbolDinamico.png")));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea2.setRows(5);
        jTextArea2.setText("- Bot\u00f3n Expandir \u00c1rbol");
        jTextArea2.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea3.setRows(5);
        jTextArea3.setText("- Bot\u00f3n Contraer\u00c1rbol");
        jTextArea3.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/arbolExpandido.png")));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/arbolContraido.png")));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(237, 237, 237)
                        .add(jLabel17))
                    .add(layout.createSequentialGroup()
                        .add(318, 318, 318)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(jTextArea1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(21, 21, 21)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jTextArea2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 724, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextArea3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(242, 242, 242)
                        .add(jLabel3))
                    .add(layout.createSequentialGroup()
                        .add(269, 269, 269)
                        .add(jLabel4)))
                .addContainerGap(435, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel1)
                .add(27, 27, 27)
                .add(jTextArea1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 497, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(31, 31, 31)
                .add(jTextArea2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jTextArea3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel4)
                .add(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
    
}
