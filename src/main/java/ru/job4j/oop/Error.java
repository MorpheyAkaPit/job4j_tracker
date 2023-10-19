package ru.job4j.oop;

import java.awt.desktop.SystemEventListener;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;

    }

    public Error() {
        active = true;
        status = 200;
        message = "Good";
    }

    public void printInfo() {
        System.out.println("Активность " + active);
        System.out.println("Код ошибки " + status);
        System.out.println("Сообщение " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "Не отвечает");
        error.printInfo();
        Error error503 = new Error(false, 503, "It`s Ok");
        error503.printInfo();
        Error errorDefault = new Error();
        errorDefault.printInfo();
    }
}
