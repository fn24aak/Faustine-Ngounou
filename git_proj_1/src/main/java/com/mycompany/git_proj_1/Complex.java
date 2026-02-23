/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.git_proj_1;

/**
 *
 * @author fn24aak
 */
public class Complex {
    private double real;
    private double imaginary;
    private double i = Math.sqrt(-1);
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public Complex(double real){
        this.real=real;
        this.imaginary=0;
    }
    
    public double getRealPart(){
        return real;
    }
    
    public double getImaginaryPart(){
        return imaginary;
    }
    
    public Complex add(Complex other){
        double num1= (real+other.getRealPart());
        double num2 = (imaginary+other.getImaginaryPart());
        Complex result = new Complex(num1,num2);
        return result;
        
    }
    
}
