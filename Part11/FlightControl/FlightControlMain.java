import logic.FlightControlLogic;
import ui.TextInterface;

public class FlightControlMain {
    public static void main(String[] args) {
        FlightControlLogic newLogic=new FlightControlLogic();
        TextInterface newText=new TextInterface(newLogic);
        newText.start();
    }
}
