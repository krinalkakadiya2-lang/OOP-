// Practical Name: Pr12

class Pr12 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        Pr12 vc = new Pr12();

        double cubeVolume = vc.calculateVolume(3);
        double rectangularCubeVolume = vc.calculateVolume(4, 5, 6);
        double sphereVolume = vc.calculateVolumeSphere(2.5);

        System.out.println("Volume of Cube: " + cubeVolume);
        System.out.println("Volume of Rectangular Cube: " + rectangularCubeVolume);
        System.out.println("Volume of Sphere: " + sphereVolume);
    }
}

/*
Output:
Volume of Cube: 27.0
Volume of Rectangular Cube: 120.0
Volume of Sphere: 65.44984694978736
*/
