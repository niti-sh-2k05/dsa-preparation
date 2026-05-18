// You are using Java
import java.util.*;
class Main{
    public static boolean isPrime(int num){
        if(num<=1 ){
            return false;
        }
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int start=inp.nextInt();
        int end=inp.nextInt();
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}