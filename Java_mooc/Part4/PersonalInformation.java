import java.util.Arrays;

public class PersonalInformation {
    private String fname;
    private double id;

    public PersonalInformation(String fullName) {
        this.fname = fullName;

        this.id = Math.random();
    }

    public String toString() {
        String[] splitter = this.fname.split(" ");
//        if (splitter.length >= 2) {
            return "First name: " + splitter[0] + "\nLast name: " + splitter[1];
//        } else {
//            return "Invalid full name format";
        }
    }

