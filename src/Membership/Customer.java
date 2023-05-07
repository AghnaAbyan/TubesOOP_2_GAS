package Membership;

import java.util.ArrayList;

public class Customer implements CanBuy {
    protected String status = "Customer";
    protected int idUser;
    protected final ArrayList<Transaction> history;
    protected Transaction activeTransaction = null;

    public Customer(){
        this.idUser = -1; //Unregistered, will change when stored into db
        this.history = new ArrayList<>();
    }

    public void addToBasket(int idBarang, int jumlah){
        if(activeTransaction == null) activeTransaction = new Transaction();

        activeTransaction.addList(idBarang, jumlah);
    }

    public int buy(){
        history.add(activeTransaction);
        int price = activeTransaction.calculatePrice();

        activeTransaction = null;
        return price;
    }
    public void setIdUser(int idUser){this.idUser = idUser;}
    public int getIdUser() {
        return this.idUser;
    }
    public ArrayList<Transaction> getHistory(){return this.history;}
    public String getStatus(){return status;}
}
