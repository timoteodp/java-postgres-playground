package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Cliente;

public class ClienteTest {
    @Test
    void testgetIdade(){
        var cliente = new Cliente();
        cliente.setAnoNascimento(1960);
        assertEquals(43, cliente.idade);

    }

    
}
