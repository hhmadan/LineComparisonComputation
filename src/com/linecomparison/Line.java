package com.linecomparison;

public class Line {
    public static void main(String[] args) {
        LineComparison obj = new LineComparison();
        obj.setX1(4);
        obj.setX2(6);
        obj.setY1(3);
        obj.setY2(8);
        obj.set_X1(8);
        obj.set_X2(10);
        obj.set_Y1(5);
        obj.set_y2(9);
        System.out.println("The co-ordinates are : \n" + obj.toString());
        int length1 = ((obj.getX2() - obj.getX1()) ^ 2 + (obj.getY2() - obj.getY1()) ^ 2);
        int length2 = ((obj.get_X2() - obj.get_X1()) ^ 2 + (obj.get_Y2() - obj.get_Y1()) ^ 2);
        System.out.println("\nLength of the first line = " + length1);
        System.out.println("Length of second line = " + length2);

        //to check lines are equal or not as well as Compare them...

        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);

        int comp = l1.compareTo(l2);
        if (comp > 0)
            System.out.println("\nLine-1 is longer than Line-2");
        else if (comp < 0)
            System.out.println("\nLine-2 is longer than Line-1");
        else
            System.out.println("\nLine-1 is equal to Line-2");
    }
}