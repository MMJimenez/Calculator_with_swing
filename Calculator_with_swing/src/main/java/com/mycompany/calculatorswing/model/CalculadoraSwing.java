
package com.mycompany.calculatorswing.model;

public class CalculadoraSwing {

    private static String x1;
    private static String x2;
    private static String solution;

    public static String getX1() {
        return x1;
    }

    public static String getX2() {
        return x2;
    }
    
    public static String getSolution() {
        return solution;
    }

    public static void setX1(String x1) {
        CalculadoraSwing.x1 = x1;
    }

    public static void setX2(String x2) {
        CalculadoraSwing.x2 = x2;
    }
    
    public static void setSolution(String solution) {
        CalculadoraSwing.solution = solution;
    }
    
    

    public static float stringToFloat(String s){
        return Float.parseFloat(s);
    }
    
    public static String floatToString(float f){
        return Float.toString(f);
    }
        
    
    public static void sum(){
        float f1 = stringToFloat(x1);
        float f2 = stringToFloat(x2);
        
        float fsolution = f1 + f2;
        
        x1 = "";
        x2 = "";
        solution = floatToString(fsolution);
    }
    
    public static void sustrat(){
        float f1 = stringToFloat(x1);
        float f2 = stringToFloat(x2);
        
        float fsolution = f1 - f2;
        
        x1 = "";
        x2 = "";
        solution = floatToString(fsolution);
    }
    
    public static void multiply(){
        float f1 = stringToFloat(x1);
        float f2 = stringToFloat(x2);
        
        float fsolution = f1 * f2;
        
        x1 = "";
        x2 = "";
        solution = floatToString(fsolution);
    }
    
    public static void division(){
        float f1 = stringToFloat(x1);
        float f2 = stringToFloat(x2);
        
        if(f2==0){
            x1 = "";
            x2 = "";
            solution = "Syntax Error";
        }else{
            float fsolution = f1 / f2; 
            
            x1 = "";
            x2 = "";
            solution = floatToString(fsolution);
        }       
    }
    
    public static void squareRoot(String a){
        float f1 = stringToFloat(x1);
        
        if(f1<0){
            x1 = "";
            x2 = "";
            solution = "Syntax Error";
        }else{
            float fsolution = (float) Math.sqrt(f1); 
            
            x1 = "";
            x2 = "";
            solution = floatToString(fsolution);
        }
    }
    
    public static void squared(){
        float f1 = stringToFloat(x1);
        
        float fsolution = f1*f1;
        
        x1 = "";
        x2 = "";
        solution = floatToString(fsolution);        
    }
    
    public static String delete(String text){
        return text.substring(0, text.length()-1);
    }
    
    public static void clear(){
        x1 = "";
        x2 = "";
    } 
}
