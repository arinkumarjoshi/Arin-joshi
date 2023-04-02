import java.util.*;
public class CreateBoundryUsingStar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int i;
    int j;
    for(i=1;i<=n;i++){
           {
            for(j=1;j<=m;j++){
                if ( i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
           }
    }
    
    
}}
