package models;

import java.security.InvalidParameterException;

/**
 *
 * @author lkreuch
 */
public class Rectangle {
    private int height;
    private int length;

    /**
     *
     */
    public Rectangle() { 
        this.height = 0;
        this.length = 0;
    }
    
    /**
     *
     * @param height
     * @param length
     */
    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }
    
    /**
     *
     * @return
     */
    public int calculatePerimeter() {
        return 2 * (this.height + this.length);
    }
    
    /**
     *
     * @return
     */
    public int calculateArea() {
        return this.height * this.length;
    }
    
    /**
     *
     * @return
     */
    public int getAltura() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setAltura(int height) {
        if (height <= 0) {
            throw new InvalidParameterException();
        }
        
        this.height = height;
    }

    /**
     *
     * @return
     */
    public int getComprimento() {
        return length;
    }

    /**
     *
     * @param length
     */
    public void setComprimento(int length) {
        if (length <= 0) {
            throw new InvalidParameterException();
        }
        
        this.length = length;
    }
}
