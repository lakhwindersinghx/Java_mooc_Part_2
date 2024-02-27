public class MoneyMain {
    public static void main(String[] args) {
        // Test Case 1: euros and cents both positive
        Money money1 = new Money(10, 50); // 10 euros and 50 cents
        Money money2 = new Money(5, 30);  // 5 euros and 30 cents
        testMinus(money1, money2);

        // Test Case 2: euros positive, cents negative
        Money money3 = new Money(10, 50); // 10 euros and 50 cents
        Money money4 = new Money(5, 80);  // 5 euros and 80 cents
        testMinus(money3, money4);

        // Test Case 3: euros negative, cents positive
        Money money5 = new Money(10, 20);  // 10 euros and 20 cents
        Money money6 = new Money(15, 30);   // 15 euros and 30 cents
        testMinus(money5, money6);

        // Test Case 4: euros and cents both negative
        Money money7 = new Money(5, 30);   // 5 euros and 30 cents
        Money money8 = new Money(10, 50);  // 10 euros and 50 cents
        testMinus(money7, money8);
    }

    public static void testMinus(Money money1, Money money2) {
        System.out.println("Subtracting " + money2.euros() + " euros and " + money2.cents() + " cents from "
                + money1.euros() + " euros and " + money1.cents() + " cents");
        Money result = money1.minus(money2);
        System.out.println("Result: " + result.euros() + " euros and " + result.cents() + " cents");
        System.out.println();
    }
}
