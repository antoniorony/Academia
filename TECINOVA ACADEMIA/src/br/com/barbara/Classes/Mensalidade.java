package br.com.barbara.Classes;
// Generated 06/02/2019 16:30:09 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Mensalidade generated by hbm2java
 */
public class Mensalidade  implements java.io.Serializable {


     private Integer idmensalidade;
     private Date dataEntrada;
     private int idCliente;
     private float valor;
     private String ano;
     private int m1;
     private int m2;
     private int m3;
     private int m4;
     private int m5;
     private int m6;
     private int m7;
     private int m8;
     private int m9;
     private int m10;
     private int m11;
     private int m12;

    public Mensalidade() {
    }

    public Mensalidade(Date dataEntrada, int idCliente, float valor, String ano, int m1, int m2, int m3, int m4, int m5, int m6, int m7, int m8, int m9, int m10, int m11, int m12) {
       this.dataEntrada = dataEntrada;
       this.idCliente = idCliente;
       this.valor = valor;
       this.ano = ano;
       this.m1 = m1;
       this.m2 = m2;
       this.m3 = m3;
       this.m4 = m4;
       this.m5 = m5;
       this.m6 = m6;
       this.m7 = m7;
       this.m8 = m8;
       this.m9 = m9;
       this.m10 = m10;
       this.m11 = m11;
       this.m12 = m12;
    }
   
    public Integer getIdmensalidade() {
        return this.idmensalidade;
    }
    
    public void setIdmensalidade(Integer idmensalidade) {
        this.idmensalidade = idmensalidade;
    }
    public Date getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getAno() {
        return this.ano;
    }
    
    public void setAno(String ano) {
        this.ano = ano;
    }
    public int getM1() {
        return this.m1;
    }
    
    public void setM1(int m1) {
        this.m1 = m1;
    }
    public int getM2() {
        return this.m2;
    }
    
    public void setM2(int m2) {
        this.m2 = m2;
    }
    public int getM3() {
        return this.m3;
    }
    
    public void setM3(int m3) {
        this.m3 = m3;
    }
    public int getM4() {
        return this.m4;
    }
    
    public void setM4(int m4) {
        this.m4 = m4;
    }
    public int getM5() {
        return this.m5;
    }
    
    public void setM5(int m5) {
        this.m5 = m5;
    }
    public int getM6() {
        return this.m6;
    }
    
    public void setM6(int m6) {
        this.m6 = m6;
    }
    public int getM7() {
        return this.m7;
    }
    
    public void setM7(int m7) {
        this.m7 = m7;
    }
    public int getM8() {
        return this.m8;
    }
    
    public void setM8(int m8) {
        this.m8 = m8;
    }
    public int getM9() {
        return this.m9;
    }
    
    public void setM9(int m9) {
        this.m9 = m9;
    }
    public int getM10() {
        return this.m10;
    }
    
    public void setM10(int m10) {
        this.m10 = m10;
    }
    public int getM11() {
        return this.m11;
    }
    
    public void setM11(int m11) {
        this.m11 = m11;
    }
    public int getM12() {
        return this.m12;
    }
    
    public void setM12(int m12) {
        this.m12 = m12;
    }




}


