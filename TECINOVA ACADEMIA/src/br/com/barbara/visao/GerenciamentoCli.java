/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;

import Util.NovoHibernateUtil;
import br.com.barbara.Classes.Clientes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author anton
 */
public class GerenciamentoCli extends javax.swing.JDialog {
private  DefaultTableModel tmResultSet = new DefaultTableModel(null, new String[]{"ID","NOME","APELIDO", "CPF", "TELEFONE","LOGRADOURO","N°","BAIRRO","CIDADE","ESTADO"});;
   java.util.List<Clientes> resultado;  
      private ListSelectionModel lsmResult;
      private DefaultTableModel tabela;
      
      
     private Integer idCliente;
     private String nome;
     private String apelido;
     private String cpf;
     private String telefone;
     private String logradouro;
     private int numero;
     private String bairro;
     private String cidade;
     private String estado;
    /**
     * Creates new form GerenciamentoCli
     */
    public GerenciamentoCli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            
            formataCPF();
            formataTelefone();
        } catch (ParseException ex) {
            Logger.getLogger(GerenciamentoCli.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jFCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTApelido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTlOGR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTNum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCCidade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCUf = new javax.swing.JComboBox<>();
        jBSalva = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);          lsmResult = jTable1.getSelectionModel();          lsmResult.addListSelectionListener(new ListSelectionListener() {               public void valueChanged(ListSelectionEvent e) {                                        if (! e.getValueIsAdjusting()){                           jTTabelaLinhaSelecionada(jTable1);                       }                                    }          });
        jBExcluir = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jFTel = new javax.swing.JFormattedTextField();
        jTPesquisa = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jFdataNsc = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jFdataEntrada = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GERENCIA DE CLIENTES - SCE - TEC.INOVA");

        jPanel1.setBackground(new java.awt.Color(0, 140, 35));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOME:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENDEREÇO:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LOGRADOURO:");

        jFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFCPFActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APELIDO");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NUMERO:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BAIRRO:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CIDADE:");

        jCCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAURITI", "BARRO", "BREJO", "MILAGRES" }));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ESTADO:");

        jCUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEARA" }));

        jBSalva.setText("ADICIONAR");
        jBSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvaActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(tmResultSet);
        jScrollPane1.setViewportView(jTable1);

        jBExcluir.setText("EXCLUIR");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBAlterar.setText("ALTERAR");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tel:");

        jButton5.setText("PESQUISA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATA DE NASCIMENTO:");

        try {
            jFdataNsc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATA DE ENTRADA");

        try {
            jFdataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTlOGR, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(62, 62, 62)
                                                    .addComponent(jBSalva)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton2))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFdataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jFdataNsc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFCPF)
                                            .addComponent(jFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(15, 15, 15))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAlterar)))
                        .addGap(11, 11, 11))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jFdataNsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jFdataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTlOGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jCCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jCUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalva)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBAlterar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(810, 662));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void formataCPF() throws ParseException{
    MaskFormatter mask = new MaskFormatter("###.###.###-##");
    mask.install(jFCPF);
}
private void formataTelefone() throws ParseException{
       MaskFormatter mask2 = new MaskFormatter("(##)#.####-####");
    mask2.install(jFTel);
}
    private void jFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFCPFActionPerformed
    
  
