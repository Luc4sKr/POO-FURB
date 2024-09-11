package com.prova.models;

import java.util.ArrayList;

/**
 *
 * @author lkreuch
 */
public class IngressoCinema {
    private DiaSemana diaSemana;
    private boolean estudante;
    
    /**
     * Instancia a classe com os valores do dia da semana e se o ingresso 
     * for de estudante
     * @param diaSemana Dia da Semana
     * @param estudante Ingresso para estudante
     */
    public IngressoCinema(DiaSemana diaSemana, boolean estudante) {
        if (diaSemana == null) {
            throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
        }
        
        this.diaSemana = diaSemana;
        this.estudante = estudante;
    }
    
    /**
     * Calcula o preço do ingresso com base no dia da semana e se é estudante
     * @return retorna o preço do ingresso
     */
    public float precoIngresso() {
        float valor = 15.0f;
        
        ArrayList<DiaSemana> diasPromocionais = new ArrayList<DiaSemana>() {
            {
                add(DiaSemana.TERCA);
                add(DiaSemana.QUARTA);
                add(DiaSemana.QUINTA);
            }
        };
        
        ArrayList<DiaSemana> diasPromocionaisEstudante = new ArrayList<DiaSemana>() {
            {
                add(DiaSemana.SEGUNDA);
                add(DiaSemana.SEXTA);
                add(DiaSemana.SABADO);
                add(DiaSemana.DOMINGO);
            }
        };
        
        ArrayList<DiaSemana> finalDeSemana = new ArrayList<DiaSemana>() {
            {
                add(DiaSemana.SABADO);
                add(DiaSemana.DOMINGO);
            }
        };
        
        if (diasPromocionais.contains(diaSemana)) {
            valor = (float) (valor * 0.5);
        }

        if (finalDeSemana.contains(diaSemana)) {
            valor = valor + (float) (valor * 0.4);
        }
        
        if (diasPromocionaisEstudante.contains(diaSemana) && estudante) {
            valor = (float) (valor * 0.7);
        }
        
        return valor;
    }

    /**
     * Getter dia da semana
     * @return
     */
    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    /**
     * Setter dia da semana
     * @param diaSemana
     */
    public void setDiaSemana(DiaSemana diaSemana) {
        if (diaSemana == null) {
            throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
        }
        
        this.diaSemana = diaSemana;
    }

    /**
     * 
     * @return retorna se é um estudante
     */
    public boolean isEstudante() {
        return estudante;
    }

    /**
     * Setter estudante
     * @param estudante
     */
    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
}
