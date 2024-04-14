public class LicensePlate {

    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public boolean equals(Object comparedObject) {
        //step1: check the memory location of objects
        if (this == comparedObject) {
            return true;
        }
        //step2: checking if compared object is of our customObject type
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }
        //step3: convert compared object to customObject
        LicensePlate object = (LicensePlate) comparedObject;

        //step4: if objects are same then their instances are also same.
        if (this.country.equals(object.country) &&
            this.liNumber.equals(object.liNumber) ) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17; // Start with a prime number
        result = 31 * result + country.hashCode();
        result = 31 * result + liNumber.hashCode();
        return result;
    }



    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}