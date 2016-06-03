/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

import java.util.Scanner;

/**
 *
 * @author Eric Gtz Castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       
            System.out.println("¿Que cuenta desea abrir?");
            System.out.println("1 = CuentaBancaria de Eric");
            System.out.println("2 = CuentaDeAhorro de Eric");
            int cuenta = entrada.nextInt();
             
        
        if (cuenta == 1){    
        System.out.println("Proporcionar el número de la Cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcionar el nombre del Cliente.");
        String cliente = entrada.next();
        CuentaBancaria cuentaBancaria = 
                new CuentaBancaria(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("Acción que desea realizar");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero quiere Depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuanto dinero quiere Retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Finalizado");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
           }
        
         if(cuenta == 2){
            System.out.println("Proporcione el numero de la cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente.");
            String cliente = entrada.next();
            CuentaDeAhorro nuevaCuenta = 
                    new CuentaDeAhorro(numeroDeCuenta,cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());    
            nuevaCuenta.Retirar(500);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
        }
        }
    }
}
 
    
        
