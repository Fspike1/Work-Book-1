package week2;

public class Dungeon {
    public static void main(String[] args) {
        printWelcome();
        displayName("faith");
        showLevel(10);
        showLevel(20);
        ahhhAttack("Lui Kang", "sword");
        battleShoutout("Scorpion", "fire breath", 40);
        castSpell("Harry Potter" , "abrakadabra" , "blahblahblah");
        gameOver("Harmonie");
        displayInventory("Pikachu ", 10);




    }


    public static void printWelcome() {
        System.out.println("Welcome to code quest");


    }

    public static void displayName (String firstname) {
        System.out.println("Hey" + firstname );


    }

    public static void showLevel( int level) {

        System.out.println("Level: " + level);

    }

    public static void ahhhAttack(String player, String item){
        System.out.println(player +  "  attacks with a " + item + " damage!");


    }

    public static void battleShoutout(String playername, String moves, int damage) {
        System.out.println(playername +  " uses " +  moves  +  " and deals "  +  damage  +  " damage! ");


    }

    public static void castSpell(String wizard , String spellName , String manaCost) {
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + " mana!  ");


    }

    public static void gameOver(String player) {
        System.out.println(" GAME OVER " + player + " ! ");

    }

    public static void displayInventory(String player , int itemCount) {
        System.out.println(player + " has " + itemCount + " items in inventory. ");

    }

}
