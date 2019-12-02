/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;
import br.com.barbara.controles.Conexao;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ANTONIO RONY
 */
public class pegrec2 {
    public void saidas() throws JRException{
        
          Conexao co = new Conexao();
      
        try {
            co.execultar("select * from mensalidade");
            JRResultSetDataSource relatorioQuartos = new JRResultSetDataSource(co.rs);
            JasperPrint jpPrint = JasperFillManager.fillReport("src/recibo/Mensalidade.jasper", new HashMap(), relatorioQuartos);
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
// TODO add your handling code here:
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro 1");
        }
    }
        
}
