package MoodRoomHubNotCarDealership;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        MoodRoomHub hub = new MoodRoomHub("The Mood Room", "Virtual", "support@moodroom.org" );
        MoodRoom room1 = new MoodRoom(111,"Reflection Room", "Silvers and Greys", "5 minutes - 1.5 hours","Overwhelmed", "Reflection");
        MoodRoom room2 = new MoodRoom(222, "FreeStyle Room", "Multicolor", "5 minutes - 1.5 hours", "Creative", "Expressive");
        MoodRoom room3 = new MoodRoom(333, "Weight Room", "Soft blues and greys", "5 minutes - 1.5 hours", "Depressed, Stressed", "Calm, Relaxing");
        MoodRoom room4 = new MoodRoom(444,"Loneliness Room", "Warm Colors", "5 minutes - 1.5 hours","Lonely", "Lonely");
        MoodRoom room5 = new MoodRoom(555,"Holding Room", "Soft Pastels", "5 minutes - 1.5 hours","Anxious", "Chill Vibes");
        MoodRoom room6 = new MoodRoom(666,"The Vault", "Dark colors with a beacon of light", "5 minutes - 1.5 hours","Intrusive or deep thoughts", "Private Safe");

        System.out.println("\n=========================");
        System.out.println("This is The Mood Room Hub:");
        System.out.println("=========================\n");
        System.out.println("Welcome to The Mood Room!");
        System.out.println("Contact: " + hub.getContactEmail() + " if you need assistance.");
        System.out.println("We are fully " + hub.getLocation()+ " for now but we are coming to a city near you!\n");
        System.out.println("""
                
                The Mood Room is a safety net for your emotions.
                This is a space designed for people to express how they feel regardless of how the world may see them.
                Each space is designed to suit different needs and help build community and communication.\s
                Everyone needs a place to just be without judgement.Let The Mood Room be yours.""");

        System.out.println("\n");
        System.out.println("View all the rooms below and see which one speaks to you");
        System.out.println("\n");


        hub.addRoom(room1);
        hub.addRoom(room2);
        hub.addRoom(room3);
        hub.addRoom(room4);
        hub.addRoom(room5);
        hub.addRoom(room6);

        MoodRoomFileManager manager = new MoodRoomFileManager();
        MoodRoomHub hub1 = manager.getMoodRoomHub();
        if (hub != null) {
            System.out.println("Welcome to " + hub.getProgramName() + "!");
            System.out.println("Contact: " + hub.getContactEmail());
            System.out.println("Location: " + hub.getLocation() + "\n");

            System.out.println("Available Rooms:\n");
            for (MoodRoom room : hub.getAllRooms()) {
                System.out.println(room);
            }
        } else {
            System.out.println("The Mood Room Hub failed to load.");
        }







    }
}
