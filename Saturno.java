/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenprogramacion1ev;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Saturno {
    double masa;
    public void peso(double m){
    masa= m;
    char seguir='a';
    final double Gravedad=10.4;
    Scanner teclado=new Scanner(System.in);
        while(seguir!='N'&&seguir!='n'){
            System.out.println("Los resultados indican que su masa en Saturno será: " + ((masa)*(Gravedad)));
            System.out.println("¿Quieres continuar ejecutando el programa? (Para parar el programa escriba N)");
            seguir=teclado.next().charAt(0);
            if(seguir!='N'&&seguir!='n'){
            System.out.println("Introduce otra masa");
            masa=teclado.nextDouble();
            }
        }
        System.out.println("El programa se ha detenido");
        teclado.close();
    }
}
