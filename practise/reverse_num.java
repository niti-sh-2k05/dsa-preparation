// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }
        System.out.print(rev);
}}