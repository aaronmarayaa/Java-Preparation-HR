import java.time.LocalDate;
import java.util.Scanner;
  
class dateAndTime {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int m =  input.nextInt();
    int d =  input.nextInt();
    int y =  input.nextInt();
    LocalDate ld = LocalDate.of(y, m, d);
    
    System.out.print(ld.getDayOfWeek());
    
    }
}