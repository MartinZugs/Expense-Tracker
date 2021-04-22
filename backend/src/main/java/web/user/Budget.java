package web.user;

import java.util.Date;

import web.transaction.TransactionCategory;

public class Budget {

    long id;
    long user_id;
    TransactionCategory category;
    String name;
    Date start_date;
    Date end_date;
    double amount;
    double used;

    public Budget(long id, long user_id, TransactionCategory category, String name, Date start_date, Date end_date,
            double amount) {
        this.id = id;
        this.user_id = user_id;
        this.category = category;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.amount = amount;
    }

    public Budget(long id, long user_id, String name, Date start_date, Date end_date, double amount) {
        this.id = id;
        this.user_id = user_id;
        this.category = TransactionCategory.OTHER;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.amount = amount;
    }

    public void updateBudget(double value) {
        this.used -= value;
        if(this.used >= this.amount) {
            // TODO: Implement message option to let user know budget is overdrawn
        }
    }

    /* ---------------- Getter & Setter ---------------- */

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

    public TransactionCategory getCategory() {
        return category;
    }

    public void setCategory(TransactionCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUsed() {
        return used;
    }

    public void setUsed(double used) {
        this.used = used;
    }
}
