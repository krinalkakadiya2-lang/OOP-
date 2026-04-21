class Point {
    int x,y;
    Point() {
        x = 5;
        y = 5;
    }

    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

  
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

  
    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class Pr8 {
    public static void main(String[] args) {

      
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

    
        Point p2 = new Point(10, 20);
        System.out.println("Parameterized Constructor:");
        p2.display();

        
        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();
    }
}

/*
Output:

Default Constructor:
Point Coordinates: (5, 5)

Parameterized Constructor:
Point Coordinates: (10, 20)

Copy Constructor:
Point Coordinates: (10, 20)
*/
