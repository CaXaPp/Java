import java.util.Random;
public class Product {
    public void price() {
        int priceMeat = 2000;
        int priceDriedFruits = 5000;
        int priceCorn = 1500;
        int priceFlour = 3000;
        int priceFabrics = 6000;
        int priceDye = 5500;
    }
    public void product() {
        Random rnd = new Random();
        int product1 = rnd.nextInt(6) + 1;
        switch (product1){
            case 1 :
                System.out.println("Product - Meat");
                int priceMeat = 2000;
                break;
        case 2 :
                System.out.println("Product - DriedFruits");
            int priceDriedFruits = 5000;
            break;
        case 3 :
                System.out.println("Product - Corn");
            int priceCorn = 1500;
            break;
        case 4 :
                System.out.println("Product - Flour");
            int priceFlour = 3000;
            break;
        case 5 :
                System.out.println("Product - Fabrics");
            int priceFabrics = 6000;
            break;
        case 6 :
                System.out.println("Product - Dye");
            int priceDye = 5500;
            break;
        }
    }
    public void buyProduct(){
        User user = new User(1,1);
//        int buyProduct = product() - user.getMoney();
    }
}
