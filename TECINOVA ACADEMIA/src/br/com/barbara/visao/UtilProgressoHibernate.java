/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;
import Util.NovoHibernateUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.Window;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
/**
 *
 * @author anton
 */
public class UtilProgressoHibernate extends SwingWorker<Void, Integer>{
private Component tela;
    private JLabel labelProgresso;
    private JProgressBar barraProgresso;
    private JTextField usuario;
    private JPasswordField senha;
      public UtilProgressoHibernate(Component tela, JLabel labelProgresso, JProgressBar barraProgresso, JTextField usuario, JPasswordField senha) {
       this.tela = tela;
        this.labelProgresso = labelProgresso;
        this.barraProgresso = barraProgresso;
        this.usuario = usuario;
        this.senha = senha;
    } // Fim do construtor
    
    @Override
    protected Void doInBackground() throws Exception {
        labelProgresso.setText("Carregando Dados...");
        NovoHibernateUtil.getSessionFactory();
        Thread.sleep(1500);
        
        labelProgresso.setText("Dados carregados com sucesso.");
        barraProgresso.setIndeterminate(false);
        usuario.setEnabled(true);
        senha.setEnabled(true);
      // Thread.sleep(1500);
      //  labelProgresso.setText("Abrindo Aplicação...");
      //  Thread.sleep(2000);
     /* tela.setVisible(false);
       Login logi =  new Login();
       logi.setVisible(true);*/
        return null;
    }
   }
