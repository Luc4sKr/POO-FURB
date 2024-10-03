package com.aula.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kroix
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of getNome method, of class Cliente.
     */
    @org.junit.jupiter.api.Test
    public void testGetNome() {
        System.out.println("getNome");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Cliente.
     */
    @org.junit.jupiter.api.Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cliente instance = new Cliente();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Cliente.
     */
    @org.junit.jupiter.api.Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Cliente.
     */
    @org.junit.jupiter.api.Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Cliente instance = new Cliente();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
