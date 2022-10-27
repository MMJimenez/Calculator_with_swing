
package com.mycompany.calculatorswing.model;

public class CalculadoraSwing {

    private static String value1 = "";
    private static String value2 = "";
    private static String solution = "";
    private static String operation = "";

    public static String getValue1() {
        return value1;
    }

    public static String getValue2() {
        return value2;
    }
    
    public static String getSolution() {
        return solution;
    }
    
    public static String getOperation() {
        return operation;
    }

    public static void setValue1(String value1) {
        CalculadoraSwing.value1 = value1;
    }

    public static void setValue2(String value2) {
        CalculadoraSwing.value2 = value2;
    }
    
    public static void setSolution(String solution) {
        CalculadoraSwing.solution = solution;
    }
    
    public static void setOperation(String operation) {
        CalculadoraSwing.operation = operation;
    }
    
    

    public static float stringToFloat(String s){
        return Float.parseFloat(s);
    }
    
    public static String floatToString(float f){
        return Float.toString(f);
    }
        
    
    public static void sum(){
        try{
            Float f1 = stringToFloat(value1);
            Float f2 = stringToFloat(value2);

            Float fsolution = f1 + f2;
            solved(fsolution); 
            
        }catch(Exception e){
            error(); 
        }       
    }
    
    public static void sustrat(){
        try{
            Float f1 = stringToFloat(value1);
            Float f2 = stringToFloat(value2);

            Float fsolution = f1 - f2;
            solved(fsolution); 
            
        }catch(Exception e){
            error(); 
        }
    }
    
    public static void multiply(){
        try{
            Float f1 = stringToFloat(value1);
            Float f2 = stringToFloat(value2);

            Float fsolution = f1 * f2;
            solved(fsolution); 
            
        }catch(Exception e){
            error(); 
        }
    }
    
    public static void division(){
        try{
            Float f1 = stringToFloat(value1);
            Float f2 = stringToFloat(value2);

            if(f2==0){
                error(); 
            }else{
                Float fsolution = f1 / f2; 
                solved(fsolution); 
            }
        }catch(Exception e){
            error(); 
        }               
    }
    
    public static void squareRoot(){
        try{
            Float f1 = stringToFloat(value1); 
            
            if(f1<0){
                error(); 
            }else{
                Float fsolution = (float) Math.sqrt(f1); 
                solved(fsolution); 
            }
        }catch(Exception e){
            error(); 
        }
    }
    
    public static void squared(){
        try{
            Float f1 = stringToFloat(value1);
        
            Float fsolution = f1*f1;
            solved(fsolution); 
            
        }catch(Exception e){
            error(); 
        }        
    }
    
    public static void cube(){
        try{
            Float f1 = stringToFloat(value1);

            float fsolution = f1*f1*f1;
            solved(fsolution);  
            
        }catch(Exception e){
            error();  
        }                 
    }
    
    public static String percent(String value){
        Float f1 = stringToFloat(value1);
        
        value = value.substring(0,value.length()-1);
        Float f2 = f1 * ((stringToFloat(value))/100);
        
        return floatToString(f2);
    }
    
    
    public static String imputText(String text, char c){
        
        if(text.charAt(text.length()-1) == '%')     text=text.substring(0,text.length()-1)+c+'%';
        else                                        text+=c;
        
        return text;
    }
    
    public static String delete(String text){
        return text.substring(0, text.length()-1);
    }
    
    public static void clear(){
        value1 = "";
        value2 = "";
        solution = "";
        operation = "";
    } 
    
    public static String clearZero(String value){    
        if(value.charAt(0) == '0' && value.charAt(1)!= '.'){
            return value.substring(1);
        }                                         
        else if(value.charAt(0) == '-' && value.charAt(1) == '0' && value.charAt(2)!= '.'){
            return ("-"+value.substring(2));
        }else{
            return value;
        }         
    }
    
    public static boolean canWrite(){
        if(solution == "Syntax Error")  return false;
        if(solution == "Infinity")      return false;
        else                            return true;
    }
    
    public static void error(){
        value1 = "";
        value2 = "";
        solution = "Syntax Error";
        operation = ""; 
    }
    
    public static void solved(float fsolution){
        value1 = "";
        value2 = "";
        solution = floatToString(fsolution);
        operation = "";
    }
}
