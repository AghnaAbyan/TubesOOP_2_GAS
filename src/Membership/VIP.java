package Membership;

public class VIP extends RegisteredCustomer{
    public VIP(String nama, String noTelp){
        super(nama, noTelp);
        this.status = "VIP";
    }

    public VIP(String nama, String noTelp, int poin, boolean isActive){
        super(nama, noTelp, poin, isActive);
        this.status = "VIP";
    }

    public void addPoin(int bayar) {
        this.poin += (0.01 * bayar);
    }

    public void spendPoin(int bayar) {
        double amount = 0.1 * bayar;
        this.poin -= (0.01 * amount);
    }
}