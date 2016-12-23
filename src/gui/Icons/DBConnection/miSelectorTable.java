/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * miSelectorTable.java
 *
 * Created on 06-jun-2012, 15:05:45
 */
package gui.Icons.DBConnection;

import Utils.DataSet;
import Utils.TableOptimalWidth;
import gui.Icons.Filters.TariyTableModel;
import gui.KnowledgeFlow.ChooserEscritorio;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.CallableStatement;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Juan Carlos
 */
public class miSelectorTable extends javax.swing.JFrame implements TableColumnModelListener {
    MyCanvasTable canvas;
    DBConnectionIcon myIcon;
    Connection connection = null;
    ScrollableTableModel tableModel = null;
    DataSet dataset;
    boolean isMarketBasket = false;
    int x = 0;
    
    private String table;
    
    int y = 0;
    /** Creates new form SelectorTable */
    /** Creates new form miSelectorTable */
    public miSelectorTable(DBConnectionIcon icon) {
        myIcon = icon;
        initComponents();
        this.setName("Frame");
        canvas = new MyCanvasTable(this);
        scrollTable.add(canvas);
        this.connection = icon.connection;
        cbxTable.setModel(new DefaultComboBoxModel(this.getTables()));
        tblPreview.getColumnModel().addColumnModelListener(this);
        dataset = new DataSet("");
    }
    
    public miSelectorTable() {
        initComponents();
    }
    
