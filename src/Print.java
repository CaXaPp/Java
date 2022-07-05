public class Print {
    public void print() {
        City city = new City();
        Product product = new Product();
        Developments devel = new Developments();
        User user = new User(1,1);
        user.buy();
        city.rndCity();
        product.product();
        city.distance();
        devel.developmentsDriver();
    }
}
