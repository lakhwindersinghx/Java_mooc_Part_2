public class Person implements Comparable<Person> {

    private String country;
    private String gender;
    private double literacy;

    public Person(String country, String gender, double literacy) {
        this.country = country;
        this.gender = gender;
        this.literacy = literacy;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracy() {
        return literacy;
    }

    public int compareTo(Person second) {
        if (this.literacy == second.getLiteracy()) {
            return 0;
        } else if (this.literacy > second.getLiteracy()) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString(){
        return this.country+"(2015), "+this.gender+", "+this.literacy;
    }

}