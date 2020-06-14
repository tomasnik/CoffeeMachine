package machine;

import java.util.Scanner;

public class Machine {
    static Scanner scanner = new Scanner(System.in);
    // Default values
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;

    public void choose() {
        while (true) {
            // Options
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            System.out.println();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    return;
            }
        }
    }

    public void buy() {
        // Choosing coffee
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String typeOfCoffee = scanner.next();
        switch (typeOfCoffee) {
            case "1":
                if (water - 250 < 0) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beans - 16 < 0) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println();
                water -= 250;
                beans -= 16;
                cups--;
                money += 4;
                break;
            case "2":
                if (water - 350 < 0) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk - 75 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beans - 20 < 0) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println();
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups--;
                money += 7;
                break;
            case "3":
                if (water - 200 < 0) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk - 100 < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beans - 12 < 0) {
                    System.out.println("Sorry, not enough beans!");
                    break;
                } else if (cups - 1 < 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                System.out.println();
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups--;
                money += 6;
                break;
            case "back":
                break;
        }
    }

    public void fill() {
        System.out.println("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();
    }

    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }
}
