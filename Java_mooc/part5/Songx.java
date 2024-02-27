public class Songx {
    private String artist;
    private String name;
    private int durationInSeconds;

    public Songx(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        //first step, compare the location of variables
        if (this == compared) {
            return true;
        }
        //second step, check if the object being examined is of parameter type
        if (!(compared instanceof Songx)) {
            return false;
        }
        //Next, the Object-type object passed as the parameter is converted to the type of the object that is being examined by
        //using a type cast, so that the values of the object variables can be compared
        Songx comparedSongx = (Songx) compared;

        if (this.artist == comparedSongx.artist &&
                this.name == comparedSongx.name &&
                this.durationInSeconds == comparedSongx.durationInSeconds) {
            return true;
        } else {
            return false;
        }

    }
}
