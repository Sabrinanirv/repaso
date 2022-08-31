/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author usuario
 */
public class CurrentAccount extends BankAccount {
     private String pin;

    public CurrentAccount(String pin, String number, int codeSecurity, double balance, Cliente client) {
        super(number, codeSecurity, balance, client);
        this.pin = pin;
    }

    public void createPin(){
        System.out.println("Crear pin");
    }
    public void updatePin(){
        System.out.println("Actualizar pin");
    }
    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }
     
}

