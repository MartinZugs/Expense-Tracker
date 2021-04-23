package web.bill;

public interface BillServiceInterface {

    public boolean createBill(Bill bill);
    public Bill getBill(long bill_id);
    
}
