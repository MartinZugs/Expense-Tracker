package web.bill;

import java.util.Date;

public class Bill {
    
    double value;
    long id;
    Date due_date;
    long transaction_id;

    public Bill(double value, long id, Date due_date, long transaction_id) {
        this.value = value;
        this.id = id;
        this.due_date = due_date;
        this.transaction_id = transaction_id;
    }

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDue_date() {
		return this.due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public long getTransaction_id() {
		return this.transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

}
