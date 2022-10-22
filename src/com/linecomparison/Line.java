package com.linecomparison;

public class Line {
    public static void main(String[] args) {
        LineComparison obj = new LineComparison();
        obj.setX1(3);
        obj.setX2(7);
        obj.setY1(4);
        obj.setY2(7);
        obj.set_X1(3);
        obj.set_X2(4);
        obj.set_Y1(4);
        obj.set_y2(3);

        System.out.println("The co-ordinates are : \n" + obj);
        double length1 = Math.sqrt(((obj.getX2() - obj.getX1()) * (obj.getX2() - obj.getX1())) + ((obj.getY2() - obj.getY1()) * (obj.getY2() - obj.getY1())));
        double length2 = Math.sqrt(((obj.get_X2() - obj.get_X1()) * (obj.get_X2() - obj.get_X1())) + ((obj.get_Y2() - obj.get_Y1()) * (obj.get_Y2() - obj.get_Y1())));
        System.out.println("\nLength of the first line = " + length1);
        System.out.println("Length of second line = " + length2);
        compareLines(length1, length2);
    }
        //to check lines are equal or not as well as Compare them...
    public static void compareLines(double length1, double length2){
        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);

        double comp = l1.compareTo(l2);
        if (comp > 0)
            System.out.println("\nLine-1 is longer than Line-2");
        else if (comp < 0)
            System.out.println("\nLine-2 is longer than Line-1");
        else
            System.out.println("\nLine-1 is equal to Line-2");
    }
}