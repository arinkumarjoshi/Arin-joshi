import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankQuestionNo3 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    if(n/2 != 0){
        if(n<=20){
             System.out.println("Weird");
        }
       
    }else if(n/2==0){
        for(n=2;n<=5;n++){
            System.out.println("Not Weird");
        }
    }if(n/2==0){
        for(n=6;n<20;n++){
            System.out.println("Weird");
        }
    }if(n>20){
        if(n/2 != 0){
           System.out.println("Weird"); 
        }if(n/2 == 0){
            System.out.println("Not Weird");
        }
    }
            
        
    }
    }
    
             
    
       
    

