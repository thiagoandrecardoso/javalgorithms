package loop;

public class YearRange {

    private int yearsBegin;
    private int yearsEnd;

    private int rangeType;

    public YearRange(int yearsBegin, int yearsEnd) {
        this.yearsBegin = yearsBegin;
        this.yearsEnd = yearsEnd;
    }

    public void setRangeType(int rangeType) {
        this.rangeType = rangeType;
    }

    public void printYears() {
        if (rangeType == 1) { //Get all years divisible by 14 and 20
            for (int y = this.yearsBegin; y <= this.yearsEnd; y++) {
                if (y % 14 == 0 && y % 20 == 0) {
                    System.out.println(y);
                }
            }
        } else if (rangeType == 2) { //Get all leap years.
            for (int y = this.yearsBegin; y <= this.yearsEnd; y++) {
                if (leapYear(y)) {
                    System.out.println(y);
                }
            }
        }
    }

    public boolean leapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
