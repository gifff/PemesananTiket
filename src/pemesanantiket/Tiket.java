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
public class Tiket {
    private String asal;
    private String tujuan;
    private int harga;

    public Tiket(String asal, String tujuan, int harga) {
        this.asal = asal;
        this.tujuan = tujuan;
        this.harga = harga;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
