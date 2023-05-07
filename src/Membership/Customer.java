package Membership;

import java.util.ArrayList;

public class Customer implements CanBuy {
    protected String status = "Customer";
    protected static int customerCount = 0;
    protected final int idUser;
    protected final ArrayList<Transaction> history;
    protected Transaction activeTransaction = null;

    public Customer(){
        this.idUser = customerCount+1;
        this.history = new ArrayList<>();
        customerCount++;
        System.out.println(customerCount);
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

    public int getIdUser() {
        return this.idUser;
    }
    public ArrayList<Transaction> getHistory(){return this.history;}
    public String getStatus(){return status;}
    public int getCustomerCount(){return customerCount;}
    public static void incCustomer(){customerCount++;}
}
