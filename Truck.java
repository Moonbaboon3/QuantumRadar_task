import java.util.ArrayList;

public class Truck extends Car{
    private final int maxSpeed = 60;
    private final int speedFee = 300;
    private final int seatBeltFee = 100;

    @Override
    int getSpeedLimit() {
        return maxSpeed;
    }
    @Override
    int getSeatbeltFee(){
        return seatBeltFee;
    }
    @Override
    int getSpeedFee(){
        return speedFee;
    }

    public Truck(String plateNum, String date, int speed, boolean isSeatFastened) {
        super(plateNum, date, speed, isSeatFastened);
        this.carType = CarTypes.Truck;
    }


    @Override
    public ArrayList<String> check_violations() {
        checkSeatbeltStatus();
        checkSpeed();
        return violations;
    }
}
