
import java.util.Random;
import java.util.Scanner;

/**
 * Main Class
 * 
 * @author Bethany Grentz
 * @description The driver
 * @tutorial_source https://www.youtube.com/watch?v=EpB9u4ItOYU&list=PLfdtiltiRHWFhVOs5BFPgRgN3ac1n-XWY&index=10
 * 
 */
public class Main {

    /**
     * String Arguments Main
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Setting up scanner and randomizer
        Scanner scan = new Scanner(System.in);
        Random randomizer = new Random();

        // Enemies Data
        String[] enemies = { "Skeletons", "Zombie", "Warrior", "Assassin" };
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player Data
        int health = 100;
        int attackDamag = 50;
        int numHealthPotions = 3;
        int healthPotionValue = 30;
        int healthPotionDropChance = 50; // Percent

        // Initial Setup
        boolean running = true;
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------"); // Fiure out why this looks off sometime
        System.out.println("Welcome to the Dungeon!");
        System.out.println("-------------------------------");

        // Game Running
        while (running) {

            // General enemy initializing
            int enemyHealth = randomizer.nextInt(maxEnemyHealth);
            String enemy = enemies[randomizer.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            // Main Menu
            while (enemyHealth > 0) {
                System.out.println("\tYour HP:" + health);
                System.out.println("\t" + enemy + "'s HP" + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!!!");

                // User Selection
                String userInput = scan.nextLine();

                // Stopping video at 19:15

            }

        }

    }
}