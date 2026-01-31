package adityanathapplication;
public class Area {
    float radius;
    static float pi;
    public Area(float radius) {
        this.radius = radius;
    }
    float disp() {
        return pi * radius * radius;
    }
    public static void main(String[] args) {
        Area a = new Area(10);
        System.out.println(a.disp());   
    }
} 