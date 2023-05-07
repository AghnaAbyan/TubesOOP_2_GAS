package Membership;

public abstract class RegisteredCustomer extends Customer{
    private String status;
    private String nama;
    private String noTelp;
    private int poin;
    public String getNama() {return this.nama;}
    public String getNoTelp() {return this.noTelp;}
    public int getPoin(){return this.poin;}

}

class Member extends RegisteredCustomer {
    private boolean active;

    public void addPoin(int amount) {
        this.poin += (0.01 * amount);
    }

    public void minusPoin(int amount) {
        this.poin -= (0.01 * amount);
    }
}

class VIP extends Customer {
    private String nama;
    private String noTelp;
    private double poin;

    public String getNama() {
        return this.nama;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public double getPoin() {
        return this.poin;
    }

    public void addPoin(int bayar) {
        this.poin += (0.01 * bayar);
    }

    public void minusPoin(int bayar) {
        double amount = 0.1 * bayar;
        this.poin -= (0.01 * amount);
    }
}