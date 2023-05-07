package DataStore;

import DataStore.Storer.StorerBarang;
import DataStore.Storer.StorerCustomer;
import Membership.Customer;
import Membership.Member;
import Membership.Transaction;

import java.util.ArrayList;


public class IDatabase {
    public static void main(String[] args) {
        IDatabase db = new IDatabase();
        Member a = new Member("Obedc","081");
        Member b = new Member("Obeds","081");
        Customer c = new Customer();
        db.addCustomer(b);
//        db.addCustomer(b);

        System.out.println(a.getNama());

    }
    private final StorerCustomer customerBuff;
    private final StorerBarang gudangBuff;

    IDatabase(){
        customerBuff = new StorerCustomer();
        gudangBuff = new StorerBarang();
    }

    public void addCustomer(Customer customer){
        this.customerBuff.addCustomer(customer);
    }

    public void updateCustomer(Customer customer){
        this.customerBuff.updateCustomer(customer);
    }

    public Customer getMembership(int idUser){
        return customerBuff.getCustomer(idUser);
    }

//    public Barang getBarang(int idBarang){
//
//    }
//
//    public ArrayList<Transaction> getBarangBeli(int idUser){
//
//    }
//
//    public int getStokGudang(int idBarang){
//
//    }
//
//    public BarangStok getBarangStok(int idBarang){}
}
