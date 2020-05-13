package ru.mtuci.java.labpoint;

public class Point3d extends Point2d {

    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** Конструктор по умолчанию. **/
    public Point3d () {
        this(0.0, 0.0, 0.0);
    }

    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }

    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }

    /** Вычисление расстояния между точками **/
    public double distanceTo(Point3d o){

        return Math.sqrt((Math.pow((o.xCoord - this.xCoord),2)) +
                (Math.pow((o.yCoord - this.yCoord),2)) +
                (Math.pow((o.zCoord - this.zCoord),2)));
    }

    /** Проверка на равенство **/
    public boolean equals(Point3d o){
        if(this.xCoord == o.xCoord && this.yCoord == o.yCoord && this.zCoord == o.zCoord) return true;
        else return false;
    }

}
