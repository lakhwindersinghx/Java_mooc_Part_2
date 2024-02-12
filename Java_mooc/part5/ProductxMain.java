public class ProductxMain {
    public static void main(String[] args) {
        Productx tapeMeasure = new Productx("Tape measure");
        Productx plaster = new Productx("Plaster", "home improvement section");
        Productx tyre = new Productx("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
