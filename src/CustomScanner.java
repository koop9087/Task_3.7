import java.util.Scanner;

public class CustomScanner {
   static Scanner scanner = new Scanner(System.in);

   public static String line() {
       String newLine = scanner.nextLine();
       return newLine;
   }
}
