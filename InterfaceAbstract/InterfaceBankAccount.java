/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceAbstract;

/**
 *
 * @author Abiansyah Gymnastiar
 */
public interface InterfaceBankAccount {
    public final String BANK = "Bank Indonesia";
    
    public void Withdraw(int amt);
    public void Deposit(int amt);
    public int getBalance();
    public String getBankName();
}
