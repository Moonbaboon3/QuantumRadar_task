import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Car>cars = new ArrayList<>();
        cars.add(new PrivateCar("ABC1234","7/24/2026", 92, false));
        for(Car c : cars){
          String result =  c.getResults();
          System.out.println(result);
        }


    }
}
