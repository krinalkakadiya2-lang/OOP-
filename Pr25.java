import java.util.Scanner;

class Table {

    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println();
    }
}

class ThreadA extends Thread {
    Table t;
    int num;

    ThreadA(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

class ThreadB extends Thread {
    Table t;
    int num;

    ThreadB(Table t, int num) {
        this.t = t;
        this.num = num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class pr25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Table obj = new Table();

        ThreadA t1 = new ThreadA(obj, n1);
        ThreadB t2 = new ThreadB(obj, n2);

        t1.start();
        t2.start();

        sc.close();
    }
}

/*
Example Output:

Enter first number: 5
Enter second number: 7

5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
*/
