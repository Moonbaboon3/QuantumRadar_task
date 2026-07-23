import java.util.ArrayList;

public abstract class Car {
    private final String plateNum;
    String date;
    int speed;
    boolean isSeatFastened;
    int totalFees = 0;
    CarTypes carType;
    ArrayList<String> violations = new ArrayList<>();

    public Car() {
        this.plateNum = "";
        this.date = "";
        this.speed = -1;
        this.isSeatFastened = false;
    }

    public Car(String plateNum, String date, int speed, boolean isSeatFastened) {
        this.plateNum = plateNum;
        this.date = date;
        this.speed = speed;
        this.isSeatFastened = isSeatFastened;
    }

    public int getTotalFees() {
        return totalFees;
    }

    void setSpeed(int _speed){
        this.speed = _speed;
    }

    abstract int getSpeedLimit();
    abstract int getSpeedFee();
    abstract int getSeatbeltFee();

    abstract ArrayList<String> check_violations(); // gives freedom to add other rule checking for other cars

    void checkSpeed(){
        if(this.speed > this.getSpeedLimit()){
            violations.add(STR."speed for \{this.speed} exceeded max allowed \{this.getSpeedLimit()} : \{getSpeedFee()}EGP");
            totalFees += getSpeedFee();
        }
    }

    void checkSeatbeltStatus(){
        if(!this.isSeatFastened){
            violations.add(STR."Seatbelt not fastned : \{getSeatbeltFee()} EGP");
            totalFees += getSeatbeltFee();
        }
    }


    public String getReport(){
        ArrayList<String>violations = check_violations();
        String body = "";

        for(String v : violations){
            body =  STR."\{body}- \{v}\n";
        }
        return STR."Traffic fine for car \{this.plateNum}\nTotal amount: \{this.totalFees}\nViolations:\n\{body}";
    }

}
