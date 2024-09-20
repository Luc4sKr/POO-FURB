package com.aulas.models;

import com.aulas.models.enums.Finalidade;
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
public class ImovelTest {
    
    public ImovelTest() {
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
    public void testAreaNegativa() {
        
    }
    
    @Test
    public void testImpostoImovelResidencial() {
        Imovel i = new Imovel(
            new Bairro("Bairro", 1),
            Finalidade.RESIDENCIAL,
            "Rua ....",
            400);
        
        assertEquals(i.calcularIptu(), 400);
    }
    
    @Test
    public void testImpostoImovelComercial_V1() {
        Imovel i = new Imovel(
            new Bairro("Bairro", 1),
            Finalidade.COMERCIAL,
            "Rua ....",
            80);
        
        assertEquals(i.calcularIptu(), 500);
    }
    
    @Test
    public void testImpostoImovelComercial_V2() {
        Imovel i = new Imovel(
            new Bairro("Bairro", 1),
            Finalidade.COMERCIAL,
            "Rua ....",
            250);
        
        assertEquals(i.calcularIptu(), 1000);
    }
    
    @Test
    public void testImpostoImovelComercial_V3() {
        Imovel i = new Imovel(
            new Bairro("Bairro", 1),
            Finalidade.COMERCIAL,
            "Rua ....",
            500);
        
        assertEquals(i.calcularIptu(), 1275);
    }
    
    @Test
    public void testImpostoImovelIndustrial_V1() {
        Imovel i = new Imovel(
            new Bairro("Bairro", 1),
            Finalidade.INDUSTRIAL,
            "Rua ....",
            2000);
        
        assertEquals(i.calcularIptu(), 1000);
    }
}
