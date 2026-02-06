package tcsLogicals;
// we hava given the diameter and find the area of circle

import java.util.Scanner;
import java.util.*;

class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a diameter:");
       float dia = sc.nextFloat();
       float r = dia/2;
       float area =(float)(Math.PI * r * r);
        
        System.out.println(area);
    }
}
