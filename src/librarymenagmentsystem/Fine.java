import java.util.Date;

public class Fine {
    private IUser user;
    private double amount;
    private Date fineDate;

    public Fine(IUser user, double amount, Date fineDate) {
        this.user = user;
        this.amount = amount;
        this.fineDate = fineDate;
    }

    public IUser getUser() {
        return user;
    }

    public double getAmount() {
        return amount;
    }

    public Date getFineDate() {
        return fineDate;
    }
}
