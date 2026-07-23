import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        String line = "-----------------------------------------------------------------";
        ArrayList<Car>cars = new ArrayList<>();
        cars.add(new PrivateCar("ABC1234","7/24/2026", 92, false));
        cars.add(new Truck("EFG456" , "7/25/2026" , 65,true));
        for(Car c : cars){
          String result =  c.getReport();
          System.out.println(result);
            System.out.println(line);
        }


    }
}
