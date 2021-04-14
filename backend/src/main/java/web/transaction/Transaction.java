package web.transaction;

import java.util.Date;

public class Transaction {

    Date date;
    long id;
    double value;
    TransactionCategory category;
    boolean isBill;

    public Transaction(Date date, long id, double value, TransactionCategory category, boolean isBill) {
        this.date = date;
        this.id = id;
        this.value = value;
        this.category = category;
        this.isBill = isBill;
    }

    public Transaction(long id, double value, TransactionCategory category, boolean isBill) {
        this.date = new Date();
        this.id = id;
        this.value = value;
        this.category = category;
        this.isBill = isBill;
    }

    public Transaction() {}

    /* ------- Getter & Setter ----- */
    public Date getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public TransactionCategory getCategory() {
        return category;
    }

    public boolean getIsBill() {
        return isBill;
    }
}
