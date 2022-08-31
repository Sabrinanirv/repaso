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
public class SavingsAccount extends BankAccount{
    private String securityKey;

    public SavingsAccount(String securityKey, String number, int codeSecurity, double balance, Cliente client) {
        super(number, codeSecurity, balance, client);
        this.securityKey = securityKey;
    
}
    
public void createKeySec(){
    System.out.println("Crear clave de seguridad");
}
public void updateKeySec(){
    System.out.println("Actualizar clave de seguridad");
}

    /**
     * @return the securityKey
     */
    public String getSecurityKey() {
        return securityKey;
    }

    /**
     * @param securityKey the securityKey to set
     */
    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

}