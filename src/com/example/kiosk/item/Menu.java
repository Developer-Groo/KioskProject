package com.example.kiosk.item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {

    private final String categoryName;
    private final List<MenuItem> menuItems = new ArrayList<>();

    public Menu(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setMenuItems(MenuItem... menuItems) {
        for (MenuItem menuItem : menuItems) {
            this.menuItems.add(menuItem);
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
