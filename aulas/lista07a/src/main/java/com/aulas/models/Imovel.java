package com.aulas.models;

import com.aulas.models.enums.Finalidade;

/**
 *
 * @author lkreuch
 */
public class Imovel {
    private Bairro bairro;
    private Finalidade finalidade;
    private String endereco;
    private int area;

    public double calcularIptu() {
        double valorIptu = 0;
        
        if (finalidade == Finalidade.RESIDENCIAL) {
            valorIptu = area;
        }
        
        if (finalidade == Finalidade.COMERCIAL) {
            if (area <= 100) {
                valorIptu = 500;
            } else if (area <= 400) {
                valorIptu = 1000;
            } else {
                valorIptu = area * 2.55;
            }
        }
        
        if (finalidade == Finalidade.INDUSTRIAL) {
            if (area <= 2000) {
                valorIptu = 1000.0f;
            }
            
            valorIptu = area * 0.55;
        }
        
        return valorIptu * bairro.getCoeficienteIptu();
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
