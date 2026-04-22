class Rectangle {
    double width;
    double height;

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }


    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }
}

public class Pr9 {
    public static void main(String[] args) {

        
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("Rectangle 2:");
        r2.display();

        
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}

/*
Output:

Rectangle 1:
Width: 4.0
Height: 40.0
Area: 160.0
Perimeter: 88.0

Rectangle 2:
Width: 3.5
Height: 35.9
Area: 125.65
Perimeter: 78.8

Rectangle 1 has a larger area.
*/
