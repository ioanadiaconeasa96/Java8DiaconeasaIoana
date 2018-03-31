/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author diaconeasaioana
 */
public class Calculator {
    
    public int operator;
    public int operators [];
    public int result;
    
    Calculator(int operator, int operators[]){
    
        this.operator = operator;
        for (int i : operators){
        
            this.operators[i] = i;
        }
        
    }

    Calculator() {
    }
    
    int get_result(){
        return this.result;
    }
    
    void set_result(int result){
    
        this.result = result;
    }
    
    
    int add(ArrayList<Integer> operators){
    
        int i ;
        int sum=0;
        for (i=0;i<operators.size();i++){
           
            if((i+1) < operators.size()){
              

                   sum =  operators.get(i) + operators.get(i+1);

               
             
            }
        } 
        
     return sum;
    }
    int substract(ArrayList<Integer> operators){
    
        int i ,j;
        int dif=0;
        for (i=0;i<operators.size();i++){
         
            if((i+1) < operators.size()){
                if( operators.get(i) > operators.get(i+1)){

                   dif =  operators.get(i) - operators.get(i+1);

                }
                else 

                {dif =  - operators.get(i+1) +  operators.get(i);}
               
            }
        }   
     return dif;
    }
    int multiply(ArrayList<Integer> operators){
    
        int i ;
        int mul=0;
        for (i=0;i<operators.size();i++){
           
            if((i+1) < operators.size()){
                if( operators.get(i) > operators.get(i+1)){

                   mul =  operators.get(i) * operators.get(i+1);

                }
                else 

                {
                    mul =  operators.get(i+1) *  operators.get(i);
                }
            
            }
        }   
     return mul;
    }
    
    double divide(ArrayList<Integer> operators){
    
        int i ;
        double div=1.0f;
        for (i=0;i<operators.size();i++){
           
            if((i+1) < operators.size()){
              
                   div =  (double) operators.get(i)/(double) operators.get(i+1);

              
            }
        }   
     return div;
    }
}
