package com.uvg.main;

public class Calculadora implements ICalculadora {
	
    int resultado;
    
    public int sumar(int operando1, int operando2){
        resultado = operando1 + operando2;  
        return resultado;
    }
    
    public int restar(int operando1, int operando2){
        resultado = operando1 - operando2;  
        return resultado;
    }
    
    public int multiplicar(int operando1, int operando2){
        resultado = operando1 * operando2;  
        return resultado;
    }
    
    public int dividir(int operando1, int operando2){
        resultado = operando1 / operando2;  
        return resultado;
    }
    
}
