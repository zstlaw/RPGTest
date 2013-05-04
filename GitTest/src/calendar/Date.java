package calendar;

public class Date implements Comparable<Date> {
	int year;
	Calendar cal;
	
	public Date(final int pYear, Calendar pCal) {
		year = pYear;
		cal = pCal;
	}

	public String toString() {
		return (cal.getShortName() == "") ? Integer.toString(year) : 
				cal.getShortName() + " " + year;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getAbsoluteYear() {
		return cal.getAbsoluteYear() + year;
	}
	
	public int compareTo(Date date) {
		return (this.cal.getAbsoluteYear() + this.year) - 
				(date.cal.getAbsoluteYear() + date.year);
	}
	
	public int subtract (Date val) {
		return year - val.year;
	}
}
