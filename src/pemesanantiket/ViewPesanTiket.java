/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesanantiket;

import java.util.Scanner;

/**
 *
 * @author gedeagas
 */
public class ViewPesanTiket {
    private Tiket tiket =  new Tiket();
    private Customer customer = new Customer();
    private Transaksi transaksi = new Transaksi(tiket, customer);
    
    
    private String nama,email,asal,tujuan;
    private int umur;
    public void viewTiket(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("System Pembelian Tiket");
        System.out.println("=============================================");
        System.out.println("Masukan Nama    : ");
        nama = input.nextLine();
        System.out.println("Masukan Email    : ");
        email = input.nextLine();
        
        System.out.println("Masukan Umur    : ");
        umur = input.nextInt();
        input.nextLine();
        System.out.println("=============================================");
        System.out.println("Masukan Asal    : ");
        asal = input.nextLine();
        System.out.println("Tujuan          : ");
        tujuan = input.nextLine();
        tiket.setAsal(asal);
        tiket.setHarga(20000);
        tiket.setTujuan(tujuan);
        
        
        customer.setEmail(email);
        customer.setNama(nama);
        customer.setUmur(umur);
        
        
        
        transaksi.printTiket();
        
        


        
         
    }
    
}
