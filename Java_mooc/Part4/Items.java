import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Items {
    private String name;
    private LocalDateTime time;

    public Items(String itemName) {
        this.name = itemName;
        this.time = LocalDateTime.now();

    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.time) + ")";
    }

}

