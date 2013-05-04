package calendar;


public class Calendar {

	int calStartDate = 0;
	int daysInYear = 224;
	String name = null;
	String shortName = null;
	Calendar parent = null;

	public Calendar(final String pPre, final String pName) {
		name = pName;
		shortName = pPre;
	}

	public Calendar(final Calendar pParent, final int pFirst,
			final String pPre, final String pName) {
		name = pName;
		shortName = pPre;
		parent = pParent;
		calStartDate = pFirst;
	}

	/** return depth in nested calendars */
	public int getDepth() {
		if (parent == null) return 0;
		else return parent.getDepth()+1;
	}

	/**
	 * calendar abbreviation used in date display
	 * */
	public String getShortName() {
		return shortName;
	}

	/**
	 * determine year in relation to root most calendar.
	 * Used for chronilogical ordering
	 * */
	public int getAbsoluteYear() {
		return (calStartDate +
				((null != parent) ? parent.getAbsoluteYear() : 0));
	}

	/**
	 * create a date object
	 * */
	public Date on(int pYear) {
		return new Date(pYear, this);
	}
}
