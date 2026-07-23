import java.util.ArrayList;

public class Bus extends Car{
    private final int maxSpeed = 50;
    private final int speedFee = 300;
    private final int seatBeltFee = 100;

    @Override
    int getSpeedLimit() {
        return maxSpeed;
    }

    int getSeatbeltFee(){
        return seatBeltFee;
    }

    int getSpeedFee(){
        return speedFee;
    }

    public Bus(String plateNum, String date, int speed, boolean isSeatFastened) {
        super(plateNum, date, speed, isSeatFastened);
        this.carType = CarTypes.Bus;
    }


    @Override
    public ArrayList<String> check_violations() {
        checkSeatbeltStatus();
        checkSpeed();
        return violations;
    }
}
