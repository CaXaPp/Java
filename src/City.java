import java.util.Random;
public class City {
    public void rndCity() {
        Random rnd = new Random();
        int random = rnd.nextInt(7) + 1;
        switch (random) {
            case 1:
                System.out.println("You are going to the city : New York");
                break;
        case 2:
                System.out.println("You are going to the city : Washington");
                break;
        case 3:
                System.out.println("You are going to the city : Kazakhstan");
                break;
        case 4:
                System.out.println("You are going to the city : Bishkek");
                break;
        case 5:
                System.out.println("You are going to the city : Japan");
                break;
        case 6:
                System.out.println("You are going to the city : Moscow");
                break;
        case 7:
                System.out.println("Saint Petersburg");
                break;
        }
    }
    public void distance(){
        int min = 50;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println("Distance to the end of the path --> " + i + " km");
    }

}
