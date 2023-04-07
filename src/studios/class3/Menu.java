package studios.class3;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private Date currentDate;
    private ArrayList<MenuItem> theMenu;
    private MenuItem mostRecent;

    private static LocalDate newDate = LocalDate.now();

    public static void main(String[] args) {
        MenuItems chickenAlfredo = new MenuItems("Creamy Noodles", "Chicken Alfredo", "Entree", 15, newDate, 1);
        MenuItems spaghetti = new MenuItems("Savory angel hair and meatballs", "Spaghetti and Meatballs", "Entree", 15, newDate, 2);
        MenuItems tendies = new MenuItems("A simple meal for simple folks", "Chicken Tenders", "Entree", 9, newDate, 0);
        MenuItems lavaCake = new MenuItems("Ooey Gooey chocolate cake", "Chocolate Lava Cake", "Dessert", 10, newDate, 0);
        MenuItems garlicBread = new MenuItems("Classic appetizer with a kick", "Spicy Garlic Bread", "Appetizer", 7, newDate, 4);
    }


    public void addItem(MenuItem newItem){
        theMenu.add(newItem);
    }

    public void removeItem(){

    }

    public Boolean isNew(){

    }


}
