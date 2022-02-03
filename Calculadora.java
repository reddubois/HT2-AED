package com.uvg.main;

public class Calculadora implements ICalculadora {
	
    int resultado;
    
    public int sumar(int n1, int n2){
        resultado = n1 + n2;  
        return resultado;
    }
    
    public int restar(int n1, int n2){
        resultado = n1 - n2;  
        return resultado;
    }
    
    public int multiplicar(int n1, int n2){
        resultado = n1 * n2;  
        return resultado;
    }
    
    public int dividir(int n1, int n2){
        resultado = n1 / n2;  
        return resultado;
    }
    
}
