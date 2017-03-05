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
public class Customer {
    private String nama;
    private String email;
    private int umar;

    public Customer(String nama, String email, int umar) {
        this.nama = nama;
        this.email = email;
        this.umar = umar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUmar() {
        return umar;
    }

    public void setUmar(int umar) {
        this.umar = umar;
    }
    
}
