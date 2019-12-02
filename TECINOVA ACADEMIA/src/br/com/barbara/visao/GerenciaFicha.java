/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;

import Util.NovoHibernateUtil;
import br.com.barbara.Classes.Ficha;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author anton
 */
public class GerenciaFicha extends javax.swing.JDialog {

    /**
     * Creates new form GerenciaFicha
     */
    public GerenciaFicha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPopProdutos = new javax.swing.JPopupMenu();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jFdataEntrada = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jCSexo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMediacao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jCAcomp = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTProbSau = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTAltura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTProfissao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTObjetivo = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFCR = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFCM = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTIdade = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TECINOVA - FICHA");
        setPreferredSize(new java.awt.Dimension(689, 400));

        jPanel1.setBackground(new java.awt.Color(0, 140, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COD:");

        jLId.setForeground(new java.awt.Color(255, 255, 255));
        jLId.setText("id");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOME:");

        jTProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTProdKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DATA DE ENTRADA");

        try {
            jFdataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEXO:");

        jCSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "MASCULINO", "FEMININO" }));
        jCSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSexoActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PESO:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEDICAÇÃO:");

        jTMediacao.setColumns(20);
        jTMediacao.setRows(5);
        jScrollPane1.setViewportView(jTMediacao);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ACOMPANHAMENTO:");

        jCAcomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE", "SIM ", "NÃO " }));
        jCAcomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCAcompActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PROBLEMA DE SAUDE:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ALTURA:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PROFISSAO:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("OBJETIVO");

        jScrollPane2.setViewportView(jTObjetivo);

        jButton1.setText("SALVAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FREQUENCIA CARD. EM REPOUSO");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FREQUENCIA CARDIACA MAXIMA");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("IDADE:");

