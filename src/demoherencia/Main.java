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
       
            System.out.println("Acción que desea realizar: ");
            System.out.println("1 = CuentaBancaria de Eric");
            System.out.println("2 = CuentaDeAhorro de Eric");
            System.out.println("3 = CuentaDeCheques de Eric");
            int Cuenta = entrada.nextInt();
        
        if (Cuenta == 1){    
        System.out.println("Proporcionar el número de la Cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcionar el nombre del Cliente.");
        String cliente = entrada.next();
        CuentaBancaria cuentaBancaria = 
        new CuentaBancaria(numeroDeCuenta,cliente);
        
        int contador = 0;
        while (contador == 0){
            System.out.println("Acción que desea realizar: ");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero deseas Depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuánto dinero deseas Retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Finalizado.");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        
        if(Cuenta == 2){
            System.out.println("Proporcionar el numero de la Cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcionar el nombre del Cliente.");
            String cliente = entrada.next();
            CuentaDeAhorro CuentaNew =  
            new CuentaDeAhorro(numeroDeCuenta,cliente);
            
            System.out.println(CuentaNew.getSaldo());
            CuentaNew.Depositar(200);
            System.out.println(CuentaNew.getSaldo());
            CuentaNew.corteMensual();
            System.out.println(CuentaNew.getSaldo());    
            CuentaNew.Retirar(500);
            System.out.println(CuentaNew.getSaldo());
            CuentaNew.corteMensual();
            System.out.println(CuentaNew.getSaldo());
        }
        
        if (Cuenta == 3){    
        System.out.println("Proporcionar el numero de la Cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcionar el nombre del Cliente.");
        String cliente = entrada.next();
        CuentaDeCheques cuentaDeCheques = 
                new CuentaDeCheques(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("Acción que desea realizar: ");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuánto dinero deseas Depositar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuánto dinero deseas Retirar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Finalizado.");
                contador = 1;
            }
            double saldo = cuentaDeCheques.getSaldo();
            System.out.println(+saldo);
            }   
        }
    }
    
}      

