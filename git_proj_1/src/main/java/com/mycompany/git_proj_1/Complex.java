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
    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary * Math.sqrt(-1);
    }
    public Complex(double real){
        this.real=real;
        this.imaginary=0;
    }
    
}
