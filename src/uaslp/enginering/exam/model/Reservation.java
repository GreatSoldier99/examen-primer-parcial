package uaslp.enginering.exam.model;

public class Reservation {
    private int RoomNumber;
    private String ArrivalDate;
    private Guest Invitado;
    private int Nights;

    public void setRoomNumber(int roomNumber ){
        RoomNumber=roomNumber;
    }

    public int getRoomNumber(){
        return RoomNumber;
    }

    public void setArrivalDate(String arrivalDate){
        ArrivalDate=arrivalDate;
    }

    public String getArrivalDate(){
        return ArrivalDate;
    }

    public void setGuest(Guest Guest){
        Invitado=Guest;
    }

    public Guest getGuest(){
        return Invitado;
    }

    public void setNights(int nights ){
        Nights=nights;
    }

    public int getNights(){
        return Nights;
    }
}
