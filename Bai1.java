import java.util.Scanner;
public class Bai1 
{
   public static void main(String[] args)
   {
    Scanner reader = new Scanner(System.in);
    System.out.print("Nhap so nguyen 1:");
    int a = reader.nextInt();
    System.out.print("Nhap so nguyen 2:");
    int b = reader.nextInt();
    System.out.println("tong 2 so la:"+(a+b));
    System.out.println("hieu 2 so la:"+(a-b));
    System.out.println("tich 2 so la:"+(a*b));
    System.out.println("thuong 2 so la:"+(a/b));
    reader.close();

   }
}