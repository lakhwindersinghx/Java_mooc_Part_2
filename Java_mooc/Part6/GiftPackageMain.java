public class GiftPackageMain {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift sexToy=new Gift("Vibrator", 300);

        GiftPackage gifts = new GiftPackage();
        gifts.addGift(book);
        gifts.addGift(sexToy);
        System.out.println(gifts.totalWeight());
    }
}

