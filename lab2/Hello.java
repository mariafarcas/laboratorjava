package lab2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args)
    {
       problema1();
    }
    public static void problema1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti n= ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int p = i * i;
        }
    }
    public static void problema2(){
            Scanner in2  =new Scanner(System.in);
            System.out.println("Introduceti n=");
            int n=in2.nextInt();
            int s=0;
            int p=1;
            for ( int i = 1; i <= n; i++) {
                if(i%2==0) {
                    s = s + 1;
                }
                else{
                    p=p*1;
                }
            }

        System.out.println("Suma este:" +s);
        System.out.println("Patratul este:" + p);
    }
}


