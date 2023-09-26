package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String say = peppy.engToRus("Fuck");
        System.out.println("Peppy says " + say);
    }
}
