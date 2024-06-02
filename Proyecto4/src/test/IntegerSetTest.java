package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.IntegerSet;

public class IntegerSetTest {
    
    @Test
    public void testUnion() {
        System.out.println("Probando método testUnion()");
        
        IntegerSet conjunto1 = new IntegerSet();
        IntegerSet conjunto2 = new IntegerSet();
        
        conjunto1.insertaElemento(10);
        conjunto1.insertaElemento(20);
        conjunto2.insertaElemento(20);
        conjunto2.insertaElemento(40);
        conjunto2.insertaElemento(50);
        
        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        
        IntegerSet union = conjunto1.union(conjunto2);
        System.out.println("Resultado esperado: 10 20 40 50 o 10 20 50 40");
        System.out.println("Resultado obtenido: " + union.toSetString());
        
        assertTrue(union.toSetString().equals("10 20 40 50") || union.toSetString().equals("10 20 50 40"));
    }
    
    @Test
    public void testInterseccion() {
        System.out.println("Probando método testInterseccion()");
        
        IntegerSet conjunto1 = new IntegerSet();
        IntegerSet conjunto2 = new IntegerSet();
        
        conjunto1.insertaElemento(10);
        conjunto1.insertaElemento(20);
        conjunto2.insertaElemento(20);
        conjunto2.insertaElemento(40);
        conjunto2.insertaElemento(50);
        
        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        
        IntegerSet interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("Resultado esperado: 20");
        System.out.println("Resultado obtenido: " + interseccion.toSetString());
        
        assertEquals("20", interseccion.toSetString());
    }
    
    @Test
    public void testInsertaYEliminaElemento() {
        System.out.println("Probando método testInsertaYEliminaElemento()");
        
        IntegerSet conjunto = new IntegerSet();
        
        conjunto.insertaElemento(10);
        conjunto.insertaElemento(20);
        System.out.println("Conjunto inicial: " + conjunto.toSetString());
        
        assertTrue(conjunto.toSetString().equals("10 20") || conjunto.toSetString().equals("10 20"));
        
        conjunto.eliminaElemento(10);
        System.out.println("Conjunto después de eliminar el elemento 10: " + conjunto.toSetString());
        
        assertFalse(conjunto.toSetString().contains("10"));
    }
    
    @Test
    public void testToString() {
        System.out.println("Probando método testToString()");
        
        IntegerSet conjunto = new IntegerSet();
        
        conjunto.insertaElemento(10);
        conjunto.insertaElemento(20);
        conjunto.insertaElemento(50);
        System.out.println("Conjunto: " + conjunto.toSetString());
        
        assertEquals("10 20 50", conjunto.toSetString());
    }
    
    @Test
    public void testIgualA() {
        System.out.println("Probando método testIgualA()");
        
        IntegerSet conjunto1 = new IntegerSet();
        IntegerSet conjunto2 = new IntegerSet();
        IntegerSet conjunto3 = new IntegerSet();
        
        conjunto1.insertaElemento(10);
        conjunto1.insertaElemento(20);
        conjunto2.insertaElemento(10);
        conjunto2.insertaElemento(20);
        conjunto3.insertaElemento(20);
        conjunto3.insertaElemento(30);
        
        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());
        System.out.println("Conjunto 3: " + conjunto3.toSetString());
        
        System.out.println("Resultado esperado para conjunto 1 y conjunto 2: Iguales");
        System.out.println("Resultado obtenido para conjunto 1 y conjunto 2: " + (conjunto1.igualA(conjunto2) ? "Iguales" : "Diferentes"));
        
        assertTrue(conjunto1.igualA(conjunto2));
        
        System.out.println("Resultado esperado para conjunto 1 y conjunto 3: Diferentes");
        System.out.println("Resultado obtenido para conjunto 1 y conjunto 3: " + (conjunto1.igualA(conjunto3) ? "Iguales" : "Diferentes"));
        
        assertFalse(conjunto1.igualA(conjunto3));
    }
}
