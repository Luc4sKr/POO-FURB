package models;

import models.enums.Quadrant;

/**
 *
 * @author lkreuch
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Quadrant identifyQuadrant() {
        Quadrant q = Quadrant.NONE;
                
        if (x < 0 && y > 0) {
            q = Quadrant.FIRST;
        }
        
        if (x > 0 && y > 0) {
            q = Quadrant.SECOND;
        }
        
        
        if (x < 0 && y < 0) {
            q = Quadrant.THIRD;
        }
        
        if (x > 0 && y < 0) {
            q = Quadrant.FOURTH;
        }
            
        return q;
    }
    
    public boolean isAffectingX() {
        return x == 0;
    }
    
    public boolean isAffectingY() {
        return y == 0;
    }
    
    public double calculateDistance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
    
    public static double calculateDistance(Point point1, Point point2) {
        return point1.calculateDistance(point2);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }    
}
