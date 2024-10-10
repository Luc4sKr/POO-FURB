package com.aula.questao1;

import com.aula.questao1.models.Circulo;
import com.aula.questao1.models.Figura;
import com.aula.questao1.models.Quadrado;
import com.aula.questao1.models.Retangulo;
import com.aula.questao1.models.Triangulo;

/**
 *
 * @author kroix
 */
public class App {

    public static void main(String[] args) {
        Figura retangulo = new Retangulo(4, 5);
        Figura quadrado = new Quadrado(4);
        Figura triangulo = new Triangulo(3, 4, 5);
        Figura circulo = new Circulo(3);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
    }
}
