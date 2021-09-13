package uaslp.enginering.exam.model;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Reservation> reservations;
    private ArrayList<Room> rooms;
    private String Name;


    public Hotel() {
        reservations = new ArrayList<>();
    }

    public Hotel(String Name){
        this.Name=Name;
        rooms = new ArrayList<>();
    }

    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }

    public String getName(){
        return Name;
    }

}
