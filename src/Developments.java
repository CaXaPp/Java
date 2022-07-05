import java.util.Random;

public class Developments {
    public void developmentsDriver() {
        Random rnd = new Random();
        int car = rnd.nextInt(9) + 1;
        switch (car){
            case 1 :
                System.out.println("nothing happened.");
                break;
            case 2 :
                System.out.println("\"Rain\" - movement speed is reduced by 2 units.");
                break;
            case 3 :
                System.out.println("\"Smooth road\" - increases speed +2 leagues");
                break;
            case 4 :
                System.out.println("\"The wheel broke\" - an empty day, we stand still.");
                break;
            case 5 :
                System.out.println("\"River\" - spent the whole day while looking for a ford.");
                break;
            case 6 :
                System.out.println("\"Met a local\" - managed to cut part of the way");
                break;
            case 7 :
                System.out.println("\"Robbers of the high road\" - paid off either with money (if any) or part of the goods");
                break;
            case 8 :
                System.out.println("\"Roadside inn\" - there is a chance to sell / buy goods.");
                break;
            case 9 :
                System.out.println("\"Product spoiled\" - One of the goods accidentally deteriorated. It is sad. :)");
                break;
        }
        City city = new City();
//        if (city.distance() == 5){

//        }
    }
}
