/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Alexandra
 */
//Clase que representa una clase bancaria
//Permite consultar tu saldo, ingresar y retirar dinero.
public class CCuenta {
    //Nombre del titular de la cuenta
    private String nombre;
    //Numero de cuenta
    private String cuenta;
    //Saldo disponible en la cuenta
    private double saldo;
    //Tipo de interes asociado a la cuenta
    private double tipoInteres;
    //constructor de la clase CCuenta
    //@param nom nombre del titular
    //@param cue numero de cuenta
    //@param sal saldo inicial
    //@param tipo tipo de interes
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }
    //Obtiene el nombre del titular
    //@return nombre del ittular
    public String getNombre() {
        return nombre;
        
    }
    //cambia el nombre del titular
    //@param nombre nuevo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getTipoInteres(){
        return tipoInteres;
    }
    public void setTipoInteres (double TipoInteres){
        this.tipoInteres = TipoInteres;
    }
    public double estado() {
        return saldo;
    }
    // metodo para ingresar dinero en la cuenta
    //@param cantidad cantidad a ingersar
    //@thorws Exception lanza una excepcion si la cantidad es negativa
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    //Metodo para retirar dinero de la cuenta 
    //@param cantidad cantidad a retirar
    //@thorws Exception lanza una excepcion si la cantidad es negativa o no hay salgo suficiente
    public void retirar(double cantidad) throws Exception{
        if (cantidad <=0){
            throw new Exception("No se puede retirar una cantidad negativa");
    }
        if(estado() < cantidad){
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
        }
}
