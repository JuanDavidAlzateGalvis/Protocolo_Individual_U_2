/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocoloindividual2.Taller1;

/**
 *
 * @author juana
 */
public class CuentaBancaria {
    
    String tipoCuenta;
    String numeroCuenta;
    double saldo;

    public CuentaBancaria() {
        this.tipoCuenta = "No asignado";
        this.numeroCuenta = "Desconocido";
        this.saldo = 0;
    }
    
    public CuentaBancaria(String tipoCuenta, String numeroCuenta) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
    }

    public CuentaBancaria(String tipoCuenta, String numeroCuenta, double saldo) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Cuenta bancaria = Tipo de cuenta: " + tipoCuenta + ", Numero de cuenta: " + numeroCuenta + ", Saldo: " + saldo; }
}