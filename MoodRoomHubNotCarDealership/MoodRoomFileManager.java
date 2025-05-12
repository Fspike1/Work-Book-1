package MoodRoomHubNotCarDealership;

import java.io.*;
import java.util.ArrayList;

public class MoodRoomFileManager {
    public MoodRoomHub getMoodRoomHub() {
        MoodRoomHub hub;

        String filename = "MoodRoom.csv";//Whatever you want to name the file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String hubInfo = reader.readLine();

            String[] hubParts = hubInfo.split("\\|");
            MoodRoomHub newHub = new MoodRoomHub(hubParts[0], hubParts[1], hubParts[2]);

            String line;
            while ((line = reader.readLine()) != null) {
                String[] roomParts = line.split("\\|");
                int id = Integer.parseInt(roomParts[0]);
                String roomName = roomParts[1];
                String colorTheme = roomParts[2];
                String timeLimit = roomParts[3];
                String emotionalState = roomParts[4];
                String roomType = roomParts[5];

                MoodRoom room = new MoodRoom(id, roomName, colorTheme, timeLimit, emotionalState, roomType);
                newHub.addRoom(room);
            }
            reader.close();
            return newHub;

        } catch (IOException e) {
            System.out.println("Uhhh Ohhh");
            return null ; // should return something if file fails
        }


    }

}
