
package ch08_2;

public class Triangle extends Shape{
    private int width;
    private int height;

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }

    public Triangle(int width, int height) {
        super(width, height);
    }
}
