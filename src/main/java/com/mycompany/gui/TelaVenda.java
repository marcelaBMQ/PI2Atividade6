package com.mycompany.gui;

 

import com.mycompany.persistencia.CadastroVendas;
import com.mycompany.persistencia.CadastroVendasDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class TelaVenda extends javax.swing.JFrame {

   
    public TelaVenda() {
        initComponents();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rotuloCadastroVendas = new javax.swing.JLabel();
        rotuloData = new javax.swing.JLabel();
        rotuloPlataforma = new javax.swing.JLabel();
        rotuloProduto = new javax.swing.JLabel();
        rotuloValor = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtPlataforma = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnFinalizarVenda = new javax.swing.JButton();
        btnListarVendaPlat = new javax.swing.JButton();
        btnListarVendaData = new javax.swing.JButton();
        btnListarVendaProd = new javax.swing.JButton();
        rotuloPesquisaFiltro = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnListarTodas = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnExcluirVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotuloCadastroVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotuloCadastroVendas.setText("Cadastro de Vendas");

        rotuloData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloData.setText("Data:");

        rotuloPlataforma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloPlataforma.setText("Plataforma:");

        rotuloProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloProduto.setText("Produto:");

        rotuloValor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloValor.setText("Valor:");

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnFinalizarVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizarVenda.setText("Finalizar");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        btnListarVendaPlat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListarVendaPlat.setText("Plataforma");
        btnListarVendaPlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendaPlatActionPerformed(evt);
            }
        });

        btnListarVendaData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListarVendaData.setText("Data");
        btnListarVendaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendaDataActionPerformed(evt);
            }
        });

        btnListarVendaProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListarVendaProd.setText("Produto");
        btnListarVendaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVendaProdActionPerformed(evt);
            }
        });

        rotuloPesquisaFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloPesquisaFiltro.setText("PESQUISA por FILTRO:");

        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rotuloData)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rotuloProduto)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rotuloCadastroVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                                    .addComponent(txtProduto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rotuloPlataforma)
                                    .addComponent(rotuloValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtData)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlataforma)))
                            .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rotuloPesquisaFiltro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarVendaProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarVendaData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListarVendaPlat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(18, 18, 18)
                        .addComponent(rotuloPesquisaFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarVendaPlat)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarVendaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarVendaProd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(rotuloCadastroVendas)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloProduto)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloPlataforma)
                            .addComponent(txtPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotuloValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloData))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Produto", "Valor", "Data", "Plataforma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        btnListarTodas.setViewportView(tblVendas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnListarTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        btnExcluirVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirVenda.setText("Excluir");
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirVenda)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabelaVendas(List<CadastroVendas> lista) {
        
    DefaultTableModel model = (DefaultTableModel) tblVendas.getModel();
    model.setRowCount(0); // limpa a tabela

    for (CadastroVendas v : lista) {
        model.addRow(new Object[]{
            v.getId(),                
            v.getProduto(),
            v.getValor(),
            v.getData(),
            v.getPlataforma()
        });
    }
    }
    
    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        new TelaMenu().setVisible(true);
          this.dispose(); 
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnListarVendaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendaDataActionPerformed
       
         try {
        CadastroVendasDAO dao = new  CadastroVendasDAO();
        List< CadastroVendas> lista = dao.listarVendaData(txtData.getText()); // sem filtro
        preencherTabelaVendas(lista);
         limparCampos(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar produtos:\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnListarVendaDataActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
       try {
            if (tblVendas.getSelectedRow() >= 0) {
                //obter o valor da coluna id da linha selecionada
                int id = (int) tblVendas.getValueAt(tblVendas.getSelectedRow(), 0);
                int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir esse registro? ");
                if (resposta == 0) {
                    CadastroVendasDAO cadastroVendasDao = new CadastroVendasDAO();
                    cadastroVendasDao.excluirVenda(id);
                    JOptionPane.showMessageDialog(this, "Registro Excluido com sucesso! ");                  
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
       
        CadastroVendas novaVenda = new CadastroVendas();
        try{
          //para a descrição capturamos direto o valor do campo de texto
          novaVenda.setProduto(txtProduto.getText());
          novaVenda.setValor(Integer.parseInt(txtValor.getText().trim()));
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate data = LocalDate.parse(txtData.getText(), formatter);
          novaVenda.setData(data);
          novaVenda.setPlataforma(txtPlataforma.getText());
          
          CadastroVendasDAO cadastroVendasDAO = new CadastroVendasDAO();
          cadastroVendasDAO.cadastrarVenda(novaVenda);
          
          JOptionPane.showMessageDialog(
            this,
            "Venda cadastrado com sucesso!",
            "Sucesso",
            JOptionPane.INFORMATION_MESSAGE);
         }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      } 
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void btnListarVendaPlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendaPlatActionPerformed
       try {
        CadastroVendasDAO dao = new  CadastroVendasDAO();
        List< CadastroVendas> lista = dao.listarVendaPlat(txtPlataforma.getText());  
        preencherTabelaVendas(lista);
         limparCampos(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar produtos:\n" + e.getMessage());
    }
   
    }//GEN-LAST:event_btnListarVendaPlatActionPerformed

    private void btnListarVendaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVendaProdActionPerformed
    try {
        CadastroVendasDAO dao = new  CadastroVendasDAO();
        List< CadastroVendas> lista = dao.listarVendaProd(txtProduto.getText()); // sem filtro
        preencherTabelaVendas(lista);
         limparCampos(); 
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar produtos:\n" + e.getMessage());
    }
        
    }//GEN-LAST:event_btnListarVendaProdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        CadastroVendasDAO dao = new CadastroVendasDAO();
        List<CadastroVendas> lista = dao.listarTodasVendas();
        preencherTabelaVendas(lista);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            this, "Erro ao listar vendas:\n" + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limparCampos() {
    txtProduto.setText("");
    txtPlataforma.setText("");
    txtData.setText("");
    }

    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
       //     logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaVenda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JScrollPane btnListarTodas;
    private javax.swing.JButton btnListarVendaData;
    private javax.swing.JButton btnListarVendaPlat;
    private javax.swing.JButton btnListarVendaProd;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel rotuloCadastroVendas;
    private javax.swing.JLabel rotuloData;
    private javax.swing.JLabel rotuloPesquisaFiltro;
    private javax.swing.JLabel rotuloPlataforma;
    private javax.swing.JLabel rotuloProduto;
    private javax.swing.JLabel rotuloValor;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtPlataforma;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
