package Membership;

public abstract class RegisteredCustomer extends Customer implements CanPayWithPoin{
    protected RegisteredCustomer(String nama, String noTelp){
        super();
        this.nama = nama;
        this.noTelp = noTelp;
        this.poin = 0;
        this.isActive = true;
    }
    protected RegisteredCustomer(String nama, String noTelp, int poin, boolean isActive){
        super();
        this.nama = nama;
        this.noTelp = noTelp;
        this.poin = poin;
        this.isActive = isActive;
    }
    protected String nama;
    protected String noTelp;
    protected boolean isActive;
    protected int poin;
    protected void deactivate(){isActive=false;}
    public String getNama() {return this.nama;}
    public String getNoTelp() {return this.noTelp;}
    public int getPoin(){return this.poin;}
}