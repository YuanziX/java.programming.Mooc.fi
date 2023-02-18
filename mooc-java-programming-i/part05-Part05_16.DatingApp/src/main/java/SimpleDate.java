
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        this.day += howManyDays;

        //Subtracts out the days till within range, incrementing months
        while(this.day > 30) {
            this.day -= 30;
            this.month++;
        }

        //Subtracts out the months till within range, incrementing years
        while(this.month > 12) {
            this.month = 1;
            this.year++;
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
