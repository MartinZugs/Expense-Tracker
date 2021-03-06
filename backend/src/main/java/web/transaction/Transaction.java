package web.transaction;

import java.util.Date;

public class Transaction {

    Date date;
    long id;
    double value;
    TransactionCategory category;
    boolean isBill;
    long account_id;

    public Transaction(Date date, long id, double value, TransactionCategory category, boolean isBill, long account_id) {
        this.date = date;
        this.id = id;
        this.value = value;
        this.category = category;
        this.isBill = isBill;
        this.account_id = account_id;
    }

    /* ------- Getter & Setter ----- */
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public TransactionCategory getCategory() {
        return category;
    }

    public void setCategory(TransactionCategory category) {
        this.category = category;
    }

    public boolean isBill() {
        return isBill;
    }

    public void setBill(boolean isBill) {
        this.isBill = isBill;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

}
