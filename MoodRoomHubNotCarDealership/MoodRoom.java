package MoodRoomHubNotCarDealership;


public class MoodRoom {
    private int id;
    private String roomName;
    private String colorTheme;
    private String timeLimit;
    private String emotionalState;
    private String roomType;

    public MoodRoom(int id, String roomName, String colorTheme, String timeLimit, String emotionalState, String roomType){
        this.id = id;
        this.roomName = roomName;
        this.colorTheme = colorTheme;
        this.timeLimit = timeLimit;
        this.emotionalState = emotionalState;
        this.roomType = roomType;
    }

    public int getId() {
        return id;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getColorTheme() {
        return colorTheme;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public String getEmotionalState() {
        return emotionalState;
    }

    public String getRoomType() {
        return roomType;
    }
    @Override
    public String toString(){
        String roomDescription = "#" + id + " Name: "+ roomName + " | "
                + "Color Theme: " + colorTheme + " | "
                + "Time Limit: " + timeLimit + " | "
                + "Emotional State: " + emotionalState + " | "
                + "Room Type:"+ roomType;
        return roomDescription.trim();
    }

}
