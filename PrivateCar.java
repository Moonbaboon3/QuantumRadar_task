import java.util.ArrayList;

public class PrivateCar extends  Car{
    private final int maxSpeed = 80;
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

    public PrivateCar(String plateNum, String date, int speed, boolean isSeatFastened) {
        super(plateNum, date, speed, isSeatFastened);
        this.carType = CarTypes.Private;
    }

    void checkSeatbeltStatus(){
        if(!this.isSeatFastened){
            violations.add(STR."Seatbelt not fastned : \{seatBeltFee} EGP");
            totalFees += seatBeltFee;
        }
    }
    @Override
    public ArrayList<String> check_violations() {
        checkSeatbeltStatus();
        checkSpeed();
        return violations;
    }


}
