/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author Eric Gtz Castillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria misAhorros = new CuentaBancaria(1,"Eric");
        System.out.println("saldo:" + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(1500.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(200);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(300);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(1000);
        System.out.println("saldo:"+ misAhorros.getSaldo());
      
    }
    
        CuentaDeAhorro misAhorros = new CuentaDeAhorro (2,"Eric");{
        System.out.println("saldo:" + misAhorros.getSaldo());
        misAhorros.depositar(1000.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(1500.0);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(200);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.depositar(300);
        System.out.println("saldo:"+ misAhorros.getSaldo());
        misAhorros.retirar(1000);
        
        System.out.println("Tasa de interes:"+ misAhorros.getSaldo());
        misAhorros.calcularTasaDeInteres(0.25);
        System.out.println("Comisión por Saldo:"+ misAhorros.getSaldo());
        misAhorros.comisionPorSaldo(50.0);
        
        System.out.println("saldo:"+ misAhorros.getSaldo());
     }
  }

