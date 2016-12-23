/*
 * ComoFunciona.java
 *
 * Created on 2 de septiembre de 2007, 03:00 PM
 */

package gui.manual;

/**
 *
 * @author  TNRsoft
 */
public class ComoFunciona extends javax.swing.JPanel {
    
    /** Creates new form ComoFunciona */
    public ComoFunciona() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18));
        jLabel2.setForeground(new java.awt.Color(58, 123, 252));
        jLabel2.setText("Como Funciona?");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea1.setRows(5);
        jTextArea1.setText("El entorno grafico del clasificador Yachay est\u00e1 compuesto por tres \u00e1reas:\n\n\u2022 \u00c1rea A: Contiene  tres pesta\u00f1as en la cuales encontramos las opciones   de acceso a los \n  diferentes m\u00f3dulos de Selecci\u00f3n, Clasificaci\u00f3n y visualizaci\u00f3n, dependiendo del tipo de pesta\u00f1a escogida \n  en el panel B, se va mostrar en un   panel de opciones para cada tipo de selecci\u00f3n que m\u00e1s adelante se \n  explicara.\n\n\u2022 \u00c1rea B: Como se dijo anteriormente es la parte en donde se muestran los iconos de las diferentes \n   opciones provistas por cada modulo, estos iconos pueden  ser \u201cArrastrados\u201d, dando click  Izquierdo \n   sostenido del mouse y ubicarlo en  C \u00c1rea  de trabajo.\n\n\u2022 \u00c1rea C: Aqu\u00ed podemos colocar todos los iconos que se deseen para la realizaci\u00f3n  de un experimento, \n   en \u00e9l podemos enlazar los diferentes iconos, dependiendo de las restricciones que cada uno contenga, \n   adem\u00e1s los iconos se pueden reubicar dando click Sostenido sobre \u00e9l y ubicando el mouse donde se desee;\n\n\u2022 Area D: en ella est\u00e1 toda la informaci\u00f3n provista por la herramienta, para determinada operaci\u00f3n que se  \n   realizo.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/ventana1.png")));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/panelSeleccion.png")));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea2.setRows(5);
        jTextArea2.setText("PESTA\u00d1A DE SELECCI\u00d3N:\nEn ella se encuentra el icono de Conexi\u00f3nBD el cual nos permite establecer  una conexi\u00f3n con una base de datos.\n");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea3.setRows(5);
        jTextArea3.setText("ICONOS:\nSe debe arrastrar el icono hacia el \u00e1rea de trabajo, cuando se encuentre en el \u00e1rea de trabajo se da Click derecho, \npara poder configurar dependiendo de su clase, cada opcion se va ir habilitando a medida que se vaya \nconfigurando cada icono, ejemplo:\n");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/iconoConexionBD.png")));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea4.setRows(5);
        jTextArea4.setText("  Pesta\u00f1a de Clasificaci\u00f3n:\n  Aqu\u00ed se encuentran todos los algoritmos de clasificaci\u00f3n implementados.");
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea5.setRows(5);
        jTextArea5.setText("Pesta\u00f1a Visualizaci\u00f3n: \nSirven para visualizar de una manera f\u00e1cil las reglas generadas por los algoritmos, se enlaza con un icono de \nClasificacion.");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/Clasificadores.png")));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/Visualizadores.png")));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18));
        jLabel7.setForeground(new java.awt.Color(58, 123, 252));
        jLabel7.setText("Modo de Uso");

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea6.setRows(5);
        jTextArea6.setText("El entorno grafico de Clasificador Yachay, permite al usuario experimenta de muy f\u00e1cil manera con sus datos, uniendo\n los iconos pertinentes a trav\u00e9s de flechas que se obtinen dando click sostenido en el \u00e1rea negra del icono; los puntos negros\n son los conectores de cada icono, que en total son 8.");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/flecha.png")));

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 13));
        jTextArea7.setRows(5);
        jTextArea7.setText("Para la conexi\u00f3n se debe ubicar la punta de la flecha en el \u00e1rea negra del icono que se desee unir y soltar el bot\u00f3n del \nmouse, si se permite la Conexi\u00f3n la flecha cambiara de Color a verde, Con la uni\u00f3n de las flechas se consigue la transmisi\u00f3n \nde los datos de cada icono.");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/conectados.png")));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(268, 268, 268)
                        .add(jLabel2))
                    .add(layout.createSequentialGroup()
                        .add(81, 81, 81)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(jLabel5))
                    .add(layout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 610, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 61, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(285, 285, 285)
                        .add(jLabel7))
                    .add(layout.createSequentialGroup()
                        .add(123, 123, 123)
                        .add(jLabel8))
                    .add(layout.createSequentialGroup()
                        .add(266, 266, 266)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 666, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTextArea7)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(9, 9, 9)
                                        .add(jTextArea5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)))
                                .add(10, 10, 10))
                            .add(layout.createSequentialGroup()
                                .add(jTextArea6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 3, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(156, 156, 156)
                        .add(jLabel9))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 694, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane4)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE))
                        .add(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 296, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(jLabel1)
                .add(42, 42, 42)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel3)
                .add(60, 60, 60)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .add(22, 22, 22)
                .add(jTextArea5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(25, 25, 25)
                .add(jLabel6)
                .add(55, 55, 55)
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(jTextArea6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel8)
                .add(55, 55, 55)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextArea7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jLabel9)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    // End of variables declaration//GEN-END:variables
    
}
