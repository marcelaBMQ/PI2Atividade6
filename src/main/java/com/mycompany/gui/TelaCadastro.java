package com.mycompany.gui;


import com.mycompany.persistencia.Fornecedor;
import com.mycompany.persistencia.FornecedorDAO;
import com.mycompany.persistencia.Produto;
import com.mycompany.persistencia.ProdutoDAO;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class TelaCadastro extends javax.swing.JFrame {
   
   
    public TelaCadastro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rotuloCadastroProd = new javax.swing.JLabel();
        rotuloNome = new javax.swing.JLabel();
        rotuloFabricante = new javax.swing.JLabel();
        rotuloFornecedor = new javax.swing.JLabel();
        txtNomeProd = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        btnBuscarProd = new javax.swing.JButton();
        btnCadastrarProd = new javax.swing.JButton();
        btnListarProd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rotuloCadastroForn = new javax.swing.JLabel();
        rotuloNomeForn = new javax.swing.JLabel();
        rotuloTelefone = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnBuscarForn = new javax.swing.JButton();
        btnCadastrarForn = new javax.swing.JButton();
        btnListarForn = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnExcluirProd = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnExcluirForn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rotuloCadastroProd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotuloCadastroProd.setText("Cadastro de Produtos");

        rotuloNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloNome.setText("Nome: ");

        rotuloFabricante.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloFabricante.setText("Fabricante:");

        rotuloFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloFornecedor.setText("Fornecedor:");

        txtNomeProd.setText(" ");
        txtNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdActionPerformed(evt);
            }
        });

        txtFabricante.setText(" ");

        txtFornecedor.setText(" ");

        btnBuscarProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarProd.setText("Buscar");
        btnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdActionPerformed(evt);
            }
        });

        btnCadastrarProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarProd.setText("Cadastrar");
        btnCadastrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdActionPerformed(evt);
            }
        });

        btnListarProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListarProd.setText("Listar Produtos");
        btnListarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(rotuloCadastroProd)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotuloFabricante)
                    .addComponent(rotuloNome)
                    .addComponent(rotuloFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListarProd)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNomeProd)
                        .addComponent(txtFabricante)
                        .addComponent(txtFornecedor)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addComponent(btnBuscarProd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarProd))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotuloCadastroProd)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloNome)
                    .addComponent(txtNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloFabricante)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloFornecedor)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProd)
                    .addComponent(btnCadastrarProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rotuloCadastroForn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotuloCadastroForn.setText("Cadastro de Fornecedores");

        rotuloNomeForn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloNomeForn.setText("Nome:");

        rotuloTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotuloTelefone.setText("Telefone:");

        txtNomeFornecedor.setText(" ");
        txtNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFornecedorActionPerformed(evt);
            }
        });

        txtTelefone.setText(" ");

        btnBuscarForn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarForn.setText("Buscar");
        btnBuscarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFornActionPerformed(evt);
            }
        });

        btnCadastrarForn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCadastrarForn.setText("Cadastrar");
        btnCadastrarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornActionPerformed(evt);
            }
        });

        btnListarForn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListarForn.setText("Listar Fornecedores");
        btnListarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarFornActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(rotuloCadastroForn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnMenu))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotuloTelefone)
                    .addComponent(rotuloNomeForn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarForn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrarForn))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarForn))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotuloCadastroForn)
                    .addComponent(btnMenu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotuloNomeForn)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotuloTelefone))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarForn)
                    .addComponent(btnCadastrarForn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarForn)
                .addGap(23, 23, 23))
        );

        tblFornecedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFornecedores);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExcluirProd.setText("Excluir");
        btnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(btnExcluirProd)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnExcluirProd)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        btnExcluirForn.setText("Excluir");
        btnExcluirForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(btnExcluirForn)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnExcluirForn)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        tblProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Fabricante", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornActionPerformed
       
       Fornecedor novoForn = new Fornecedor();
        try{
          //para a descrição capturamos direto o valor do campo de texto
          novoForn.setNomeFornecedor(txtNomeFornecedor.getText());
          novoForn.setTelefone(txtTelefone.getText());
    
          FornecedorDAO fornecedorDAO = new FornecedorDAO();
          fornecedorDAO.cadastrarForn(novoForn);
          
          JOptionPane.showMessageDialog(
            this,
            "Fornecedor cadastrado com sucesso!",
            "Sucesso",
            JOptionPane.INFORMATION_MESSAGE);
        
         }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      } 
    }//GEN-LAST:event_btnCadastrarFornActionPerformed

    private void btnExcluirFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornActionPerformed
       
        try {
        int linhaSelecionada = tblFornecedores.getSelectedRow();

        if (linhaSelecionada >= 0) {

            // PEGAR O ID  
            Integer id = (Integer) tblFornecedores.getValueAt(linhaSelecionada, 0);

            int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja excluir esse registro?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                FornecedorDAO fornecedorDAO = new FornecedorDAO();
                fornecedorDAO.excluirForn(id);

                JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                btnListarFornActionPerformed(evt); // atualiza a tabela
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um fornecedor para excluir.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocorreu uma falha: " + e.getMessage());
    }
    }//GEN-LAST:event_btnExcluirFornActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       new TelaMenu().setVisible(true);
          this.dispose(); 
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdActionPerformed
         
        try {
        String filtro = txtNomeProd.getText().trim();
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProd(filtro);
        preencherTabelaProdutos(lista);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar produto:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarProdActionPerformed

    
    private void btnCadastrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdActionPerformed
        // TODO add your handling code here:
        
        Produto novoProd = new Produto();
        try{
          //para a descrição capturamos direto o valor do campo de texto
          novoProd.setNomeProduto(txtNomeProd.getText());
          novoProd.setFabricante(txtFabricante.getText());
          novoProd.setFornecedor(txtFornecedor.getText());
       
          ProdutoDAO produtoDAO = new ProdutoDAO();
          produtoDAO.cadastrarProd(novoProd);
          
          JOptionPane.showMessageDialog(
            this,
            "Produto cadastrado com sucesso!",
            "Sucesso",
            JOptionPane.INFORMATION_MESSAGE);
        
         }catch(Exception e){
          JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
      } 
    }//GEN-LAST:event_btnCadastrarProdActionPerformed
    
    
    private void preencherTabelaProdutos(List<Produto> lista) {
    DefaultTableModel model = (DefaultTableModel) tblProdutos.getModel();
    model.setRowCount(0); // limpa a tabela

    for (Produto p : lista) {
        model.addRow(new Object[]{
           p.getId(),                
            p.getNomeProduto(),
            p.getFabricante(),
            p.getFornecedor()
        });
    }
}
    
    private void preencherTabelaFornecedores(List<Fornecedor> lista) {
    DefaultTableModel model = (DefaultTableModel) tblFornecedores.getModel();
    model.setRowCount(0); // limpa a tabela

    for (Fornecedor f : lista) {
        model.addRow(new Object[]{
            f.getId(),                
            f.getNomeFornecedor(),
            f.getTelefone(),
        });
    }
}
    
    
    private void btnListarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProdActionPerformed
        // TODO add your handling code here:
        try {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProd(""); // sem filtro
        preencherTabelaProdutos(lista);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar produtos:\n" + e.getMessage());
      } 
    }//GEN-LAST:event_btnListarProdActionPerformed


    private void btnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdActionPerformed
       
           try {
        int linhaSelecionada = tblProdutos.getSelectedRow();

        if (linhaSelecionada >= 0) {

            // PEGAR O ID  
            Integer id = (Integer) tblProdutos.getValueAt(linhaSelecionada, 0);

            int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja excluir esse registro?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                ProdutoDAO produtoDAO = new ProdutoDAO();
                produtoDAO.excluirProd(id);

                JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");
                btnListarProdActionPerformed(evt); // atualiza a tabela
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocorreu uma falha: " + e.getMessage());
    }
    }//GEN-LAST:event_btnExcluirProdActionPerformed

    private void txtNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFornecedorActionPerformed

    private void txtNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdActionPerformed

    private void btnListarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarFornActionPerformed
         try {
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.listarForn("");
        preencherTabelaFornecedores(lista);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao listar fornecedores:\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnListarFornActionPerformed

    private void btnBuscarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFornActionPerformed
        try {
        String filtro = txtNomeFornecedor.getText().trim();
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.listarForn(filtro);
        preencherTabelaFornecedores(lista);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar fornecedor:\n" + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarFornActionPerformed


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
          //  logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarForn;
    private javax.swing.JButton btnBuscarProd;
    private javax.swing.JButton btnCadastrarForn;
    private javax.swing.JButton btnCadastrarProd;
    private javax.swing.JButton btnExcluirForn;
    private javax.swing.JButton btnExcluirProd;
    private javax.swing.JButton btnListarForn;
    private javax.swing.JButton btnListarProd;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rotuloCadastroForn;
    private javax.swing.JLabel rotuloCadastroProd;
    private javax.swing.JLabel rotuloFabricante;
    private javax.swing.JLabel rotuloFornecedor;
    private javax.swing.JLabel rotuloNome;
    private javax.swing.JLabel rotuloNomeForn;
    private javax.swing.JLabel rotuloTelefone;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtNomeProd;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void btnListarProd(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
