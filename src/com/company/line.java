package com.company;

import java.awt.*;

public class line {
    String name;
    point p1, p2;
           double abs;


    line(double _x, double _y, double _x2, double _y2, String _name)
    {
        p1=new point(_x, _y);
        p2=new point(_x2, _y2);
        name=_name;
        abs=-1.0;
    }


    double[] linevector()
    {
        double[] a=new double[2];

        a[0]=p2.getX()-p1.getX();
        a[1]=p2.getY()-p1.getY();

        return  a;
    }


    void getabs()
    {
        double[]arr=this.linevector();
        this.abs=Math.sqrt(arr[0]*arr[0]+arr[1]*arr[1]);
    }


    double[] vector_norm()
    {
        getabs();
        double[] a=this.linevector();
        a[0]/=abs;
        a[1]/=abs;
        return  a;
    }
    
    
    boolean intersections(line b)
    {
        line Lines=new line(this.p1.getX(), this.p1.getY(), b.p2.getX(), b.p2.getY(), "vector1");
        line Lines2=new line(this.p1.getX(), this.p1.getY(), b.p1.getX(), b.p1.getY(), "vector2");

        double[] this_norm=this.vector_norm();
        double[] Lines_norm=Lines.vector_norm();
        double[] Lines2_norm=Lines2.vector_norm();
        
        double cross_product1, cross_product2;
        
        cross_product1=Lines_norm[0]*this_norm[1]-Lines_norm[1]*this_norm[0];//ac*ab
        cross_product2=this_norm[0]*this_norm[1]-this_norm[1]*this_norm[0];//ad*ab
        
        if ((cross_product1>0 || cross_product2>0)&&(cross_product1<0||cross_product2<0))
            return  true;
        else
            return  false;

    }

}
