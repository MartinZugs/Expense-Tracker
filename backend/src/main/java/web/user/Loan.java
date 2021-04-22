package web.user;

import java.util.Date;

public class Loan {

    long id;
    long user_id;
    double amount;
    double paid_off;
    Date creation_date;
    double interest_rate;
    String name;


    public Loan(long id, long user_id, double amount, double paid_off, Date creation_date, double interest_rate,
            String name) {
        this.id = id;
        this.user_id = user_id;
        this.amount = amount;
        this.paid_off = paid_off;
        this.creation_date = creation_date;
        this.interest_rate = interest_rate;
        this.name = name;
    }

    /* ------------ Getter & Setter ----------- */
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public long getUser_id() {
        return user_id;
    }


    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public double getPaid_off() {
        return paid_off;
    }


    public void setPaid_off(double paid_off) {
        this.paid_off = paid_off;
    }


    public Date getCreation_date() {
        return creation_date;
    }


    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }


    public double getInterest_rate() {
        return interest_rate;
    }


    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    
}
