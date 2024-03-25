import java.util.HashMap;
public class NickNames {
    public static void main(String[] args) {
        HashMap<String,String> nickNames=new HashMap<>();
        nickNames.put("matthew","matt");
        nickNames.put("michael","mix");
        System.out.println(nickNames.get("matthew"));
    }
}
