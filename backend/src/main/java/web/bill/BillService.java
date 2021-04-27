package web.bill;

import java.util.LinkedList;
import java.util.List;
import java.sql.*;
import web.database.*;

public class BillService implements BillServiceInterface{

    List<Bill> bills = new LinkedList<Bill>();
    DatabaseController database_controller = new DatabaseController("expense_tracker");

    public boolean createBill(Bill bill) {
        database_controller.open_connection();
        int affected_rows = database_controller.execute_update("INSERT INTO Bill (amount, due_date, transaction_id) VALUES ('" + bill.getValue() + "','" + bill.getDue_date() + "','" + bill.getTransaction_id() + "');");
        System.out.println(affected_rows);
        database_controller.close_connection();
        return bills.add(bill);
    }

    public Bill getBill(long bill_id) {
        return bills.stream().filter(bill -> bill.getId() == bill_id).findFirst().orElse(null);
    }
    
}
