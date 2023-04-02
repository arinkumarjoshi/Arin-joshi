import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+c;
        System.out.println(sum);
        int mul = a*b;
        System.out.println(mul);
        int diff = a-c;
        System.out.println(diff);
        int div = a/b/c;
        System.out.println(div);

    }
    
}
