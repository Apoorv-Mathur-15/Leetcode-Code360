package src.CodingNinja;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {

    }
    // Constructor to initialize length and breadth
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Member Function: getArea()
    public int getArea() {
        return length * breadth;
    }
}
