import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class button {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    if(button == 1){
        System.out.println("hello");
    } else if(button == 2){
        System.out.println("namste");
    } else if(button == 3){
        System.out.println("kemcho");
    } else{
        System.out.println("invalid button");
    }

    }


    
}
