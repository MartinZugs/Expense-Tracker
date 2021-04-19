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

    public Transaction(Date date, long id, double value, boolean isBill, long account_id) {
        this.date = date;
        this.id = id;
        this.value = value;
        this.category = TransactionCategory.OTHER;
        this.isBill = isBill;
        this.account_id = account_id;
    }

    public Transaction(long id, double value, TransactionCategory category, boolean isBill, long account_id) {
        this.date = new Date();
        this.id = id;
        this.value = value;
        this.category = category;
        this.isBill = isBill;
        this.account_id = account_id;
    }

    public Transaction(long id, double value, boolean isBill, long account_id) {
        this.date = new Date();
        this.id = id;
        this.value = value;
        this.category = TransactionCategory.OTHER;
        this.isBill = isBill;
        this.account_id = account_id;
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

    public long getAccount_id() {
        return account_id;
    }
}
