package membership;

public class Customer {
    private int idUser;

    public int getID() {
        return this.idUser;
    }
}

class Member extends Customer {
    private String nama;
    private Double noTelp;
    private int poin;

    public String getNama() {
        return this.nama;
    }

    public Double getNoTelp() {
        return this.noTelp;
    }

    public int getPoin() {
        return this.poin;
    }

    public void addPoin(int amount) {
        this.poin += (0.01 * amount);
    }

    public void minusPoin(int amount) {
        this.poin -= (0.01 * amount);
    }
}

class VIP extends Customer {
    private String nama;
    private Double noTelp;
    private int poin;

    public String getNama() {
        return this.nama;
    }

    public Double getNoTelp() {
        return this.noTelp;
    }

    public int getPoin() {
        return this.poin;
    }

    public void addPoin(int bayar) {
        this.poin += (0.01 * bayar);
    }

    public void minusPoin(int bayar) {
        int amount = 0.1 * bayar;
        this.poin -= (0.01 * amount);
    }
}