    public void updateIcon(DBConnectionIcon icon) {
        myIcon = icon;
        this.setName("Frame");
        canvas = new MyCanvasTable(this);
        scrollTable.add(canvas);
        this.connection = icon.connection;
        cbxTable.setModel(new DefaultComboBoxModel(this.getTables()));
        tblPreview.getColumnModel().addColumnModelListener(this);
        dataset = new DataSet("");
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
        jPanel4 = new javax.swing.JPanel();
        cbxTable = new javax.swing.JComboBox();
        pnlTabs = new javax.swing.JTabbedPane();
        pnlDrag = new javax.swing.JPanel();
        scrollTable = new javax.swing.JScrollPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQuery2 = new JEditorPane("text/html", "<html>No Select found...</html>");
        btnExecute = new javax.swing.JButton();
        pnlDataTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreview = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        marketBasket = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnAccept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cbxTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Table..." }));
        cbxTable.setToolTipText("Select a Table...");
        cbxTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTableActionPerformed(evt);
            }
        });

        pnlDrag.setBackground(new java.awt.Color(255, 255, 255));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));
        scrollTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jCheckBox1.setText("View Relations");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlDragLayout = new javax.swing.GroupLayout(pnlDrag);
        pnlDrag.setLayout(pnlDragLayout);
        pnlDragLayout.setHorizontalGroup(
            pnlDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDragLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(scrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDragLayout.setVerticalGroup(
            pnlDragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDragLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTabs.addTab("Drag and Drop", pnlDrag);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);

        txtQuery2.setFont(new java.awt.Font("Courier New", 0, 10));
        jScrollPane3.setViewportView(txtQuery2);

        btnExecute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnExecute.setText("Play");
        btnExecute.setToolTipText("Execute SQL sentence");
        btnExecute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExecute.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(btnExecute)
                .addContainerGap(366, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnExecute)
                .addContainerGap(406, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(88, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pnlTabs.addTab("SQL Sentence", jPanel2);

        pnlDataTable.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        tblPreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPreview.setDragEnabled(true);
        jScrollPane2.setViewportView(tblPreview);

        javax.swing.GroupLayout pnlDataTableLayout = new javax.swing.GroupLayout(pnlDataTable);
        pnlDataTable.setLayout(pnlDataTableLayout);
        pnlDataTableLayout.setHorizontalGroup(
            pnlDataTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        pnlDataTableLayout.setVerticalGroup(
            pnlDataTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlTabs.addTab("Data Table", pnlDataTable);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabular", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        buttonGroup1.add(marketBasket);
        marketBasket.setFont(new java.awt.Font("Tahoma", 0, 12));
        marketBasket.setText("UniValued");
        marketBasket.setToolTipText("Choose for mining univalued sets");
        marketBasket.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        marketBasket.setMargin(new java.awt.Insets(0, 0, 0, 0));
        marketBasket.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                marketBasketItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("MultiValued");
        jRadioButton1.setToolTipText("Choose for mining multivalued sets");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(marketBasket)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marketBasket)
                    .addComponent(jRadioButton1))
                .addContainerGap())
        );

        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnAccept.setText("Acept");
        btnAccept.setToolTipText("Accept and confirm this data set");
        btnAccept.setEnabled(false);
        btnAccept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAccept.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbxTable, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnAccept)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbxTable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccept)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(pnlTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JScrollPane getScrollTable() {
        return scrollTable;
    }
    
    private void cbxTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTableActionPerformed
        // TODO add your handling code here:
        if(cbxTable.getSelectedIndex() == 0){
            return;
        }
        String table = cbxTable.getSelectedItem().toString();
        ArrayList columns = this.getColumns(table);
        Table t = new Table(table, columns.size());
        Vector primaryKeys = this.getPrimaryKeys(table);
        Vector foreingKeys = this.getForeingKeys(table);
        Iterator it = columns.iterator();
        while(it.hasNext()){
            String name = (String)it.next();
            int key = 0;
            if(primaryKeys.contains(name) && foreingKeys.contains(name)){
                key = 3;
            } else if(foreingKeys.contains(name)){
                key = 2;
            } else if(primaryKeys.contains(name)){
                key = 1;
            }
            t.addColumn(name, key, false);
        }
        canvas.addTable(t);
        Component[] tables = canvas.getComponents();
        int nComponents = canvas.getComponentCount() - 1; //Sin contar la tabla que se acabo de adicionar
        Vector references = new Vector(1, 1);
        String otherTable;
        for(int i = 0; i < nComponents ; i++){
            otherTable = ((Table)tables[i]).getName();
            references = this.getCrossReference(otherTable, table);
            if(references.size() > 0){
                Conector2 c1 = ((Table)tables[i]).getConector((String)references.elementAt(0));
                Conector2 c2 = t.getConector((String)references.elementAt(1));
                canvas.edges.add(new Edge(c1, c2, true));
            }
            //            references = this.getCrossReference(table, otherTable);
            //            if(references.size() > 0){
            //                Chooser.status.setText(references.toString());
            //                Conector2 c1 = ((Table)tables[i]).getConector((String)references.elementAt(0));
            //                Conector2 c2 = t.getConector((String)references.elementAt(1));
            //                canvas.edges.add(new Edge(c1, c2));
            //            }
        }
        pnlTabs.setSelectedIndex(0);
}//GEN-LAST:event_cbxTableActionPerformed

    private void marketBasketItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_marketBasketItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == evt.SELECTED){
            isMarketBasket = true;
        } else{
            isMarketBasket = false;
        }
        this.setQuery(canvas.selectToString());
}//GEN-LAST:event_marketBasketItemStateChanged

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int rows = tableModel.getRowCount();
        int columns = tableModel.getColumnCount();
        if(columns <= 1){
            JOptionPane.showMessageDialog(this, "No se aplica Mineria de Datos a una unica columna.");
            return;
        }
        Object[][] data = new Object[rows][columns];
        String[] columnsName = new String[columns];
        for(int i = 0; i < columns; i++){
            for(int j = 0; j < rows; j++){
                data[j][i] = tableModel.getValueAt(j ,i);
            }
            columnsName[i] = tableModel.getColumnName(i);
        }
        myIcon.connectionTableModel = new TariyTableModel(data, columnsName);
        myIcon.info = canvas.selectToString();
        myIcon.getMnuLoad().setEnabled(true);
        ChooserEscritorio.setStatus("Load SQL: " + canvas.selectToString());
        this.dispose();
}//GEN-LAST:event_btnAcceptActionPerformed

    public DataSet loadMultiValuedDataSet(){
        int ncolumns = tableModel.getColumnCount();
        Statement stm = null;
        ResultSet rs = null;
        ArrayList elementsDictionary = new ArrayList();
        try {
            stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String queryFrom = txtQuery2.getToolTipText();
            String column;
            int posFrom, posOrderBy;
            for(int i = 0; i < ncolumns; i++){
                column = (String)canvas.getSelect().elementAt(i);
                posFrom = queryFrom.indexOf("\nFROM ");
                //posOrderBy= queryFrom.indexOf("\nORDER BY ");
                posOrderBy = queryFrom.length();
                String query = "SELECT distinct " + column + queryFrom.substring(posFrom, posOrderBy) +
                        " ORDER BY " + column;
                rs = stm.executeQuery(query);
                column = column.substring(column.indexOf(".") + 1);
                while(rs.next()){
                    Object obj = rs.getObject(1);
                    if(!rs.wasNull()){
                        elementsDictionary.add(column + "=" + obj.toString());
                    }
                }
            }
            dataset.buildMultiValuedDictionary(elementsDictionary);
            for(int i = 0; i < tableModel.getRowCount(); i++){
                for(int j = 0; j < tableModel.getColumnCount(); j++){
                    if(tableModel.getValueAt(i, j) != null){
                        String item = tableModel.getColumnName(j) + "=" +
                                tableModel.getValueAt(i, j).toString();
                        int id = (j == tableModel.getColumnCount() - 1) ? -1 : j;
                        dataset.buildNTree(dataset.codeAttribute(item), id);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            ChooserEscritorio.status.setText("Exception: " + ex.getSQLState());
        } finally{
            return dataset;
        }
    }
    
    public DataSet loadDataSet(){
        Statement stm;
        try {
            stm = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String column2 = (String)canvas.getSelect().elementAt(1);
            String queryFrom = txtQuery2.getToolTipText();
            int posFrom = queryFrom.indexOf("\nFROM ");
            int posOrderBy= queryFrom.indexOf("\nORDER BY ");
            String query = "SELECT distinct " + column2 + queryFrom.substring(posFrom, posOrderBy) +
                    " ORDER BY " + column2;
            System.out.println(query);
            ResultSet rs = stm.executeQuery(query);
            dataset.buildDictionary(rs);
            //dataset.showDictionary();
            //dataset.showNTree();
        } catch (SQLException ex) {
            ChooserEscritorio.setStatus(ex.getMessage() + " Error in build dictionary");
        }
        boolean inicio, fin;
        int nfilas = tableModel.getRowCount() - 1;
        //Integer aux = (Integer)(tableModel.getValueAt(0, 0));
        String aux = (String)(tableModel.getValueAt(0, 0).toString());
        String item;
        Short itemShort;
        Integer itemInteger;
        int id = 1;
        inicio = true;
        fin = false;
        for(int i = 0; i < nfilas; i++){
            id = 1;
            //if(aux.compareTo((Integer)(tableModel.getValueAt(i + 1, 0))) != 0){
            if(aux.compareTo((tableModel.getValueAt(i + 1, 0).toString())) != 0){
                fin = true;
                //aux = (Integer)(tableModel.getValueAt(i + 1, 0));
                aux = (String)(tableModel.getValueAt(i + 1, 0).toString());
            }
            item = (String)(tableModel.getValueAt(i, 1).toString());
            if(inicio) {
                id = 0;
                inicio = false;
            }
            if(fin) {
                if(id == 0 && fin) id = -2;
                else id = -1;
                fin = false;
                inicio = true;
            }
            dataset.buildNTree(dataset.codeAttribute(item), id);
        }
        if(inicio) {
            id = -2;
            inicio = false;
        } else {
            id = -1;
        }
        item = (String)(tableModel.getValueAt(nfilas, 1).toString());
        dataset.buildNTree(dataset.codeAttribute(item), id);
        System.gc();
        ChooserEscritorio.status.setText("Free Memory: " + Runtime.getRuntime().freeMemory()
        + " bits");
        try {
            dataset.setName(connection.getCatalog());
        } catch (SQLException ex) {
            ChooserEscritorio.setStatus(ex.getMessage());
        }
        return dataset;
    }
    
    public DataSet getDataset() {
        return dataset;
    }
    
    public ArrayList getColumns(String table){
        ResultSet rs;
        ArrayList nombres = new ArrayList();
        try{
            DatabaseMetaData dbmd = connection.getMetaData();
            rs = dbmd.getColumns(null, null, table, null);
            while(rs.next()){
                nombres.add(rs.getString(4));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            nombres.trimToSize();
            return nombres;
        }
    }
    
    public Vector getTables(){
        ResultSet rs;
        Vector names = new Vector();
        names.add("Select a table...");
        try{
            DatabaseMetaData dbmd = connection.getMetaData();
            String[] types = { "TABLE" };
            rs = dbmd.getTables(null, null, null, types);
            while(rs.next()){
                names.addElement(rs.getString(3));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            return names;
        }
    }
    
    public Vector getPrimaryKeys(String table){
        ResultSet rs;
        Vector primaryKeys = new Vector(1);
        try{
            DatabaseMetaData dbmd = connection.getMetaData();
            rs = dbmd.getPrimaryKeys(null, null, table);
            while(rs.next()){
                primaryKeys.addElement(new String(rs.getString(4)));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            return primaryKeys;
        }
    }
    
    public Vector getForeingKeys(String table){
        ResultSet rs;
        Vector foreingKeys = new Vector(1);
        try{
            DatabaseMetaData dbmd = connection.getMetaData();
            rs = dbmd.getImportedKeys(null, null, table);
            while(rs.next()){
                foreingKeys.addElement(new String(rs.getString(8)));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            return foreingKeys;
        }
    }
    
    public Vector getCrossReference(String table1, String table2){
        ResultSet rs;
        Vector pairKeys = new Vector(2);
        try{
            DatabaseMetaData dbmd = connection.getMetaData();
            rs = dbmd.getCrossReference(null, null, table1, null, null, table2);
            while(rs.next()){
                pairKeys.addElement(rs.getString(4));
                pairKeys.addElement(rs.getString(8));
            }
            if(pairKeys.size() == 0){
                rs = dbmd.getCrossReference(null, null, table2, null, null, table1);
                while(rs.next()){
                    pairKeys.addElement(rs.getString(8));
                    pairKeys.addElement(rs.getString(4));
                }
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            return pairKeys;
        }
    }
    
    public void setQuery(String query){
        this.txtQuery2.setToolTipText(query);
        this.setQuery2(query);
    }
    
    public void setQuery2(String query){
        query = query.replaceFirst("SELECT", "<font color=blue>SELECT</font>");
        query = query.replaceFirst("DISTINCT", "<font color=blue>DISTINCT</font>");
        query = query.replaceFirst("FROM", "<font color=blue>FROM</font>");
        query = query.replaceFirst("WHERE", "<font color=blue>WHERE</font>");
        query = query.replaceFirst("ORDER BY", "<font color=blue>ORDER BY</font>");
        query = query.replaceAll("\n", "<br>");
        query = "<html><body face=\"Arial\" size=\"-1\">".concat(query).concat("</body></html>");
        this.txtQuery2.setText(query);
    }
    
    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        // TODO add your handling code here:
        try{
            if(canvas.nrelations < canvas.ntables - 1){
                JOptionPane.showMessageDialog(this, "No relations in WHERE clause");
            } else {
                tableModel = new ScrollableTableModel(connection,
                        txtQuery2.getToolTipText());
                tblPreview.setModel(tableModel);
                TableOptimalWidth.setOptimalColumnWidth(tblPreview, 10);
                this.btnAccept.setEnabled(true);
            }
        } catch (IllegalArgumentException stme){
            JOptionPane.showMessageDialog(this, stme.getMessage());
        }catch (ScrollableTableModelException stme){
            JOptionPane.showMessageDialog(this, stme.getMessage());
        }
        
        pnlTabs.setSelectedIndex(2);
}//GEN-LAST:event_btnExecuteActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if(evt.getStateChange() == evt.SELECTED){
            this.canvas.stress = true;
        } else{
            this.canvas.stress = false;
        }
        repaint();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
////                new miSelectorTable().setVisible(true);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnExecute;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxTable;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton marketBasket;
    private javax.swing.JPanel pnlDataTable;
    private javax.swing.JPanel pnlDrag;
    private javax.swing.JTabbedPane pnlTabs;
    private javax.swing.JScrollPane scrollTable;
    private javax.swing.JTable tblPreview;
    private javax.swing.JEditorPane txtQuery2;
    // End of variables declaration//GEN-END:variables

    public void columnAdded(TableColumnModelEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void columnRemoved(TableColumnModelEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void columnMoved(TableColumnModelEvent e) {
         if(e.getFromIndex() != e.getToIndex()){
            Vector select = canvas.getSelect();
            String from = (String)select.elementAt(e.getFromIndex());
            String to = (String)select.elementAt(e.getToIndex());
            select.setElementAt(from, e.getToIndex());
            select.setElementAt(to, e.getFromIndex());
            canvas.setSelect(select);
            setQuery(canvas.selectToString());
        }
    }

    public void columnMarginChanged(ChangeEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void columnSelectionChanged(ListSelectionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public JButton getBtnAccept() {
        return btnAccept;
    }
}