/*
 * ConexionMn.java
 *
 * Created on 29 de agosto de 2007, 11:25 PM
 */

package gui.manual;

/**
 *
 * @author  TNRsoft
 */
public class ConexionMn extends javax.swing.JPanel {
    
    /**
     * Creates new form ConexionMn
     */
    public ConexionMn() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextArea7 = new javax.swing.JTextArea();

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea4.setRows(5);
        jTextArea4.setText("-  Servidor: Es la direcci\u00f3n Ip o nombre del servidor donde ese encuentra la base de datos.\n\n-  SGBD: Es el nombre del Sistema Gestor de Base de Datos, ya sea PostgreSql o MySql.\n\n-  Puerto: Es el puerto por con el cual trabaja el SGBD, este par\u00e1metro generalmente se trabajo por defecto.\n\n-  Base de Datos: Es el nombre de la Base de Datos a la cual se quiere tener Acceso.\n\n- Usuario: Es el nombre del usuario que desea tener acceso a la base de datos.\n\n- Contrase\u00f1a: Es la Contrase\u00f1a del Usuario.\n\nAdem\u00e1s esta ventana est\u00e1 compuesta por tres botones:\n- Probar Conexi\u00f3n: Permite Verificar si los par\u00e1metros requeridos son correctos, Es necesario para Aceptar, y establecer\n  la conexi\u00f3n;\n- Aceptar: Acepta la conexi\u00f3n.\n- Cancelar: no configura los par\u00e1metros.\n\nTambi\u00e9n se encuentra una barra de estado, en donde se presenta toda la informaci\u00f3n acerca de los par\u00e1metros \nescritos.\n\n\u2022  Seleccionar Atributos: Esta opci\u00f3n se habilita  despu\u00e9s de entrar al men\u00fa configurar, aqu\u00ed se muestran todas las\n    tablas y se selecciona todos los atributos de la base de datos. \n");
        jTextArea4.setCaretColor(new java.awt.Color(255, 255, 255));

        setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18));
        jLabel2.setForeground(new java.awt.Color(58, 123, 252));
        jLabel2.setText("Conexi\u00f3nBD");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea1.setRows(5);
        jTextArea1.setText("Permite establecer conexi\u00f3n a una base de datos y ademas permite seleccionar seleccionar el conjunto\nde datos a trabajar \n ");
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\u2022  Borrar: Borra el icono del \u00e1rea de trabajo.\n\u2022  Configurar: esta opci\u00f3n permite configurar los par\u00e1metros para que se pueda conectar \n    a la base de datos que se va a trabajar, configundolos de la siguiente manera:");
        jTextArea2.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/iconoConexionBD.png")));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/patresConexBD.png")));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea3.setRows(5);
        jTextArea3.setText("-  Servidor: Es la direcci\u00f3n Ip o nombre del servidor donde ese encuentra la base de datos.\n\n-  SGBD: Es el nombre del Sistema Gestor de Base de Datos, ya sea PostgreSql o MySql.\n\n-  Puerto: Es el puerto por con el cual trabaja el SGBD, este par\u00e1metro generalmente se trabajo por defecto.\n\n-  Base de Datos: Es el nombre de la Base de Datos a la cual se quiere tener Acceso.\n\n- Usuario: Es el nombre del usuario que desea tener acceso a la base de datos.\n\n- Contrase\u00f1a: Es la Contrase\u00f1a del Usuario.\n\nAdem\u00e1s esta ventana est\u00e1 compuesta por tres botones:\n\n- Probar Conexi\u00f3n: Permite Verificar si los par\u00e1metros requeridos son correctos, Es necesario para Aceptar, y establecer\n  la conexi\u00f3n;\n- Aceptar: Acepta la conexi\u00f3n.\n- Cancelar: no configura los par\u00e1metros.\n\nTambi\u00e9n se encuentra una barra de estado, en donde se presenta toda la informaci\u00f3n acerca de los par\u00e1metros \nescritos.\n\n\u2022  Seleccionar Atributos: Esta opci\u00f3n se habilita  despu\u00e9s de entrar al men\u00fa configurar, aqu\u00ed se muestran todas las\n    tablas y se selecciona todos los atributos de la base de datos. \n");
        jTextArea3.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/seleccioTablasLetras.png")));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea5.setRows(5);
        jTextArea5.setText("\u2022 \u00c1rea A: Presenta todas las tablas encontradas en la base de datos, se da click izquierdo, y aparece dibuja la tabla \n   en el \u00e1rea de tablas.\n\n\u2022 \u00c1rea B: es el \u00e1rea en donde se dibujan todas las tablas seleccionadas, aqu\u00ed tambi\u00e9n se muestra las relaciones que \n   se encuentran entre las diferentes tablas, las cuales son las l\u00edneas de color magenta, adem\u00e1s en las tablas las llaves \n   primarias tienes una llave  amarilla y las llaves for\u00e1neas se pinta una llave de color gris.\n\n\u2022 \u00c1rea C: Se Muestra  la sentencia SQL que se va a ejecutar, es generada  al seleccionar los atributos.\n\n\u2022 \u00c1rea D: se presenta una vista de los datos que se van a trabajar.\n\nTambi\u00e9n aqu\u00ed encontramos tambi\u00e9n un checkbox el cual nos da la opci\u00f3n de mirar los nombres en la l\u00ednea de relaci\u00f3n \nlos cuales forman la llave for\u00e1nea. En la misma parte encontramos dos botones:\n \n  - Bot\u00f3n Ejecutar: nos permite una vista previa de los datos en el \u00c1rea D, Es indispensable para aceptar los datos \n    seleccionados.\n  - Bot\u00f3n Aceptar: Acepta los datos escojidos\n\n\n\nNOTA: El atributo que selecciona como de color Cyan, se toma como atributo clase, se puede modificar deseleccionando \ny volviendo a seleccionar el atributo. Adem\u00e1s cada tabla tiene un men\u00fa que sale dando click derecho sobre la tabla:\n");
        jTextArea5.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Herramienta/menuTabla.png")));

        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14));
        jTextArea7.setRows(5);
        jTextArea7.setText("                  -\tBorrar Tabla: borra la tabla del \u00e1rea de trabajo.\n                  -\tSeleccionar Todos: Selecciona todos los atributos de la tabla.\n                  -\tInvertir Selecci\u00f3n: Selecciona los atributos que no est\u00e1n seleccionados y deselecciona los que est\u00e1n \n                     seleccionados.\n\n   \u2022  Cargar Datos: carga los datos en memoria, Es indispensable para empezar a trabajar.\n");
        jTextArea7.setCaretColor(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(277, 277, 277)
                                .add(jLabel2))
                            .add(jTextArea1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(188, 188, 188)
                                .add(jLabel1))
                            .add(jTextArea2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 689, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(jLabel3))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jTextArea3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 761, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .add(jLabel4)
                .add(86, 86, 86))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jTextArea5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 761, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(232, 232, 232)
                .add(jLabel5)
                .addContainerGap(257, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(jTextArea7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 719, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(jTextArea1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextArea2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 192, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50)
                .add(jTextArea3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .add(44, 44, 44)
                .add(jTextArea5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32)
                .add(jLabel5)
                .add(61, 61, 61)
                .add(jTextArea7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea7;
    // End of variables declaration//GEN-END:variables
    
}
