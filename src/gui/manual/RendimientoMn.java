/*
 * RendimientoMn.java
 *
 * Created on 29 de agosto de 2007, 11:52 PM
 */

package gui.manual;

/**
 *
 * @author  TNRsoft
 */
public class RendimientoMn extends javax.swing.JPanel {
    
    /** Creates new form RendimientoMn */
    public RendimientoMn() {
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

        setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18));
        jLabel17.setForeground(new java.awt.Color(58, 123, 252));
        jLabel17.setText("Rendimiento");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea1.setRows(5);
        jTextArea1.setText("Rendimiento de Algoritmos: se visualiza una grafica en donde se mira los rendimientos seg\u00fan los\ntiempos de ejecuci\u00f3n y el numero de datos. Tambi\u00e9n encontramos una tabla en donde informaci\u00f3n \nsobre el algoritmo y caracter\u00edsticas del conjunto de datos al cual fue aplicado, esta tabla se ordena \nde mayor a menor o viceversa dando click sobre el nombre de la columna, tambi\u00e9n cuenta con 4 \nbotenes quemuetran  la informaci\u00f3n en la tabla seg\u00fan el nombre del bot\u00f3n seleccionado. ");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/ventanaRen.png")));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .add(jLabel17)
                .add(2674, 2674, 2674))
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jTextArea1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2451, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 823, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(21, 21, 21)
                .add(jTextArea1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .add(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}
