import java.util.*;
public class PrintStarFromUser {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int i;
    int j;
    for(i=1;i<=x;i++){
      for(j=1;j<=y;j++){
         System.out.print("*");
      }
       System.out.println();
    }
   } 
}
