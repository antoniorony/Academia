/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.barbara.controles;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author anton
 */
public class TESTE2 {
    public static void main(String[] args) throws Exception {
    try {
        URL url = new URL("http://projetos.tecinova.tech/phpmailer/envia.php");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setDoOutput(true);
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("nome", "admin");
        jsonObj.put("email", "antoniorony@hotmail.com");
        jsonObj.put("mensagem", "bdmin");

        DataOutputStream os = new DataOutputStream(con.getOutputStream());
        os.writeBytes(jsonObj.toString());
        os.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
        int responseCode = con.getResponseCode();
        String output;
        StringBuffer sb = new StringBuffer();
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            sb.append(output);
            break;
        } 

        System.out.println("Response Code: "+responseCode);
        System.out.println("URL: "+url);
        System.out.println("Parameters: "+jsonObj.toString());
        System.out.println("Output: "+output.toString());

        con.disconnect();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
