package DataStore;

import DataStore.Storer.StorerBarang;
import DataStore.Storer.StorerCustomer;
import Membership.Customer;


public class IDatabase {
//    public static void main(String[] args) {
//        IDatabase db = new IDatabase();
//
//        Member a = (Member)db.getMembership(3); // Load Member dari database
//        Customer c = db.getMembership(1); // Load Customer dari database
//        Member b = new Member("Obedc","081"); // Bikin member baru
//        db.addCustomer(b);
//    }
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
