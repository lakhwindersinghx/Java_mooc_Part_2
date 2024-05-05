public class RegularExpression {
    public static void main(String[] args) {
        System.out.println(isDayOfWeek("mon"));
        System.out.println(allVowels("oi"));
        System.out.println(timeOfDay("17:23:05"));
    }

    public static boolean isDayOfWeek(String string) {
        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u)*");
    }
    public static boolean timeOfDay(String string){
        return (string.matches("([0-1][0-9]|[2][0-3])"
                              + ":[0-5][0-9]"
                              + ":[0-5][0-9]"));
    }

}
