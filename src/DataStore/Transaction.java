package DataStore;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Transaction {
    private final ArrayList<Bought> list;
    private final String timestamp;

    Transaction(ArrayList<Bought> list, LocalDateTime timestamp){
        this.list = list;
        this.timestamp = timestamp.toString();
    }

    Transaction(){
        this.list = new ArrayList<>();
        this.timestamp = LocalDateTime.now().toString();
    }

    public void addBought(Bought bought){
        this.list.add(bought);
    }

    public ArrayList<Bought> getList(){return list;}
    public String getTimestamp(){return timestamp;}
}

class Bought{
    private final int idBarang;
    private int jumlah;

    public Bought(int idBarang, int jumlah){
        this.idBarang = idBarang;
        this.jumlah = jumlah;
    }

    public int getIdBarang(){return idBarang;}
    public int getJumlah(){return idBarang;}
    public void setJumlah(int jumlah){this.jumlah=jumlah;}
}

class Customer {
    public int idUser;
    private String status;
    private String nama;
    private String noTelp;
    private int poin;

    public Customer(int idUser, String status, String nama, String noTelp, int poin){
        this.idUser = idUser;
        this.status = status;
        this.nama = nama;
        this.noTelp = noTelp;
        this.poin = poin;
    }
}