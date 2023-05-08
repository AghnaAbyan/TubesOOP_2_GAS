package Membership;

public class Member extends RegisteredCustomer{
    public Member(String nama, String noTelp){
        super(nama, noTelp);
        this.status = "Member";
    }
    public Member(String nama, String noTelp, int poin, boolean isActive){
        super(nama, noTelp, poin, isActive);
        this.status = "Member";
    }


    public void addPoin(int amount) {
        this.poin += (0.01 * amount);
    }

    public void spendPoin(int amount) {
        this.poin -= (0.01 * amount);
    }
}
