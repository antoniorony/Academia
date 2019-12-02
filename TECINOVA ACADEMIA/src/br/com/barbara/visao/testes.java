/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.visao;

import com.google.gson.Gson;
import java.awt.Event;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;
import static java.util.logging.Logger.global;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import jdk.nashorn.internal.parser.JSONParser;



/**
 *
 * @author anton
 */
public class testes {
 
    

   
    public static void main(String args[]) throws MalformedURLException, IOException{
      
        // cria o conjunto de dados

        
        
        /*          Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        System.out.print(String.valueOf(dia)+"/"+String.valueOf(mes+1)+"/"+String.valueOf(ano));
     /*   HttpURLConnection con = null;
       URL url = new URL("http://antoniorony.000webhostapp.com/listar.php");
       con = (HttpURLConnection) url.openConnection();
       con.setRequestMethod("GET");
       con.connect();

        // String jsonText = "{\"id\":1,\"name\":\"Jeovane\"}";
        String jsonText = url.toString();
  Gson gson = new Gson();
    Listar mg = gson.fromJson(jsonText, Listar.class);
    System.out.println(mg.getId()+mg.getName());

    }
  */
     
    }
}