        jButton3.setText("ATUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLId)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTProd, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFdataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTIdade)))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(16, 16, 16)
                                .addComponent(jCAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFCR)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFCM)
                                            .addComponent(jLabel13))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jTProbSau, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLId)
                    .addComponent(jLabel3)
                    .addComponent(jTProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jFdataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCAcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jCSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jTProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTProbSau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(748, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ficha ficha = new Ficha();
        ficha.setIdCliente(Integer.parseInt(jLId.getText()));
        ficha.setAcompanhamento(jCAcomp.getSelectedItem().toString());
        ficha.setAltura(Float.parseFloat(jTAltura.getText()));
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         
        try {
            ficha.setDataEntrada(formato.parse(jFdataEntrada.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(GerenciaFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        ficha.setMedicacao(jTMediacao.getText());
        ficha.setObjetivo(jTObjetivo.getText());
        ficha.setPeso(Float.parseFloat(jTPeso.getText()));
        ficha.setProblemaSaude(jTProbSau.getText());
        ficha.setProfissao(jTProfissao.getText());
        ficha.setSexo(jCSexo.getSelectedItem().toString());
        ficha.setFrequenciacardrep(Float.parseFloat(jTFCR.getText()));
        ficha.setFrequenciacardMax(Float.parseFloat(jTFCM.getText()));
        Session s = NovoHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(ficha);
        s.getTransaction().commit();
       // s.close();
        JOptionPane.showMessageDialog(rootPane, "FICHA CRIADA COM SUCESSO!");
        limparcampos();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdKeyPressed
//codigo para jogar o nome do cliente no text viewr atravez de jpopup
    if (evt.getKeyCode() == evt.VK_SPACE) {
        jPopProdutos.removeAll();//remove tudo antes de pesquisar e adicionar
        jLId.setText("");//limpa o campo do id
        pesquisaSelecionada(jTProd.getText());//chama uma nova pesquisa
        
        
        
            jTProd.add(jPopProdutos);//adiciona o popup selecionado ao jtextfield
            jTProd.setComponentPopupMenu(jPopProdutos);//seta o popup no jtext
            try {
                int dotPosition = jTProd.getCaretPosition();//pega a posicao do jtext
                Rectangle popupLocation = jTProd.modelToView(dotPosition);//cria um tetangulo para jogar o model do pop up
                jPopProdutos.show(jTProd, popupLocation.x, popupLocation.y+30);//joga na posicao 
                jTProd.setFocusable(true);///joga o focu no jtestfield do popup
            } catch (BadLocationException badLocationException) {
                //exceção
                System.out.println("Oops"+badLocationException);
            }
          }    
        
        if (evt.getKeyCode() == evt.VK_F2) { //se apertar f2 ele fecha
             this.dispose();
          //   CadastroProduto cadastroProduto = new CadastroProduto(null, true);
           //  cadastroProduto.setVisible(true);
            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTProdKeyPressed

    private void jCAcompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCAcompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCAcompActionPerformed

    private void jCSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSexoActionPerformed
        int idade = Integer.parseInt(jTIdade.getText());
        if(jCSexo.getSelectedItem().toString().equalsIgnoreCase("masculino")){
            jTFCM.setText(String.valueOf(208.609-(0.716*idade)));
        }else if(jCSexo.getSelectedItem().toString().equalsIgnoreCase("FEMININO")){
            jTFCM.setText(String.valueOf(209.273-(0.804*idade)));
        }else{
            JOptionPane.showMessageDialog(rootPane, "Informe o sexo, /n mas não esqueça de informar a idade");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCSexoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

ATUALIZA();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciaFicha dialog = new GerenciaFicha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCAcomp;
    private javax.swing.JComboBox<String> jCSexo;
    private javax.swing.JFormattedTextField jFdataEntrada;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTFCM;
    private javax.swing.JTextField jTFCR;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextArea jTMediacao;
    private javax.swing.JTextPane jTObjetivo;
    private javax.swing.JTextField jTPeso;
    private javax.swing.JTextField jTProbSau;
    private javax.swing.JTextField jTProd;
    private javax.swing.JTextField jTProfissao;
    // End of variables declaration//GEN-END:variables
///metodo de pesquisa que preenche o jpopup 
private void pesquisaSelecionada(String text) {
Session sesion = NovoHibernateUtil.getSessionFactory().openSession();        Transaction tx = null;
        Criteria crit = sesion.createCriteria(br.com.barbara.Classes.Clientes.class);
       // crit.add(Restrictions.like("nome",text+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        br.com.barbara.Classes.Clientes Sal = (br.com.barbara.Classes.Clientes) iterator.next(); 
          JMenuItem item = new JMenuItem(Sal.getIdCliente()+","+Sal.getNome());
          item.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent arg0){
             String mods = item.getText();
             String campos[] = mods.split(",");
             jTProd.setText(campos[1]);
             jLId.setText(campos[0]);
             pegaFicha(Integer.parseInt(campos[0]));

            }});
         jPopProdutos.add(item);
         
        }
}

public void limparcampos(){
    jTAltura.setText("");
    jTFCM.setText("");
    jTFCR.setText("");
    jTIdade.setText("");
    jTMediacao.setText("");
    jTObjetivo.setText("");
    jTPeso.setText("");
    jTProbSau.setText("");
    jTProd.setText("");
    jTProfissao.setText("");
    jCAcomp.setSelectedIndex(0);
    jCSexo.setSelectedIndex(0);
}

    private void pegaFicha(int i) {
        Session sesion = NovoHibernateUtil.getSessionFactory().openSession();        Transaction tx = null;
        Criteria crit = sesion.createCriteria(br.com.barbara.Classes.Ficha.class);
       // crit.add(Restrictions.like("nome",text+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        br.com.barbara.Classes.Ficha Sal = (br.com.barbara.Classes.Ficha) iterator.next(); 
         
        if(Sal.getIdCliente() == i){
        jTAltura.setText(String.valueOf(Sal.getAltura()));
          jTFCM.setText(String.valueOf(Sal.getFrequenciacardMax()));
          jTFCR.setText(String.valueOf(Sal.getFrequenciacardrep()));
          jTMediacao.setText(String.valueOf(Sal.getMedicacao()));
          jTObjetivo.setText(String.valueOf(Sal.getObjetivo()));
          jTPeso.setText(String.valueOf(Sal.getPeso()));
          jTProbSau.setText(String.valueOf(Sal.getProblemaSaude()));
          jTProfissao.setText(String.valueOf(Sal.getProfissao()));
        }else{
            
        }

    }



    }

    private void ATUALIZA() {
         Ficha ficha = new Ficha();
        ficha.setIdCliente(Integer.parseInt(jLId.getText()));
        ficha.setAcompanhamento(jCAcomp.getSelectedItem().toString());
        ficha.setAltura(Float.parseFloat(jTAltura.getText()));
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         
        try {
            ficha.setDataEntrada(formato.parse(jFdataEntrada.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(GerenciaFicha.class.getName()).log(Level.SEVERE, null, ex);
        }
        ficha.setMedicacao(jTMediacao.getText());
        ficha.setObjetivo(jTObjetivo.getText());
        ficha.setPeso(Float.parseFloat(jTPeso.getText()));
        ficha.setProblemaSaude(jTProbSau.getText());
        ficha.setProfissao(jTProfissao.getText());
        ficha.setSexo(jCSexo.getSelectedItem().toString());
        ficha.setFrequenciacardrep(Float.parseFloat(jTFCR.getText()));
        ficha.setFrequenciacardMax(Float.parseFloat(jTFCM.getText()));
        Session s = NovoHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(ficha);
        s.getTransaction().commit();
       // s.close();
        JOptionPane.showMessageDialog(rootPane, "FICHA ATUALIZADA COM SUCESSO!");
        limparcampos();
    
    }

}