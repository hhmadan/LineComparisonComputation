//model a line based on a point of (x, y) co-ordinates using the Cartesian system, to calculate its length...
//Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
package com.linecomparison;

import java.util.Scanner;

public class ModelALineUsingCartesianSystem {
    public static double getLength(int x1, int y1, int x2, int y2){
        double length = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2- y1)*(y2- y1)));
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First point x-coordinate, x1: ");
        int x1 = sc.nextInt();
        System.out.println("Enter First point y-coordinate, y1: ");
        int y1 = sc.nextInt();
        System.out.println("Enter Second point x-coordinate, x2: ");
        int x2 = sc.nextInt();
        System.out.println("Enter Second point y-coordinate y2: ");
        int y2 = sc.nextInt();

        System.out.println("Length of given Line having points "+"("+x1+","+y1+")"+"  "+"("+x2+","+y2+")"+" is: "+ getLength(x1, y1, x2, y2));
    }

}
