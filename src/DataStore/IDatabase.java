package DataStore;

import DataStore.Storer.StorerBarang;
import DataStore.Storer.StorerCustomer;
import Entitas.Barang;
import Membership.Customer;
import Membership.Member;

import java.util.ArrayList;
import java.util.HashMap;


public class IDatabase {
    public static void main(String[] args) {
        IDatabase db = new IDatabase();

        Member a = (Member)db.getMembership(1); // Load Member dari database
//        Customer c = db.getMembership(1); // Load Customer dari database
//        Member b = new Member("Obedc","081"); // Bikin member baru
//        a.addToBasket(1,5);
//        a.addToBasket(5,3);
//        a.buy();
//        db.addCustomer(a);

//        Barang b = new Barang("Milkita", 1000.0, 2000.0, "Permen", "./");
//        db.addBarang(b);
        ArrayList<Barang> lb = db.getGudangList();
        System.out.println(lb);

    }
    private final StorerCustomer customerBuff;
    private final StorerBarang gudangBuff;

    public IDatabase(){
        customerBuff = new StorerCustomer();
        gudangBuff = new StorerBarang();
    }

    public void addCustomer(Customer customer){
        this.customerBuff.addCustomer(customer);
    }

    public void updateCustomer(Customer customer){
        this.customerBuff.updateCustomer(customer);
    }

    public ArrayList<Barang> getGudangList(){
        ArrayList<Barang> lb = new ArrayList<>();
        HashMap<String, Barang> gudang = this.gudangBuff.getGudang();
        for(String key : gudang.keySet()){
            lb.add(gudang.get(key));
        }
        return lb;
    }
    public void addBarang(Barang barang){this.gudangBuff.addBarang(barang);}
    public void updateBarang(Barang barang){this.gudangBuff.updateBarang(barang);}

    public Customer getMembership(int idUser){
        return customerBuff.getCustomer(idUser);
    }

//    public Barang getBarang(int idBarang){
//        return gudangBuff.get
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
//    public void beliBarang(int idUser, int idBarang, int jumlah){
//
//    }
}
