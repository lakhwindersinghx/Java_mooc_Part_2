import java.util.Objects;

public class PersonForTwins {


    private String name;
    private SimpledateForTwins birthday;
    private int height;
    private int weight;

    public PersonForTwins(String name, SimpledateForTwins birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof PersonForTwins)) {
            return false;
        }
        PersonForTwins comparedPersonForTwins = (PersonForTwins) compared;

        if (this.name.equals(comparedPersonForTwins.name) &&
                this.height == comparedPersonForTwins.height &&
                this.weight == comparedPersonForTwins.weight &&
                this.birthday.equals( comparedPersonForTwins.birthday)) {
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return this.name+" "+this.birthday+" "+this.weight+" "+this.height;
    }
}

