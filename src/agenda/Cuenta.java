/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import javax.swing.JOptionPane;

/**
 *
 * @author ar316b
 */
public class Cuenta {
    
    private String numeroCuenta;
    private String tipoCuenta;
    private double balance;

    public Cuenta(String numeroCuenta, String tipoCuenta, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.balance = balance;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void credito(double cantidad) {
        if(cantidad >0 ) {
        balance += cantidad;
       JOptionPane.showMessageDialog(null, "Deposito realizado con exito");
        }
     
    }
    
    public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public void debito(double cantidad) {
        if (balance >= cantidad) {
            balance -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + balance);
    }

    
    public String tuiString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", balance=" + balance + "]";
    }

    
    
    
}
