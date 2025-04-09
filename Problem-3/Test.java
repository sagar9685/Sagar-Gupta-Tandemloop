import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    
    
    if(a%2==0)
    {
      a=a-1;
    }
    System.out.print("Output: ");
    for (int i = 0; i < a; i++) {
      System.out.print(2 * i + 1);
      if (i < a - 1) {
          System.out.print(", ");
      }
  }
    
    scanner.close();
  }
}
