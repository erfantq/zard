import java.util.Scanner;

//4012262209
public class Main {
    public static void main(String[] args) {
        Scanner inpute=new Scanner(System.in);
        int count=inpute.nextInt();
        System.out.print("W");
        for (int i=0 ; i<count ; i++){
            System.out.print("o");
        }
        System.out.print("w");
        System.out.print("!");
    }
}