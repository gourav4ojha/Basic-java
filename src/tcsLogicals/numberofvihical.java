package tcsLogicals;
// we have given nnumber if vehical and wheels 
// we have to return how ment two wehiler and four wehiler vehicals can be made

import java.util.Scanner;
class numberofvihical{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        if(w%2 != 0 || w<v) {
            System.out.println("Invalid");
        }
        int tw = 0;
        int fw =0;
        tw=((v*4)-w)/2;
        fw = v-tw;
        System.out.println(tw);
        System.out.println(fw);
        
    }
}