package view;

import controller.CategoriaDAO;
import controller.ProdutoDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Produto;

public class FormInserirProduto extends javax.swing.JFrame {

    
    public FormInserirProduto() {
        initComponents();
        
        this.setTitle("Produtos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        txtId.setEnabled(false);
        preencherCategorias();
        configurarTabela();
    }

    private void preencherCategorias() {
        List<Categoria> lista = new CategoriaDAO().listar();
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for (Categoria c : lista) {
            m.addElement(c);
        }
        cbxCategoria.setModel(m);
    }

    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.addColumn("Id");
        m.addColumn("Sabor");
        m.addColumn("Categoria");
        m.addColumn("Preço");
        
        tabPesquisa.setModel(m);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnProdutos = new javax.swing.JTabbedPane();
        pnInserir = new javax.swing.JPanel();
        lblInserir = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblSabor = new javax.swing.JLabel();
        txtSabor = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnPesquisar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPesquisa = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        lblPreco1 = new javax.swing.JLabel();
        txtTotalGeral = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnProdutosMouseClicked(evt);
            }
        });

        pnInserir.setBackground(new java.awt.Color(204, 204, 255));

        lblInserir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInserir.setText("Inserir produtos");

        lblProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProduto.setText("Produto");

        cbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setText("ID");

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblSabor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSabor.setText("Sabor ");

        txtSabor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco.setText("Preço");

        txtPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnInserir.setBackground(new java.awt.Color(153, 153, 255));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(153, 153, 255));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnInserirLayout = new javax.swing.GroupLayout(pnInserir);
        pnInserir.setLayout(pnInserirLayout);
        pnInserirLayout.setHorizontalGroup(
            pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInserirLayout.createSequentialGroup()
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInserirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnInserirLayout.createSequentialGroup()
                        .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnInserirLayout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(lblInserir))
                            .addGroup(pnInserirLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnInserirLayout.createSequentialGroup()
                                        .addComponent(lblProduto)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnInserirLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnInserirLayout.createSequentialGroup()
                                                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPreco)
                                                    .addComponent(lblSabor)
                                                    .addComponent(lblID))
                                                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnInserirLayout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInserirLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 249, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnInserirLayout.setVerticalGroup(
            pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInserirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblInserir)
                .addGap(39, 39, 39)
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSabor)
                    .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnInserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnInserir))
                .addGap(16, 16, 16))
        );

        pnProdutos.addTab("Inserir", pnInserir);

        pnPesquisar.setBackground(new java.awt.Color(204, 204, 255));

        tabPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPesquisa);

        txtPesquisa.setBackground(new java.awt.Color(153, 153, 255));
        txtPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        lblPreco1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco1.setText("Total Geral: ");

        txtTotalGeral.setEditable(false);
        txtTotalGeral.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout pnPesquisarLayout = new javax.swing.GroupLayout(pnPesquisar);
        pnPesquisar.setLayout(pnPesquisarLayout);
        pnPesquisarLayout.setHorizontalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPesquisarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPreco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPesquisa)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        pnPesquisarLayout.setVerticalGroup(
            pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPreco1)
                    .addComponent(txtTotalGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnProdutos.addTab("Pesquisar", pnPesquisar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPesquisaMouseClicked

        if (evt.getClickCount() == 2){
            int linha = tabPesquisa.getSelectedRow();

            String categoria_nome = tabPesquisa.getValueAt(linha,2).toString();
            

            DefaultComboBoxModel m =
            (DefaultComboBoxModel)cbxCategoria.getModel();
            int i;
            for (i = 0; i < m.getSize(); i++) {
                Categoria cat = (Categoria)m.getElementAt(i);
                if (cat.getNome().equals(categoria_nome)){
                    break;
                }
            }
            cbxCategoria.setSelectedIndex(i);

            txtId.setText(tabPesquisa.getValueAt(linha,0).toString());
            txtSabor.setText(tabPesquisa.getValueAt(linha,1).toString());
            txtPreco.setText(tabPesquisa.getValueAt(linha,2).toString());

            
            pnProdutos.setSelectedIndex(0);

        }
    }//GEN-LAST:event_tabPesquisaMouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

        String chave = txtPesquisa.getText();
        txtTotalGeral.setText("");
        if (!chave.isEmpty()) {
            List<Produto> lista = new ProdutoDAO().pesquisarPorNome(chave);
            configurarTabela();
            DefaultTableModel m = (DefaultTableModel) tabPesquisa.getModel();

            double soma = 0;
            for (Produto p : lista) {
                m.addRow(new Object[]{
                    p.getId(), p.getSabor(), p.getCategoria_nome(), p.getPreco(),
                });
                
                soma += (p.getPreco());
            }

            tabPesquisa.setModel(m);
            txtTotalGeral.setText(String.format("%.2f", soma));
        }else{
            configurarTabela();
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Produto p = new Produto();
        p.setSabor(txtSabor.getText());
        p.setPreco(Double.parseDouble(txtPreco.getText()));
        
        Categoria cat = (Categoria) cbxCategoria.getSelectedItem();
        p.setCategoria_id(cat.getId());
        p.setCategoria_nome(cat.getNome());

        int res = -1;
        if (txtId.getText().isEmpty()) {
            res = new ProdutoDAO().inserir(p);
        } else {
            //atualizar
            p.setId(Integer.parseInt(txtId.getText()));
            res = new ProdutoDAO().atualizar(p);
        }

        if (res >= 0) {
            txtId.setText(String.valueOf(res));
            JOptionPane.showMessageDialog(null,
                    "Operação realizada com sucesso."
            );
        } else {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível realizar a operação."
            );
        }
        txtId.setText("");
        txtSabor.setText("");
        txtPreco.setText("");
        cbxCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FormAdmin f = new FormAdmin();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void pnProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(FormInserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInserirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormInserirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblInserir;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPreco1;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSabor;
    private javax.swing.JPanel pnInserir;
    private javax.swing.JPanel pnPesquisar;
    private javax.swing.JTabbedPane pnProdutos;
    private javax.swing.JTable tabPesquisa;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtSabor;
    private javax.swing.JTextField txtTotalGeral;
    // End of variables declaration//GEN-END:variables
}
