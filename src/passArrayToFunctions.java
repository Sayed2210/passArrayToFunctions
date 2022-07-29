import java.util.Scanner;

public class passArrayToFunctions {
    public static void main(String[] args) {
        int[] a=new int[4];
        input(a);
        output(a);
        int[] b=new int[4];
        input(b);
        output(b);


    }
    public static void input(int[] a){
        System.out.println("Enter the Elements Of Array");
        for (int i=0;i<a.length;i++){
            a[i]= new Scanner(System.in).nextInt();
        }
    }
    public static void output(int[] a){
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
