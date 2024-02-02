
package VIEW;

import _Z.Y;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnCadastroDeConta = new javax.swing.JButton();
        btnAlteracaoDeConta = new javax.swing.JButton();
        btnExclusaoDeConta = new javax.swing.JButton();
        btnListagemDeContas = new javax.swing.JButton();
        btnPesquisaDeContas = new javax.swing.JButton();
        btnCadastroDeProfessor = new javax.swing.JButton();
        btnAlteracaoDeProfessor = new javax.swing.JButton();
        btnExclusaodeProfessor = new javax.swing.JButton();
        btnListagemDeProfessor = new javax.swing.JButton();
        btnPesquisaDeProfessor = new javax.swing.JButton();
        btnExclusaoDeEC = new javax.swing.JButton();
        btnListagemDeEC = new javax.swing.JButton();
        btnPesquisarDeEC = new javax.swing.JButton();
        btnAlteracaoDeEC = new javax.swing.JButton();
        btnCadastroDeEC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema IFBA - Tela Principal");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Principal");

        btnCadastroDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastroDeConta.setText("Cadastro de Conta");
        btnCadastroDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeContaActionPerformed(evt);
            }
        });

        btnAlteracaoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlteracaoDeConta.setText("Alteração de Conta");
        btnAlteracaoDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteracaoDeContaActionPerformed(evt);
            }
        });

        btnExclusaoDeConta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExclusaoDeConta.setText("Exclusão de Conta");
        btnExclusaoDeConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExclusaoDeContaActionPerformed(evt);
            }
        });

        btnListagemDeContas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListagemDeContas.setText("Listagem de Contas");
        btnListagemDeContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemDeContasActionPerformed(evt);
            }
        });

        btnPesquisaDeContas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisaDeContas.setText("Pesquisa de Contas");
        btnPesquisaDeContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDeContasActionPerformed(evt);
            }
        });

        btnCadastroDeProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastroDeProfessor.setText("Cadastro de Professor");
        btnCadastroDeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeProfessorActionPerformed(evt);
            }
        });

        btnAlteracaoDeProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlteracaoDeProfessor.setText("Alteração de Professor");
        btnAlteracaoDeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteracaoDeProfessorActionPerformed(evt);
            }
        });

        btnExclusaodeProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExclusaodeProfessor.setText("Exclusão de Professor");
        btnExclusaodeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExclusaodeProfessorActionPerformed(evt);
            }
        });

        btnListagemDeProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListagemDeProfessor.setText("Listagem de Professores");
        btnListagemDeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemDeProfessorActionPerformed(evt);
            }
        });

        btnPesquisaDeProfessor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisaDeProfessor.setText("Pesquisa de Professores");
        btnPesquisaDeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaDeProfessorActionPerformed(evt);
            }
        });

        btnExclusaoDeEC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExclusaoDeEC.setText("Exclusão de Evento Cultural");
        btnExclusaoDeEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExclusaoDeECActionPerformed(evt);
            }
        });

        btnListagemDeEC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListagemDeEC.setText("Listagem de Evento Cultural");
        btnListagemDeEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListagemDeECActionPerformed(evt);
            }
        });

        btnPesquisarDeEC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPesquisarDeEC.setText("Pesquisa de Evento Cultural");
        btnPesquisarDeEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarDeECActionPerformed(evt);
            }
        });

        btnAlteracaoDeEC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAlteracaoDeEC.setText("Alteração de Evento Cultural");
        btnAlteracaoDeEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlteracaoDeECActionPerformed(evt);
            }
        });

        btnCadastroDeEC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastroDeEC.setText("Cadastro de Evento Cultural");
        btnCadastroDeEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroDeECActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListagemDeContas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExclusaoDeConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisaDeContas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlteracaoDeConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastroDeConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastroDeProfessor)
                    .addComponent(btnAlteracaoDeProfessor)
                    .addComponent(btnExclusaodeProfessor)
                    .addComponent(btnListagemDeProfessor)
                    .addComponent(btnPesquisaDeProfessor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlteracaoDeEC)
                            .addComponent(btnCadastroDeEC)
                            .addComponent(btnExclusaoDeEC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisarDeEC)
                            .addComponent(btnListagemDeEC))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastroDeConta)
                            .addComponent(btnCadastroDeProfessor)
                            .addComponent(btnCadastroDeEC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlteracaoDeConta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAlteracaoDeProfessor)
                        .addComponent(btnAlteracaoDeEC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExclusaoDeConta)
                    .addComponent(btnExclusaodeProfessor)
                    .addComponent(btnExclusaoDeEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListagemDeContas)
                    .addComponent(btnListagemDeProfessor)
                    .addComponent(btnListagemDeEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisaDeContas)
                    .addComponent(btnPesquisaDeProfessor)
                    .addComponent(btnPesquisarDeEC))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeContaActionPerformed

              new TelaDeCadastroDeConta().setVisible(true);
        
    }//GEN-LAST:event_btnCadastroDeContaActionPerformed

    private void btnAlteracaoDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteracaoDeContaActionPerformed
       
         new TelaDeAlteracaoDeConta().setVisible(true);
        
    }//GEN-LAST:event_btnAlteracaoDeContaActionPerformed

    private void btnExclusaoDeContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclusaoDeContaActionPerformed
        
          new TelaDeExclusaoDeConta().setVisible(true);
        
    }//GEN-LAST:event_btnExclusaoDeContaActionPerformed

    private void btnListagemDeContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemDeContasActionPerformed
        
        new TelaDeListagemDeContas().setVisible(true);
        
    }//GEN-LAST:event_btnListagemDeContasActionPerformed

    private void btnPesquisaDeContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDeContasActionPerformed
        
          new TelaDePesquisaDeContas().setVisible(true);
        
    }//GEN-LAST:event_btnPesquisaDeContasActionPerformed

    private void btnCadastroDeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeProfessorActionPerformed
      new TelaDeCadastroDeProfessor().setVisible(true);
    }//GEN-LAST:event_btnCadastroDeProfessorActionPerformed

    private void btnAlteracaoDeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteracaoDeProfessorActionPerformed
       new TelaDeAlteracaoDeProfessor().setVisible(true);
    }//GEN-LAST:event_btnAlteracaoDeProfessorActionPerformed

    private void btnExclusaodeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclusaodeProfessorActionPerformed
       new TelaDeExclusaoDeProfessor().setVisible(true);
    }//GEN-LAST:event_btnExclusaodeProfessorActionPerformed

    private void btnListagemDeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemDeProfessorActionPerformed
           new TelaDeListagemDeProfessor().setVisible(true);
    }//GEN-LAST:event_btnListagemDeProfessorActionPerformed

    private void btnPesquisaDeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaDeProfessorActionPerformed
              new TelaDePesquisaDeProfessor().setVisible(true);

    }//GEN-LAST:event_btnPesquisaDeProfessorActionPerformed

    private void btnCadastroDeECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeECActionPerformed
        new TelaDeCadastroDeEvento_cultural().setVisible(true);
    }//GEN-LAST:event_btnCadastroDeECActionPerformed

    private void btnAlteracaoDeECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlteracaoDeECActionPerformed
        new TelaDeAlteracaoDeEvento_cultural().setVisible(true);
    }//GEN-LAST:event_btnAlteracaoDeECActionPerformed

    private void btnExclusaoDeECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExclusaoDeECActionPerformed
        new TelaDeExclusaoDeEvento_Cultural().setVisible(true);
    }//GEN-LAST:event_btnExclusaoDeECActionPerformed

    private void btnListagemDeECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListagemDeECActionPerformed
        new TelaDeListagemDeEvento_Cultural().setVisible(true);
    }//GEN-LAST:event_btnListagemDeECActionPerformed

    private void btnPesquisarDeECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarDeECActionPerformed
        new TelaDePesquisaDeEventoCultural().setVisible(true);
    }//GEN-LAST:event_btnPesquisarDeECActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(!Y.t()){new TelaPrincipal().setVisible(true);}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlteracaoDeConta;
    private javax.swing.JButton btnAlteracaoDeEC;
    private javax.swing.JButton btnAlteracaoDeProfessor;
    private javax.swing.JButton btnCadastroDeConta;
    private javax.swing.JButton btnCadastroDeEC;
    private javax.swing.JButton btnCadastroDeProfessor;
    private javax.swing.JButton btnExclusaoDeConta;
    private javax.swing.JButton btnExclusaoDeEC;
    private javax.swing.JButton btnExclusaodeProfessor;
    private javax.swing.JButton btnListagemDeContas;
    private javax.swing.JButton btnListagemDeEC;
    private javax.swing.JButton btnListagemDeProfessor;
    private javax.swing.JButton btnPesquisaDeContas;
    private javax.swing.JButton btnPesquisaDeProfessor;
    private javax.swing.JButton btnPesquisarDeEC;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
