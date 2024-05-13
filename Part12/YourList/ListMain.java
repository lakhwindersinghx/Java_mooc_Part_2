public class ListMain {
    public static void main(String[] args) {
        YourList<String> test=new YourList<>();
        test.add("a");
        test.add("b");
        test.add("c");
//        test.add("a");
        System.out.println(test.contains("a"));
        test.remove("a");
        System.out.println(test.contains("a"));
        System.out.println(test.contains("b"));
        System.out.println(test.contains("c"));

        for(int i=0;i<test.size();i++){
            System.out.println(test.value(i));
        }
    }
}
