package Membership;

public class Member extends RegisteredCustomer{
    public Member(String nama, String noTelp){
        super(nama, noTelp);
        this.status = "Member";
    }
    public Member(String nama, String noTelp, int poin){
        super(nama, noTelp, poin);
        this.status = "Member";
    }


    public void addPoin(int amount) {
        this.poin += (0.01 * amount);
    }

    public void minusPoin(int amount) {
        this.poin -= (0.01 * amount);
    }
}
