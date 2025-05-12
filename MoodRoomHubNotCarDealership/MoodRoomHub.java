package MoodRoomHubNotCarDealership;

import java.util.ArrayList;

public class MoodRoomHub{
    private String programName;
    private String location;
    private String contactEmail;
    private ArrayList <MoodRoom> listOfRooms;

    public MoodRoomHub(String programName, String location , String contactEmail){
        this.programName = programName;
        this.location = location;
        this.contactEmail = contactEmail;
        this.listOfRooms = new ArrayList<>();
    }

    public String getProgramName() {
        return programName;
    }

    public String getLocation() {
        return location;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public ArrayList<MoodRoom> getAllRooms() {
        return listOfRooms;
    }
    public void addRoom(MoodRoom moodRoom) {
        listOfRooms.add(moodRoom);

    }

}

