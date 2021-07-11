package nirzhorknitwearmanagement;


import java.sql.Date;


public class CompletedOrdersClass extends OrderInputClass{
    
    Date CompletingDate;
    int ProducedQuantity;

    public CompletedOrdersClass() {
    }

    public CompletedOrdersClass(Date CompletingDate, int ProducedQuantity, Date Date, String BuyingHouseName, String BuyerName, String StyleNo, int OrderQuantity, double UnitPrice, double CM, double CMperPiece) {
        super(Date, BuyingHouseName, BuyerName, StyleNo, OrderQuantity, UnitPrice, CM, CMperPiece);
        this.CompletingDate = CompletingDate;
        this.ProducedQuantity = ProducedQuantity;
    }
    
    
}
