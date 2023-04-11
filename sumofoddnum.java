import java.util.*;
public class sumofoddnum {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for(i=0;i<=n;i++){
            if(n/2 != 0){
             sum = sum +i;
            }
            System.out.println("sum of odd number"+sum);
        }

        
    }
    
}
