package src.main;

public class SierpinskiTriangle {
    public static void main(String[] args) {
        drawTriangle(4);

        drawSierpinskiTriangle(3);
    }
    public static void drawTriangle(int height){
        Triangle triangle = new Triangle(height);
        //triangle.generate();
    };
    
    public static void drawSierpinskiTriangle(int order) {
     //TODO: Implement this   
    }
}
