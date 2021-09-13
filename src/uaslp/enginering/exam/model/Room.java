package uaslp.enginering.exam.model;

public class Room {
    private int RoomNumber;
    private String RoomDescription;
    private RoomStatus EstadoRoom;

    public Room(int roomNumber, String roomDescription, RoomStatus estadoRoom) {
        RoomNumber=roomNumber;
        RoomDescription=roomDescription;
        EstadoRoom=estadoRoom;
    }

    public void setRoomNumber(int roomNumber){
        RoomNumber=roomNumber;
    }

    public void setRoomDescription(String roomDescription){
        RoomDescription=roomDescription;
    }

    public void setEstadoRoom(RoomStatus estadoRoom){
        EstadoRoom=estadoRoom;
    }

    public int getNumber(){
        return RoomNumber;
    }

    public RoomStatus getStatus(){
        return EstadoRoom;
    }
}
