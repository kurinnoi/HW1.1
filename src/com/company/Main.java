// kurinnoi
/*
ДЗ 01.1
Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
Пример:

Enter Your name:
Eugene

Hello, Eugene
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String input = in.nextLine();
        System.out.println("Hello, " + input);
    }
}
