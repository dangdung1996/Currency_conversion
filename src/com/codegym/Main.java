package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền cần chuyển(USD): ");
        int number = scanner.nextInt();
        System.out.println("VND = " + number*23000);
    }
}
