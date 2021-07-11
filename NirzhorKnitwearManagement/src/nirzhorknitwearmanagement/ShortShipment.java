
package nirzhorknitwearmanagement;




import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShortShipment {

    String StyleNo;

    void ShortShipmentMethod(String StyleNo) {
        try {
            ConnectDatabase obj = new ConnectDatabase();
            obj.connectDB();
            Statement statement = obj.connection.createStatement();
            int OrderId = 0, OrderQuantity = 0, ProducedQuantity = 0;
            Date CompletionDate = new Date(119, 10, 10);
            System.out.println("StyleNo "+StyleNo);
            ResultSet resultset = statement.executeQuery("select OrderId,OrderQuantity,ProducedQuantity,SystemDate from ProductionStatus where OrderId=(select min(OrderId) from ProductionStatus where StyleNo='" + StyleNo + "')");
            while (resultset.next()) {
                OrderId = resultset.getInt("OrderId");
                OrderQuantity = resultset.getInt("OrderQuantity");
                ProducedQuantity = resultset.getInt("ProducedQuantity");
                CompletionDate = resultset.getDate("SystemDate");
            }
            System.out.println("OrderId "+OrderId);
            System.out.println("OrderQuantity "+OrderQuantity);
            System.out.println("ProducedQuantity "+ProducedQuantity);
            
            statement.executeUpdate("delete from ProductionStatus where OrderId=" + OrderId);
            System.out.println("delete done");
            resultset = statement.executeQuery("select OrderId,Date,StyleNo,OrderQuantity from OrderInput where OrderId=" + OrderId);
            int one = 0;
            Date two = new Date(119, 10, 10);
            String three = "DIE";
            int four = 0;

            while (resultset.next()) {
                two = resultset.getDate("Date");
                three = resultset.getString("StyleNo");
                four = resultset.getInt("OrderQuantity");
            }
            System.out.println("Date "+two);
            System.out.println("StyleNo "+three);
            System.out.println("OrderQuantity "+four);
            
            //statement.executeUpdate("insert into CompletedOrders values (" + OrderId + ",'" + two + "','" + three + "'," + four + ",'" + Knitwear2.currentDate + "'," + ProducedQuantity + ")");

            statement.executeUpdate("insert into CompletedOrders values (" + OrderId + ",'" + two + "','" + three + "'," + four + ",'" + CompletionDate + "'," + ProducedQuantity + ")");

            
            System.out.println("insert done");
        } catch (SQLException ex) {
            System.out.println("EXCEPTION");
            
        }

    }

}
