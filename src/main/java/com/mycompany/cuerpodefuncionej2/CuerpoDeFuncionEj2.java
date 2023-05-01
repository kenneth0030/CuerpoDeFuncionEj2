/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cuerpodefuncionej2;

/**
 *
 * @author kenne
 */
public class CuerpoDeFuncionEj2 {

    public void multiplicacion(int a, int b) {
        int resultado = a*b;
        System.out.println("el resultado =" + resultado );
    }

    public static void main(String[] args) {
        CuerpoDeFuncionEj2 op = new CuerpoDeFuncionEj2();
        op.multiplicacion(3, 2);
    }
}
