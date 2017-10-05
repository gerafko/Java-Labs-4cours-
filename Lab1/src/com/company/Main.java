package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        String password = "admin";
        String in_password;
        System.out.print("Введите пароль: ");
        in_password = sc.next();
        if(password.equals(in_password))
            System.out.println("Вы ввели верный пароль");
        else
            System.out.println("Пароли не совпадают");
    }
}
