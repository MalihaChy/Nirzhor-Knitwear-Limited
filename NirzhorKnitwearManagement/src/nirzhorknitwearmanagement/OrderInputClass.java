package nirzhorknitwearmanagement;


import java.sql.Date;
import java.util.ArrayList;


public class OrderInputClass {
    public Date Date;
    public String BuyingHouseName;
    public String BuyerName;
    public String StyleNo;
    public int OrderQuantity;
    public double UnitPrice;
    public double CM;
    public double CMperPiece;
    public int noOfColors;
    public String category;
    public ArrayList<String> nameOfColors;
    public ArrayList<Integer> quantityOfColors; 

    public OrderInputClass() {
        nameOfColors = new ArrayList<>();
        quantityOfColors = new ArrayList<>();
    }

    public OrderInputClass(Date Date, String BuyingHouseName, String BuyerName, String StyleNo, int OrderQuantity, double UnitPrice, double CM, double CMperPiece) {
        this.Date = Date;
        this.BuyingHouseName = BuyingHouseName;
        this.BuyerName = BuyerName;
        this.StyleNo = StyleNo;
        this.OrderQuantity = OrderQuantity;
        this.UnitPrice = UnitPrice;
        this.CM=CM;
        this.CMperPiece = CMperPiece;
    }
    
    public int totalQuantity(){
        int total =0;
        for(int i=0; i<noOfColors; i++){
            total+=quantityOfColors.get(i);
        }
        
        return total; 
    }
}
