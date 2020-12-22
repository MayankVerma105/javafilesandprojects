import java.time.*;  
public class LocalDateExample3 {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.of(2020, 12, 14);  
    LocalDateTime datetime = date.atTime(1,50,9);      
    System.out.println(datetime);   
  }  
} 