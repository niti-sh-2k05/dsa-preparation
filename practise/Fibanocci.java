// You are using Java
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int fterm=0;
        int sterm=1;
        
        for(int i=1;i<=n;i++){
            System.out.print(fterm+" ");
            
            int nterm=fterm+sterm;
            fterm=sterm;
            sterm=nterm;
        }
}}