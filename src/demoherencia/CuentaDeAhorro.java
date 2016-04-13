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
public class CuentaDeAhorro {
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private double tasaDeInteres;
    private double comisionPorSaldo;
 
    public CuentaDeAhorro (int numeroDeCuenta, String cliente){
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.tasaDeInteres = 0.25;
        this.comisionPorSaldo = 50.0;
        
    }
    public boolean depositar (double cantidad){
        boolean seRealizaDeposito;
        if (cantidad > 0.0){
            saldo = saldo + cantidad;
            seRealizaDeposito = true;
        }
        else {
            seRealizaDeposito = false;
        }
        return seRealizaDeposito;
        }
    public boolean retirar (double cantidad){
        boolean seRealizaRetiro;
        if (cantidad > 0.0){
            saldo = saldo - cantidad;
            seRealizaRetiro = true;
        }
        else{
            seRealizaRetiro = false;
        }
        return seRealizaRetiro;
    }
    public double getSaldo(){
    return saldo;
    
    }
    public boolean calcularTasaDeInteres (double cantidad){
    boolean seCalculaInteres;
    
     if (cantidad > 0.0){
            double interes = saldo *tasaDeInteres /100.0;
            seCalculaInteres = true;
        }
        else {
            seCalculaInteres = false;
        }
        return seCalculaInteres;
        }
    public boolean comisionPorSaldo (double cantidad){
        boolean seRealizoComision;
        if (cantidad > 0.0){
            double comision = saldo * comisionPorSaldo /100;
            seRealizoComision = true;
        }
        else{
           seRealizoComision = false;
        }
        return seRealizoComision;
    }
}