// TODO add your handling code here:
    }//GEN-LAST:event_jFCPFActionPerformed

    private void jBSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvaActionPerformed
    Clientes clientes = new Clientes();
         clientes.setNome(jTNome.getText());
        clientes.setApelido(jTApelido.getText());
        clientes.setBairro(jTBairro.getText());
        clientes.setCidade(jCCidade.getSelectedItem().toString());
        clientes.setCpf(jFCPF.getText());
        clientes.setEstado(jCUf.getSelectedItem().toString());
        clientes.setLogradouro(jTlOGR.getText());
        clientes.setTelefone(jFTel.getText());
        clientes.setNumero(57);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    try {
        clientes.setDataNascimento(formato.parse(jFdataNsc.getText()));
    } catch (ParseException ex) {
        JOptionPane.showMessageDialog(rootPane,"Data Incorreta");
        Logger.getLogger(GerenciamentoCli.class.getName()).log(Level.SEVERE, null, ex);
    }
               Session s = NovoHibernateUtil.getSessionFactory().openSession();
       
        //Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        s.save(clientes);
        s.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "CADASTRADO COM SUCESSO!");
        cadastraMensalidade();
        limpaCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalvaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if(jTPesquisa.equals("")){
  mostraPesquisa();
  
}else{ 
    mostraPesquisaFiltro(jTPesquisa.getText());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
//codigo para atualizar
         Clientes clientes = new Clientes();
         clientes.setNome(jTNome.getText());
        clientes.setApelido(jTApelido.getText());
        clientes.setBairro(jTBairro.getText());
        clientes.setCidade(jCCidade.getSelectedItem().toString());
        clientes.setCpf(jFCPF.getText());
        clientes.setEstado(jCUf.getSelectedItem().toString());
        clientes.setLogradouro(jTlOGR.getText());
        clientes.setTelefone(jFTel.getText());
        clientes.setNumero(57);
        clientes.setIdCliente(idCliente);
                
       Session s = NovoHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(clientes);
        s.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "ALTERADO COM SUCESSO!");
        limpaCampos();


        // TODO add your handling code here:
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed

 Clientes clientes = new Clientes();
         clientes.setNome(jTNome.getText());
        clientes.setApelido(jTApelido.getText());
        clientes.setBairro(jTBairro.getText());
        clientes.setCidade(jCCidade.getSelectedItem().toString());
        clientes.setCpf(jFCPF.getText());
        clientes.setEstado(jCUf.getSelectedItem().toString());
        clientes.setLogradouro(jTlOGR.getText());
        clientes.setTelefone(jFTel.getText());
        clientes.setNumero(57);
        clientes.setIdCliente(idCliente);
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente EXCLUIR:"+clientes.getNome());
         if(confirm == 0){   
        Session s = NovoHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(clientes);
        s.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "EXCLUIDO COM SUCESSO!");
         }else{
             System.out.print("ok");
         }

        // TODO add your handling code here:
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
limpaCampos();
jBSalva.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciamentoCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciamentoCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerenciamentoCli dialog = new GerenciamentoCli(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSalva;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCCidade;
    private javax.swing.JComboBox<String> jCUf;
    private javax.swing.JFormattedTextField jFCPF;
    private javax.swing.JFormattedTextField jFTel;
    private javax.swing.JFormattedTextField jFdataEntrada;
    private javax.swing.JFormattedTextField jFdataNsc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTApelido;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNum;
    private javax.swing.JTextField jTPesquisa;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTlOGR;
    // End of variables declaration//GEN-END:variables
//codigo da pesquisa com hibernate
private void mostraPesquisa() {
         tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
        Session sesion = NovoHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Criteria crit = sesion.createCriteria(Clientes.class);
        //crit.add(Restrictions.like("descricao",text+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        Clientes Sal = (Clientes) iterator.next(); 
        tmResultSet.addRow(new Object[]{
            //`enter code here`columns
            Sal.getIdCliente(),
            Sal.getNome(),
            Sal.getApelido(),
            Sal.getCpf(),
            Sal.getTelefone(),
            Sal.getLogradouro(),
            Sal.getNumero(),
            Sal.getBairro(),
            Sal.getCidade(),
            Sal.getEstado()
            
        });
        }
       
        
 
      }
//código para linha selecionada, restante do codigo está na tabela
      private void jTTabelaLinhaSelecionada(JTable tabela) {
           if (jTable1.getSelectedRow()!= -1) {     
          String cod = (jTable1.getValueAt(jTable1.getSelectedRow(),0)).toString();
                   this.idCliente = Integer.parseInt(cod);
                   this.nome = (jTable1.getValueAt(jTable1.getSelectedRow(),1)).toString();
          this.apelido = (jTable1.getValueAt(jTable1.getSelectedRow(),2)).toString();
          this.cpf = (jTable1.getValueAt(jTable1.getSelectedRow(),3)).toString();
          this.telefone = (jTable1.getValueAt(jTable1.getSelectedRow(),4)).toString();
          this.logradouro = (jTable1.getValueAt(jTable1.getSelectedRow(),5)).toString();
          String num = (jTable1.getValueAt(jTable1.getSelectedRow(),6)).toString();
          this.numero = Integer.parseInt(num);
          this.bairro = (jTable1.getValueAt(jTable1.getSelectedRow(),7)).toString();
          this.cidade = (jTable1.getValueAt(jTable1.getSelectedRow(),8)).toString();
          this.estado = (jTable1.getValueAt(jTable1.getSelectedRow(),9)).toString();      
          
                   jogaValor();
                   desabilitaBotaoSalvar();
           }
      /*  if (jTable1.getSelectedRow()!= -1) {
           
          this.id = resultado.get(tabela.getSelectedRow()).getIdProduto();
          this.descricao = resultado.get(tabela.getSelectedRow()).getDescricao();
          this.unCompra = resultado.get(tabela.getSelectedRow()).getUnidadeCompra();
          this.unVenda = resultado.get(tabela.getSelectedRow()).getUnidadeVenda();
          this.fornecedor = resultado.get(tabela.getSelectedRow()).getIdFornecedor();
          this.marca = resultado.get(tabela.getSelectedRow()).getIdMarca();
          
          
          System.out.println("Conheça nossos produtos: "+this.descricao);
          
          
        }*/
        
        
     }  
