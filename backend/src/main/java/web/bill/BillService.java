package web.bill;

import java.util.LinkedList;
import java.util.List;

public class BillService implements BillServiceInterface{

    List<Bill> bills = new LinkedList<Bill>();

    public boolean createBill(Bill bill) {
        return bills.add(bill);
    }

    public Bill getBill(long bill_id) {
        return bills.stream().filter(bill -> bill.getId() == bill_id).findFirst().orElse(null);
    }
    
}
