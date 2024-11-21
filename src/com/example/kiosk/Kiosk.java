package com.example.kiosk;

import com.example.kiosk.item.Menu;
import com.example.kiosk.item.MenuItem;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    private final Menu[] menus;

    public Kiosk(Menu... menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[ " + "MAIN MENU" + " ]");

            for (int i = 0; i < menus.length; i++) {
                System.out.println((i + 1) + ". " + menus[i].getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택해 주세요: ");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.println();
            displayMenu(menus[choice - 1], scanner);
        }
    }

    private void displayMenu(Menu menu, Scanner scanner) {
        List<MenuItem> menuItems = menu.getMenuItems();

        System.out.println("[ " + menu.getCategoryName().toUpperCase() + " MENU ]");

        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf((i + 1) + ". " + "%-16s | W %-3s | %s%n", item.getName(), item.getPrice(), item.getDescription());
        }

        System.out.println("0. 뒤로가기 ");
        System.out.print("메뉴를 선택해 주세요: ");

        int choice = scanner.nextInt();
        if (choice == 0) {
            System.out.println();
            return;
        }

        MenuItem item = menuItems.get(choice - 1);
        System.out.printf("선택한 메뉴: " + "%-13s | W %-3s | %s%n", item.getName(), item.getPrice(), item.getDescription());
        System.out.println();
    }
}