import java.time.LocalDate;  
public class LocalDateExample1 {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.now();  
    LocalDate yesterday = date.minusDays(1);  
    LocalDate tomorrow = yesterday.plusDays(2);  
    System.out.println("Today date: "+date);  
    System.out.println("Yesterday date: "+yesterday);  
    System.out.println("Tommorow date: "+tomorrow);  
  }  
}  