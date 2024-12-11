//package org.example;
//
//import java.util.Scanner;
//
///**
// * Програма-драйвер для тестування класу Container
// */
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Container<Banka> bankContainer = new Container<>();
//
//        Container<Integer> intContainer = new Container<>();
//
//        System.out.println("Введіть кількість пар (назва банки і число), які хочете додати: ");
//        int pairCount = scanner.nextInt();
//        scanner.nextLine();
//
//        for (int i = 0; i < pairCount; i++) {
//            System.out.println("Введіть назву банки: ");
//            String bankName = scanner.nextLine();
//            System.out.println("Введіть ємність банки: ");
//            double bankCapacity = scanner.nextDouble();
//            scanner.nextLine();
//            bankContainer.addElement(new Banka(bankName, bankCapacity));
//
//        }
//
//        System.out.println("Мінімальна банка після додавання пар: " + bankContainer.getMinimumElement());
//
//        scanner.close();
//    }
//}