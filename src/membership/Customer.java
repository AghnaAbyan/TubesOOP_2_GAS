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
<<<<<<< Updated upstream
    private int poin;
=======
    private double poin;
    private int hargaBarang;
>>>>>>> Stashed changes

    public String getNama() {
        return this.nama;
    }

    public Double getNoTelp() {
        return this.noTelp;
    }

    public double getPoin() {
        return this.poin;
    }

<<<<<<< Updated upstream
    public void addPoin(int bayar) {
        this.poin += (0.01 * bayar);
    }

    public void minusPoin(int bayar) {
        int amount = 0.1 * bayar;
=======
    public void addPoin() {
        double amount = 0.1 * this.hargaBarang;
        this.poin += (0.01 * amount);
    }

    public void minusPoin() {
        double amount = 0.1 * this.hargaBarang;
>>>>>>> Stashed changes
        this.poin -= (0.01 * amount);
    }
}