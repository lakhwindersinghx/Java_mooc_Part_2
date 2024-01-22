public class WhistleSound {
    public static void main(String[] args) {
        Whistle duckWhistle=new Whistle("Kvak");
        Whistle catWhistle=new Whistle("meow");

        duckWhistle.sound();
        catWhistle.sound();
    }
}
