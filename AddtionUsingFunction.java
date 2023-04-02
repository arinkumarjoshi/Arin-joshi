import java.util.*;
public class AddtionUsingFunction {
   public static int AddtionTwoNum(int a , int b){
    int addtion = a+b;
    return addtion;
   } 
   public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int addtion = AddtionTwoNum(a, b);
    System.out.println(addtion);
   }
}
