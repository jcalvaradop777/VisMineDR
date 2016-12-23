/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChooserApplet.java
 *
 * Created on 19-ago-2014, 14:57:15
 */



/*
 * Para ponerla como aplicacion de escritorio
 *
 * 1. Hay que cambiar el nombre de ChooserEscritorio a  ChooserApplet
 * 2. En propiedades: run - configuracion - se deja en default config 
 * 3. y En propiedades: run - mainclass se deja a ChooserApplet 
 * 
 */


package gui.KnowledgeFlow;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juan Carlos Alvarado
 */
//public class ChooserApplet extends javax.swing.JApplet {
public class ChooserEscritorio extends javax.swing.JFrame {

    miContenedor c1;

    JPanel p = null;
    
    public static Vector tiempoAlgoritmos;
    
    // clus
    public static help ayuda = null;

    /** Initializes the applet ChooserApplet */
//    @Override
//    public void init() {
//        try {
//            java.awt.EventQueue.invokeAndWait(new Runnable() {
//                public void run() {
//
//                initComponents();
//                c1 = new miContenedor();
//                chooser.addTab("Data", c1); // carga la pesta�a de conexiones inicialmente
//                chooser.addTab("Data cleaning", p);
//                chooser.addTab("Data mining", p);
//                chooser.addTab("Views", p);
//                }
//            });
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
    
     public ChooserEscritorio() {
        initComponents();
        c1 = new miContenedor();
        chooser.addTab("Data", c1); // carga la pesta�a de conexiones inicialmente
        chooser.addTab("Data cleaning", p);
        chooser.addTab("Dimensionality reduction", p);
        chooser.addTab("Data mining", p);
        chooser.addTab("Views", p);
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooser = new javax.swing.JTabbedPane();
        status = new javax.swing.JLabel();

        chooser.setBackground(new java.awt.Color(255, 255, 255));
        chooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooserMouseClicked(evt);
            }
        });

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        status.setText("VisMineKDD is ready ");
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(199, 206, 213)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chooser, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(chooser, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooserMouseClicked
        int select = chooser.getSelectedIndex();
        c1.changeLeftPanel(select);
    }//GEN-LAST:event_chooserMouseClicked

 public static void setStatus(String str){
        status.setText(str);
        str = str.replaceAll("\n", "<p>");
        str = "<html>".concat(str).concat("</html>");
        status.setToolTipText(str);
    }

 public static String getStatus(){
        return status.getText();
    }
 
 // clus
 public static void addTimes(String auxNom,int auxNumIns,int auxNumCols,long auxTiempo){
        performanceAttribute datos;
        datos = new performanceAttribute(auxNom,auxNumIns,auxNumCols,auxTiempo);
        tiempoAlgoritmos.add(datos);
    }

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooserEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane chooser;
    public static javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables

}
