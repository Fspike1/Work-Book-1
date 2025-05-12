package MoodRoomHubNotCarDealership;

import java.util.Scanner;

public class UserInterface {
    private MoodRoomHub hub;//stores all rooms
    private Scanner scanner;//reads user input


    public UserInterface(MoodRoomHub hub){
        this.hub = hub;
        this.scanner = new Scanner(System.in);

    }


    public void display(MoodRoomHub hub){

        //this is so that a new room can be recommended to the user from the MoodRoom room
        //In order for the mood room to not be null, I add the while loop with info below

        while (true){//This is a boolean so once the user presses "X" the loop will exit or break completely
            System.out.println("How are you feeling today?: \n");
            System.out.println("Type your mood or press X to exit");
            System.out.println("Mood: ");

            String moodInput = scanner.nextLine().trim();

            if (moodInput.equalsIgnoreCase("X")){
                System.out.println("Come back when you have time. The Mood Room isn't going anywhere.");
                break;
            }

            //this is so that a new room can be recommended to the user from the MoodRoom room
            //In order for the mood room to not be null, I add the while loop with info below
            MoodRoom recommendedRoom = null;

            for (MoodRoom room : hub.getAllRooms()) {//This is saying "For each room in the mood room show ONE room at a time"
                //(MoodRoom= data type, room= temporary variable, hub.getAllRooms= where the list of rooms is located
                if (room.getEmotionalState().equalsIgnoreCase(moodInput)) {
                    recommendedRoom = room;
                    break;
                }

                //If we found a match, tell the user and give them options (enter the room, see more, or exit)
                if (recommendedRoom != null){//this is where the user gets options
                System.out.println("\n Based on your mood, we recommend: " + recommendedRoom.getRoomName());
                System.out.println("Would you like to enter this room?");
                System.out.println("1. Yes");
                System.out.println("2. Show other options");
                System.out.println("X Exit");

                String choice = scanner.nextLine().trim();
            }

                }
                if (recommendedRoom != null) {
                    System.out.println("Based on your mood, we recommend: " + recommendedRoom.getRoomName());
                    System.out.println("Would you like to enter this room?");
                    System.out.println("1. Yes");
                    System.out.println("2. Show other options");
                    System.out.println("X. Exit");
                }
                else {
                    System.out.println("We couldn't find a room that matches that mood, but we would like to. Please try again");
            }


            }

    }

}
