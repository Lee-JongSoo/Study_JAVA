package ch08_2;

public class Shape {
    private int width;
    private int height;
    private int radius;

    public Shape(){}
    public Shape(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Shape(int radius){
        this.radius = radius;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
}
