package com.prova.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lkreuch
 */
public class IngressoCinemaTest {
    
    public IngressoCinemaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testPrecoIngressoQuarta() {
        IngressoCinema ingressoQuarta = new IngressoCinema(DiaSemana.QUARTA, false);
        assertEquals(7.50f, ingressoQuarta.precoIngresso());
    }
    
    @Test
    public void testPrecoIngressoQuartaEstudante() {
        IngressoCinema ingressoQuartaEstudante = new IngressoCinema(DiaSemana.QUARTA, true);
        assertEquals(7.50f, ingressoQuartaEstudante.precoIngresso());
    }
    
    @Test
    public void testPrecoIngressoSegundaEstudante() {
        IngressoCinema ingressoSegundaEstudante = new IngressoCinema(DiaSemana.SEGUNDA, true);
        assertEquals(10.50f, ingressoSegundaEstudante.precoIngresso());
    }
    
    @Test
    public void testPrecoIngressoSabadoEstudante() {
        IngressoCinema ingressoSabadoEstudante = new IngressoCinema(DiaSemana.SABADO, true);
        assertEquals(14.70f, ingressoSabadoEstudante.precoIngresso());
    }
    
    @Test
    public void testPrecoIngressoSabado() {
        IngressoCinema ingressoSabado = new IngressoCinema(DiaSemana.SABADO, false);
        assertEquals(21.00f, ingressoSabado.precoIngresso());
    }
}
