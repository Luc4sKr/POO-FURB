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

    public Imovel(Bairro bairro, Finalidade finalidade, String endereco, int area) {
        this.setBairro(bairro);
        this.setFinalidade(finalidade);
        this.setEndereco(endereco);
        this.setArea(area);
    }
    
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

    public final void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public final void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public final void setArea(int area) {
        if (area < 0) {
            throw new IllegalArgumentException();
        }
        this.area = area;
    }
}
