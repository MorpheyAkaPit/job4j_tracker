package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String voice = "Неизвестное слово " + eng;
        System.out.println(voice);
        return voice;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String say = peppy.engToRus("Fuck");
    }
}
