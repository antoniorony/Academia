package br.com.barbara.Classes;
// Generated 06/02/2019 16:30:09 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Ficha generated by hbm2java
 */
public class Ficha  implements java.io.Serializable {


     private Integer idficha;
     private Date dataEntrada;
     private String sexo;
     private float peso;
     private String medicacao;
     private String acompanhamento;
     private String problemaSaude;
     private float altura;
     private String objetivo;
     private String profissao;
     private int idCliente;
     private float frequenciacardrep;
     private float frequenciacardMax;
     private float calculoFcm;

    public Ficha() {
    }

    public Ficha(Date dataEntrada, String sexo, float peso, String medicacao, String acompanhamento, String problemaSaude, float altura, String objetivo, String profissao, int idCliente, float frequenciacardrep, float frequenciacardMax, float calculoFcm) {
       this.dataEntrada = dataEntrada;
       this.sexo = sexo;
       this.peso = peso;
       this.medicacao = medicacao;
       this.acompanhamento = acompanhamento;
       this.problemaSaude = problemaSaude;
       this.altura = altura;
       this.objetivo = objetivo;
       this.profissao = profissao;
       this.idCliente = idCliente;
       this.frequenciacardrep = frequenciacardrep;
       this.frequenciacardMax = frequenciacardMax;
       this.calculoFcm = calculoFcm;
    }
   
    public Integer getIdficha() {
        return this.idficha;
    }
    
    public void setIdficha(Integer idficha) {
        this.idficha = idficha;
    }
    public Date getDataEntrada() {
        return this.dataEntrada;
    }
    
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getMedicacao() {
        return this.medicacao;
    }
    
    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }
    public String getAcompanhamento() {
        return this.acompanhamento;
    }
    
    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
    public String getProblemaSaude() {
        return this.problemaSaude;
    }
    
    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }
    public float getAltura() {
        return this.altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getObjetivo() {
        return this.objetivo;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public float getFrequenciacardrep() {
        return this.frequenciacardrep;
    }
    
    public void setFrequenciacardrep(float frequenciacardrep) {
        this.frequenciacardrep = frequenciacardrep;
    }
    public float getFrequenciacardMax() {
        return this.frequenciacardMax;
    }
    
    public void setFrequenciacardMax(float frequenciacardMax) {
        this.frequenciacardMax = frequenciacardMax;
    }
    public float getCalculoFcm() {
        return this.calculoFcm;
    }
    
    public void setCalculoFcm(float calculoFcm) {
        this.calculoFcm = calculoFcm;
    }




}

