/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tema1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/**
 *
 * @author diaconeasaioana
 */
public class Tema1 {

    /**
     * @param args the command line arguments
     */
    static String command;
    //static float result=0.0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char operator ;
        int i,j;
        double result=0;
        List operators = new ArrayList<Integer>(); 
        List operations = new ArrayList<Character>(); 
        char operation;
        Calculator calc = new Calculator();
        // TODO code application logic here
        System.out.println("Give command:");
        Boolean var = true;
        
        while(var){
        
            int op1 = scan.nextInt();
            result = 0;
            String op;
            
            op = scan.next();
            int op2 = scan.nextInt();
            
            operators.add(op1);
            operators.add(op2);
          
            
             if(op.equals("+")){
                    result +=  calc.add((ArrayList) operators);
               }
               else if(op.equals("-")){
                    result +=  calc.substract((ArrayList) operators);
                    
               }
               else if(op.equals("*")){
                    result += calc.multiply((ArrayList) operators);
               }
               else if(op.equals("/")){
                    result += calc.divide((ArrayList) operators);
            }
               else {
                   return;
               }
               System.out.println("Rezultatul este " +  result);  
        }
           
        
        }

    
}
