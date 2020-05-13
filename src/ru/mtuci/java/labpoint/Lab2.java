package ru.mtuci.java.labpoint;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        double area;
        Scanner in = new Scanner(System.in);
        System.out.print("First point: ");
        Point3d firstp = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.print("Second point: ");
        Point3d secondp = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.print("Third point: ");
        Point3d thirdp = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());

        /** Проверка треугольника на реальность и вычисление площади **/
        if (firstp.equals(secondp) || firstp.equals(thirdp) || thirdp.equals(secondp))
            System.out.println("Points are equals, area is unavailable");
        else {
            area = computeArea(firstp, secondp, thirdp);
            System.out.println("Area: " + area);
        }
    }

    /** Рассчет площади треугольника **/
    public static double computeArea(Point3d firstp, Point3d secondp, Point3d thirdp){
        double distone = firstp.distanceTo(secondp);
        double disttwo = secondp.distanceTo(thirdp);
        double distthree = thirdp.distanceTo(firstp);
        double p = (distone + disttwo + distthree) / 2;
        return Math.sqrt(p * (p - distone) * (p - disttwo) * (p - distthree));
    }
}
