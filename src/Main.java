import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz:");
        int x= input.nextInt();
        System.out.println("Üssünü alınız:");
        int y= input.nextInt();
        int total=1;

        for(int i=1;i<=y;i++){
            total*=x;
        }
        System.out.println("CEVAP:"+total);




    }
}