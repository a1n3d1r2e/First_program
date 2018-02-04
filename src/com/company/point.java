package com.company;

public class point {
    double x, y;
    point(double _x,double _y)
    {
        x=_x; y=_y;
    }
   double getX()
    {
        return this.x;
    }
    double getY()
    {
        return  this.y;
    }
    double[] getall()
    {
        double[] a=new double[2];
        a[0]=this.x; a[1]=this.y;
        return a;
    }
}
