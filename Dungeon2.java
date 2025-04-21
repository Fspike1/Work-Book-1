package week2;
import java.util.Scanner;

public class Dungeon2 {

    // #1 - Player title
    public static String getPlayerTitle(String title, String name) {
        return title + " " + name;
    }

    // #2 - Double XP
    public static int doubleXP(int xp) {
        return xp * 2;
    }

    // #3 - Level up check
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
    }

    // #4 - Dice roll
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }

    // #5 - Damage calculation
    public static int calculateDamage(int strength, int enemyDefense) {
        return (strength * 2) - enemyDefense;
    }

    // #6 - Chest opening logic
    public static boolean canOpenChest(boolean hasKey, boolean lockIsBroken) {
        return hasKey || lockIsBroken;
    }
    public static String getPlayerClass(int choice) {
        if (choice == 1) {
            return "Warrior";
        }else if (choice == 2){
            return "Mage";
        }else if (choice == 3){
            return "Rogue";
        }else {
            return "Peasant";

        }

    }
    public static int addGold(int currentGold, int goldFound) {
        if (goldFound > 100) {
            goldFound = goldFound - (goldFound / 10);

        }
        return currentGold + goldFound;


    }
    public static boolean isQuestComplete(int tasksDone, int totalTasks) {
       return tasksDone == totalTasks;
    }

    public static boolean isBossDefeated(int playerHP, int bossHP, boolean usedPotion) {
        if (bossHP <= 0) {
            return true;
        } else if (playerHP <= 0 && !usedPotion) {
            return false;

        } else if (usedPotion) {
            return playerHP > bossHP;

        }

        return playerHP > bossHP;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // #1 - Title
        String playerTitle = getPlayerTitle("Princess" , "Faith");
        System.out.println(playerTitle);

        // #2 - Double XP
        int oGXP = 45;
        int doubledXP = doubleXP(oGXP);
        System.out.println("Original XP: " + oGXP);
        System.out.println("Doubled XP: " + doubledXP);

        // #3 - Leveled Up Check
        int currentXP = 100;
        int threshold = 120;
        boolean leveledUp = hasLeveledUp(currentXP, threshold);
        if (leveledUp) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep Ya Head Up");
        }

        // #4 - Roll Dice 3 Times
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        System.out.println("First Roll: " + roll1);
        System.out.println("Second Roll: " + roll2);
        System.out.println("Third Roll: " + roll3);

        // #5 - Damage Calculation
        int strength = 10;
        int enemyDefense = 20;
        int damage = calculateDamage(strength, enemyDefense);
        if (damage < 0) {
            damage = 0;
        }
        System.out.println("You dealt " + damage + " damage!");

        // #6 - Open Chest Tests
        System.out.println("Test 1 (true, true): " + canOpenChest(true, true));
        System.out.println("Test 2 (true, false): " + canOpenChest(true, false));
        System.out.println("Test 3 (false, true): " + canOpenChest(false, true));
        System.out.println("Test 4 (false, false): " + canOpenChest(false, false));

        //#7 - Return a class name
        System.out.println("Choose your class 1 = Warrior , 2 = Mage , 3 = Rogue:  ");
        int choice = scanner.nextInt();
        String playerClass = getPlayerClass(choice);
        System.out.println(" You are a " + playerClass + " ! ");

        //#8 Amount of Gold
        int currentGold = 100;
        int goldFound = 150;
        int totalGold = addGold(100 , 150);
        System.out.println("You now have " + totalGold + " pieces of gold. ");

        //#9 - Add a message
        int tasksDone = 10;
        int totalTasks = 10;

        if (isQuestComplete(10,10)) {
            System.out.println(" The quest is complete!");
        }else {
            System.out.println(" You still have work to do! ");
        }
        //#10 - Different values defeat the boss
        int playerHP = 20;
        int bossHP = 60;
        boolean usedPotion = true;
        System.out.println("Is boss defeated?: " + isBossDefeated(10 ,5,false));
        System.out.println("Is boss defeated?: " + isBossDefeated(1 ,100,false));
        System.out.println("Is boss defeated?: " + isBossDefeated(90 ,0,true));
        System.out.println("Is boss defeated?: " + isBossDefeated(0,53,true));

        //Bonus Round!- mini quest game
        String playerTitle1 = getPlayerTitle("Princess", "Faith");
        String playerClass2 = getPlayerClass(3);
        System.out.println("Welcome, " + playerTitle1 + " the " + playerClass2 + "!");
        System.out.println("\n A wild shadow beast appears! ");

        boolean bossDefeated = isBossDefeated(50, 0, true);
        if (bossDefeated) {
            System.out.println("You defeated the Shadow Beast!");

        }else{
            System.out.println("The Shadow Beast was too powerful...");
        }
        int totalGold1 = addGold(200 ,150);

        System.out.println(" You found " + goldFound + " pieces of gold!");
        System.out.println("Your new total is " + totalGold1);
        if (isQuestComplete(10, 10)){
            System.out.println("Game Complete");

        }else {
            System.out.println("Time is ticking my friend");
        }

















    }
}







