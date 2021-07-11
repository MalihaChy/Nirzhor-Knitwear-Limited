
package nirzhorknitwearmanagement;

public class DateWiseProductionReport {
        
    String styleNo;
    String color;
    int quantity;
    double income;
    int sewingInput;

    public DateWiseProductionReport() {
    }

    public DateWiseProductionReport(String styleNo, int quantity) {
        this.styleNo = styleNo;
        this.quantity = quantity;
        
    }

    public DateWiseProductionReport(String styleNo, int quantity, double income) {
        this.styleNo = styleNo;
        this.quantity = quantity;
        this.income = income;
    }

    public DateWiseProductionReport(String styleNo, String color, int quantity) {
        this.styleNo = styleNo;
        this.color = color;
        this.quantity = quantity;
    }

    public DateWiseProductionReport(String styleNo, int quantity, int sewingInput) {
        this.styleNo = styleNo;
        this.quantity = quantity;
        this.sewingInput = sewingInput;
    }
    
    
    
    
}
