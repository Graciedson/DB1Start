package br.com.db1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import antlr.collections.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //int zero = 0;
        Integer zeroObjeto=0;
        zeroObjeto.doubleValue();
        
        
        char vogal = 'a';
        String vogalString = "a";
        vogalString.trim();
        
        double umPontoDois = 1.2;
        Double valor = 1.2;
        
        
        Float valor3 = 3f;
        
        BigDecimal dinheiro = BigDecimal.ZERO;
        		
       for (Integer x=0;x<100;x++) {}
       
       Integer x=0;
       while (x<100) {
    	   x++;
       }
      /* do {
    	   x++;
       		}while x<100;
       
       x%2 ==0 : "eh par" ? "ej impar";
 
       switch (x) {
       case 1:
    	   System.out.println("zero");
       case 2:
    	   System.out.println("dois");
    	   
    	   break;*/
    	   
    	   int[] matriz = {1,2,3,4};
    	   int matriz22 = 1;
    	   Integer[] matrizInteger = {1,2,3,4};
    	   
    	  // Colection
    	   //Mexeu com Lista tem que usar uma classe que já existe ArrayList<Integer>() por exemplo
    	   List valores = (List) new ArrayList<Integer>();
    	   Set<Integer> valoresNaoRepetidos = new HashSet<Integer>();
    	   
    	   
    	   
       }
}
