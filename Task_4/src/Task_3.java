// Task 3

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short c = 1;
        while (c != 0) {
            System.out.println("Введите нужную цифру: " + '\n' + "1 — help");
            c = input.nextShort();
            switch (c) {
                case 0:
                    break;
                case 1:
                    Calculator.help();
                    break;
                case 2:
                    System.out.println("Введите x, t, z");
                    Calculator data1 = new Calculator(input.nextDouble(), input.nextInt(), input.nextDouble());
                    System.out.println("Ваш ответ: " + data1.first());
                    break;
                case 3:
                    System.out.println("Введите x, y, n, m");
                    Calculator data2 = new Calculator(input.nextDouble(), input.nextInt(), input.nextInt(), input.nextInt());
                    System.out.println("Ваш ответ: " + data2.second());
                    break;
                case 4:
                    System.out.println("Введите: x, z, t");
                    Calculator data3 = new Calculator(input.nextDouble(), input.nextInt(), input.nextInt());
                    System.out.println("Ваш ответ: " + data3.third());
                    break;
                case 5:
                    System.out.println("Введите: q, x, z");
                    Calculator data4 = new Calculator(input.nextInt(), input.nextDouble(), input.nextInt());
                    System.out.println("Ваш ответ: " + data4.fourth());
                    break;



                default:
                    System.out.println("Неккоректное значение");
            }
        }
    }
}

class Calculator {
    private double x;
    private double z;
    private int t;
    private int y;
    private int m;
    private int s;
    private int q;
    private int n;
    private double firstTask;
    private double secondTask;
    private double thirdTask;
    private double fourthTask;

    // methods

    public static void help() {
        System.out.println("x — Цена за одну работу" + '\n' +
                "z — процент наценки за просрочку" + '\n' +
                "t — количество недель сдачи работ" + '\n' +
                "y — количество работ просроченных на одинаковый срок" + '\n' +
                "m — количество тем которые надо сдать" + '\n' +
                "s — количество студентов которые просрочили работы" + '\n' +
                "q — недель" + '\n' +
                "1 — help" + '\n' +
                "2 — 1е условие *Просрочит сдачу одной темы на T недель*" + '\n' +
                "3 — 2е условие *Просрочит сдачу N из M тем на Y недель каждая*" + '\n' +
                "4 — 3е условие *Не выполнит ни одной темы на T недель*" + '\n' +
                "5 — 4е условие *По каждой теме будет иметь просрочку на неделю/Q недель*" + '\n' +
                "0 — Выход");
    }


    public double first() {
        firstTask = x;
        for (int i = 0; i < t; i++) {
            firstTask *= (1 + z);
        }
        return firstTask;
    }

    public double second() {
        secondTask = x;
        for (int i = 0; i < y; i++) {
            secondTask *= (1 + z);
        }
        secondTask *= n;
        secondTask += x * (m - n);
        return secondTask;
    }

    public double third() {
        thirdTask = 0;
        for (int i = 0; i < t; i++) {
            thirdTask += x * Math.pow((1 + z), t - i);
        }
        return thirdTask;
    }

    public double fourth() {
        fourthTask = 0;
        for (int i = 0; i < q; i++) {
            fourthTask += x * (1 + z);
        }
        return fourthTask;
    }
    //end methods


    // constructors
    public Calculator(double x, int t, double z) {                     //first task
        setX(x);
        setT(t);
        setZ(z);
    }

    public Calculator(double x, int y, int n, int m) {              // second task
        setX(x);
        setY(y);
        setN(n);
        setM(m);
    }

    public Calculator(double x, int z, int t) {             // third task
        setX(x);
        setZ(z);
        setT(t);
    }

    public Calculator(int q, double x, int z) {         // fourth task
        setZ(z);
        setX(x);
        setQ(q);
    }
    //end constructors

    // getters an setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        System.out.println("x = " + x);
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        System.out.println("z = " + z);
        this.z = z;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        System.out.println("t = " + t);
        this.t = t;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("y = " + y);
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        System.out.println("m = " + m);
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        System.out.println("s = " + s);
        this.s = s;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        System.out.println("q = " + q);
        this.q = q;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        System.out.println("n = " + n);
        this.n = n;
    }
// end getters an setters
}