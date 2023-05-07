package Membership;

public abstract class RegisteredCustomer extends Customer implements CanPayWithPoin{
    protected RegisteredCustomer(String nama, String noTelp){
        super();
        this.nama = nama;
        this.noTelp = noTelp;
        this.poin = 0;
    }
    protected RegisteredCustomer(String nama, String noTelp, int poin){
        super();
        this.nama = nama;
        this.noTelp = noTelp;
        this.poin = poin;
    }
    protected String nama;
    protected String noTelp;
    protected int poin;
    public String getNama() {return this.nama;}
    public String getNoTelp() {return this.noTelp;}
    public int getPoin(){return this.poin;}
}