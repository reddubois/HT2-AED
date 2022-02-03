package com.uvg.main;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
    
    IPosfixCalc calc = new Calculadora();
    IStack<String> stackCalc = new StackNodes<String>(); 
    
    	//Definimos las variables a utilizar.
    String dentro = "\n";
    int n1;
    int n2 ;
    int resultado = 0;
    boolean bandera = true;
    
		// Vamos a recuperar el documento con la expresión posfix para leerlo.
    File expresion = new File("datos.txt");
    BufferedReader entrada;
    try {
           entrada = new BufferedReader(new FileReader(expresion));
           while(entrada.ready()){
        	   dentro += entrada.readLine() + "\n";
            }
    }catch (IOException e) {
            e.printStackTrace();
	}
                
    	// Se separa la expresión en cada espacio.        
    String exp[]=dentro.trim().split(" ");
    
    for(int i=0;i<exp.length;i++){
        
        try{
            Integer.parseInt(exp[i]);
            bandera = true;
        }catch(NumberFormatException excepcion){
            bandera = false;
        }
        
        	//Chequeamos los símbolos que van apareciendo.
        if (bandera == true){
        	stackCalc.push(exp[i]);
        	
        }else{
            if("+".equals(exp[i])){
            		//Obtenemos los números a sumar, y los sumamos.
                n1 = Integer.parseInt(stackCalc.pull());
                n2 = Integer.parseInt(stackCalc.pull());
                resultado = n1 + n2;
                	//Se agrega el resultado a nuestro stack.
                stackCalc.push(String.valueOf(resultado));
                
            }else if("-".equals(exp[i])){
        			//Obtenemos los números a restar, y los restamos.
                n1 = Integer.parseInt(stackCalc.pull());
                n2 = Integer.parseInt(stackCalc.pull());
                resultado = n1-n2;
            		//Se agrega el resultado a nuestro stack.
                stackCalc.push(String.valueOf(resultado));
                
            }else if ("*".equals(exp[i])){
        			//Obtenemos los números a multiplicar, y los multiplicamos.
                n1 = Integer.parseInt(stackCalc.pull());
                n2 = Integer.parseInt(stackCalc.pull());
                resultado = n1*n2;
            		//Se agrega el resultado a nuestro stack.
                stackCalc.push(String.valueOf(resultado));
                
            }else if ("/".equals(exp[i])){
               
        			//Obtenemos los números a dividir, y los dividimos.
                n1 = Integer.parseInt(stackCalc.pull());
                n2 = Integer.parseInt(stackCalc.pull());
                resultado = n1/n2;
            		//Se agrega el resultado a nuestro stack.
                stackCalc.push(String.valueOf(resultado));
            
            }else{
                System.out.println("Ocurrió un error, lo sentimos... ¿No intentó dividir entre 0 "
                		+ "o incluir operaciones de números no enteros, verdad?");
            }
        }
          
    
    
    }
    System.out.println("Para la operación dada:" + dentro + "Se obtiene un resultado de: " + resultado);
    }   
}