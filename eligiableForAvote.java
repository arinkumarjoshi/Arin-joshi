import java.util.*;
public class eligiableForAvote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a age");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("YES eligible of vote");
        }
        else{
            System.out.println("not esligiable of vote");
        }
    }
}
