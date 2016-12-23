/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * miVerMuestra.java
 *
 * Created on 25-may-2012, 14:21:50
 */
package gui.Icons.Filters.Range;

import Utils.ExampleFileFilter;
import Utils.FileManager;
import gui.Icons.Filters.TipodVariables;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Juan Carlos
 */
public class miVerMuestra extends javax.swing.JFrame {

    AbstractTableModel datosEntrada;
    AbstractTableModel tipoVariables;
    AbstractTableModel datosFiltros;
    
    /** Creates new form miVerMuestra */
    public miVerMuestra(AbstractTableModel dataIn, AbstractTableModel dataOut) {
        datosEntrada = dataIn;
        tipoVariables = new TipodVariables(dataIn);
        datosFiltros = dataOut;
        initComponents();
        LblRegAct.setText(Integer.toString(datosFiltros.getRowCount()));
        LblRegElim.setText(Integer.toString((datosEntrada.getRowCount()-datosFiltros.getRowCount())));
    }
    
    public miVerMuestra() {
        initComponents();
    }
    
    public void setDatas(AbstractTableModel din, AbstractTableModel dot) {
        datosEntrada = din;
        tipoVariables = new TipodVariables(din);
        datosFiltros = dot;
        LblRegAct.setText(Integer.toString(datosFiltros.getRowCount()));
        LblRegElim.setText(Integer.toString((datosEntrada.getRowCount()-datosFiltros.getRowCount())));
       
        TableTVariables.setModel(tipoVariables);
        TableDatosEntrada.setModel(datosEntrada);
        TableDatosFiltro.setModel(datosFiltros);   
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Save = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableTVariables = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatosEntrada = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDatosFiltro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LblRegAct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblRegElim = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setToolTipText("Structure of Data");

        jScrollPane3.setToolTipText("Type of Variables");

        TableTVariables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TableTVariables);

        jTabbedPane1.addTab("Attributes", new javax.swing.ImageIcon(getClass().getResource("/images/16x16/atributes.png")), jScrollPane3); // NOI18N

        jScrollPane1.setToolTipText("Input Data");

        TableDatosEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableDatosEntrada);

        jTabbedPane1.addTab("Input Data", new javax.swing.ImageIcon(getClass().getResource("/images/16x16/datain.png")), jScrollPane1); // NOI18N

        jScrollPane2.setToolTipText("Filtered Data");

        TableDatosFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableDatosFiltro);

        jTabbedPane1.addTab("Filtered Data", new javax.swing.ImageIcon(getClass().getResource("/images/16x16/filter.png")), jScrollPane2); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Current : ");

        LblRegAct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblRegAct.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Deleted : ");

        LblRegElim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblRegElim.setText("0");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filesave.png"))); // NOI18N
        jButton1.setText("Filtered");
        jButton1.setToolTipText("Save the Filtered Data");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Samples ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LblRegAct))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LblRegElim)))
                    .addComponent(jButton1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRegAct)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LblRegElim))
                .addGap(133, 133, 133)
                .addComponent(jButton1)
                .addGap(208, 208, 208))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ExampleFileFilter ext = new ExampleFileFilter("csv", "Filtered Data");
        String path;
        FileManager fm;
        
        Save.addChoosableFileFilter(ext);
        int saveOK = Save.showSaveDialog(this);
        if(saveOK == Save.APPROVE_OPTION) {
            path = Save.getSelectedFile().getAbsolutePath();
            path += ".csv";
            fm = new FileManager(path);
            int rows = datosFiltros.getRowCount();
            int columns = datosFiltros.getColumnCount()-1;
            StringBuffer textFilter = new StringBuffer();
            
            for(int c = 0; c < columns; c++){
                textFilter.append(datosFiltros.getColumnName(c) + ",");
            }
            textFilter.append(datosFiltros.getColumnName(columns));
            textFilter.append("\n");
            
            for(int f = 0; f < rows; f++){
                for(int c = 0; c < columns; c++){
                    textFilter.append(datosFiltros.getValueAt(f,c) + ",");
                }
                textFilter.append(datosFiltros.getValueAt(f,columns));
                textFilter.append("\n");
            }
            fm.writeString(textFilter.toString());
            JOptionPane.showMessageDialog(this, "Filtered data successfully saved", "VisMineKDD", JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
//                new miVerMuestra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblRegAct;
    private javax.swing.JLabel LblRegElim;
    private javax.swing.JFileChooser Save;
    private javax.swing.JTable TableDatosEntrada;
    private javax.swing.JTable TableDatosFiltro;
    private javax.swing.JTable TableTVariables;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