//pega o valor das variaveis do inicio e joga na tela
    private void jogaValor() {
        jTNome.setText(this.nome);
        jTApelido.setText(this.apelido);
        jFCPF.setText(this.cpf);
        jFTel.setText(this.telefone);
        jTBairro.setText(this.bairro);
        jTNum.setText(String.valueOf(this.numero));
        jTlOGR.setText(this.logradouro);
        jCCidade.setSelectedItem(this.cidade);
        jCUf.setSelectedItem(this.estado);
        
    
    }
    //limpa os campos
    private void limpaCampos(){
         jTNome.setText("");
        jTApelido.setText("");
        jFCPF.setText("");
        jFTel.setText("");
        jTBairro.setText("");
        jTNum.setText(String.valueOf(""));
        jTlOGR.setText("");
        jCCidade.setSelectedItem("");
        jCUf.setSelectedItem("");
        tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
    }
    //desabilita botao de salvar
    public void desabilitaBotaoSalvar(){
        jBSalva.setEnabled(false);
    }
    //habilita botoes alterar e excluir
      public void habilitaBotaoSexAl(){
        jBSalva.setEnabled(false);
    }

    private void mostraPesquisaFiltro(String text) {
 tabela = (DefaultTableModel)jTable1.getModel();
        tabela.setNumRows(0);
        Session sesion = NovoHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Criteria crit = sesion.createCriteria(Clientes.class);
        crit.add(Restrictions.like("nome",text+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        Clientes Sal = (Clientes) iterator.next(); 
        tmResultSet.addRow(new Object[]{
            //`enter code here`columns
            Sal.getIdCliente(),
            Sal.getNome(),
            Sal.getApelido(),
            Sal.getCpf(),
            Sal.getTelefone(),
            Sal.getLogradouro(),
            Sal.getNumero(),
            Sal.getBairro(),
            Sal.getCidade(),
            Sal.getEstado()
            
        });
        }    }
public void cadastraMensalidade(){
    int id_cliente = 0;
    Session sesion = NovoHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Criteria crit = sesion.createCriteria(Clientes.class);
        crit.add(Restrictions.like("nome",jTNome.getText()+"%"));
        java.util.List results = crit.list();
        for (Iterator iterator = results.iterator(); iterator.hasNext();){
        Clientes Sal2 = (Clientes) iterator.next(); 

            //`enter code here`columns
           id_cliente = Sal2.getIdCliente();
        
        }
 br.com.barbara.Classes.Mensalidade mensalidade = new br.com.barbara.Classes.Mensalidade();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    try {
        mensalidade.setDataEntrada(formato.parse(jFdataEntrada.getText()));
    } catch (ParseException ex) {
        JOptionPane.showMessageDialog(rootPane,"Data Incorreta");
        Logger.getLogger(GerenciamentoCli.class.getName()).log(Level.SEVERE, null, ex);
    }
               Session s = NovoHibernateUtil.getSessionFactory().openSession();
        Calendar cal = Calendar.getInstance();
    //    int dia = cal.get(Calendar.DAY_OF_MONTH);
     //   int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        mensalidade.setValor(50);
        mensalidade.setAno(String.valueOf(ano));
        mensalidade.setIdCliente(id_cliente);
        mensalidade.setM1(0);
        mensalidade.setM2(0);
        mensalidade.setM3(0);
        mensalidade.setM4(0);
        mensalidade.setM5(0);
        mensalidade.setM6(0);
        mensalidade.setM7(0);
        mensalidade.setM8(0);
        mensalidade.setM9(0);
        mensalidade.setM10(0);
        mensalidade.setM11(0);
        mensalidade.setM12(0);
        
 //aqui esta o codigo para pegar o id do cliente.;      
        
        
        s.beginTransaction();
        s.save(mensalidade);
        s.getTransaction().commit();
        JOptionPane.showMessageDialog(rootPane, "CADASTRADO COM SUCESSO!");
        limpaCampos();

        }



}
