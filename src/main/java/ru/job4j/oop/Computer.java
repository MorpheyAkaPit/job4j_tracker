package ru.job4j.oop;

public class Computer {

        private boolean multiMonitor;
        private int ssd;
        private  String cpu;

        public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: "+ ssd + " Gb");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public  Computer() {

    }

    public Computer(int ssd, String cpu) {
            this.ssd = ssd;
            this.cpu = cpu;
    }
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public Computer(boolean multiMonitor, double ssd, String cpu) {
            this.multiMonitor = multiMonitor;
            this.ssd = (int) ssd;
            this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer first = new Computer();
        first.printInfo();
        Computer second = new Computer(true, 256, "AMD Ryzen 5 3600");
        second.printInfo();
        Computer third = new Computer(256, "AMD Ryzen 5 3600");
        third.printInfo();
        Computer forth = new Computer(true, 512.0, "AMD Ryzen 7 3700X");
        forth.printInfo();

    }
}
