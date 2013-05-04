package calendar;

public class Event implements Comparable<Event> {
	/** static counter of objects initialized **/
	static int eventCount = 0;

	/** year of event */
	final protected Date startDate;
	/** end of event */
	final protected Date endDate;
	/** name or event */
	final protected String name;
	/** Miscellaneous description information */
	final protected String description;
	/** sequence number of object **/
	final int order;
	/** where the event happened */
	final Locale locale;
	enum Locale {Sula, Thule, Lothia, Gian, Helen, Albienne, Burgandry, Isles, Outerplanar};

	/**
	 * Creates a event at a certian time on a calendar.
	 * @param pStart Event start year
	 * @param pEnd  Event end year
	 * @param pName Name of Event
	 * @param pDesc Description of event
	 */
	public Event(final Locale pLocale, final Date pStart, final Date pEnd, 
			final String pName, final String pDesc) {
		locale = pLocale;
		startDate = pStart;
		endDate = pEnd;
		name = pName;		
		description = pDesc;
		order = eventCount++;
	}

	/**
	 * Creates a event that lasted only a single year.
	 * @param pDate Event year of event
	 * @param pName Name of Event
	 */
	public Event(final Locale pLocale, final Date pDate, final String pName) {
		locale = pLocale;
		startDate = pDate;
		endDate = pDate;
		name = pName;
		description = "";
		order = eventCount++;
	}

	/** return start date of event */
	public Date getDate() {
		return startDate;
	}

	/** return event duration */
	public int getDuration() {
		return endDate.subtract(startDate);
	}
	
	/** return indent */
	public String getIndent() {
		StringBuilder bld = new StringBuilder();
		for (int cnt = startDate.cal.getDepth()+1; cnt>0; cnt--) {
			bld.append("\t");
		}
		return bld.toString();
	}

	/** Get name and length of event. */
	public String toString() {
		String desc = ("".equals(description)) ? "" : " [" + description + "]";
		if (endDate.compareTo(startDate) > 0) {
			return getIndent() + name + desc + " (" + startDate + 
					"-" + endDate.getYear() + ")";
		} else {
			return getIndent() + name + desc + " (" + startDate + ")";
		}
	}
		
	public int compareTo(Event event) {
		int dateCompare = startDate.compareTo(event.startDate);
		if (0 == dateCompare) {
			return order - event.order;
		} else {
			return dateCompare;
		}
			
	}
}
