/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanantiket;

/**
 *
 * @author prime10
 */
public class Transaksi {
    private Tiket tiket;
    private Customer customer;

    public Transaksi(Tiket tiket, Customer customer) {
        this.tiket = tiket;
        this.customer = customer;
    }
    
    public void printTiket()
    {
        System.out.println("=================== Tiket ===================");
        System.out.println("Asal        : " + tiket.getAsal());
        System.out.println("Tujuan      : " + tiket.getTujuan());
        System.out.println("=============================================");
        System.out.println("Nama     : " + customer.getNama());
        System.out.println("Email    : " + customer.getEmail());
        System.out.println("Umur     : " + customer.getUmur());
        System.out.println("=============================================");
    }
}
