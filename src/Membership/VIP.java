package Membership;

public class VIP extends RegisteredCustomer{
    public VIP(String nama, String noTelp){
        super(nama, noTelp);
        this.status = "VIP";
    }

    public VIP(String nama, String noTelp, int poin){
        super(nama, noTelp, poin);
        this.status = "VIP";
    }

    public String getStatus(){return status;}

    public void addPoin(int bayar) {
        this.poin += (0.01 * bayar);
    }

    public void minusPoin(int bayar) {
        double amount = 0.1 * bayar;
        this.poin -= (0.01 * amount);
    }
}