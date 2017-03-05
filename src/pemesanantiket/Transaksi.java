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

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}
