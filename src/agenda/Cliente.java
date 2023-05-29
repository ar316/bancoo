/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author ar316b
 */
public class Cliente  extends Cuenta{
    
    private String username;

    public Cliente( String username,String numeroCuenta, String tipoCuenta, double balance) {
        super(numeroCuenta, tipoCuenta, balance);
        this.username = username;
        
    }
    public String mostrarInfo() {
         return "Nombre del titular:"+ this.username + " numero de cuenta "+ super.getNumeroCuenta()+ " Balance "+ super.getBalance();
    
    }
    
    
    
    
}
