/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecao;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class AddColFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddColFrame
     */
    public AddColFrame() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addNomeTextField = new javax.swing.JTextField();
        btClearCol = new javax.swing.JButton();
        btAddCol = new javax.swing.JButton();
        addTelTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addEmailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCol = new javax.swing.JTable();
        btShowCol = new javax.swing.JButton();
        btBackCol = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSelect = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionar Coletor"));

        jLabel2.setText("Nome:");

        addNomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNomeTextFieldActionPerformed(evt);
            }
        });

        btClearCol.setText("Limpar");
        btClearCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearColActionPerformed(evt);
            }
        });

        btAddCol.setText("Add");
        btAddCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddColActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone:");

        jLabel4.setText("E-mail:");

        btUpdate.setText("Atualizar");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(addTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(addNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btClearCol)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btAddCol, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btUpdate)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addNomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddCol)
                    .addComponent(btClearCol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUpdate))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Coletores Cadastrados"));

        tabCol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(tabCol);

        btShowCol.setText("Ver Coletores Cadastrados");
        btShowCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowColActionPerformed(evt);
            }
        });

        btBackCol.setText("Sair");
        btBackCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackColActionPerformed(evt);
            }
        });

        btDelete.setText("Deletar");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btSelect.setText("Selecionar");
        btSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btBackCol, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btShowCol)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btShowCol)
                            .addComponent(btDelete)
                            .addComponent(btSelect)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBackCol)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomeTextFieldActionPerformed

    private void btClearColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearColActionPerformed
        addNomeTextField.setText("");
        addTelTextField.setText("");
        addEmailTextField.setText("");
    }//GEN-LAST:event_btClearColActionPerformed

    private void btAddColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddColActionPerformed
        String nome = addNomeTextField.getText();
        String telefone = addTelTextField.getText();
        String email = addEmailTextField.getText();

        Coletor c = ColetorFactory.getInstance().cadastrarColetor(nome,telefone,email);
        
        initColTable();
        addNomeTextField.setText("");
        addTelTextField.setText("");
        addEmailTextField.setText("");
    }//GEN-LAST:event_btAddColActionPerformed

    private void initColTable(){
        DefaultTableModel m = (DefaultTableModel) tabCol.getModel();
        m.setRowCount(0);
        for(Coletor c : ColetorFactory.getInstance().findAll()){
            m.addRow(new Object[] {c.getNome(), c.getTelefone(), c.getEmail()});
        }
    }     
    
    private void btShowColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowColActionPerformed
        initColTable();
    }//GEN-LAST:event_btShowColActionPerformed

    private void btBackColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackColActionPerformed
        this.dispose();
    }//GEN-LAST:event_btBackColActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
       int row = tabCol.getSelectedRow();
       int columnNome = 0;
       int columnTel = 1; 
       int columnEmail = 2;
       
       Object n = tabCol.getValueAt(row, columnNome);
       Object t = tabCol.getValueAt(row, columnTel);
       Object e = tabCol.getValueAt(row, columnEmail);

       String nome = n.toString();       
       String telefone = t.toString();       
       String email = e.toString(); 
       
       Coletor cRemove = ColetorFactory.getInstance().findCol(nome,telefone,email);
       
       if((ColetorFactory.getInstance().deleteCol(cRemove))==true){
            initColTable();
       }
       
       else{
           ImpossivelDeletar frame = new ImpossivelDeletar();
           frame.setVisible(true);
       }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        int row = tabCol.getSelectedRow();
        int columnNome = 0;
        int columnTel = 1; 
        int columnEmail = 2;

        Object n = tabCol.getValueAt(row, columnNome);
        Object t = tabCol.getValueAt(row, columnTel);
        Object e = tabCol.getValueAt(row, columnEmail);

        String nome = n.toString();       
        String telefone = t.toString();       
        String email = e.toString(); 

        Coletor c1 = ColetorFactory.getInstance().findCol(nome,telefone,email);
        
        String nomeNovo = addNomeTextField.getText();
        String telefoneNovo = addTelTextField.getText();
        String emailNovo = addEmailTextField.getText();

        ColetorFactory.getInstance().updateCol(c1, nomeNovo, telefoneNovo, emailNovo);
        initColTable();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectActionPerformed
        int row = tabCol.getSelectedRow();
        int columnNome = 0;
        int columnTel = 1; 
        int columnEmail = 2;

        Object n = tabCol.getValueAt(row, columnNome);
        Object t = tabCol.getValueAt(row, columnTel);
        Object e = tabCol.getValueAt(row, columnEmail);

        String nome = n.toString();       
        String telefone = t.toString();       
        String email = e.toString(); 
        
        addNomeTextField.setText(nome);
        addTelTextField.setText(telefone);
        addEmailTextField.setText(email);
    }//GEN-LAST:event_btSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addEmailTextField;
    private javax.swing.JTextField addNomeTextField;
    private javax.swing.JTextField addTelTextField;
    private javax.swing.JButton btAddCol;
    private javax.swing.JButton btBackCol;
    private javax.swing.JButton btClearCol;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSelect;
    private javax.swing.JButton btShowCol;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCol;
    // End of variables declaration//GEN-END:variables
}