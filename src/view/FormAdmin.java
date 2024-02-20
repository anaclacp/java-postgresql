
package view;


public class FormAdmin extends javax.swing.JFrame {

    
    public FormAdmin() {
        initComponents();
        
        this.setTitle("Admin");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPn = new javax.swing.JTabbedPane();
        pnFuncionalidades = new javax.swing.JPanel();
        lblTela = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        pnSobre = new javax.swing.JPanel();
        lblSobre = new javax.swing.JLabel();
        lblObj = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnFuncionalidades.setBackground(new java.awt.Color(204, 204, 255));

        lblTela.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblTela.setText("Tela de Funcionalidades do Admin");

        lblCliente.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 0, 0));
        lblCliente.setText("Clientes");
        lblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClienteMouseClicked(evt);
            }
        });

        lblFuncionario.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblFuncionario.setForeground(new java.awt.Color(255, 0, 0));
        lblFuncionario.setText("Funcionários");
        lblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFuncionarioMouseClicked(evt);
            }
        });

        lblProduto.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(255, 0, 0));
        lblProduto.setText(" Produtos");
        lblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnFuncionalidadesLayout = new javax.swing.GroupLayout(pnFuncionalidades);
        pnFuncionalidades.setLayout(pnFuncionalidadesLayout);
        pnFuncionalidadesLayout.setHorizontalGroup(
            pnFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionalidadesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblCliente)
                .addGap(109, 109, 109)
                .addComponent(lblProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(lblFuncionario)
                .addGap(41, 41, 41))
            .addGroup(pnFuncionalidadesLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblTela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFuncionalidadesLayout.setVerticalGroup(
            pnFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionalidadesLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblTela)
                .addGap(84, 84, 84)
                .addGroup(pnFuncionalidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto)
                    .addComponent(lblFuncionario)
                    .addComponent(lblCliente))
                .addContainerGap(301, Short.MAX_VALUE))
        );

        tabbedPn.addTab("Funcionalidades", pnFuncionalidades);

        pnSobre.setBackground(new java.awt.Color(204, 204, 255));
        pnSobre.setForeground(new java.awt.Color(204, 204, 255));

        lblSobre.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblSobre.setText("Sobre o projeto");

        lblObj.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblObj.setText("Objetivo do projeto:");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setText("Criar uma aplicação para administrar e organizar os ");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel10.setText("Ana Clara Carnavalli Pereira");

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setText("Código da matrícula:");

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel12.setText("837024");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel13.setText("dados de uma pizzaria.");

        javax.swing.GroupLayout pnSobreLayout = new javax.swing.GroupLayout(pnSobre);
        pnSobre.setLayout(pnSobreLayout);
        pnSobreLayout.setHorizontalGroup(
            pnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSobreLayout.createSequentialGroup()
                .addGroup(pnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnSobreLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(lblObj)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnSobreLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblSobre)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pnSobreLayout.setVerticalGroup(
            pnSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSobreLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblSobre)
                .addGap(51, 51, 51)
                .addComponent(lblObj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(58, 58, 58)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        tabbedPn.addTab("Sobre", pnSobre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPn, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClienteMouseClicked
        FormCliente f = new FormCliente();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblClienteMouseClicked

    private void lblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFuncionarioMouseClicked
        FormFuncionario f = new FormFuncionario();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblFuncionarioMouseClicked

    private void lblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutoMouseClicked
        FormInserirProduto f = new FormInserirProduto();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFuncionario;
    private javax.swing.JLabel lblObj;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblSobre;
    private javax.swing.JLabel lblTela;
    private javax.swing.JPanel pnFuncionalidades;
    private javax.swing.JPanel pnSobre;
    private javax.swing.JTabbedPane tabbedPn;
    // End of variables declaration//GEN-END:variables
}
