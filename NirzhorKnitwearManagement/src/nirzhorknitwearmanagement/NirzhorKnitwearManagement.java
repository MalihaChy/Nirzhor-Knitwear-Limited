
package nirzhorknitwearmanagement;

import java.time.LocalDate;

public class NirzhorKnitwearManagement {
    
    public static LocalDate currentDate;
    

    public static void main(String[] args) {
        currentDate = LocalDate.now();
        new ManagementHomePage().setVisible(true);
        
    }
    
}
