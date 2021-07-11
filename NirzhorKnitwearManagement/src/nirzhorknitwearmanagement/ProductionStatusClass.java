package nirzhorknitwearmanagement;


import java.sql.Date;


public class ProductionStatusClass {
    Date Date;
    String StyleNo;
    int OrderQuantity;
    int	ProducedQuantity;
    int	Remaining;
    String Status;

    public ProductionStatusClass(Date Date, String StyleNo, int OrderQuantity, int ProducedQuantity, int Remaining, String Status) {
        this.Date = Date;
        this.StyleNo = StyleNo;
        this.OrderQuantity = OrderQuantity;
        this.ProducedQuantity = ProducedQuantity;
        this.Remaining = Remaining;
        this.Status = Status;
    }
    
    
}
