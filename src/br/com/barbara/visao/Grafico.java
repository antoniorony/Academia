/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;

import java.util.Locale;
import javax.swing.JFrame;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author anton
 */
public class Grafico extends JFrame {
    
    public Grafico() {
      super( "Meu Primeiro Grafico" ); //Define o titulo da tela
      //add grafico
     // DefaultPieDataset pieDataset = new DefaultPieDataset();
      
     // pieDataset.setValue("A", new Integer(75));
    //  pieDataset.setValue("B", new Integer(25));
      
   //   JFreeChart grafico = ChartFactory.createPieChart("Primeiro Grafico", pieDataset, true, true, Locale.CANADA);
    //  this.add(new ChartPanel(grafico));
      
      this.pack(); //para ajustar automaticamente o Frame
      //Cria um dataSet para inserir os dados que serão passados para a criação do gráfico tipo Pie

   }
   public static void main(String[] args) {
      new Grafico().setVisible( true );
   }
}
