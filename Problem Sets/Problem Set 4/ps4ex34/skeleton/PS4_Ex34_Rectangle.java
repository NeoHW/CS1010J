/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #34: PS4_Ex34_Rectangle.java
 * 
 * The Rectangle class keeps the bottom-left and
 * top-right corners as attributes.
 * 
 * Haowei
 */

import java.awt.Point; // A point representing a location in (x,y) coordinate space, specified in integer precision.

class Rectangle {
  
    private Point vertex1; // bottom-left point
    private Point vertex2; // top-right point

    public Rectangle(Point vert1, Point vert2) {
        this.vertex1 = vert1;
        this.vertex2 = vert2;
    }

    public Point getVertex1(){
        return this.vertex1;
    }

    public Point getVertex2(){
        return this.vertex2;
    }

    public int computeArea() {
        return (vertex2.x - vertex1.x) * (vertex2.y - vertex1.y);
        // return (int)((vertex2.getY()-vertex1.getY())*(vertex2.getX()-vertex1.getX()));
    }

    public String toString() {
        return "[(" + vertex1.x + ", " + vertex1.y + "); (" + vertex2.x + ", " + vertex2.y + ")]";
        // return "[(" + (int)this.vertex1.getX() + ", " + (int)this.vertex1.getY() + "); (" + (int)this.vertex2.getX() + ", " + (int)this.vertex2.getY() + ")]";
    }
}