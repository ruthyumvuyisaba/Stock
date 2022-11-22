
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Shops extends javax.swing.JFrame {

    /**
     * Creates new form Shops
     */
    public Shops() {
        initComponents();
        Connection();
        getShops();
    }
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    
    public void Connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void getShops(){
        int a;
        try{
            pst = con.prepareStatement("select * from shop order by id desc");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rd = rs.getMetaData();
            a = rd.getColumnCount();
            df = (DefaultTableModel)shopsTable.getModel();
            df.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i = 0; i < a; i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("created_at"));
                }
                df.addRow(v2);
            }
            
         }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CategoryMenuBtn = new javax.swing.JButton();
        suppliersMenuBtn = new javax.swing.JButton();
        productMenuBtn = new javax.swing.JButton();
        productInMenuBtn = new javax.swing.JButton();
        productOutMenuBtn = new javax.swing.JButton();
        reportMenuBtn = new javax.swing.JButton();
        logoutMenuBtn = new javax.swing.JButton();
        shopsMenuBtn = new javax.swing.JButton();
        myAccountMenuBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shopsTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CategoryMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CategoryMenuBtn.setText("Categories");
        CategoryMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryMenuBtnActionPerformed(evt);
            }
        });

        suppliersMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suppliersMenuBtn.setText("Suppliers");
        suppliersMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersMenuBtnActionPerformed(evt);
            }
        });

        productMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productMenuBtn.setText("Product");
        productMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productMenuBtnActionPerformed(evt);
            }
        });

        productInMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productInMenuBtn.setText("Product In");
        productInMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productInMenuBtnActionPerformed(evt);
            }
        });

        productOutMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productOutMenuBtn.setText("Product Out");
        productOutMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productOutMenuBtnActionPerformed(evt);
            }
        });

        reportMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reportMenuBtn.setText("Report");
        reportMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportMenuBtnActionPerformed(evt);
            }
        });

        logoutMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutMenuBtn.setText("Logout");
        logoutMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuBtnActionPerformed(evt);
            }
        });

        shopsMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        shopsMenuBtn.setText("Shops");
        shopsMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopsMenuBtnActionPerformed(evt);
            }
        });

        myAccountMenuBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myAccountMenuBtn.setText("My account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CategoryMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(suppliersMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productInMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productOutMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                    .addComponent(myAccountMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shopsMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CategoryMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(suppliersMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(shopsMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(productMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(productInMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(productOutMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(reportMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(myAccountMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(logoutMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        shopsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Shop Name", "Address", "Created_at"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        shopsTable.setRowHeight(25);
        shopsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(shopsTable);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Shop Name");

        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });

        lbl_name.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setText("Address");

        lbl_address.setForeground(new java.awt.Color(255, 0, 0));

        txt_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_addressKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addComponent(txt_address, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Shops");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryMenuBtnActionPerformed
        // TODO add your handling code here:
        Categories category = new Categories();
        category.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoryMenuBtnActionPerformed

    private void suppliersMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersMenuBtnActionPerformed
        // TODO add your handling code here:
        Supplier supplier = new Supplier();
        supplier.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_suppliersMenuBtnActionPerformed

    private void productMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productMenuBtnActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMenuBtnActionPerformed

    private void productOutMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productOutMenuBtnActionPerformed
        // TODO add your handling code here:
        ProductOut productOut = new ProductOut();
        productOut.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productOutMenuBtnActionPerformed

    private void shopsMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopsMenuBtnActionPerformed
        // TODO add your handling code here:
        Shops shop = new Shops();
        shop.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_shopsMenuBtnActionPerformed

    private void productInMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productInMenuBtnActionPerformed
        // TODO add your handling code here:
        ProductIn productIn = new ProductIn();
        productIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productInMenuBtnActionPerformed

    private void reportMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportMenuBtnActionPerformed
        // TODO add your handling code here:
        Report report = new Report();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportMenuBtnActionPerformed

    private void logoutMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuBtnActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMenuBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
         if(txt_name.getText().trim().isEmpty() && txt_address.getText().trim().isEmpty()){
            lbl_name.setText("Shop Name is required");
            lbl_address.setText("Address is required");
        }
         else if(txt_name.getText().trim().isEmpty()){
             lbl_name.setText("Shop Name is required");
         }
         else if(txt_address.getText().trim().isEmpty()){
             lbl_address.setText("Address is required");
         }
        else{
            try {
                // TODO add your handling code here:
                DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime now = LocalDateTime.now();
                String created_at = dt.format(now);

                pst = con.prepareStatement("insert into shop (name,address,created_at) values(?,?,?)");
                pst.setString(1,txt_name.getText());
                pst.setString(2,txt_address.getText());
                pst.setString(3,created_at);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "New Shop ("+ txt_name.getText() +") is recorded successfully");

                txt_name.setText("");
                txt_address.setText("");
                txt_name.requestFocus();
                getShops();
                lbl_name.setText("");
                lbl_address.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        // TODO add your handling code here:
        lbl_name.setText("");
    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_addressKeyReleased
        // TODO add your handling code here:
        lbl_address.setText("");
    }//GEN-LAST:event_txt_addressKeyReleased

    private void shopsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopsTableMouseClicked
        // TODO add your handling code here:
        df = (DefaultTableModel)shopsTable.getModel();
        int selected = shopsTable.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected,0).toString());
        txt_name.setText(df.getValueAt(selected, 1).toString());
        txt_address.setText(df.getValueAt(selected, 2).toString());
        
        saveBtn.setEnabled(false);
    }//GEN-LAST:event_shopsTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(shopsTable.getSelectedRow() >= 0){
            df = (DefaultTableModel)shopsTable.getModel();
            int selected = shopsTable.getSelectedRow();
            int id = Integer.parseInt(df.getValueAt(selected,0).toString());

             if(txt_name.getText().trim().isEmpty() && txt_address.getText().trim().isEmpty()){
                lbl_name.setText("Shop Name is required");
                lbl_address.setText("Address is required");
            }
             else if(txt_name.getText().trim().isEmpty()){
                 lbl_name.setText("Shop Name is required");
             }
             else if(txt_address.getText().trim().isEmpty()){
                 lbl_address.setText("Address is required");
             }
            else{
                try {
                    // TODO add your handling code here:  
                    pst = con.prepareStatement("update shop set name = ? ,address = ? where id = ?");
                    pst.setString(1,txt_name.getText());
                    pst.setString(2,txt_address.getText());
                    pst.setInt(3,id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Shop Updated successfully");

                    txt_name.setText("");
                    txt_address.setText("");
                    txt_name.requestFocus();
                    getShops();
                    saveBtn.setEnabled(true);
                    lbl_name.setText("");
                    lbl_address.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
             }
        }
         else{
            JOptionPane.showMessageDialog(null, "Select a shop to Update and procceed");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(shopsTable.getSelectedRow() >= 0){
        df = (DefaultTableModel)shopsTable.getModel();
        int selected = shopsTable.getSelectedRow();
        int id = Integer.parseInt(df.getValueAt(selected,0).toString());
        try {
            // TODO add your handling code here:  
            pst = con.prepareStatement("delete from shop where id = ?");
            pst.setInt(1,id);
            
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Shop", "Remove Shop", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Shop Deleted successfully","Remove Shop",JOptionPane.INFORMATION_MESSAGE);
            txt_name.setText("");
            txt_address.setText("");
            txt_name.requestFocus();
            getShops();
            saveBtn.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Select a shop to delete and procceed");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shops.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shops().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoryMenuBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JButton logoutMenuBtn;
    private javax.swing.JButton myAccountMenuBtn;
    private javax.swing.JButton productInMenuBtn;
    private javax.swing.JButton productMenuBtn;
    private javax.swing.JButton productOutMenuBtn;
    private javax.swing.JButton reportMenuBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton shopsMenuBtn;
    private javax.swing.JTable shopsTable;
    private javax.swing.JButton suppliersMenuBtn;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_name;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
