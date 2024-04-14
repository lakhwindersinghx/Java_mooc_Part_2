public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day,int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SimpleDate)) {
            return false;
        }
        SimpleDate Date = (SimpleDate) object;

        if(this.day==((SimpleDate) object).day){
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result=7;
        result=31*result+day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }


    @Override
    public String toString() {
        return this.year+"/"+this.month+"/"+this.day;
    }
}
